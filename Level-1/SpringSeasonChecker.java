import java.util.*;
class SpringSeasonChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = in.nextInt();
        System.out.print("Enter day: ");
        int day = in.nextInt();
		boolean isSpring = (month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20);
        System.out.println(isSpring ? "It's a Spring Season" : "Not a Spring Season");
    }
}