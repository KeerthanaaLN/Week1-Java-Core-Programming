import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        
        if (number < 2) {
            System.out.println(number + " is not a Prime Number");
        } else {
            boolean isPrime = true;

            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
                System.out.println(number + " is a Prime Number");
            else
                System.out.println(number + " is not a Prime Number");
        }
    }
}
