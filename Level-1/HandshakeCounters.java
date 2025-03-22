import java.util.*;

public class HandshakeCounters {
    public static int hsCalculations(int n) {
        return (n * (n - 1)) / 2; 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = in.nextInt();

        int result = hsCalculations(numberOfStudents);

        System.out.printf("Number of handshakes for %d students is %d%n", numberOfStudents, result);

        in.close();
    }
}