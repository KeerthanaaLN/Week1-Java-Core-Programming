import java.util.Scanner;

class RocketCountdownFor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter countdown start number: ");
        int counter = in.nextInt();
		for(int i=counter;i>=1;i--)
			System.out.println(i);
	}
}