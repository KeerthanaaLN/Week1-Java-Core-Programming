import java.util.*;

public class CalendarDisplay {

    static String getMonthName(int month) {
        String[] months = { "January", "February", "March", "April", "May", "June",
                            "July", "August", "September", "October", "November", "December" };
        return months[month - 1];
    }

    static int getDaysInMonth(int month, int year) {
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        return (month == 2 && isLeapYear(year)) ? 29 : days[month - 1];
    }

    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    static int getFirstDayOfMonth(int month, int year) {
        Calendar calendar = new GregorianCalendar(year, month - 1, 1);
        return calendar.get(Calendar.DAY_OF_WEEK) - 1;
    }

    static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        System.out.printf("\n  %s %d\n", monthName, year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < firstDay; i++) {
            System.out.print("     ");
        }

        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%4d", day);
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        if (month < 1 || month > 12 || year < 1) {
            System.out.println("Invalid input! Please enter a valid month (1-12) and a positive year.");
        } else {
            displayCalendar(month, year);
        }

        scanner.close();
    }
}
