package p1;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class CheckTime {
	
	public static String getTime() {
		// Create string to hold time
		String time = " ";
		// create object of DateTimeFormatter and specify format
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		// create object of LocalDateTime
		LocalDateTime now = LocalDateTime.now();  
		
		// return date and time
		time = dtf.format(now);
		return time;
	}
	

	

}