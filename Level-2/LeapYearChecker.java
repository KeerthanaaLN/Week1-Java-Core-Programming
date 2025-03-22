import java.util.*;

public class LeapYearChecker {
	
    public static boolean LeapYearFinder(int year) {
        if (year >= 1582) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        } else {
            System.out.println("Invalid input! Enter a year above 1582 to check if it is a leap year or not.");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = in.nextInt();

        boolean result = LeapYearFinder(year);

        if (result)
            System.out.println(year + " is a Leap Year.");
        else if (year >= 1582)
            System.out.println(year + " is not a Leap Year.");

        in.close();
    }
}
