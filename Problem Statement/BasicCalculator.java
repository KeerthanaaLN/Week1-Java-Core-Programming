import java.util.*;

public class BasicCalculator {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }

    public static void displayResult(double result) {
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Select operation:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\nEnter choice (1-4): ");
        int choice = in.nextInt();
        
        System.out.print("Enter first number: ");
        double num1 = in.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = in.nextDouble();
        
        double result = 0;
        boolean validChoice = true;
        
        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = subtract(num1, num2);
                break;
            case 3:
                result = multiply(num1, num2);
                break;
            case 4:
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Invalid choice!");
                validChoice = false;
        }
        
        if (validChoice) {
            displayResult(result);
        }
        
        in.close();
    }
}
