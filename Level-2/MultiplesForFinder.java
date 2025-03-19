import java.util.*;

class MultiplesForFinder{
	public static void main(String[] args){
		int greatestFactor = 1;
		Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
		int number = in.nextInt();
		if(number>0 && number<100){
			for(int i=100;i>=1;i--){
				if(number%i==0){
					System.out.println(i);
					continue;
				}
			}
		}
	}
}