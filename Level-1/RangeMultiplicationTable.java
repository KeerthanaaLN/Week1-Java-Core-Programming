import java.util.Scanner;

public class RangeMultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number for multiplication: ");
        int number = in.nextInt();

        int[] multiplicationResult = new int[4]; // Array to store results from 6 to 9

        for (int i = 0; i < multiplicationResult.length; i++) {
            multiplicationResult[i] = number * (i + 6); 
        }

        System.out.println("Multiplication Table from 6 to 9:");
        for (int i = 0; i < multiplicationResult.length; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }

        in.close();
    }
}
