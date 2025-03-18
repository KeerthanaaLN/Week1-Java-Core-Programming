import java.util.*;
import java. lang. Math. *;
class CircleAreaCalculator{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        float radius = in.nextFloat();
        System.out.println("Area of a circle : "+((3.14) * Math.pow(radius,2)));
    }
}
