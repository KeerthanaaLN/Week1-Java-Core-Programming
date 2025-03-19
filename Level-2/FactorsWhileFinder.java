import java.util.Scanner;

class FactorsWhileFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = in.nextInt();
        if (number > 0) {
            System.out.println("Factors of " + number + " are:");
			int i=1;
            while(i < number) {
                if (number % i == 0) {
                    System.out.println(i);
                }
				i++;
            }
        } else {
            System.out.println("Please enter a positive number.");
        }
        
    }
}