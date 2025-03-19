import java.util.Scanner;

class LargestChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int number1 = in.nextInt(), number2 = in.nextInt(), number3 = in.nextInt();
        
        System.out.println("Is the first number the largest? " + (number1 > number2 && number1 > number3) + "\n" +
                           "Is the second number the largest? " + (number2 > number1 && number2 > number3) + "\n" +
                           "Is the third number the largest? " + (number3 > number1 && number3 > number2));
    }
}
