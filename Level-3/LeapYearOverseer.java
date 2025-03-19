import java.util.Scanner;

public class LeapYearOverseer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = in.nextInt();
		
		boolean leap=false;
		if(year>=1582){
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			System.out.println(year+" is a leap year");
		else
			System.out.println(year+" is not a leap year");
		}
		else{
			System.out.println("Enter the year that is above 1582");
			return;
		}
	}
}
					
