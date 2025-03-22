import java.util.Scanner;

public class CollinearityChecker {

    public static boolean areCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {

        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }

    public static boolean areCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {

        double area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter x1, y1: ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();

        System.out.print("Enter x2, y2: ");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();

        System.out.print("Enter x3, y3: ");
        double x3 = in.nextDouble();
        double y3 = in.nextDouble();

        boolean isCollinearBySlope = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean isCollinearByArea = areCollinearByArea(x1, y1, x2, y2, x3, y3);

        System.out.println("Collinear by Slope Method: " + isCollinearBySlope);
        System.out.println("Collinear by Area Method: " + isCollinearByArea);

        in.close();
    }
}
