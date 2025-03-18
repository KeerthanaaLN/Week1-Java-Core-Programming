import java.util.Scanner;

class TotalIncomeCalculator{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float salary = in.nextFloat();
		float bonus = in.nextFloat();
		float totalIncome = salary+bonus;
		System.out.println("The salary is INR "+salary+" and bonus is INR "+bonus+". Hence Total Income is INR "+totalIncome);
	}
}