import java.util.*;

public class NumberChecker5 {
    
    public static int[] getFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }
    
    public static int getGreatestFactor(int[] factors) {
        int max = factors[0];
        for (int i = 1; i < factors.length; i++) {
            if (factors[i] > max)
                max = factors[i];
        }
        return max;
    }
    
    public static int getSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors)
            sum += factor;
        return sum;
    }
    
    public static int getProductOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors)
            product *= factor;
        return product;
    }
    
    public static double getProductCubeOfFactors(int[] factors) {
        double productCube = 1;
        for (int factor : factors)
            productCube *= Math.pow(factor, 3);
        return productCube;
    }
    
    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
    
    public static boolean isAbundantNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum > number;
    }
    
    public static boolean isDeficientNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum < number;
    }
    
    public static boolean isStrongNumber(int number) {
        int sum = 0, temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += computeFactorial(digit);
            temp /= 10;
        }
        return sum == number;
    }
    
    public static int computeFactorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        
        int[] factors = getFactors(number);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Greatest Factor: " + getGreatestFactor(factors));
        System.out.println("Sum of Factors: " + getSumOfFactors(factors));
        System.out.println("Product of Factors: " + getProductOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + getProductCubeOfFactors(factors));
        System.out.println("Is Perfect Number? " + isPerfectNumber(number));
        System.out.println("Is Abundant Number? " + isAbundantNumber(number));
        System.out.println("Is Deficient Number? " + isDeficientNumber(number));
        System.out.println("Is Strong Number? " + isStrongNumber(number));
        
        in.close();
    }
}
