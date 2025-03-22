import java.util.Scanner;

public class UnitConvertor {

    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter distance in kilometers (km): ");
        double km = in.nextDouble();

        System.out.print("Enter distance in miles: ");
        double miles = in.nextDouble();

        System.out.print("Enter distance in meters (m): ");
        double meters = in.nextDouble();

        System.out.print("Enter distance in feet: ");
        double feet = in.nextDouble();

        System.out.printf("Kilometers to Miles: %.3f miles%n", convertKmToMiles(km));
        System.out.printf("Miles to Kilometers: %.3f km%n", convertMilesToKm(miles));
        System.out.printf("Meters to Feet: %.3f feet%n", convertMetersToFeet(meters));
        System.out.printf("Feet to Meters: %.3f meters%n", convertFeetToMeters(feet));

        in.close();
    }
}
