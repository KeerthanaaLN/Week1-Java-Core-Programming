import java.util.*;

class GreatestFactorForFinder{
	public static void main(String[] args){
		int greatestFactor = 1;
		Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
		int number = in.nextInt();
		for(int i=number-1;i>=1;i--){
			if(number%i==0){
				greatestFactor = i;
				break;
			}
		}
		System.out.println("The greatest Factor of "+number+" is "+greatestFactor);
	}
}