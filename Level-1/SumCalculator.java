import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
		double[] number = new double[10];
		double total =0.0;
		int index=0;
		System.out.print("Enter numbers : ");
		while(true){
			double num = in.nextDouble();
			if(num<=0)
				break;
			if(index<10){
				number[index]=num;
				index++;
			}
		}
		for(int i=0;i<number.length;i++){
			total+=number[i];
		}
		System.out.println("The total value is : "+total);
		
		in.close();
	}
}