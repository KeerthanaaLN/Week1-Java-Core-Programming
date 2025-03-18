import java.util.*;
class CelsiusToFahrenheitConverter{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float celsius = in.nextFloat();
		float farenheitResult = (Celsius * 9/5) + 32;
        System.out.println("The "+celsius+" celsius is "+farenheitResult+" fahrenheit");
    }
}
