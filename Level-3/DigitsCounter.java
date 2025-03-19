import java.util.Scanner;

public class DigitsCounter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();
		int originalNumber=number,reminder=0;
		int count = 0;
		while(number!=0){
			reminder=number%10;
			count+=1;
			number/=10;
		}
		System.out.println("No of digits in "+originalNumber+" is "+count);
	}
}
        