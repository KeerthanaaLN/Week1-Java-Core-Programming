import java.util.Scanner;

public class EuclideanGeometry {

    public static double getEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] getLineEquation(double x1, double y1, double x2, double y2) {
        if (x1 == x2) {  // Handling vertical line case
            return null;
        }

        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - (m * x1);
		
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = in.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = in.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = in.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = in.nextDouble();

        double distance = getEuclideanDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance: %.2f%n", distance);

        double[] equation = getLineEquation(x1, y1, x2, y2);

        if (equation == null) {
            System.out.println("Equation of the line: x = " + x1);  // Vertical line case
        } else {
            System.out.printf("Equation of the line: y = %.2fx + %.2f%n", equation[0], equation[1]);
        }

        in.close();
    }
}
