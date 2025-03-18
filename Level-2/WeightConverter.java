import java.util.Scanner;

class WeightConverter{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float pound = in.nextFloat();
		float weight = pound * 2.2f;
		System.out.println("The weight of the person in pound is "+pound+" and in kg is "+weight);
	}
}