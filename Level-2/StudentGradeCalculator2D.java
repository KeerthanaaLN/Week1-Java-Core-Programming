import java.util.Scanner;

public class StudentGradeCalculator2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Taking number of students as input
        System.out.print("Enter number of students: ");
        int number = in.nextInt();
        
        double[][] marks = new double[number][3]; // Stores physics, chemistry, maths marks
        double[][] percentageGrades = new double[number][1]; // Stores percentage
        String[] grades = new String[number]; // Stores grades

        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter the details of Student " + (i + 1) + ":");

            double physics;
            do {
                System.out.print("Enter Physics marks (0-100): ");
                physics = in.nextDouble();
                if (physics < 0 || physics > 100)
                    System.out.println("Invalid input! Marks should be between 0 and 100.");
            } while (physics < 0 || physics > 100);

            double chemistry;
            do {
                System.out.print("Enter Chemistry marks (0-100): ");
                chemistry = in.nextDouble();
                if (chemistry < 0 || chemistry > 100)
                    System.out.println("Invalid input! Marks should be between 0 and 100.");
            } while (chemistry < 0 || chemistry > 100);

            double maths;
            do {
                System.out.print("Enter Maths marks (0-100): ");
                maths = in.nextDouble();
                if (maths < 0 || maths > 100)
                    System.out.println("Invalid input! Marks should be between 0 and 100.");
            } while (maths < 0 || maths > 100);

            double totalMarks = physics + chemistry + maths;
            double percentage = totalMarks / 3.0;

            String grade;
            if (percentage >= 80) grade = "A";
            else if (percentage >= 70) grade = "B";
            else if (percentage >= 60) grade = "C";
            else if (percentage >= 50) grade = "D";
            else if (percentage >= 40) grade = "E";
            else grade = "F";

            marks[i][0] = physics;
            marks[i][1] = chemistry;
            marks[i][2] = maths;
            percentageGrades[i][0] = percentage;
            grades[i] = grade;
        }

        System.out.println("\n--- Student Report ---");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n", 
            "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < number; i++) {
            System.out.printf("%-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10s\n",
                "Student " + (i + 1), marks[i][0], marks[i][1], marks[i][2], 
                percentageGrades[i][0], grades[i]);
        }

        in.close();
    }
}
