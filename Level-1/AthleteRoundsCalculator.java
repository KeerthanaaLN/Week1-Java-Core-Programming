import java.util.*;

public class AthleteRoundsCalculator {
    public static float asCalculations(float[] sides) {
        float perimeter = 0, distance = 5000;
        
        for (float side : sides) {
            perimeter += side;
        }
        
        return distance / perimeter;
    }

    public static void main(String[] args) {
        float[] sides = new float[3];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < sides.length; i++) {
            System.out.print("Enter the side " + (i + 1) + " of the triangle (meters): ");
            sides[i] = in.nextFloat();
        }

        System.out.println("The number of rounds the athlete needs to complete a 5km run is: " 
                           + asCalculations(sides));
        in.close();
    }
}
