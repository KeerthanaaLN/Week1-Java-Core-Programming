import java.util.*;

class MaximumFinder{

	void inputValues(){
		Scanner in = new Scanner(System.in);

		System.out.print("Enter first number : ");
		int first = in.nextInt();
		
		System.out.print("Enter second number : ");
		int second = in.nextInt();
		
		System.out.print("Enter third number : ");
		int third = in.nextInt();

		System.out.printf("The maximum of 3 number is : %d%n",findMax(first,second,third));
		in.close();
	}
	
	int findMax(int first,int second,int third){
		return (Math.max(first,Math.max(second,third)));
	}

	public static void main(String[] args){
		MaximumFinder finder = new MaximumFinder();
		
		finder.inputValues();
	}
}