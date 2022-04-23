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

public class SpecificRem extends Layout {
	
	public void addComponentsToPane(Container pane) throws Exception {
			
		pane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		pane.setLayout(new GridBagLayout());  
			
		GridBagConstraints gbc = new GridBagConstraints(); 
		gbc.insets = new Insets (2, 5, 2, 5);
		
		SpecificRemFactory SpecificReminder = new SpecificRemFactory();
		
		//Specific Reminder Header
			JLabel header = SpecificReminder.reminderHeader();
			
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
			
			//Add component to pane
			pane.add(header, gbc);
		
		//Reminder Name Title
			JLabel name = SpecificReminder.reminderNameTitle();
	
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
			
			//Add component to pane
			pane.add(name, gbc);
		
		//Reminder Name Text Field
			JTextField reminderName = SpecificReminder.createReminderName();
			
			//GBC Values	
			gbc = gbcSetValues(
					//Constraint - GridBagConstraints	
					gbc, 
					
					//Grid X, Grid Y - Int
					1, 2, 
					
					//Internal Padding Y - Int
					5, 
					
					//Weight X, Weight Y - Double
					0.2, 0,
					
					//Direction AKA "HORIZONTAL" or "BOTH"
					"HORIZONTAL"
					);
			
			//Add component to pane, follows constraints
			pane.add(reminderName, gbc);
		
		//Description
			JLabel desc = SpecificReminder.reminderDescTitle();
			
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
			pane.add(desc, gbc);
		
		//Description Text Field
			JTextField description = SpecificReminder.createReminderDesc();
			
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
			pane.add(description, gbc);
		
		//Time
			JLabel time = SpecificReminder.reminderTimeTitle();
			
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
		
		//Time Spinner
			JTextField remTime = SpecificReminder.createReminderTime();
			
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
			pane.add(remTime, gbc);
			
		//Spaces
			//Space 1
			JLabel space = new JLabel("");
			
			//GBC Values	
			gbc = gbcSetValues(
					//Constraint	
					gbc, 
					
					//Grid X, Grid Y
					1, 7, 
					
					//Internal Padding Y
					50, 
					
					//Weight X, Weight Y
					0.2, 0,
					
					//Direction AKA "HORIZONTAL" or "BOTH"
					"BOTH"
					);

			//Add component to pane, follows constraints
			pane.add(space, gbc);
			
			//Space 2
			JLabel space2 = new JLabel("");
			
			//GBC Values	
			gbc = gbcSetValues(
					//Constraint	
					gbc, 
					
					//Grid X, Grid Y
					1, 8, 
					
					//Internal Padding Y
					100, 
					
					//Weight X, Weight Y
					0.2, 0,
					
					//Direction AKA "HORIZONTAL" or "BOTH"
					"BOTH"
					);
			
			//Add component to pane, follows constraints
			pane.add(space2, gbc);
		
		//Submit
			JButton submit = SpecificReminder.submitButton();
			
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
					"NONE"
					);
			
			//Add component to pane, follows constraints
			pane.add(submit, gbc);
			
			//When user clicks submit button
			submit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ae) {
	
					String dbName = reminderName.getText();
					String dbDesc = description.getText();
					String dbTime = remTime.getText();
					
					String regex = "([01]?[0-9]|2[0-3]):[0-5][0-9]";
					Pattern p = Pattern.compile(regex);
					
					Matcher m = p.matcher(dbTime);
					boolean match = m.matches();
					
					if (match && !dbTime.isEmpty() && !dbName.isEmpty()) {
	        			try {
	        				
		                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/healthapp", "root", "password1234");
		                    Statement statement = connection.createStatement();
		                    
		                    String sql0 = "CREATE DATABASE IF NOT EXISTS healthapp";
		                    statement.executeUpdate(sql0);
		                    
		            		//statement.executeUpdate("SET FOREIGN_KEY_CHECKS = 0");
		            		//statement.executeUpdate("DROP TABLE IF Exists SpecificReminders");
		            		//statement.executeUpdate("SET FOREIGN_KEY_CHECKS = 1");
		                    
		                    String sql1 = "CREATE TABLE IF NOT EXISTS SpecificReminders" +
		            				"(numID INTEGER not NULL AUTO_INCREMENT," +
		            				"reminderName VARCHAR(100) not NULL," +
		            				"reminderDesc VARCHAR(100)," +
		            				"reminderTime TIME not NULL," +
		        					"PRIMARY KEY ( numID ))";
		            		statement.executeUpdate(sql1);
		                    
		                    String sql2 = "INSERT INTO SpecificReminders (reminderName, reminderDesc, reminderTime) values('" + dbName + "','" + dbDesc + "','" + dbTime + "')";
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
						JOptionPane.showMessageDialog(submit, "There has been an error! Potential reasons:\n * Reminder must be named\n * Valid military time (HH:mm) must be entered");
					}
					
				}
			});		
		
	}
	
	
	public static void addRangedComponentsToPane(Container pane) throws Exception {
		
		//Initializing buttons and labels
			JButton submit;
			JLabel title, name, desc, time, hours, and, space, space2;
			JTextField reminderName, description;
						
			pane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
			pane.setLayout(new GridBagLayout());  
			GridBagConstraints gbc = new GridBagConstraints(); 
			gbc.insets = new Insets (2, 5, 2, 5);	
		
		//Create Ranged Time Reminders Title
			title = new JLabel("Create Ranged Time Reminder", SwingConstants.CENTER);
			title.setFont(new Font("Helvetica", Font.BOLD, 25));
			title.setForeground(new Color(20, 31, 26));
			
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
			pane.add(title, gbc);
		
		//Reminder name
			name = new JLabel("Reminder Name");
			name.setFont(new Font("Helvetica", Font.BOLD, 13));
			name.setForeground(new Color(30, 47, 39));
			
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
			reminderName = new JTextField("");
			
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
		
		//Description
			desc = new JLabel("Description");
			desc.setFont(new Font("Helvetica", Font.BOLD, 13));
			desc.setForeground(new Color(30, 47, 39));
			
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
			pane.add(desc, gbc);
		
		//Description Text Field
			description = new JTextField("");
			
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
			pane.add(description, gbc);
		
		//Time
			time = new JLabel("How many times would you like to be reminded?");
			time.setFont(new Font("Helvetica", Font.BOLD, 13));
			time.setForeground(new Color(30, 47, 39));
			
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
			
		//How many times
			JTextField numTimes = new JTextField("");
			
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
			
		//Between what hours
			hours = new JLabel("Between the hours of");
			hours.setFont(new Font("Helvetica", Font.BOLD, 13));
			hours.setForeground(new Color(30, 47, 39));
			
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
			
		//Time Spinner 1
			JTextField remTime1 = new JTextField("HH:00");
			
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
			and = new JLabel("and");
			and.setFont(new Font("Helvetica", Font.BOLD, 13));
			and.setForeground(new Color(30, 47, 39));
			
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
			
		//Time Spinner 2
			JTextField remTime2 = new JTextField("HH:00");
			
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
			space = new JLabel("");
			
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
			submit = new JButton("Submit");
			submit.setFont(new Font("Helvetica", Font.BOLD, 13));
			submit.setForeground(Color.WHITE);
			submit.setBackground(new Color(91,146,121));
			
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
					String dbDesc = description.getText();
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
			space2 = new JLabel("");
			
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
			
			//Add component and constraints to pane
			pane.add(space2, gbc);
	
	}
	
	
}

