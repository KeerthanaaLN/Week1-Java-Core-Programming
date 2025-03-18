class ProfitAndLossCalculator{
    public static void main(String[] args) {
        int cost_price = 129, selling_price = 191;
        double profit = selling_price - cost_price; 
        double profit_percentage = (profit / cost_price) * 100; 

        System.out.printf("The Cost Price is INR %d and Selling Price is INR %d%n", cost_price, selling_price);
        System.out.printf("The Profit is INR %.2f and the Profit Percentage is %.2f%n", profit, profit_percentage);
    }
}
