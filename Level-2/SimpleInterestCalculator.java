import java.util.*;
class SimpleInterestCalculator{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float principle = in.nextFloat();
        float rate = in.nextFloat();
        float time = in.nextFloat();
		float simpleInterest = (principle * rate * time)/100;
        System.out.print("The Simple Interest is : "+simpleInterest+" for Principal "+principle+". Rate of interest "+rate+" and Time "+time);
    }
}
