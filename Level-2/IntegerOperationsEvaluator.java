import java.util.*;

class IntegerOperationsEvaluator{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", and " + result3 + ".");
    }
}
