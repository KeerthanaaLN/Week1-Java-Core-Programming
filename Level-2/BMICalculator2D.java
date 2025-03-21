import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Taking number of persons as input
        System.out.print("Enter number of persons: ");
        int number = in.nextInt();

        double[][] personData = new double[number][3]; // Stores weight, height, and BMI
        String[] weightStatus = new String[number]; // Stores weight status

        // Taking input for each person
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for person " + (i + 1) + ":");

            // Get valid weight input
            double weight;
            do {
                System.out.print("Enter weight (positive value): ");
                weight = in.nextDouble();
            } while (weight <= 0);

            // Get valid height input
            double height;
            do {
                System.out.print("Enter height (positive value): ");
                height = in.nextDouble();
            } while (height <= 0);

            // Calculate BMI
            double bmi = weight / (height * height);

            // Determine weight status
            String status;
            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 24.9) status = "Normal";
            else if (bmi < 29.9) status = "Overweight";
            else status = "Obese";

            // Storing values
            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = bmi;
            weightStatus[i] = status;
        }

        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight(kg)", "Height(m)", "BMI", "Status");
        System.out.println("-------------------------------------------------");

        for (int i = 0; i < number; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n",
                personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        in.close();
    }
}
