import java.util.Scanner;

public class UnitConverter {

    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter distance in meters (m): ");
        double meters = in.nextDouble();

        System.out.print("Enter distance in feet: ");
        double feet = in.nextDouble();

        System.out.print("Enter distance in yards: ");
        double yards = in.nextDouble();

        System.out.print("Enter distance in inches: ");
        double inches = in.nextDouble();

        System.out.printf("Yards to Feet: %.3f feet%n", convertYardsToFeet(yards));
        System.out.printf("Feet to Yards: %.3f yards%n", convertFeetToYards(feet));
        System.out.printf("Meters to Inches: %.3f inches%n", convertMetersToInches(meters));
        System.out.printf("Inches to Meters: %.3f meters%n", convertInchesToMeters(inches));
        System.out.printf("Inches to Centimeters: %.3f cm%n", convertInchesToCentimeters(inches));

        in.close();
    }
}
