import java.util.*;
class StudentFeeCalculator{
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);		
        double fee = in.nextDouble();
        double discountPercent = in.nextDouble();   
		double discount_variable = fee/discountPercent;
		double discount_fee = fee - discount_variable;
        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f\n",discount_variable,discount_fee);
    }
}