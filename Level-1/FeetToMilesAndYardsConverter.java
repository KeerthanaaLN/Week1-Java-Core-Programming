import java.util.*;

class FeetToMilesAndYardsConverter{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float distanceInFeet = in.nextFloat();
		float distanceInYards = distanceInFeet / 3;
        float distanceInMiles = distanceInYards / 1760; 
        System.out.printf("The distance in feet is %.2f while in miles is %.2f and in yards is %.2f \n",distanceInFeet,distanceInMiles,distanceInYards);
    }
}
