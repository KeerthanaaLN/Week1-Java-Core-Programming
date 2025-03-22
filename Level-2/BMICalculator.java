import java.util.Scanner;

public class BMICalculator {

    public static double calculateBMI(double weight, double heightCm) {
        double heightMeters = heightCm / 100.0;
        return weight / (heightMeters * heightMeters);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[][] bmiData = new double[10][3];
        String[] bmiStatus = new String[10]; 

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + " : ");
            bmiData[i][0] = in.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + " : ");
            bmiData[i][1] = in.nextDouble();

            bmiData[i][2] = calculateBMI(bmiData[i][0], bmiData[i][1]);
            bmiStatus[i] = getBMIStatus(bmiData[i][2]);
        }

        System.out.println("\nBMI Analysis Results:\n");

		for (int i = 0; i < 10; i++) {
			System.out.printf("Person %d has a weight of %.2f kg and a height of %.2f cm.\n\tTheir BMI is %.2f, which falls under the '%s' category.%n%n",
        (i + 1), bmiData[i][0], bmiData[i][1], bmiData[i][2], bmiStatus[i]);
		}

        in.close();
    }
}
