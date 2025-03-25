import java.util.Scanner;

public class GCDLCMCalculator {
    
    public static int calculateGCD(int num1, int num2) {
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    public static int calculateLCM(int num1, int num2) {
        return Math.abs(num1 / calculateGCD(num1, num2) * num2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int first = in.nextInt();
        
        System.out.print("Enter second number: ");
        int second = in.nextInt();
        
        int gcd = calculateGCD(first, second);
        int lcm = calculateLCM(first, second);
        
        System.out.println("Greatest Common Divisor (GCD): " + gcd);
        System.out.println("Least Common Multiple (LCM): " + lcm);
        
        in.close();
    }
}
