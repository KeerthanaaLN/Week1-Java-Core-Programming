import java.util.*;
class FahrenheitToCelsiusConverter{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float fahrenheit= in.nextFloat();
		float celsiusResult  = (fahrenheit-32)*(5f/9);
        System.out.println("The "+fahrenheit+" fahrenheit is "+celsiusResult +" celsius");
    }
}
