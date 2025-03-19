import java.util.Scanner;

class FactorialFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }
        int factorial = 1;
        for(int i=n;i>=1;i--){
			factorial *= i; 
        System.out.println("Factorial of " + n + " is: " + factorial);
        sc.close();
    }
}
