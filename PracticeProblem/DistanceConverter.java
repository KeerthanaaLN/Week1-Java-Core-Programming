import java.util.*;
class DistanceConverter{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the rangle in kilometers: ");
        float kilometer = in.nextFloat();
        System.out.println("The convereted value of kilometer into miles : "+(kilometer * 0.621371));
    }
}
