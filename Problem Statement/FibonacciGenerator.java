import java.util.*;

class FibonacciGenerator {

    static int[] getFibonacci(int number) {
        int[] a = new int[number];
        if (number > 0) a[0] = 0;
        if (number > 1) a[1] = 1;

        int n1 = 0, n2 = 1, temp;
        for (int i = 2; i < number; i++) {
            temp = n1 + n2;
            a[i] = temp;
            n1 = n2;
            n2 = temp;
        }
        return a;
    }

    static void display(int[] a) {
        for (int num : a)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms: ");
        int number = in.nextInt();

        int[] fibonacciSeries = getFibonacci(number);
        display(fibonacciSeries);

        in.close();
    }
}
