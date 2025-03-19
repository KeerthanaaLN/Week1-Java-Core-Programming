import java.util.Scanner;

public class PowerForCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);       
        System.out.print("Enter the base number: ");
        int number = in.nextInt();      
        System.out.print("Enter the exponent (positive integer): ");
        int power = in.nextInt();    
        if (power < 0) {
            System.out.println("Exponent should be a positive integer.");
        } else {
            int result = 1;
            
            for (int i = 1; i <= power; i++) {
                result *= number;
            }
            
            System.out.println(number + "^" + power + " = " + result);
        }
    }
}
