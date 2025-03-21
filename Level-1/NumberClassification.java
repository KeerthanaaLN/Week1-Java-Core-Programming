import java.util.Scanner;

public class NumberClassification {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		
		int[] number = new int[5];
		System.out.print("Enter the numbers : ");
		for(int i=0;i<number.length;i++){
			number[i] = in.nextInt();
		}
		for(int i=0;i<number.length;i++){
			if(number[i]==0)
				System.out.println("The number is zero");
			else if(number[i]>0){
				if(number[i]%2==0)
					System.out.println(number[i]+" is a even number");
				else
					System.out.println(number[i]+" is odd number");					
			}
			else
				System.out.println(number[i] + " is a negative number");
		}
		if (number[0] > number[number.length-1]) {
            System.out.println("First number is greater than last number.");
        } else if (number[0] < number[number.length-1]) {
            System.out.println("First number is less than last number.");
        } else {
            System.out.println("First and last numbers are equal.");
        }
		in.close();
	}
}