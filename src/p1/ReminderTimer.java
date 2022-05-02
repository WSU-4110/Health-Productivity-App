package p1;

import java.util.Timer;
import java.util.Scanner;


public class ReminderTimer {
	
	int currentTime = 0;
	
	long getTime() {
		long currentTime = System.currentTimeMillis();
		return currentTime;
	}
	
	long alarmTime(long currentTime, long addedTime) {
		long alarm = currentTime + addedTime;
		return alarm;
	}
	
	long calcAddedTime() {
		long currentTime = getTime();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Time: ");
		long alarmTime = input.nextLong();
		long addedTime = alarmTime - currentTime;
		return addedTime;
	}
	
}
