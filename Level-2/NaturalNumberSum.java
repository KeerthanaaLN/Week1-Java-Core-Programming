import java.util.*;

public class NaturalNumberSum {
	
    public static int sum_natural_recursive(int number) {
        if (number == 1)
            return 1;
        return number + sum_natural_recursive(number - 1);
    }

    public static int sum_natural_formula(int number) {
        return number * (number + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = in.nextInt();

        if (number > 0) {
            int result1 = sum_natural_recursive(number);
            int result2 = sum_natural_formula(number);

            System.out.println("Sum using recursion: " + result1);
            System.out.println("Sum using formula: " + result2);

            if (result1 == result2)
                System.out.println("Both the computed sums are equal. The implementation is correct!");
            else
                System.out.println("Mismatch in computed sums. There might be an issue in the logic.");
        } else {
            System.out.println("Please enter a natural number (greater than 0).");
            System.exit(0);
        }
        
        in.close();
    }
}
