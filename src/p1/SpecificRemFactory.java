package p1;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class SpecificRemFactory implements CreateReminderInterface {
	
	//Header
	public JLabel reminderHeader() {
		JLabel header = new JLabel("Create Specific Time Reminder", SwingConstants.CENTER);
		header.setFont(new Font("Helvetica", Font.BOLD, 25));
		header.setForeground(new Color(20, 31, 26));
		return header;
	}
	
	//Name of reminder
	public JLabel reminderNameTitle() {
		JLabel reminderNameTitle = new JLabel("Reminder Name");
		reminderNameTitle.setFont(new Font("Helvetica", Font.BOLD, 13));
		reminderNameTitle.setForeground(new Color(30, 47, 39));
		return reminderNameTitle;
	}
	
	public JTextField createReminderName() { 
		JTextField reminderName  = new JTextField("");
		return reminderName;
	}
	
	//Description
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
	
	//Times
	public JLabel reminderTimeTitle () {
		JLabel reminderTime = new JLabel("At what time would you like to be reminded?");
		reminderTime.setFont(new Font("Helvetica", Font.BOLD, 13));
		reminderTime.setForeground(new Color(30, 47, 39));
		return reminderTime;
	}
	
	public JTextField createReminderTime () {
		JTextField reminderTime = new JTextField("HH:mm");
		return reminderTime;
	}
	
	//Submit
	public JButton submitButton() {
		JButton submit = new JButton("Submit");
		submit.setFont(new Font("Helvetica", Font.BOLD, 13));
		submit.setForeground(Color.WHITE);
		submit.setBackground(new Color(91,146,121));
		return submit;
	}
	
}
