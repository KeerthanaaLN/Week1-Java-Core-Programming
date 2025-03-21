import java.util.Scanner;

public class DigitFrequencyCounter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        
        int[] frequency = new int[10];

        // Count frequency directly while extracting digits
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10; 
            frequency[digit]++;    
            temp /= 10;            
        }

        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " times");
            }
        }       
        in.close();
    }
}
