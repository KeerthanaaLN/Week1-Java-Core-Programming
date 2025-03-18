import java.util.*;
class SimpleInterestCalculator{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the pricniple amount: ");
        float principle = in.nextFloat();
        System.out.print("Enter the rate of interest : ");
        float rate = in.nextFloat();
        System.out.print("Enter the time period : ");
        float time = in.nextFloat();
        System.out.println("Simple Interest : "+((principle * rate * time)/100));
    }
}
