import java.util.*;
import java.lang.Math.*;
class PowerCalculator{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base value : ");
        int base = in.nextInt();
        System.out.print("Enter the exponent value : ");
        int exponent = in.nextInt();        
        System.out.println("Result : "+(Math.pow(base,exponent)));
    }
}
