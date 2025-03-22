import java.util.*;

public class NumberChecker2 {

    public static int getDigitCount(int number) {
        return String.valueOf(number).length();
    }

    public static int[] getDigitsArray(int number) {
        int count = getDigitCount(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static int getSumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static int getSumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = getSumOfDigits(digits);
        return number % sum == 0;
    }

    public static int[][] getDigitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];

        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }

        for (int digit : digits) {
            frequency[digit][1]++;
        }
        return frequency;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = in.nextInt();

        System.out.printf("Total number of digits: %d%n", getDigitCount(number));

        int[] digits = getDigitsArray(number);
        System.out.printf("Digits in an array: %s%n", Arrays.toString(digits));

        System.out.printf("Sum of digits: %d%n", getSumOfDigits(digits));

        System.out.printf("Sum of squares of digits: %d%n", getSumOfSquaresOfDigits(digits));

        System.out.printf("%d is a Harshad number: %s%n", number, isHarshadNumber(number, digits) ? "yes" : "no");

        int[][] frequency = getDigitFrequency(digits);
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.printf("Digit %d occurs %d times%n", frequency[i][0], frequency[i][1]);
            }
        }

        in.close();
    }
}
