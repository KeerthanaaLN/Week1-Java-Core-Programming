import java.util.Scanner;

class HandshakeCalculator{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfStudents = in.nextInt();
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.printf("The maximum number of handshakes among %d students is %d \n",numberOfStudents,maxHandshakes);
    }
}
