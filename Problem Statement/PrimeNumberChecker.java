import java.math.BigInteger;
import java.util.Scanner;

class PrimeNumberChecker {

    static boolean isPrimeNumber(int n) {
        return BigInteger.valueOf(n).isProbablePrime(1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = in.nextInt();

        if (isPrimeNumber(number))
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");

        in.close();
    }
}
