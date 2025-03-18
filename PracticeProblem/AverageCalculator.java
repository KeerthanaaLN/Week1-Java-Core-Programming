import java.util.*;
class AverageCalculator{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = in.nextInt();
        System.out.print("Enter the second number : ");
        int b = in.nextInt();        
        System.out.print("Enter the third number : ");
        int c = in.nextInt();
        System.out.println("Average of 3 numbers : "+((a+b+c)/3));
    }
}
