import java.util.Scanner;

public class FootballPlayersMeanHeight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		
		double[] height = new double[11];
		double sum=0.0, meanHeight=0.0;
		System.out.print("Enter the height of football players : ");
		for(int i=0;i<height.length;i++){
			height[i] = in.nextDouble();
			sum += height[i];
		}
		
		meanHeight = sum/height.length;
		System.out.printf("The Mean height of the football players is %2f%n ",meanHeight);
		
		in.close();
	}
}