import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Basic Calculator!");
        System.out.println("Choose an operation: +, -, *, /");

        // Read operator
        System.out.print("Enter operator: ");
        char operator = scanner.next().charAt(0);

        // Read operands
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator! Please choose +, -, *, or /.");
                return;
        }

        // Print the result
        System.out.println("The result is: " + result);

        // Close scanner
        scanner.close();
    }
}
