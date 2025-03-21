import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[] salary = new double[10];
        double[] experience = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0.0, totalOldSalary = 0.0, totalNewSalary = 0.0;

        // Taking input for salaries and years of experience
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            salary[i] = in.nextDouble();
            
            System.out.print("Enter years of experience of employee " + (i + 1) + ": ");
            experience[i] = in.nextDouble();

            if (salary[i] < 0 && experience[i] < 0) {
                System.out.println("Kindly enter a valid salary and years of experience again!");
                i--; // Decrement index to take input again
            }
        }

        // Calculating new salary and bonus
        for (int i = 0; i < 10; i++) {
            double bonusPercentage = (experience[i] > 5) ? 0.05 : 0.02;
            double bonus = salary[i] * bonusPercentage;
            newSalary[i] = salary[i] + bonus;

            totalBonus += bonus;
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.printf("The total bonus payout for 10 employees is %.2f%n", totalBonus);
        System.out.printf("The total old salary of all employees is %.2f%n", totalOldSalary);
        System.out.printf("The total new salary after bonuses is %.2f%n", totalNewSalary);

        in.close();
    }
}
