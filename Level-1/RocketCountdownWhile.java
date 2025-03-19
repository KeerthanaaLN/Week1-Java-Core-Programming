import java.util.Scanner;

class RocketCountdownWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter countdown start number: ");
        int counter = in.nextInt();
		while (counter>=1){
			System.out.println(counter);
			counter-=1;
		}
	}
}