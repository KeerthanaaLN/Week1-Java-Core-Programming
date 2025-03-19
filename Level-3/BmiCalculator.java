import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        double weight = in.nextDouble();
        System.out.print("Enter height in cm: ");
        double heightCm = in.nextDouble();

        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        System.out.printf("\nYour BMI: %.2f\n", bmi);
        System.out.println("Weight Status: " + status);
    }
}