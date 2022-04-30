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
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class standingBreak implements CreateReminderInterface
{
	public static void addComponentToPane(Container pane)
	{
		//Initializing buttons and labels
				JButton submit;
				JLabel title, name, desc, space, space2, and, hours;
				JTextField reminderName, description;
							
				pane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
				pane.setLayout(new GridBagLayout());  
				GridBagConstraints gbc = new GridBagConstraints(); 
				gbc.insets = new Insets (2, 5, 2, 5);	
			
			//Create Standing Reminders Title
				title = new JLabel("Create Standing Reminder", SwingConstants.CENTER);
				title.setFont(new Font("Helvetica", Font.BOLD, 25));
				title.setForeground(new Color(20, 31, 26));
				//Grid positioning
				gbc.gridx = 1;
				gbc.gridy = 0;
				//Internal padding
				gbc.ipady = 5;
				//Spacing
				gbc.weightx = 0.2;
				gbc.weighty = 0;
				//As window resizes, components stretch horizontally
				gbc.fill = GridBagConstraints.HORIZONTAL;
				//Add component to pane, follows constraints
				pane.add(title, gbc);
			
			//Reminder name
				name = new JLabel("Reminder Name");
				name.setFont(new Font("Helvetica", Font.BOLD, 13));
				name.setForeground(new Color(30, 47, 39));
				//Grid positioning
				gbc.gridx = 1;
				gbc.gridy = 1;
				//Internal padding
				gbc.ipady = 1;
				//Spacing
				gbc.weightx = 0.2;
				gbc.weighty = 0;
				//As window resizes, components stretch horizontally
				gbc.fill = GridBagConstraints.HORIZONTAL;
				//Add component to pane, follows constraints
				pane.add(name, gbc);
			
			//Reminder Name Text Field
				reminderName = new JTextField("Take a standing break!");
				reminderName.setFont(new Font("Helvetica", Font.BOLD, 13));
				reminderName.setForeground(new Color(30, 47, 39));
				//Grid positioning
				gbc.gridx = 1;
				gbc.gridy = 2;
				//Internal padding
				gbc.ipady = 5;
				//Spacing
				gbc.weightx = 0.2;
				gbc.weighty = 0;
				//As window resizes, components stretch horizontally
				gbc.fill = GridBagConstraints.HORIZONTAL;
				//Add component to pane, follows constraints
				pane.add(reminderName, gbc);
			
			//Description
				desc = new JLabel("Description");
				desc.setFont(new Font("Helvetica", Font.BOLD, 13));
				desc.setForeground(new Color(30, 47, 39));
				//Grid positioning
				gbc.gridx = 1;
				gbc.gridy = 3;
				//Internal padding
				gbc.ipady = 1;
				//Spacing
				gbc.weightx = 0.2;
				gbc.weighty = 0;
				//As window resizes, components stretch horizontally
				gbc.fill = GridBagConstraints.HORIZONTAL;
				//Add component to pane, follows constraints
				pane.add(desc, gbc);
			
			//Description Text Field
				description = new JTextField("");
				//Grid positioning
				gbc.gridx = 1;
				gbc.gridy = 4;
				//Internal padding
				gbc.ipady = 5;
				//Spacing
				gbc.weightx = 0.2;
				gbc.weighty = 0;
				//As window resizes, components stretch horizontally
				gbc.fill = GridBagConstraints.HORIZONTAL;
				//Add component to pane, follows constraints
				pane.add(description, gbc);
			
			//Range of time
				//Between what hours
				hours = new JLabel("Remind between the hours of");
				hours.setFont(new Font("Helvetica", Font.BOLD, 13));
				hours.setForeground(new Color(30, 47, 39));
				//Grid positioning
				gbc.gridx = 1;
				gbc.gridy = 9;
				//Internal padding
				gbc.ipady = 1;
				//Spacing
				gbc.weightx = 0.2;
				gbc.weighty = 0;
				//As window resizes, components stretch horizontally
				gbc.fill = GridBagConstraints.HORIZONTAL;
				//Add component to pane, follows constraints
				pane.add(hours, gbc);
				
			//Time Spinner 1
				JTextField remTime1 = new JTextField("HH:00");
				//Grid positioning
				gbc.gridx = 1;
				gbc.gridy = 10;
				//Internal padding
				gbc.ipady = 5;
				//Spacing
				gbc.weightx = 0.2;
				gbc.weighty = 0;
				//As window resizes, components stretch horizontally
				gbc.fill = GridBagConstraints.HORIZONTAL;
				//Add component to pane, follows constraints
				pane.add(remTime1, gbc);
				
			//And
				and = new JLabel("and");
				and.setFont(new Font("Helvetica", Font.BOLD, 13));
				and.setForeground(new Color(30, 47, 39));
				//Grid positioning
				gbc.gridx = 1;
				gbc.gridy = 11;
				//Internal padding
				gbc.ipady = 1;
				//Spacing
				gbc.weightx = 0.2;
				gbc.weighty = 0;
				//As window resizes, components stretch horizontally
				gbc.fill = GridBagConstraints.HORIZONTAL;
				//Add component to pane, follows constraints
				pane.add(and, gbc);
				
			//Time Spinner 2
				JTextField remTime2 = new JTextField("HH:00");
				//Grid positioning
				gbc.gridx = 1;
				gbc.gridy = 12;
				//Internal padding
				gbc.ipady = 5;
				//Spacing
				gbc.weightx = 0.2;
				gbc.weighty = 0;
				//As window resizes, components stretch horizontally
				gbc.fill = GridBagConstraints.HORIZONTAL;
				//Add component to pane, follows constraints
				pane.add(remTime2, gbc);
				
			//Space
				space = new JLabel("");
				//Grid positioning
				gbc.gridx = 1;
				gbc.gridy = 13;
				//Internal padding
				gbc.ipady = 5;
				//Spacing
				gbc.weightx = 0.2;
				gbc.weighty = 0;
				//As window resizes, components stretch horizontally
				gbc.fill = GridBagConstraints.BOTH;
				//Add component to pane, follows constraints
				pane.add(space, gbc);

			//Space
				space2 = new JLabel("");
				//Grid positioning
				gbc.gridx = 1;
				gbc.gridy = 15;
				//Internal padding
				gbc.ipady = 65;
				//Spacing
				gbc.weightx = 0.2;
				gbc.weighty = 0;
				//As window resizes, components stretch horizontally
				gbc.fill = GridBagConstraints.BOTH;
				//Add component to pane, follows constraints
				pane.add(space2, gbc);	
				
			//Submit
				submit = new JButton("Submit");
				submit.setFont(new Font("Helvetica", Font.BOLD, 13));
				submit.setForeground(Color.WHITE);
				submit.setBackground(new Color(91,146,121));
				//Grid positioning
				gbc.gridx = 1;
				gbc.gridy = 14;
				//Internal padding
				gbc.ipady = 1;
				//Spacing
				gbc.weightx = 0.2;
				gbc.weighty = 0;
				//As window resizes, components stretch horizontally
				gbc.fill = GridBagConstraints.HORIZONTAL;
				//Add component to pane, follows constraints
				pane.add(submit, gbc);
				
				submit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {

						String dbName = reminderName.getText();
						String dbDesc = description.getText();
						String dbTime1 = remTime1.getText();
						String dbTime2 = remTime2.getText();
						
						String regex = "([01]?[0-9]|2[0-2]):[0][0]";
						String regex2 = "([01]?[0-9]|2[0-3]):[0][0]";
	
						Pattern p = Pattern.compile(regex);
						Pattern p2 = Pattern.compile(regex2);
						
						Matcher m1 = p.matcher(dbTime1);
						boolean match1 = m1.matches();
						
						Matcher m2 = p2.matcher(dbTime2);
						boolean match2 = m2.matches();
						
						boolean flag = false;
						
						if(match1 && match2) {
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
						
						if (match1 && match2 && !flag && !dbTime1.isEmpty() && !dbTime2.isEmpty() && !dbName.isEmpty()) {
		        			try {
		        				
			                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/healthApp", "root", "password1234");
			                    Statement statement = connection.createStatement();
			                    
			                    String sql0 = "CREATE DATABASE IF NOT EXISTS healthApp";
			                    statement.executeUpdate(sql0);
			                    
			            		//statement.executeUpdate("SET FOREIGN_KEY_CHECKS = 0");
			            		//statement.executeUpdate("DROP TABLE IF Exists RangedReminders");
			            		//statement.executeUpdate("SET FOREIGN_KEY_CHECKS = 1");
			                    
			                    String sql1 = "CREATE TABLE IF NOT EXISTS StandingReminders" +
			            				"(numID INTEGER not NULL AUTO_INCREMENT," +
			            				"reminderName VARCHAR(100) not NULL," +
			            				"reminderDesc VARCHAR(100) not NULL," +
			            				"reminderTime1 TIME," +
			            				"reminderTime2 TIME," +
			        					"PRIMARY KEY ( numID ))";
			            		statement.executeUpdate(sql1);
			                    
			                    String sql2 = "INSERT INTO StandingReminders (reminderName, reminderDesc, reminderTime1, reminderTime2) values('" + dbName + "','" + dbDesc + "', '" + dbTime1 + "', '" + dbTime2 + "')";
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
							JOptionPane.showMessageDialog(submit, "There has been an error! Potential reasons:\n * Reminder must be named\n * Valid military times (HH:00) must be entered\n* First time should be earlier than second time\n* First and second time can not be the same time");
						}
						
					}
				});
				

	}
}