import java.util.*;

public class NaturalNumberSumCalculator {
	public static int sumNaturalNumbers(int number){
		int sum=0;
		for(int i=1;i<=number;i++){
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int number = in.nextInt();
		
		System.out.println("The sum of "+number+" is : "+sumNaturalNumbers(number));
		in.close();
	}
}
		
		