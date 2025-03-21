import java.util.Scanner;

public class YoungestAndTallestFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String[] name = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[name.length];
        int[] height = new int[name.length];

        for (int i = 0; i < name.length; i++) {
            System.out.print("Enter " + name[i] + "'s age: ");
            age[i] = in.nextInt();
            System.out.print("Enter " + name[i] + "'s height (in cm): ");
            height[i] = in.nextInt();
        }

        // Initialize with the first friend's data
        String youngest = name[0];
        String tallest = name[0];
        int youngestAge = age[0];
        int tallestHeight = height[0];

        for (int i = 1; i < name.length; i++) {
            if (age[i] < youngestAge) {
                youngestAge = age[i];
                youngest = name[i];
            }
            if (height[i] > tallestHeight) {
                tallestHeight = height[i];
                tallest = name[i];
            }
        }

        System.out.println("\nThe youngest friend is: " + youngest + " (Age: " + youngestAge + ")");
        System.out.println("The tallest friend is: " + tallest + " (Height: " + tallestHeight + " cm)");
        in.close();
    }
}
