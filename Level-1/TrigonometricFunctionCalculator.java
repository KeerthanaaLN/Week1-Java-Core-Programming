import java.util.*;

public class TrigonometricFunctionCalculator{
	public double[] calculateTrigonometricFunctions(double angle){
	double sin = Math.sin(angle);
	double cos = Math.cos(angle);
	double tan = Math.tan(angle);
	return new double[] {sin,cos,tan};
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Angle : ");
		double angle = in.nextDouble();
		
		double radians = Math.toRadians(angle);
		double[] result = TrigonometricFunctionCalculator(radians);
		
		System.out.println("The angle is : "+angle+" and sin : "+result[0]+", cos : "+result[1]+", tan : "+reslut[2]);
		
	}
}