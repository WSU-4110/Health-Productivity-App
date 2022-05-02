package p1;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class RangedRemFactory implements CreateReminderInterface {
	
	public JLabel reminderHeader() { 
		JLabel header = new JLabel("Create Ranged Time Reminder", SwingConstants.CENTER);
		header.setFont(new Font("Helvetica", Font.BOLD, 25));
		header.setForeground(new Color(20, 31, 26));
		return header;
	}
	
	public JLabel reminderNameTitle() { 
		JLabel reminderNameTitle = new JLabel("Reminder Name");
		reminderNameTitle.setFont(new Font("Helvetica", Font.BOLD, 13));
		reminderNameTitle.setForeground(new Color(30, 47, 39));
		return reminderNameTitle;
	}
	
	public JTextField createReminderName() { 
		JTextField reminderName = new JTextField("");
		return reminderName;	
	}
	
	public JLabel reminderDescTitle() {
		JLabel reminderDescTitle = new JLabel("Description");
		reminderDescTitle.setFont(new Font("Helvetica", Font.BOLD, 13));
		reminderDescTitle.setForeground(new Color(30, 47, 39));
		return reminderDescTitle;
	}
	
	public JTextField createReminderDesc() { 
		JTextField reminderDesc = new JTextField("");
		return reminderDesc;
		
	}
	
	public JLabel reminderNumTimesTitle() { 
		JLabel reminderTime = new JLabel("How many times would you like to be reminded?");
		reminderTime.setFont(new Font("Helvetica", Font.BOLD, 13));
		reminderTime.setForeground(new Color(30, 47, 39));
		return reminderTime;
		
	}
	public JTextField createReminderNumTimes() { 
		JTextField numTimes = new JTextField("");
		return numTimes;
	}
	
	public JLabel reminderBetweenHoursTitle() { 
		JLabel reminderBetweenHours = new JLabel("Between the hours of");
		reminderBetweenHours.setFont(new Font("Helvetica", Font.BOLD, 13));
		reminderBetweenHours.setForeground(new Color(30, 47, 39));
		return reminderBetweenHours;
	}
	
	public JTextField createReminderFirstTime() {
		JTextField firstTime = new JTextField("HH:00");
		return firstTime;
	}
	
	public JLabel andTitle() {
		JLabel and = new JLabel("and");
		and.setFont(new Font("Helvetica", Font.BOLD, 13));
		and.setForeground(new Color(30, 47, 39));
		return and;
	}
	
	public JTextField createReminderSecondTime() {
		JTextField secondTime = new JTextField("HH:00");
		return secondTime;
	}
	
	public JButton submitButton() { 
		JButton submit = new JButton("Submit");
		submit.setFont(new Font("Helvetica", Font.BOLD, 13));
		submit.setForeground(Color.WHITE);
		submit.setBackground(new Color(91,146,121));
		return submit;
		
	}
	
}
