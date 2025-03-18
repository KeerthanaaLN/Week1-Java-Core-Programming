import java.util.*;
class QuotientAndRemainderCalculator{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		float number1 = in.nextFloat();
		float number2 = in.nextFloat();
		float quotient = number1/number2;
		float reminder = number1%number2;
		System.out.printf("The Quotient is %.2f and Reminder is %.2f of two number %.2f and %.2f\n",quotient,reminder,number1,number2);
	}
}