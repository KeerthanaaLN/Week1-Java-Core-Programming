import java.util.*;

class DoubleOperationsEvaluator{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", and " + result3 + ".");
    }
}