import java.util.*;
class RectanglePerimeterCalculator{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of a rectangle : ");
        float length = in.nextFloat();
        System.out.print("Enter the width of a rectangle : ");
        float width = in.nextFloat();
        System.out.println("perimeter of a rectangle : "+( 2 * (length + width)));
    }
}
