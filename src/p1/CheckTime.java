package p1;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class CheckTime {
	
	public static String getTime() {
		// Create string to hold time
		String time = " ";
		// create object of DateTimeFormatter and specify format
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		
		// create object of LocalDateTime
		LocalDateTime now = LocalDateTime.now();  
		
		//print date and time
		//System.out.println(dtf.format(now));  
		//System.out.println("Made it to check clock");
		// return date and time
		time = dtf.format(now);
		return time;
	}
	

	

}