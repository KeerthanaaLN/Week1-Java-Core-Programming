import java.util.*;

public class NumberChecker3 {

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

    public static int[] getReverseArray(int[] digits) {
        int count = digits.length;
        int[] reversedDigits = new int[count];

        for (int i = 0; i < count; i++)
            reversedDigits[i] = digits[count - 1 - i];
        return reversedDigits;
    }

    public static boolean isCompare(int[] digits, int[] reversedDigits) {
        return Arrays.equals(digits, reversedDigits);
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) { 
            if (digits[i] == 0)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = in.nextInt();

        System.out.printf("Total number of digits: %d%n", getDigitCount(number));

        int[] digits = getDigitsArray(number);
        System.out.printf("Digits in an array: %s%n", Arrays.toString(digits));

        int[] reversedDigits = getReverseArray(digits);
        System.out.printf("Reversed Digits in an array: %s%n", Arrays.toString(reversedDigits));

        System.out.printf("Array Comparison (Palindrome check): %s%n", isCompare(digits, reversedDigits) ? "Yes" : "No");

        System.out.printf("%d is a Duck Number: %s%n", number, isDuckNumber(digits) ? "Yes" : "No");

        in.close();
    }
}
