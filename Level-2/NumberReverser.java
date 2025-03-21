import java.util.Scanner;

public class NumberReverser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        
        String numberString = String.valueOf(number);
        int length = numberString.length();

        int[] digits = new int[length];

        // Store digits in reverse order
        for (int i = 0; i < length; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        // Print the reversed number
        System.out.print("Reversed number: ");
        for (int digit : digits) {
            System.out.print(digit);
        }

        System.out.print("\n");
        in.close();
    }
}
