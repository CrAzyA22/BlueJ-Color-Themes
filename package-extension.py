#!/usr/bin/env python3
"""
BlueJ Extension Packager
A cross-platform tool to compile and package BlueJ extensions into JAR files.
"""

import os
import sys
import json
import shutil
import subprocess
import platform
from pathlib import Path
from typing import Optional, List, Dict


class BlueJPackager:
    def __init__(self, config_file: Optional[str] = None):
        self.config = self.load_config(config_file)
        self.system = platform.system()
        self.bluej_home = self.find_bluej_home()
        self.jdk_bin = self.find_jdk_bin()
        
    def load_config(self, config_file: Optional[str]) -> Dict:
        """Load configuration from JSON file or use defaults."""
        default_config = {
            "source_dir": "src",
            "resources_dir": "resources",
            "target_dir": "target",
            "output_jar": None,  # Auto-generated from main class
            "main_class": None,  # Auto-detect from manifest
            "manifest_file": "src/META-INF/MANIFEST.MF",
            "java_release": "21",
            "bluej_home": None,  # Auto-detect
            "include_patterns": ["**/*.java"],
            "resource_patterns": ["**/*.css", "**/*.properties", "**/*.png", "**/*.jpg"]
        }
        
        if config_file and os.path.exists(config_file):
            with open(config_file, 'r') as f:
                user_config = json.load(f)
                default_config.update(user_config)
                print(f"✓ Loaded configuration from {config_file}")
        
        return default_config
    
    def find_bluej_home(self) -> Path:
        """Auto-detect BlueJ installation directory."""
        if self.config.get("bluej_home"):
            path = Path(self.config["bluej_home"])
            if path.exists():
                print(f"✓ Using BlueJ from config: {path}")
                return path
        
        # Common BlueJ installation paths
        common_paths = []
        if self.system == "Windows":
            common_paths = [
                Path("C:/Program Files/BlueJ"),
                Path("C:/Program Files (x86)/BlueJ"),
                Path("C:/Users\klemm_1vmpzfr/Desktop/Coding/Informatik/BueJ exe"),
                Path(os.path.expanduser("~/AppData/Local/Programs/BlueJ"))
            ]
        elif self.system == "Darwin":  # macOS
            common_paths = [
                Path("/Applications/BlueJ.app/Contents/Resources/Java"),
                Path(os.path.expanduser("~/Applications/BlueJ.app/Contents/Resources/Java"))
            ]
        else:  # Linux
            common_paths = [
                Path("/usr/share/bluej"),
                Path("/opt/bluej"),
                Path(os.path.expanduser("~/bluej"))
            ]
        
        for path in common_paths:
            if path.exists():
                print(f"✓ Found BlueJ installation: {path}")
                return path
        
        print("⚠ Could not auto-detect BlueJ installation.")
        user_path = input("Please enter BlueJ installation path: ").strip()
        path = Path(user_path)
        if path.exists():
            return path
        else:
            raise FileNotFoundError(f"BlueJ not found at: {path}")
    
    def find_jdk_bin(self) -> Path:
        """Find JDK bin directory within BlueJ installation."""
        jdk_paths = [
            self.bluej_home / "jdk" / "bin",
            self.bluej_home / "jre" / "bin",
            self.bluej_home / "bin"
        ]
        
        for path in jdk_paths:
            javac = path / ("javac.exe" if self.system == "Windows" else "javac")
            if javac.exists():
                print(f"✓ Found JDK binaries: {path}")
                return path
        
        raise FileNotFoundError("Could not find JDK/JRE in BlueJ installation")
    
    def get_bluej_classpath(self) -> str:
        """Build classpath for BlueJ and JavaFX libraries."""
        lib_dir = self.bluej_home / "lib"
        
        if not lib_dir.exists():
            raise FileNotFoundError(f"BlueJ lib directory not found: {lib_dir}")
        
        # Find required JAR files
        required_jars = []
        
        # BlueJ core
        bluej_jar = lib_dir / "bluej.jar"
        if bluej_jar.exists():
            required_jars.append(str(bluej_jar))
        
        # JavaFX libraries (version-agnostic pattern matching)
        javafx_patterns = ["javafx-base", "javafx-controls", "javafx-graphics"]
        for jar_file in lib_dir.glob("*.jar"):
            for pattern in javafx_patterns:
                if pattern in jar_file.name.lower():
                    required_jars.append(str(jar_file))
                    break
        
        if not required_jars:
            raise FileNotFoundError("Could not find required BlueJ/JavaFX JAR files")
        
        separator = ";" if self.system == "Windows" else ":"
        classpath = separator.join(["."] + required_jars)
        print(f"✓ Built classpath with {len(required_jars)} JAR files")
        return classpath
    
    def find_java_files(self) -> List[Path]:
        """Find all Java source files in the source directory."""
        source_dir = Path(self.config["source_dir"])
        if not source_dir.exists():
            raise FileNotFoundError(f"Source directory not found: {source_dir}")
        
        java_files = list(source_dir.rglob("*.java"))
        print(f"✓ Found {len(java_files)} Java source file(s)")
        return java_files
    
    def get_main_class_from_manifest(self) -> Optional[str]:
        """Extract Main-Class from manifest file."""
        manifest_path = Path(self.config["manifest_file"])
        if not manifest_path.exists():
            print(f"⚠ Manifest file not found: {manifest_path}")
            return None
        
        with open(manifest_path, 'r') as f:
            for line in f:
                if line.startswith("Main-Class:"):
                    main_class = line.split(":", 1)[1].strip()
                    print(f"✓ Detected main class: {main_class}")
                    return main_class
        return None
    
    def compile_sources(self) -> bool:
        """Compile Java sources with BlueJ classpath."""
        print("\n📦 Compiling Java sources...")
        
        # Prepare target directory
        target_classes = Path(self.config["target_dir"]) / "classes"
        target_classes.mkdir(parents=True, exist_ok=True)
        
        # Get Java files
        java_files = self.find_java_files()
        if not java_files:
            print("✗ No Java source files found!")
            return False
        
        # Build compilation command
        javac = self.jdk_bin / ("javac.exe" if self.system == "Windows" else "javac")
        classpath = self.get_bluej_classpath()
        
        cmd = [
            str(javac),
            f"--release={self.config['java_release']}",
            "-cp", classpath,
            "-d", str(target_classes)
        ] + [str(f) for f in java_files]
        
        print(f"Running: {' '.join(cmd[:4])} ... {len(java_files)} file(s)")
        
        try:
            result = subprocess.run(cmd, capture_output=True, text=True)
            if result.returncode == 0:
                print("✓ Compilation successful")
                return True
            else:
                print("✗ Compilation failed:")
                print(result.stderr)
                return False
        except Exception as e:
            print(f"✗ Compilation error: {e}")
            return False
    
    def copy_resources(self) -> bool:
        """Copy resources (CSS, images, etc.) to target directory."""
        print("\n📋 Copying resources...")
        
        resources_dir = Path(self.config["resources_dir"])
        target_classes = Path(self.config["target_dir"]) / "classes"
        
        if not resources_dir.exists():
            print(f"⚠ Resources directory not found: {resources_dir}")
            return True  # Not fatal
        
        copied_count = 0
        for pattern in self.config["resource_patterns"]:
            for resource_file in resources_dir.rglob(pattern.replace("**/", "")):
                if resource_file.is_file():
                    # Preserve directory structure
                    rel_path = resource_file.relative_to(resources_dir)
                    target_file = target_classes / rel_path
                    target_file.parent.mkdir(parents=True, exist_ok=True)
                    shutil.copy2(resource_file, target_file)
                    copied_count += 1
        
        print(f"✓ Copied {copied_count} resource file(s)")
        return True
    
    def copy_manifest(self) -> bool:
        """Copy manifest file to target META-INF directory."""
        print("\n📄 Copying manifest...")
        
        manifest_src = Path(self.config["manifest_file"])
        if not manifest_src.exists():
            print(f"✗ Manifest file not found: {manifest_src}")
            return False
        
        target_manifest = Path(self.config["target_dir"]) / "classes" / "META-INF" / "MANIFEST.MF"
        target_manifest.parent.mkdir(parents=True, exist_ok=True)
        shutil.copy2(manifest_src, target_manifest)
        
        print(f"✓ Copied manifest to {target_manifest}")
        return True
    
    def create_jar(self) -> bool:
        """Create JAR file from compiled classes and resources."""
        print("\n🗜️  Creating JAR file...")
        
        # Determine output JAR name
        if self.config["output_jar"]:
            jar_name = self.config["output_jar"]
        else:
            main_class = self.get_main_class_from_manifest()
            if main_class:
                jar_name = f"{main_class}.jar"
            else:
                jar_name = "extension.jar"
        
        jar_path = Path(jar_name)
        target_classes = Path(self.config["target_dir"]) / "classes"
        manifest_path = target_classes / "META-INF" / "MANIFEST.MF"
        
        # Build JAR command
        jar_cmd = self.jdk_bin / ("jar.exe" if self.system == "Windows" else "jar")
        
        cmd = [
            str(jar_cmd),
            "-cfm",
            str(jar_path),
            str(manifest_path),
            "-C", str(target_classes),
            "."
        ]
        
        print(f"Running: jar -cfm {jar_path} ...")
        
        try:
            result = subprocess.run(cmd, capture_output=True, text=True)
            if result.returncode == 0:
                size = jar_path.stat().st_size
                print(f"✓ Created JAR: {jar_path} ({size:,} bytes)")
                return True
            else:
                print("✗ JAR creation failed:")
                print(result.stderr)
                return False
        except Exception as e:
            print(f"✗ JAR creation error: {e}")
            return False
    
    def verify_jar(self, jar_path: str) -> bool:
        """Verify JAR contents."""
        print(f"\n🔍 Verifying JAR contents...")
        
        jar_cmd = self.jdk_bin / ("jar.exe" if self.system == "Windows" else "jar")
        cmd = [str(jar_cmd), "-tf", jar_path]
        
        try:
            result = subprocess.run(cmd, capture_output=True, text=True)
            if result.returncode == 0:
                contents = result.stdout.strip().split('\n')
                print(f"✓ JAR contains {len(contents)} entries:")
                # Show first few entries
                for entry in contents[:10]:
                    print(f"  - {entry}")
                if len(contents) > 10:
                    print(f"  ... and {len(contents) - 10} more")
                return True
            else:
                print("✗ Could not verify JAR")
                return False
        except Exception as e:
            print(f"✗ Verification error: {e}")
            return False
    
    def package(self) -> bool:
        """Execute the complete packaging process."""
        print("=" * 60)
        print("BlueJ Extension Packager")
        print("=" * 60)
        print(f"Platform: {self.system}")
        print(f"BlueJ Home: {self.bluej_home}")
        print(f"JDK Bin: {self.jdk_bin}")
        print("=" * 60)
        
        # Step 1: Compile
        if not self.compile_sources():
            return False
        
        # Step 2: Copy resources
        if not self.copy_resources():
            return False
        
        # Step 3: Copy manifest
        if not self.copy_manifest():
            return False
        
        # Step 4: Create JAR
        if not self.create_jar():
            return False
        
        # Step 5: Verify
        jar_name = self.config.get("output_jar")
        if not jar_name:
            main_class = self.get_main_class_from_manifest()
            jar_name = f"{main_class}.jar" if main_class else "extension.jar"
        
        self.verify_jar(jar_name)
        
        print("\n" + "=" * 60)
        print("✅ Packaging complete!")
        print("=" * 60)
        print(f"\nYour BlueJ extension is ready: {jar_name}")
        print(f"\nTo install, copy {jar_name} to:")
        if self.system == "Windows":
            print("  %USERPROFILE%\\bluej\\extensions\\")
        elif self.system == "Darwin":
            print("  ~/Library/Preferences/org.bluej/extensions/")
        else:
            print("  ~/.bluej/extensions/")
        
        return True
    
    def clean(self):
        """Clean build artifacts."""
        target_dir = Path(self.config["target_dir"])
        if target_dir.exists():
            shutil.rmtree(target_dir)
            print(f"✓ Cleaned: {target_dir}")


