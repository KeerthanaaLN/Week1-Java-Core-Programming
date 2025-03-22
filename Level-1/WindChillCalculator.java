import java.util.*;

public class WindChillCalculator {
	public double calculateWindChill(double temperature, double windSpeed){
	double windChill = 35.74 + 0.6215 *temperature + (0.4275*temperature - 35.75) * Math.pow(windSpeed,0.16);
	return windChill;
	}
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		WindChillCalculator obj  = new WindChillCalculator();
		
		System.out.print("Enter temperature : ");
		double temperature = in.nextDouble();
		System.out.print("Enter wind Speed  : ");
		double windSpeed = in.nextDouble();
		
		System.out.print("Te wind chill is "+obj.calculateWindChill(temperature,windSpeed));
		System.out.println(" for the temperature "+temperature+" and wind speed of "+windSpeed);
	}
}