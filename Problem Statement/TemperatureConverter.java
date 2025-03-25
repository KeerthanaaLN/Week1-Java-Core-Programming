import java.util.Scanner;

public class TemperatureConverter {
    
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Menu:\n1. Fahrenheit to Celsius\n2. Celsius to Fahrenheit\nEnter choice (1-2): ");
        int choice = in.nextInt();
        
        double result = 0;
        
        if (choice == 1) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = in.nextDouble();
            result = fahrenheitToCelsius(fahrenheit);
            System.out.println("Temperature in Celsius: " + result);
        } else if (choice == 2) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = in.nextDouble();
            result = celsiusToFahrenheit(celsius);
            System.out.println("Temperature in Fahrenheit: " + result);
        } else {
            System.out.println("Invalid choice!");
        }
        
        in.close();
    }
}
