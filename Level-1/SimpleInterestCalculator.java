import java.util.*;

public class SimpleInterestCalculator {
    public static double siCalculations(double p, double r, int t) {
        return (p * r * t) / 100; 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = in.nextDouble();

        System.out.print("Enter rate of interest: ");
        double rate = in.nextDouble();

        System.out.print("Enter time period: ");
        int time = in.nextInt();

        double result = siCalculations(principal, rate, time);

        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f, and Time %d%n",
                result, principal, rate, time);

        in.close();
    }
}
