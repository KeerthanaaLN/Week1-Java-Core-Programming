import java.util.*;

public class SpringSeasonChecker {
    public static boolean springChecking(int month, int day) {
        if ((month == 3 && day >= 20) || (month > 3 && month < 6) ||  (month == 6 && day <= 20)) 
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the month (1-12): ");
        int month = in.nextInt();
        System.out.print("Enter the day: ");
        int day = in.nextInt();

        boolean isSpring = springChecking(month, day);
        System.out.println("Is month " + month + " with day " + day + " in spring season? " + isSpring);

        in.close();
    }
}
