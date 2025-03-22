import java.util.*;

public class HandshakeCounter {
    public static int hsCalculations(int n) {
        return (n * (n - 1)) / 2; 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of students: ");
        int number = in.nextInt();

        int result = hsCalculations(number);

        System.out.printf("Number of handshakes for %d students is %d%n", number, result);

        in.close();
    }
}
