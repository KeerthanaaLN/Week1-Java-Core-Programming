import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

class DateAndTime{
	public static void main(String[] args){
	
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");
	
		ZonedDateTime currentTime = ZonedDateTime.now();
		System.out.println("Current System Time: " + currentTime.format(formatter));
	
		ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
		System.out.println("GMT Time: " + gmt.format(formatter));
	
		ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("IST Time: " + ist.format(formatter));
        
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("PST Time: " + pst.format(formatter));
	}
}