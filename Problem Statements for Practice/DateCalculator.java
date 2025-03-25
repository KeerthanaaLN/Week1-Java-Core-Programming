import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class DateCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = in.nextLine();
        LocalDate date = LocalDate.parse(inputDate, formatter);

        LocalDate newDate = date.plusDays(7).plusMonths(1).plusYears(2);
        LocalDate finalDate = newDate.minusWeeks(3);

        System.out.println("Original Date: " + date.format(formatter));
        System.out.println("After Adding 7 days, 1 month, and 2 years: " + newDate.format(formatter));
        System.out.println("After Subtracting 3 weeks: " + finalDate.format(formatter));

        in.close();
    }
}
