import java.util.Scanner;

public class PowerWhileCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the base number: ");
        int number = in.nextInt();
        
        System.out.print("Enter the power: ");
        int power = in.nextInt();
        
        if (power < 0) {
            System.out.println("Please enter a positive integer for power.");
        } else {
            int result = 1;
            int counter = 0;        
            while (counter < power) {
                result *= number;
                counter++;
            }         
            System.out.println(number + " raised to the power of " + power + " is: " + result);
        }
    }
}