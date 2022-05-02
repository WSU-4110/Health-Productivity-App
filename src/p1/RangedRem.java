package p1;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class RangedRem extends Layout {
	
	public void addComponentsToPane(Container pane) {
		
		pane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		pane.setLayout(new GridBagLayout()); 
		
		GridBagConstraints gbc = new GridBagConstraints(); 
		gbc.insets = new Insets (2, 5, 2, 5);	
		
		RangedRemFactory RangedReminder = new RangedRemFactory();
		
	//Ranged Reminders Header
		JLabel header = RangedReminder.reminderHeader();
		
		//GBC Values	
		gbc = gbcSetValues(
				//Constraint	
				gbc, 
				
				//Grid X, Grid Y
				1, 0, 
				
				//Internal Padding Y
				5, 
				
				//Weight X, Weight Y
				0.2, 0,
				
				//Direction AKA "HORIZONTAL" or "BOTH"
				"HORIZONTAL"
				);
		//Add component to pane, follows constraints
		pane.add(header, gbc);
	
	//Reminder Name Title
		JLabel name = RangedReminder.reminderNameTitle();
		
		//GBC Values	
		gbc = gbcSetValues(
				//Constraint	
				gbc, 
				
				//Grid X, Grid Y
				1, 1, 
				
				//Internal Padding Y
				1, 
				
				//Weight X, Weight Y
				0.2, 0,
				
				//Direction AKA "HORIZONTAL" or "BOTH"
				"HORIZONTAL"
				);

		//Add component to pane, follows constraints
		pane.add(name, gbc);
	
	//Reminder Name Text Field
		JTextField reminderName = RangedReminder.createReminderName();
		
		//GBC Values	
		gbc = gbcSetValues(
				//Constraint	
				gbc, 
				
				//Grid X, Grid Y
				1, 2, 
				
				//Internal Padding Y
				5, 
				
				//Weight X, Weight Y
				0.2, 0,
				
				//Direction AKA "HORIZONTAL" or "BOTH"
				"HORIZONTAL"
				);

		//Add component to pane, follows constraints
		pane.add(reminderName, gbc);
	
	//Description Title
		JLabel descTitle = RangedReminder.reminderDescTitle();
		
		//GBC Values	
		gbc = gbcSetValues(
				//Constraint	
				gbc, 
				
				//Grid X, Grid Y
				1, 3, 
				
				//Internal Padding Y
				1, 
				
				//Weight X, Weight Y
				0.2, 0,
				
				//Direction AKA "HORIZONTAL" or "BOTH"
				"HORIZONTAL"
				);

		//Add component to pane, follows constraints
		pane.add(descTitle, gbc);
	
	//Description Text Field
		JTextField desc = RangedReminder.createReminderDesc();
		
		//GBC Values	
		gbc = gbcSetValues(
				//Constraint	
				gbc, 
				
				//Grid X, Grid Y
				1, 4, 
				
				//Internal Padding Y
				5, 
				
				//Weight X, Weight Y
				0.2, 0,
				
				//Direction AKA "HORIZONTAL" or "BOTH"
				"HORIZONTAL"
				);
		
		//Add component to pane, follows constraints
		pane.add(desc, gbc);
	
	//How many times Title
		JLabel time = RangedReminder.reminderNumTimesTitle();
		
		//GBC Values	
		gbc = gbcSetValues(
				//Constraint	
				gbc, 
				
				//Grid X, Grid Y
				1, 5, 
				
				//Internal Padding Y
				1, 
				
				//Weight X, Weight Y
				0.2, 0,
				
				//Direction AKA "HORIZONTAL" or "BOTH"
				"HORIZONTAL"
				);

		//Add component to pane, follows constraints
		pane.add(time, gbc);
		
	//Number of Times Text Field
		JTextField numTimes = RangedReminder.createReminderNumTimes();
		
		//GBC Values	
		gbc = gbcSetValues(
				//Constraint	
				gbc, 
				
				//Grid X, Grid Y
				1, 6, 
				
				//Internal Padding Y
				5, 
				
				//Weight X, Weight Y
				0.2, 0,
				
				//Direction AKA "HORIZONTAL" or "BOTH"
				"HORIZONTAL"
				);
		
		//Add component to pane, follows constraints
		pane.add(numTimes, gbc);
		
	//Between what hours Title
		JLabel hours = RangedReminder.reminderBetweenHoursTitle();

		//GBC Values	
		gbc = gbcSetValues(
				//Constraint	
				gbc, 
				
				//Grid X, Grid Y
				1, 7, 
				
				//Internal Padding Y
				1, 
				
				//Weight X, Weight Y
				0.2, 0,
				
				//Direction AKA "HORIZONTAL" or "BOTH"
				"HORIZONTAL"
				);

		//Add component to pane, follows constraints
		pane.add(hours, gbc);
		
	//First Time
		JTextField remTime1 = RangedReminder.createReminderFirstTime();
		
		//GBC Values	
		gbc = gbcSetValues(
				//Constraint	
				gbc, 
				
				//Grid X, Grid Y
				1, 8, 
				
				//Internal Padding Y
				5, 
				
				//Weight X, Weight Y
				0.2, 0,
				
				//Direction AKA "HORIZONTAL" or "BOTH"
				"HORIZONTAL"
				);

		//Add component to pane, follows constraints
		pane.add(remTime1, gbc);
		
	//And
		JLabel and = RangedReminder.andTitle();
		
		//GBC Values	
		gbc = gbcSetValues(
				//Constraint	
				gbc, 
				
				//Grid X, Grid Y
				1, 9, 
				
				//Internal Padding Y
				1, 
				
				//Weight X, Weight Y
				0.2, 0,
				
				//Direction AKA "HORIZONTAL" or "BOTH"
				"HORIZONTAL"
				);

		//Add component to pane, follows constraints
		pane.add(and, gbc);
		
	//Second Time
		JTextField remTime2 = RangedReminder.createReminderSecondTime();
		
		//GBC Values	
		gbc = gbcSetValues(
				//Constraint	
				gbc, 
				
				//Grid X, Grid Y
				1, 10, 
				
				//Internal Padding Y
				5, 
				
				//Weight X, Weight Y
				0.2, 0,
				
				//Direction AKA "HORIZONTAL" or "BOTH"
				"HORIZONTAL"
				);

		//Add component to pane, follows constraints
		pane.add(remTime2, gbc);
		
	//Space
		JLabel space = new JLabel("");
		
		//GBC Values	
		gbc = gbcSetValues(
				//Constraint	
				gbc, 
				
				//Grid X, Grid Y
				1, 11, 
				
				//Internal Padding Y
				5, 
				
				//Weight X, Weight Y
				0.2, 0,
				
				//Direction AKA "HORIZONTAL" or "BOTH"
				"BOTH"
				);

		//Add component to pane, follows constraints
		pane.add(space, gbc);

	//Submit
		JButton submit = RangedReminder.submitButton();
		
		//GBC Values	
		gbc = gbcSetValues(
				//Constraint	
				gbc, 
				
				//Grid X, Grid Y
				1, 12, 
				
				//Internal Padding Y
				1, 
				
				//Weight X, Weight Y
				0.2, 0,
				
				//Direction AKA "HORIZONTAL" or "BOTH"
				"NONE"
				);

		//Add component to pane, follows constraints
		pane.add(submit, gbc);
		
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {

				String dbName = reminderName.getText();
				String dbDesc = desc.getText();
				String dbNumTimes = numTimes.getText();
				String dbTime1 = remTime1.getText();
				String dbTime2 = remTime2.getText();
				
				String regex = "([01]?[0-9]|2[0-3]):[0][0]";
				String regex2 = "(0?[2-9]|1[0-9]|2[0-5])";
				
				Pattern p = Pattern.compile(regex);
				Pattern p2 = Pattern.compile(regex2);
				
				Matcher m1 = p.matcher(dbTime1);
				boolean match1 = m1.matches();
				
				Matcher m2 = p.matcher(dbTime2);
				boolean match2 = m2.matches();
				
				boolean flag = false;
				
				if (match1 && match2) {
					String[] token = dbTime1.split(":");
					String time1 = token[0];
					int t1 = Integer.parseInt(time1);
					
					String[] token2 = dbTime2.split(":");
					String time2 = token2[0];
					int t2 = Integer.parseInt(time2);
					
					if (t1 > t2) {
						flag = true;
					}
					
					if (t1 == t2) {
						flag = true;
					}
				}
				
				Matcher m3 = p2.matcher(dbNumTimes);
				boolean match3 = m3.matches();

				if (match1 && match2 && match3 && !flag && !dbTime1.isEmpty() && !dbTime2.isEmpty() && !dbName.isEmpty() && !dbNumTimes.isEmpty()) {
        			try {
        				       				
	                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/healthApp", "root", "password1234");
	                    Statement statement = connection.createStatement();
	                    
	                    String sql0 = "CREATE DATABASE IF NOT EXISTS healthApp";
	                    statement.executeUpdate(sql0);
	                    
	            		//statement.executeUpdate("SET FOREIGN_KEY_CHECKS = 0");
	            		//statement.executeUpdate("DROP TABLE IF Exists RangedReminders");
	            		//statement.executeUpdate("SET FOREIGN_KEY_CHECKS = 1");
	                    
	                    String sql1 = "CREATE TABLE IF NOT EXISTS RangedReminders" +
	            				"(numID INTEGER not NULL AUTO_INCREMENT," +
	            				"reminderName VARCHAR(100) not NULL," +
	            				"reminderDesc VARCHAR(100)," +
	            				"reminderNumTimes INTEGER not NULL," +
	            				"reminderTime1 TIME not NULL," +
	            				"reminderTime2 TIME not NULL," +
	        					"PRIMARY KEY ( numID ))";
	            		statement.executeUpdate(sql1);
	                    
	                    String sql2 = "INSERT INTO RangedReminders (reminderName, reminderDesc, reminderNumTimes, reminderTime1, reminderTime2) values('" + dbName + "','" + dbDesc + "', '" + Integer.parseInt(dbNumTimes) + "', '" + dbTime1 + "', '" + dbTime2 + "')";
	                    statement.executeUpdate(sql2);
	                    
	                    
	                    connection.close();
	                    
	                    JComponent comp = (JComponent) ae.getSource();
	                    Window win = SwingUtilities.getWindowAncestor(comp);
	                    win.dispose();
        			}
        			
	                catch (Exception e) {
	                    e.printStackTrace();
	                }
        			
				}
				else {
					JOptionPane.showMessageDialog(submit, "There has been an error! Potential reasons:\n * Reminder must be named\n * Valid military times (HH:00) must be entered\n * Number of times must be between 2-25\n * First time must be earlier than second time\n * First and second time can not be the same time");
				}
				
			}
		});
		
	//Space
		JLabel space2 = new JLabel("");
		
		//GBC Values	
		gbc = gbcSetValues(
				//Constraint	
				gbc, 
				
				//Grid X, Grid Y
				1, 13, 
				
				//Internal Padding Y
				10, 
				
				//Weight X, Weight Y
				0.2, 0,
				
				//Direction AKA "HORIZONTAL" or "BOTH"
				"BOTH"
				);
		
		//Add component to pane, follows constraints
		pane.add(space2, gbc);
	}
	
}
