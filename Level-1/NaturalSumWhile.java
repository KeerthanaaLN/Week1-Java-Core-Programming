import java.util.*;
class NaturalSumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println(n + " is not a natural number.");
            return;
        }
        int sum = 0, i = 1;
        while (i <= n) sum += i++;
        System.out.println("Sum using loop: " + sum);
        System.out.println("Sum using formula: " + (n * (n + 1) / 2));
    }
}