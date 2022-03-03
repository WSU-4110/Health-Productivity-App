package p1;
import p1.CheckTime;

public class DisplayClock {
	public static void main(String[] args) {
		// Create string object with value of time
		String time = CheckTime.getTime();
		
		//System.out.println("Display Clock");
		
		// print time
		System.out.println(time);
	}
}
