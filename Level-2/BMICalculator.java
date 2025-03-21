import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter number of persons: ");
        int number = in.nextInt();
		
		double[] weight = new double[number];
		double[] height = new double[number];
		double[] bmi = new double[number];
		String[] weightStatus = new String[number];
		
		for(int i=0;i<number;i++){
			System.out.print("Enter person "+(i+1)+" weight(kg) : ");
			weight[i] = in.nextDouble();
			System.out.print("Enter person "+(i+1)+" height(m) : ");
			height[i] = in.nextDouble();

			bmi[i]=weight[i] / Math.pow(height[i],2); 
			
			if(bmi[i]>=40.0)
				weightStatus[i]="obese";
			else if(bmi[i]>=25.0)
				weightStatus[i]="Over Weight";
			else if(bmi[i]>=18.5)
				weightStatus[i]="Normal";
			else
				weightStatus[i]="Under weight";
		}
		for(int i=0;i<number;i++){
			System.out.printf("Person %d\n \t Height: %.2f m -- Weight: %.2f kg -- BMI: %.2f -- Weight Status: %s%n",
                  (i+1), height[i], weight[i], bmi[i], weightStatus[i]);
		}
		in.close();
	}
}
		
		
						
