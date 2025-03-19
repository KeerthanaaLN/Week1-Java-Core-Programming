import java.util.*;

class MultiplesWhileFinder{
	public static void main(String[] args){
		int greatestFactor = 1,i=100;
		Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
		int number = in.nextInt();
		if(number>0 && number<100){
			while(i>=1){
				if(number%i==0){
					System.out.println(i);
				}
				i--;
			}
		}
	}
}