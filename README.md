# kode-skan
KodeSkan is a CLI-based code complexity analyser designed to analyse cyclomatic complexity, nesting depth, duplicate code, and much more.

# CodeCortex - Code Complexity Analyzer

## Introduction
**KodeSkan** is a **CLI-based Code Complexity Analyzer** that helps developers assess and optimize their code quality. It analyzes **Cyclomatic Complexity, Nesting Depth, Duplicate Code, and much more** helping in maintainability issues and improving software performance.

## Features
- **Cyclomatic Complexity Calculation** - Identify complex functions.
- **Code Metrics Analysis** - Count lines of code, nesting depth, and more.
- **Duplicate Code Detection** - Find repeated code blocks.
- **Customizable Reports** - Output results in **Text, JSON, or CSV formats**.
- **Batch Analysis** - Scan multiple files in a directory.

## Installation
### Prerequisites
- Java 8+ must be installed on your system.

### Clone the Repository
```sh
 git clone https://github.com/starreh/kode-skan.git
 cd kode-skan
```

### Compile the Project
```sh
javac -d bin src/main/KodeScan.java
```

### Run the Analyzer
```sh
java -cp bin KodeScan /path/to/java/files
```

## Usage
### Analyze a single Java file
```sh
java -cp bin KodeScan Main.java
```

### Analyze all Java files in a directory
```sh
java -cp bin KodeScan src/
```

### Generate a JSON Report
```sh
java -cp bin KodeScan src/ --format json
```

### Full Help Menu
```sh
java -cp bin KodeScan --help
```

## Sample Output
```
Analyzing: Main.java
------------------------------------
Cyclomatic Complexity: 5
Lines of Code: 120
Nesting Depth: 3
Duplicate Code Blocks: 2
------------------------------------
Recommendation: Consider refactoring long methods and reducing nesting depth.
```

## Contributors
- [Sounak Roy](https://github.com/starreh)

## License
This project is licensed under the **MIT License**.

## Support & Contributions
If you find this tool useful, feel free to star the repository and contribute! PRs are welcome!

