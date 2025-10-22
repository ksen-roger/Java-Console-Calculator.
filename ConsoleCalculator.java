import java.util.Scanner;

public class ConsoleCalculator {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        displayWelcome();

        boolean continueCalculating = true;

        while (continueCalculating) {
            displayMenu();
            int choice = getMenuChoice();

            if (choice == 9) {
                System.out.println("\n✓ Thank you for using the calculator. Goodbye!");
                continueCalculating = false;
                continue;
            }

            if (choice >= 1 && choice <= 8) {
                performCalculation(choice);
            } else {
                System.out.println("\n✗ Invalid choice! Please select a valid option.");
            }

            if (continueCalculating) {
                System.out.print("\nPress Enter to continue...");
                scanner.nextLine();
            }
        }

        scanner.close();
    }

    // Display welcome message
    private static void displayWelcome() {
        System.out.println("\n╔════════════════════════════════════════════╗");
        System.out.println("║       JAVA CONSOLE CALCULATOR v1.0        ║");
        System.out.println("╚════════════════════════════════════════════╝");
    }

    // Display menu options
    private static void displayMenu() {
        System.out.println("\n" + "=".repeat(45));
        System.out.println("              CALCULATOR MENU");
        System.out.println("=".repeat(45));
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (×)");
        System.out.println("4. Division (÷)");
        System.out.println("5. Modulus (%)");
        System.out.println("6. Power (x^y)");
        System.out.println("7. Square Root (√)");
        System.out.println("8. Percentage");
        System.out.println("9. Exit");
        System.out.println("=".repeat(45));
    }

    // Get menu choice from user
    private static int getMenuChoice() {
        System.out.print("Enter your choice (1-9): ");
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    // Perform calculation based on choice
    private static void performCalculation(int choice) {
        double num1, num2, result;

        switch (choice) {
            case 1: // Addition
                System.out.println("\n--- ADDITION ---");
                num1 = getNumber("Enter first number: ");
                num2 = getNumber("Enter second number: ");
                result = add(num1, num2);
                displayResult(num1, "+", num2, result);
                break;

            case 2: // Subtraction
                System.out.println("\n--- SUBTRACTION ---");
                num1 = getNumber("Enter first number: ");
                num2 = getNumber("Enter second number: ");
                result = subtract(num1, num2);
                displayResult(num1, "-", num2, result);
                break;

            case 3: // Multiplication
                System.out.println("\n--- MULTIPLICATION ---");
                num1 = getNumber("Enter first number: ");
                num2 = getNumber("Enter second number: ");
                result = multiply(num1, num2);
                displayResult(num1, "×", num2, result);
                break;

            case 4: // Division
                System.out.println("\n--- DIVISION ---");
                num1 = getNumber("Enter numerator: ");
                num2 = getNumber("Enter denominator: ");
                if (num2 == 0) {
                    System.out.println("\n✗ Error: Division by zero is not allowed!");
                } else {
                    result = divide(num1, num2);
                    displayResult(num1, "÷", num2, result);
                }
                break;

            case 5: // Modulus
                System.out.println("\n--- MODULUS ---");
                num1 = getNumber("Enter first number: ");
                num2 = getNumber("Enter second number: ");
                if (num2 == 0) {
                    System.out.println("\n✗ Error: Modulus by zero is not allowed!");
                } else {
                    result = modulus(num1, num2);
                    displayResult(num1, "%", num2, result);
                }
                break;

            case 6: // Power
                System.out.println("\n--- POWER ---");
                num1 = getNumber("Enter base: ");
                num2 = getNumber("Enter exponent: ");
                result = power(num1, num2);
                displayResult(num1, "^", num2, result);
                break;

            case 7: // Square Root
                System.out.println("\n--- SQUARE ROOT ---");
                num1 = getNumber("Enter number: ");
                if (num1 < 0) {
                    System.out.println("\n✗ Error: Cannot calculate square root of negative number!");
                } else {
                    result = squareRoot(num1);
                    System.out.println("\n" + "─".repeat(40));
                    System.out.printf("√%.2f = %.4f%n", num1, result);
                    System.out.println("─".repeat(40));
                }
                break;

            case 8: // Percentage
                System.out.println("\n--- PERCENTAGE ---");
                num1 = getNumber("Enter the value: ");
                num2 = getNumber("Enter percentage: ");
                result = percentage(num1, num2);
                System.out.println("\n" + "─".repeat(40));
                System.out.printf("%.2f%% of %.2f = %.2f%n", num2, num1, result);
                System.out.println("─".repeat(40));
                break;

            default:
                System.out.println("\n✗ Invalid operation!");
        }
    }

    // Get number input from user with validation
    private static double getNumber(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("✗ Invalid input! Please enter a valid number.");
            }
        }
    }

    // Display calculation result
    private static void displayResult(double num1, String operator, double num2, double result) {
        System.out.println("\n" + "─".repeat(40));
        System.out.printf("%.2f %s %.2f = %.4f%n", num1, operator, num2, result);
        System.out.println("─".repeat(40));
    }

    // ========== CALCULATION METHODS ==========

    // Addition method
    private static double add(double a, double b) {
        return a + b;
    }

    // Subtraction method
    private static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication method
    private static double multiply(double a, double b) {
        return a * b;
    }

    // Division method
    private static double divide(double a, double b) {
        return a / b;
    }

    // Modulus method
    private static double modulus(double a, double b) {
        return a % b;
    }

    // Power method
    private static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Square root method
    private static double squareRoot(double a) {
        return Math.sqrt(a);
    }

    // Percentage method
    private static double percentage(double value, double percent) {
        return (value * percent) / 100;
    }
}