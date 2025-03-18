import java.util.*;
class DistanceConverter {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);		
        double km = in.nextDouble();
		double miles = km*1.6;
        System.out.printf("The total miles is %.2f mile for the given %.2f km%n",miles,km);
    }
}