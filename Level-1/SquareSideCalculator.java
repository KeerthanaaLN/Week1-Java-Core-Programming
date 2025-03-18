import java.util.Scanner;

class SquareSideCalculator{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float perimeter = in.nextFloat();
		float side = perimeter/4;
		System.out.printf("The length of the side is %.2f whose perimeter is %.2f \n",side,perimeter);
	}
}