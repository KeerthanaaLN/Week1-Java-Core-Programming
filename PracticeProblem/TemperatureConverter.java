import java.util.*;
class TemperatureConverter{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius : ");
        float Celsius = in.nextFloat();
        System.out.println("The  temperature in Fahrenheit : "+((Celsius * 9/5) + 32));
    }
}
