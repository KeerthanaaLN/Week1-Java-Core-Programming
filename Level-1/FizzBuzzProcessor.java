import java.util.Scanner;

public class FizzBuzzProcessor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = in.nextInt();

        if (number < 0) {
            System.out.println("Error: Please enter a positive integer.");
            return;
        }
		
        String[] result = new String[number + 1];

        // Process FizzBuzz logic
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                result[i] = "Fizz";
            } else if (i % 5 == 0) {
                result[i] = "Buzz";
            } else {
                result[i] = String.valueOf(i);  // Convert int to String
            }
        }

        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + result[i]);
        }

        in.close();
    }
}
