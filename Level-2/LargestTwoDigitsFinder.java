import java.util.Scanner;

public class LargestTwoDigitsFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = in.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (number != 0) {
            int remainder = number % 10;
            digits[index++] = remainder;
            number /= 10;

            // Ensure we don't exceed the initial array size
            if (index == maxDigit) break;
        }

        // Finding the largest and second largest digits
        int largest = -1, secondLargest = -1;
        
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        in.close();
    }
}
