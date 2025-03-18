import java.util.Scanner;

class TotalPurchasePriceCalculator{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float unitPrice = in.nextFloat();
		float quantity = in.nextFloat();
		float total = unitPrice*quantity;
        System.out.printf("The total purchase price is INR %.2f if the quantity %.2f and unit price is INR %.2f",total,quantity, unitPrice);
	}
}