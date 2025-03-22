import java.util.*;

public class NumberSignChecker {
	public static void signChecker(int n){
		if(n==0)
			System.out.println("It is zero");
		else if(n>0)
			System.out.println(n+" is a positive number");
		else
			System.out.println(n+" is a negative number");
	}
	public static void main(String[] args){
		Scanner in =new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int number = in.nextInt();
		
		signChecker(number);
		in.close();

	}
}	
		