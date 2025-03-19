import java.util.Scanner;

class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = in.nextDouble();  
        System.out.print("Enter years of experience: ");
        int experience = in.nextInt();

        if (experience > 5) {
            double bonusAmount = salary * 0.05;
            System.out.printf("Bonus Amount: %.2f | Salary: %.2f | Experience: %d years%n", bonusAmount, salary, experience);
        } else {
            System.out.println("Employee has less than 5 years of experience, so no bonus is provided.");
        }
    }
}
