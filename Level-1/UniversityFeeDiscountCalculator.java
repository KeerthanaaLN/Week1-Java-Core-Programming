class UniversityFeeDiscountCalculator{
    public static void main(String[] args) {
        int fee = 125000;
        int discountPercent = 10;   
		int discount_variable = fee/discountPercent;
		int discount_fee = fee - discount_variable;
        System.out.printf("The discount amount is INR %d and final discounted fee is INR %d\n",discount_variable,discount_fee);
    }
}