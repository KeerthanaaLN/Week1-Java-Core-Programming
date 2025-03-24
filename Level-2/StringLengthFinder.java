import java.util.Scanner;

public class StringLengthFinder {
	
    public static int findStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		
        System.out.print("Enter a string: ");
        String inputString = in.next();
		
        int calculatedLength = findStringLength(inputString);
        int actualLength = inputString.length();
		
        System.out.println("Calculated Length (Custom Method): " + calculatedLength);
        System.out.println("Actual Length (Built-in Method): " + actualLength);
        
		in.close();
    }
}
