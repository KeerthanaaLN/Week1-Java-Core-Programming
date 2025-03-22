import java.util.*;

public class NumberChecker{
	public static int getDigitCount(int number){
		return  (int) String.valueOf(number).length();
	}
	
	public static int[] getDigitsArray(int number) {
		int count = getDigitCount(number);
		int[] digits = new int[count];
    
		for (int i = count - 1; i >= 0; i--) {
			digits[i] = number % 10;
			number /= 10;
		}
		return digits;
	}
	
	public static boolean isDuckNumber(int[] digits){
		for(int digit : digits){
			if(digit == 0)
				return false;
		} 
		return true;
	}
	
	public static boolean isArmstrongNumber(int[] digits, int originalNumber){
		int sum = 0, power = digits.length;
		for (int digit : digits) {
			sum += Math.pow(digit, power);
		}
		return sum == originalNumber;
	}
	
	public static int[] findLargestAndSecondLargest(int[] digits){
		int secondMax = Integer.MIN_VALUE,max = Integer.MIN_VALUE;
		for(int digit : digits){
			if(digit>max){
				secondMax=max;
				max=digit;
			}
			else if(digit>secondMax && digit!=max)
				secondMax = digit;
		}
		return new int[]{max,secondMax};
	}
	
	public static int[] findSmallestAndSecondSmallest(int[] digits){
		int secondSmall = Integer.MAX_VALUE,small = Integer.MAX_VALUE;
		for(int digit : digits){
			if(digit<small){
				secondSmall=small;
				small=digit;
			}
			else if(digit<secondSmall && digit!=small)
				secondSmall = digit;
		}
		return new int[]{small,secondSmall};
	}
	
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	
	System.out.print("Enter a number : ");
	int number = in.nextInt();
	    
	System.out.printf("Total number of digits : %d%n", getDigitCount(number));
	
	int[] digits = getDigitsArray(number);
    System.out.printf("Digits in a arrray : %s%n",Arrays.toString(digits));
	
    System.out.printf("%d is duck number : %s%n",number, isDuckNumber(digits)? "yes" : "no");	
	
	System.out.printf("%d is an Armstrong number: %s%n", number, isArmstrongNumber(digits, number) ? "yes" : "no");
	
	int[] largestNumbers = findLargestAndSecondLargest(digits);
    System.out.printf("Largest digit: %d, Second largest digit: %d%n", largestNumbers[0], largestNumbers[1]);

    int[] smallestNumbers = findSmallestAndSecondSmallest(digits);
	System.out.printf("Smallest digit: %d, Second smallest digit: %d%n", smallestNumbers[0], smallestNumbers[1]);
	
	in.close();
	}
}