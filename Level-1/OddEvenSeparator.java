import java.util.Scanner;

public class OddEvenSeparator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the range: ");
        int number = in.nextInt();

        if (number <= 0) {
            System.out.println("Error: Please enter a natural number greater than zero.");
            in.close();
            return;
        }

        int[] even = new int[number / 2 + 1];
        int[] odd = new int[number / 2 + 1];
        int evenIndex = 0, oddIndex = 0;

        // Separate odd and even numbers
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenIndex++] = i;
            } else {
                odd[oddIndex++] = i;
            }
        }

        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }

        System.out.print("\nEven numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }

        System.out.println(); 
        in.close();
    }
}
