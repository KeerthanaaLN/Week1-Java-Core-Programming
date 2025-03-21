import java.util.Scanner;

public class MultiplicationTableGenerator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a number for multiplication: ");
        int number = in.nextInt();
        
        int[] result = new int[10];
        System.out.println("Result:");

        for (int i = 0; i < result.length; i++) {
            result[i] = number * (i + 1);
            System.out.println(number + " * " + (i + 1) + " = " + result[i]);
        }

        in.close();
    }
}
