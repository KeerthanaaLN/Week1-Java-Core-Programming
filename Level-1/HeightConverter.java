import java.util.*;
class HeightConverter{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float height = in.nextFloat();
        float totalInches = height / 2.54f;
        int feet = (int) (totalInches / 12);
		
        System.out.printf("Your height in cm is %.2f while in feet is %d and inches is %.2f%n", 
                          height, feet, totalInches);
    }
}
