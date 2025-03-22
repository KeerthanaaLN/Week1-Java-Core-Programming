import java.util.Scanner;

public class UnitConverters {

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
		double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
		return kilograms * kilograms2pounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
		return gallons * gallons2liters;
    }

    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
		return liters * liters2gallons;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = in.nextDouble();
        System.out.print("Enter temperature in Celsius: ");
        double celsius = in.nextDouble();
        System.out.print("Enter weight in Pounds: ");
        double pounds = in.nextDouble();
        System.out.print("Enter weight in Kilograms: ");
        double kilograms = in.nextDouble();
        System.out.print("Enter volume in Gallons: ");
        double gallons = in.nextDouble();
        System.out.print("Enter volume in Liters: ");
        double liters = in.nextDouble();


        System.out.printf("\nFahrenheit to Celsius: %.3f °C%n", convertFahrenheitToCelsius(fahrenheit));
        System.out.printf("Celsius to Fahrenheit: %.3f °F%n", convertCelsiusToFahrenheit(celsius));
        System.out.printf("Pounds to Kilograms: %.3f kg%n", convertPoundsToKilograms(pounds));
        System.out.printf("Kilograms to Pounds: %.3f lbs%n", convertKilogramsToPounds(kilograms));
        System.out.printf("Gallons to Liters: %.3f L%n", convertGallonsToLiters(gallons));
        System.out.printf("Liters to Gallons: %.3f gal%n", convertLitersToGallons(liters));

        in.close();
    }
}
