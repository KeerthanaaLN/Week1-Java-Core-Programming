import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number (6-9): ");
        int number = in.nextInt();
		if(number>=6 && number<=9){
			for(int i=1;i<=12;i++)
				System.out.println(number+" * "+i+" = "+number*i);
		}
		else {
            System.out.println("Please enter a number between 6 and 9.");
        }
	}
}