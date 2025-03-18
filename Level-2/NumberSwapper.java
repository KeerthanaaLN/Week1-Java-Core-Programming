import java.util.Scanner;

class NumberSwapper{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int number1 = in.nextInt();
		int number2 = in.nextInt();
		number1 = number1 - number2;
		number2 = number2 + number1;
		number1 = number2 - number1;
		System.out.println("The swapped numbers are "+number1+" and "+number2);
	}
}