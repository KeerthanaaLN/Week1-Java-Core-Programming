import java.util.Scanner;

class TravelComputation{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = in.nextLine();

        System.out.print("Enter the starting city: ");
        String fromCity = in.nextLine();

        System.out.print("Enter the via city: ");
        String viaCity = in.nextLine();

        System.out.print("Enter the destination city: ");
        String toCity = in.nextLine();

        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (km): ");
        double distanceFromToVia = in.nextDouble();

        System.out.print("Enter the travel time from " + fromCity + " to " + viaCity + " (minutes): ");
        int timeFromToVia = in.nextInt();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (km): ");
        double distanceViaToFinalCity = in.nextDouble();

        System.out.print("Enter the travel time from " + viaCity + " to " + toCity + " (minutes): ");
        int timeViaToFinalCity = in.nextInt();

        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistance + " km and the Total Time taken is " + totalTime + " minutes.");
    }
}
