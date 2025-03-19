import java.util.Scanner;

public class HarshadNumberChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();
		
		int originalNumber=number,reminder=0,sum=0;
		while(number!=0){
			reminder=number%10;
			sum +=reminder;
			number/=10;
		}
		if(originalNumber%sum==0)
			System.out.println(originalNumber+" is a Harshad Number");
		else
			System.out.println(originalNumber+" is not a Harshad Number");
	}
}