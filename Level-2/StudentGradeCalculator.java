import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int number = in.nextInt();
        
        double[] marks = new double[number];
        double[] percentage = new double[number];
        char[] grade = new char[number];

        for (int i = 0; i < number; i++) {
            double physics, chemistry, maths;
            
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            // Validating input for physics
            physics = getValidMarks(in, "Physics");
            chemistry = getValidMarks(in, "Chemistry");
            maths = getValidMarks(in, "Maths");

            marks[i] = physics + chemistry + maths;
        }

        for (int i = 0; i < number; i++) {
            percentage[i] = (marks[i] / 300)*100;
            
            if (percentage[i] >= 80)
                grade[i] = 'A';
            else if (percentage[i] >= 70)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else if (percentage[i] >= 50)
                grade[i] = 'D';
            else if (percentage[i] >= 40)
                grade[i] = 'E';
            else
                grade[i] = 'F';
        }

        System.out.println("\nStudent Results:");
        System.out.println("--------------------------------------------------------");
        System.out.println("Student\tMarks\tPercentage\tGrade");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < number; i++) {
            System.out.printf("%d\t%.2f\t%.2f%%\t\t%c\n", 
                (i + 1), marks[i], percentage[i], grade[i]);
        }

        in.close();
    }

    // Function to validate marks input
    public static double getValidMarks(Scanner in, String subject) {
        double marks;
        do {
            System.out.print(subject + " Marks (0-100): ");
            marks = in.nextDouble();
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid input! Marks should be between 0 and 100. Try again.");
            }
        } while (marks < 0 || marks > 100);
        return marks;
    }
}
