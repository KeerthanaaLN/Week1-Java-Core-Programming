import java.util.*;
class NaturalSumFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println(n + " is not a natural number.");
            return;
        }
        int sum = 0;
        for(int i=1;i<=n;i++) sum += i;
        System.out.println("Sum using loop: " + sum);
        System.out.println("Sum using formula: " + (n * (n + 1) / 2));
    }
}