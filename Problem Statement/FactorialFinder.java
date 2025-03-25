import java.util.*;

class FactorialFinder {
    
    static int getInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        in.close();
        return number;
    }

    static int getFactorial(int number) {
        if (number == 0 || number == 1)
            return 1;
        return number * getFactorial(number - 1);
    }

    static void display(int number, int factorial) {
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static void main(String[] args) {
        int number = getInput();
        int factorial = getFactorial(number);
        display(number, factorial);
    }
}
