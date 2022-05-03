
package p1;

import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;
import java.awt.*;
import java.awt.TrayIcon.MessageType;


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
	
	public void displayTray() throws AWTException {
        //Obtain only one instance of the SystemTray object
        SystemTray tray = SystemTray.getSystemTray();

        //If the icon is a file
        Image image = Toolkit.getDefaultToolkit().createImage("icon.png");
        //Alternative (if the icon is on the classpath):
        //Image image = Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png"));

        TrayIcon trayIcon = new TrayIcon(image, "Reminder");
        //Let the system resize the image if needed
        trayIcon.setImageAutoSize(true);
        //Set tooltip text for the tray icon
        trayIcon.setToolTip("Reminder Description");
        tray.add(trayIcon);

        trayIcon.displayMessage("Reminder Name", "Reminder Description", MessageType.INFO);
    }
	
	class Helper extends TimerTask {
		public static int i = 0;
		public void run() {
			try {
				displayTray();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void mainTimer() {
		Timer timer = new Timer();
		TimerTask task = new Helper();
		
		timer.schedule(task, 10000);
		
		
		
		
	}
	
}

