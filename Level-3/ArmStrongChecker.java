import java.util.Scanner;

public class ArmStrongChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        
        int sum = 0, originalNumber = number, remainder;
        int digits = String.valueOf(number).length();

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            sum += Math.pow(remainder, digits);
            originalNumber /= 10;
        }

        if (sum == number)
            System.out.println(number + " is an Armstrong number");
        else
            System.out.println(number + " is not an Armstrong number");
    }
}
