import java.util.Scanner;

public class QuadraticSolver {

    public static double[] findRoots(float a, float b, float c) {
        double delta = Math.pow(b, 2) - (4 * a * c);

        if (delta > 0) { 
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } 
        else if (delta == 0) { 
            double root = -b / (2 * a);
            return new double[]{root};
        } 
        else
            return new double[]{}; 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a value: ");
        float a = in.nextFloat();
        System.out.print("Enter b value: ");
        float b = in.nextFloat();
        System.out.print("Enter c value: ");
        float c = in.nextFloat();	

        double[] roots = findRoots(a, b, c);

        if (roots.length == 2) {
            System.out.printf("The equation has two real roots: %.2f and %.2f%n", roots[0], roots[1]);
        } else if (roots.length == 1) {
            System.out.printf("The equation has one real root: %.2f%n", roots[0]);
        } else {
            System.out.println("The equation has no real roots.");
        }

        in.close();
    }
}