def main():
    import argparse
    
    parser = argparse.ArgumentParser(
        description="Package BlueJ extensions into JAR files",
        formatter_class=argparse.RawDescriptionHelpFormatter,
        epilog="""
Examples:
  python package-extension.py                    # Package with defaults
  python package-extension.py -c config.json     # Use custom config
  python package-extension.py --clean            # Clean build artifacts
  python package-extension.py --init             # Create sample config
        """
    )
    
    parser.add_argument(
        "-c", "--config",
        help="Path to configuration file (JSON)",
        default=None
    )
    
    parser.add_argument(
        "--clean",
        action="store_true",
        help="Clean build artifacts"
    )
    
    parser.add_argument(
        "--init",
        action="store_true",
        help="Create a sample configuration file"
    )
    
    args = parser.parse_args()
    
    # Handle --init
    if args.init:
        config_file = "bluej-package-config.json"
        sample_config = {
            "source_dir": "src",
            "resources_dir": "resources",
            "target_dir": "target",
            "output_jar": "MyExtension.jar",
            "manifest_file": "src/META-INF/MANIFEST.MF",
            "java_release": "21",
            "bluej_home": None,
            "include_patterns": ["**/*.java"],
            "resource_patterns": ["**/*.css", "**/*.properties", "**/*.png", "**/*.jpg"]
        }
        
        with open(config_file, 'w') as f:
            json.dump(sample_config, f, indent=2)
        
        print(f"✓ Created sample configuration: {config_file}")
        print("Edit this file to customize your build settings.")
        return 0
    
    try:
        packager = BlueJPackager(args.config)
        
        if args.clean:
            packager.clean()
            return 0
        
        success = packager.package()
        return 0 if success else 1
        
    except KeyboardInterrupt:
        print("\n\n⚠ Cancelled by user")
        return 130
    except Exception as e:
        print(f"\n✗ Error: {e}")
        import traceback
        traceback.print_exc()
        return 1


if __name__ == "__main__":
    sys.exit(main())
