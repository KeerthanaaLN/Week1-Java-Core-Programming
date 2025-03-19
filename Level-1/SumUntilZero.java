import java.util.Scanner;

class SumUntilZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total = 0.0;
        System.out.print("Enter a number (0 to stop): ");
        double number = in.nextDouble();
        while (number != 0) {
            total += number;  
            System.out.print("Enter a number (0 to stop): ");
            number = in.nextDouble();
        }
        System.out.println("Total sum: " + total);
        in.close();
    }
}
