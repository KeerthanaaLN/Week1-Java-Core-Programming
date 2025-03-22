import java.util.*;

public class AgeHeightAnalyzer {

    public static void youngestChecker(int[] age, String[] name) {
        int youngestAge = age[0];
        String youngestName = name[0];

        for (int i = 1; i < name.length; i++) {
            if (age[i] < youngestAge) {
                youngestAge = age[i];
                youngestName = name[i];
            }
        }
        System.out.println("The youngest person is " + youngestName + " with age " + youngestAge);
    }

    public static void tallestChecker(float[] height, String[] name) {
        float tallestHeight = height[0];
        String tallestName = name[0];

        for (int i = 1; i < name.length; i++) {
            if (height[i] > tallestHeight) {
                tallestHeight = height[i];
                tallestName = name[i];
            }
        }
        System.out.println("The tallest person is " + tallestName + " with height " + tallestHeight + " meters");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] name = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        float[] height = new float[3];

        for (int i = 0; i < name.length; i++) {
            System.out.print("Enter age of " + name[i] + " : ");
            age[i] = in.nextInt();
            System.out.print("Enter height of " + name[i] + " (in feet): ");
            height[i] = in.nextFloat();
        }

        youngestChecker(age, name);
        tallestChecker(height, name);

        in.close();
    }
}
