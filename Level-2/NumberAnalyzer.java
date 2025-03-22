import java.util.*;

public class NumberAnalyzer {

    public static String isPositive(int num) {
        return (num >= 0) ? "Positive" : "Negative";
    }

    public static String isEven(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }

    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void displayComparison(int first, int last) {
        int comparisonResult = compare(first, last);
        if (comparisonResult == 1) {
            System.out.println("First number is greater than the last number.");
        } else if (comparisonResult == 0) {
            System.out.println("First number is equal to the last number.");
        } else {
            System.out.println("First number is less than the last number.");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] number = new int[5];

        for (int i = 0; i < number.length; i++) {
            System.out.print("Enter number " + (i + 1) + " : ");
            number[i] = in.nextInt();
        }

        for (int i = 0; i < number.length; i++) {
            System.out.println("Number " + number[i] + " is " + isPositive(number[i]));
            if (number[i] >= 0) {
                System.out.println("It is " + isEven(number[i]));
            }
        }

        displayComparison(number[0], number[4]);

        in.close();
    }
}
