import java.util.*;

public class QuotientRemainderFinder {
	public static float[] findRemainderAndQuotient(int number, int divisor){
		float quotient = number/divisor;
		int remainder = number%divisor;
		return new float[] {quotient,remainder};
	}			
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter frist number : ");
		int number1 = in.nextInt();
		System.out.print("Enter second number : ");
		int number2 = in.nextInt();
		
		float[] result = findRemainderAndQuotient(number1,number2);
		
		System.out.println("The quotient of " + number1 + " and " + number2 + " is " + result[0] +
                    " and the remainder is " + (int) result[1]);
        in.close();
    }
}