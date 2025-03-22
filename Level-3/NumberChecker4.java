import java.util.*;

public class NumberChecker4 {

    public static boolean isPrimeNumber(int number) {
        if (number <= 1) 
			return false;
		
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isNeonNumber(int number) {
        int square = number*number;
        int sum = 0;

        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    public static boolean isSpyNumber(int number) {
        int sum = 0, product = 1, digit;
        
        while (number > 0) {
            digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphicNumber(int number) {
        int square = number*number;;
		String numberString = String.valueOf(number);
		String squareString = String.valueOf(number);
		
		return squareString.endsWith(numberString);
        
    }

    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = in.nextInt();

        System.out.printf("%d is a prime number: %s%n", number, isPrimeNumber(number) ? "yes" : "no");
        System.out.printf("%d is a neon number: %s%n", number, isNeonNumber(number) ? "yes" : "no");
        System.out.printf("%d is a spy number: %s%n", number, isSpyNumber(number) ? "yes" : "no");
        System.out.printf("%d is an automorphic number: %s%n", number, isAutomorphicNumber(number) ? "yes" : "no");
        System.out.printf("%d is a buzz number: %s%n", number, isBuzzNumber(number) ? "yes" : "no");

        in.close();
    }
}
