# Java-Console-Calculator.

A feature-rich command-line calculator built with Java, perfect for learning Java fundamentals and performing quick calculations.

##  Table of Contents
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Operations](#operations)
- [Code Structure](#code-structure)
- [Learning Objectives](#learning-objectives)
- [Troubleshooting](#troubleshooting)
- [Contributing](#contributing)

##  Features

- **Basic Arithmetic Operations**: Addition, Subtraction, Multiplication, Division
- **Advanced Operations**: Modulus, Power, Square Root, Percentage
- **User-Friendly Interface**: Menu-driven with clear prompts
- **Error Handling**: Gracefully handles invalid inputs and mathematical errors
- **Continuous Operation**: Loop allows multiple calculations without restarting
- **Input Validation**: Ensures only valid numbers are processed
- **Formatted Output**: Clean, readable results with visual separators

##  Prerequisites

Before running this calculator, ensure you have:

- **Java Development Kit (JDK)** version 8 or higher
  - Download from [Oracle](https://www.oracle.com/java/technologies/downloads/) or [OpenJDK](https://openjdk.org/)
- **Text Editor or IDE** (optional but recommended):
  - VS Code with Java Extension Pack
  - IntelliJ IDEA Community Edition
  - Eclipse
  - Or any text editor with terminal access

### Verify Java Installation


## Installation

### Step 1: Clone or Download

Download the `ConsoleCalculator.java` file to your local machine.

### Step 2: Navigate to Directory

Open terminal/command prompt and navigate to the directory containing the file:

```bash
cd path/to/calculator/directory
```

### Step 3: Compile the Program

```bash
javac ConsoleCalculator.java
```

This creates a `ConsoleCalculator.class` file.

### Step 4: Run the Program

```bash
java ConsoleCalculator
```

##  Usage

### Starting the Calculator

Once you run the program, you'll see the welcome screen:

```
╔════════════════════════════════════════════╗
║       JAVA CONSOLE CALCULATOR v1.0        ║
╚════════════════════════════════════════════╝
```

### Main Menu

```
=============================================
              CALCULATOR MENU
=============================================
1. Addition (+)
2. Subtraction (-)
3. Multiplication (×)
4. Division (÷)
5. Modulus (%)
6. Power (x^y)
7. Square Root (√)
8. Percentage
9. Exit
=============================================
```

### Example Usage

**Addition Example:**
```
Enter your choice (1-9): 1

--- ADDITION ---
Enter first number: 25.5
Enter second number: 14.3

────────────────────────────────────────
25.50 + 14.30 = 39.8000
────────────────────────────────────────
```

**Division Example:**
```
Enter your choice (1-9): 4

--- DIVISION ---
Enter numerator: 100
Enter denominator: 8

────────────────────────────────────────
100.00 ÷ 8.00 = 12.5000
────────────────────────────────────────
```

**Square Root Example:**
```
Enter your choice (1-9): 7

--- SQUARE ROOT ---
Enter number: 64

────────────────────────────────────────
√64.00 = 8.0000
────────────────────────────────────────
```

##  Operations

| Operation | Symbol | Description | Example |
|-----------|--------|-------------|---------|
| Addition | + | Adds two numbers | 5 + 3 = 8 |
| Subtraction | - | Subtracts second from first | 10 - 4 = 6 |
| Multiplication | × | Multiplies two numbers | 7 × 6 = 42 |
| Division | ÷ | Divides first by second | 20 ÷ 4 = 5 |
| Modulus | % | Returns remainder | 17 % 5 = 2 |
| Power | ^ | Raises base to exponent | 2^3 = 8 |
| Square Root | √ | Returns square root | √25 = 5 |
| Percentage | % | Calculates percentage | 20% of 50 = 10 |

### Error Handling

The calculator handles common errors:

- **Division by Zero**: Prevented with error message
- **Invalid Input**: Re-prompts for valid number
- **Negative Square Root**: Shows error message
- **Invalid Menu Choice**: Displays error and shows menu again

##  Code Structure

```
ConsoleCalculator.java
│
├── main()                    # Entry point, program flow control
├── displayWelcome()          # Shows welcome message
├── displayMenu()             # Displays operation menu
├── getMenuChoice()           # Gets and validates menu selection
├── performCalculation()      # Routes to specific operation
├── getNumber()               # Gets validated numerical input
├── displayResult()           # Formats and shows results
│
└── Calculation Methods:
    ├── add()                 # Addition
    ├── subtract()            # Subtraction
    ├── multiply()            # Multiplication
    ├── divide()              # Division
    ├── modulus()             # Modulus
    ├── power()               # Exponentiation
    ├── squareRoot()          # Square root
    └── percentage()          # Percentage calculation
```

##  Learning Objectives

This project demonstrates:

1. **Java Syntax**: Variables, data types, operators
2. **Methods**: Creating and calling reusable functions
3. **Scanner Class**: Reading user input from console
4. **Control Structures**: if-else, switch-case statements
5. **Loops**: while loop for continuous operation
6. **Exception Handling**: try-catch for invalid inputs
7. **Input Validation**: Ensuring data integrity
8. **Code Organization**: Separating concerns into methods
9. **User Experience**: Creating intuitive interfaces

## 🐛 Troubleshooting

### Common Issues

**Problem**: `javac: command not found`
- **Solution**: Java is not installed or not in PATH. Install JDK and add to system PATH.

**Problem**: `Error: Could not find or load main class ConsoleCalculator`
- **Solution**: Ensure you're in the correct directory and the `.class` file exists.

**Problem**: Program doesn't accept decimal numbers
- **Solution**: This calculator fully supports decimal numbers. Ensure you're using a period (.) not a comma (,).

**Problem**: Calculator closes after one operation
- **Solution**: The program is designed to continue until you select option 9 (Exit). Press Enter after each calculation.

##  Contributing

Suggestions for improvement:

- Add scientific functions (sin, cos, tan, log)
- Implement calculation history
- Add memory functions (M+, M-, MR, MC)
- Support for complex numbers
- Unit conversion features
- Expression evaluation (e.g., "2 + 3 * 4")

##  License

This project is created for educational purposes and is free to use and modify.

##  Author

Khushi Sen.

## Acknowledgments

- Built using Java Standard Library
- No external dependencies required
- Follows Java naming conventions and best practices

---

**Happy Calculating! 🎉**

For questions or issues, please refer to Java documentation at [docs.oracle.com](https://docs.oracle.com/en/java/).
