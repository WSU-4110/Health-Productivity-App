
package p1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.text.DateFormat;

import javax.swing.*;  
import java.util.*;


public class SignInDash extends Layout {

	//Where we set up GUI components in Sign In Dashboard
	public static void addComponentsToPane(Container pane) {
	
		//Set component orientation - left to right
	    pane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		//Set GridBag layout and constraints
		pane.setLayout(new GridBagLayout());  
		GridBagConstraints gbc = new GridBagConstraints();  
		
		//External padding for each component (top, left, bottom, right)
		gbc.insets = new Insets (2, 5, 2, 5);
		
		//Reminders Application Header
		JLabel reminderAppHeader = new JLabel("Reminders Application", SwingConstants.CENTER);
		reminderAppHeader.setFont(new Font("Helvetica", Font.BOLD, 25));
		reminderAppHeader.setForeground(new Color(20, 31, 26));
		
		//GBC Values	
		gbc = gbcSetValues(
				//Constraint	
				gbc, 
				
				//Grid X, Grid Y
				1, 0, 
				
				//Internal Padding Y
				15, 
				
				//Weight X, Weight Y
				0.2, 0,
				
				//Direction AKA "HORIZONTAL" or "BOTH"
				"HORIZONTAL"
				);

		//Add component to pane, follows constraints
		pane.add(reminderAppHeader, gbc);
		
		JLabel label2 = new JLabel("Custom Reminders", SwingConstants.CENTER);
		label2.setFont(new Font("Helvetica", Font.BOLD, 15));
		label2.setForeground(new Color(30, 47, 39));
		
		//GBC Values	
		gbc = gbcSetValues(
				//Constraint	
				gbc, 
				
				//Grid X, Grid Y
				0, 3, 
				
				//Internal Padding Y
				0, 
				
				//Weight X, Weight Y
				0.2, 0,
				
				//Direction AKA "HORIZONTAL" or "BOTH"
				"HORIZONTAL"
				);

		//Add component to pane, follows constraints
		pane.add(label2, gbc);
		
		JLabel label5 = new JLabel("Current Reminders", SwingConstants.CENTER);
		label5.setFont(new Font("Helvetica", Font.BOLD, 15));
		label5.setForeground(new Color(30, 47, 39));
		
		//GBC Values	
		gbc = gbcSetValues(
				//Constraint	
				gbc, 
				
				//Grid X, Grid Y
				1, 3, 
				
				//Internal Padding Y
				0, 
				
				//Weight X, Weight Y
				0.2, 0,
				
				//Direction AKA "HORIZONTAL" or "BOTH"
				"HORIZONTAL"
				);

		//Add component to pane, follows constraints
		pane.add(label5, gbc);
		
		//Create Specific Time Reminder button
		JButton specific = new JButton("+ Create Specific Time Reminder");
		specific.setFont(new Font("Helvetica", Font.BOLD, 13));
		specific.setForeground(Color.WHITE);
		specific.setBackground(new Color(91,146,121));
		
		//GBC Values	
		gbc = gbcSetValues(
				//Constraint	
				gbc, 
				
				//Grid X, Grid Y
				0, 4, 
				
				//Internal Padding Y
				20, 
				
				//Weight X, Weight Y
				0.2, 0,
				
				//Direction AKA "HORIZONTAL" or "BOTH"
				""
				);
		
		//Add component to pane, follows constraints
		pane.add(specific, gbc);
		
		 specific.addActionListener(
				 new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						JFrame createReminder = new JFrame("Create Specific Time Reminder");
						createReminder.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
						createReminder.getContentPane().setBackground(new Color(239, 245, 243));
						//CreateReminder.addSpecificComponentsToPane(createReminder.getContentPane());  
			
						SpecificRem specificReminder = new SpecificRem();
						specificReminder.addComponentsToPane(createReminder.getContentPane());

						createReminder.setMinimumSize(new Dimension(800, 490));
						createReminder.pack();
						createReminder.setLocationRelativeTo(null);
						createReminder.setVisible(true); 
				}
			}
		);
		 
		//Create Ranged Reminder button
		JButton range = new JButton("+ Create Ranged Time Reminder");
		range.setFont(new Font("Helvetica", Font.BOLD, 13));
		range.setForeground(Color.WHITE);
		range.setBackground(new Color(91,146,121));
		
		//GBC Values	
		gbc = gbcSetValues(
				//Constraint	
				gbc, 
				
				//Grid X, Grid Y
				0, 5, 
				
				//Internal Padding Y
				20, 
				
				//Weight X, Weight Y
				0.2, 0,
				
				//Direction AKA "HORIZONTAL" or "BOTH"
				""
				);

		//Add component to pane, follows constraints
		pane.add(range, gbc);
			
		range.addActionListener(
				 new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JFrame createReminder = new JFrame("Create Ranged Time Reminder");
						createReminder.getContentPane().setBackground(new Color(239, 245, 243));
						CreateReminder.addRangedComponentsToPane(createReminder.getContentPane()); 
						createReminder.setMinimumSize(new Dimension(800, 490));
						createReminder.pack();
						createReminder.setLocationRelativeTo(null);
						createReminder.setVisible(true); 
				}
			}
		);
		 
		JLabel label3 = new JLabel("Preset Reminders", SwingConstants.CENTER);
		label3.setFont(new Font("Helvetica", Font.BOLD, 15));
		label3.setForeground(new Color(30, 47, 39));
		
		//GBC Values
		gbc.gridheight = 1;
		
		gbc = gbcSetValues(
				//Constraint	
				gbc, 
				
				//Grid X, Grid Y
				0, 6, 
				
				//Internal Padding Y
				0, 
				
				//Weight X, Weight Y
				0.2, 0,
				
				//Direction AKA "HORIZONTAL" or "BOTH"
				"HORIZONTAL"
				);
		
		//Add component to pane, follows constraints
		pane.add(label3, gbc);
		 
		//Preset button 1
		JButton water = new JButton("+ Drink Water");
		water.setFont(new Font("Helvetica", Font.BOLD, 13));
		water.setForeground(Color.WHITE);
		water.setBackground(new Color(91,146,121));
		
		//GBC Values
		gbc.gridheight = 1;
		
		gbc = gbcSetValues(
				//Constraint	
				gbc, 
				
				//Grid X, Grid Y
				0, 7, 
				
				//Internal Padding Y
				20, 
				
				//Weight X, Weight Y
				0.2, 0,
				
				//Direction AKA "HORIZONTAL" or "BOTH"
				""
				);

		//Add component to pane, follows constraints
		pane.add(water, gbc);
		
		water.addActionListener(
				 new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JFrame createReminder = new JFrame("Create Water Reminder");
						createReminder.getContentPane().setBackground(new Color(239, 245, 243));
						drinkWater test1 = new drinkWater();
						test1.addComponentToPane(createReminder.getContentPane()); 
						createReminder.setMinimumSize(new Dimension(800, 490));
						createReminder.pack();
						createReminder.setLocationRelativeTo(null);
						createReminder.setVisible(true);
				}
			}
		);
		
		//Preset button 2
		JButton standing = new JButton("+ Standing Break");
		standing.setFont(new Font("Helvetica", Font.BOLD, 13));
		standing.setForeground(Color.WHITE);
		standing.setBackground(new Color(91,146,121));
		
		//GBC Values	
		gbc.gridheight = 2;
		
		gbc = gbcSetValues(
				//Constraint	
				gbc, 
				
				//Grid X, Grid Y
				0, 8, 
				
				//Internal Padding Y
				20, 
				
				//Weight X, Weight Y
				0.2, 0,
				
				//Direction AKA "HORIZONTAL" or "BOTH"
				""
				);
		
		//Add component to pane, follows constraints
		pane.add(standing, gbc);
		
		 standing.addActionListener(
				 new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JFrame createReminder = new JFrame("Create Ranged Time Reminder");
						createReminder.getContentPane().setBackground(new Color(239, 245, 243));
						standingBreak test2 = new standingBreak();
						test2.addComponentToPane(createReminder.getContentPane());
						createReminder.setMinimumSize(new Dimension(800, 490));
						createReminder.pack();
						createReminder.setLocationRelativeTo(null);
						createReminder.setVisible(true); 
				}
			}
		);
	
		//Account button
		JButton account = new JButton("Account");
		account.setFont(new Font("Helvetica", Font.BOLD, 13));
		account.setForeground(Color.WHITE);
		account.setBackground(new Color(69, 110, 91));
		
		//GBC Values	
		gbc.gridheight = 1;
		gbc = gbcSetValues(
				//Constraint	
				gbc, 
				
				//Grid X, Grid Y
				1, 1, 
				
				//Internal Padding Y
				0, 
				
				//Weight X, Weight Y
				0.2, 0,
				
				//Direction AKA "HORIZONTAL" or "BOTH"
				""
				);
		
		account.addActionListener(
				 new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						//dispose();
						accountSettings a1 = new accountSettings();
						a1.main(null);
				}
			}
		);

		//Add component to pane, follows constraints
		pane.add(account, gbc);
		
		
		//Sign Out button
		JButton signOut = new JButton("Sign Out");
		signOut.setFont(new Font("Helvetica", Font.BOLD, 13));
		signOut.setForeground(Color.WHITE);
		signOut.setBackground(new Color(69, 110, 91));
		
		//GBC Values
		gbc.gridheight = 1;
		gbc = gbcSetValues(
				//Constraint	
				gbc, 
				
				//Grid X, Grid Y
				1, 2, 
				
				//Internal Padding Y
				0, 
				
				//Weight X, Weight Y
				0.2, 0,
				
				//Direction AKA "HORIZONTAL" or "BOTH"
				""
				);
		
		signOut.addActionListener(
				 new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						//dispose();
						login_window a1 = new login_window();
						a1.main(null);
				}
			}
		);
		
		//Add component to pane, follows constraints
		pane.add(signOut, gbc);
		
		//Reminder Placeholder
		JButton placeHolder = new JButton("Test Reminder");
		placeHolder.setFont(new Font("Helvetica", Font.BOLD, 13));
		placeHolder.setForeground(Color.WHITE);
		placeHolder.setBackground(new Color(91,146,121));
		
		//GBC Values	
		gbc = gbcSetValues(
				//Constraint	
				gbc, 
				
				//Grid X, Grid Y
				1, 5, 
				
				//Internal Padding Y
				20, 
				
				//Weight X, Weight Y
				0.2, 0,
				
				//Direction AKA "HORIZONTAL" or "BOTH"
				""
				);
		
		//Add component to pane, follows constraints
		pane.add(placeHolder, gbc);
		
<<<<<<< HEAD
		
		//Clock
		
		label4 = new JLabel("Clock", SwingConstants.CENTER);
=======
		//Clock Title
		JLabel label4 = new JLabel("Date and Time", SwingConstants.CENTER);
>>>>>>> b847d6774741433e4a7e5f26ac543619c9327630
		label4.setFont(new Font("Helvetica", Font.BOLD, 15));
		label4.setForeground(new Color(30, 47, 39));
		
		//GBC Values	
		gbc.gridheight = 1;
		
		gbc = gbcSetValues(
				//Constraint	
				gbc, 
				
				//Grid X, Grid Y
				2, 3, 
				
				//Internal Padding Y
				0, 
				
				//Weight X, Weight Y
				0.2, 0,
				
				//Direction AKA "HORIZONTAL" or "BOTH"
				""
				);
		
		//Add component to pane, follows constraints
		pane.add(label4, gbc);
		
		//Display Clock
		//GBC Values	
		gbc.gridheight = 5;
		
		gbc = gbcSetValues(
				//Constraint	
				gbc, 
				
				//Grid X, Grid Y
				2, 5, 
				
				//Internal Padding Y
				0, 
				
				//Weight X, Weight Y
				0, 0,
				
				//Direction AKA "HORIZONTAL" or "BOTH"
				""
				);

				//Add component to pane, follows constraints
				pane.add(new DisplayClock(), gbc);
		
		
		//Date
		// get current date and convert it to a string
		String day = java.time.LocalDate.now().toString();
		
		JLabel date = new JLabel(day, SwingConstants.CENTER);
		date.setFont(new Font("Helvetica", Font.BOLD, 13));
		date.setForeground(Color.BLACK);
		date.setOpaque(true);
		date.setBackground(new Color(91,146,121));
		
		//GBC Values
		gbc.gridheight = 1;
		gbc.ipadx = 150;
		
		gbc = gbcSetValues(
				//Constraint	
				gbc, 
				
				//Grid X, Grid Y
				2, 4, 
				
				//Internal Padding Y
				29, 
				
				//Weight X, Weight Y
				0.2, 0,
				
				//Direction AKA "HORIZONTAL" or "BOTH"
				""
				);

		//Add component to pane, follows constraints
		pane.add(date, gbc); // date,gbc
		
		// edit button
		JButton Edit = new JButton("Edit");
		Edit.setFont(new Font("Helvetica", Font.BOLD, 13));
		Edit.setForeground(Color.WHITE);
		Edit.setBackground(new Color(91,146,121));
		
		//GBC Values
		gbc.gridheight = 1;
		
		gbc = gbcSetValues(
				//Constraint	
				gbc, 
				
				//Grid X, Grid Y
				1, 4, 
				
				//Internal Padding Y
				20, 
				
				//Weight X, Weight Y
				0.2, 0,
				
				//Direction AKA "HORIZONTAL" or "BOTH"
				""
				);

		pane.add(Edit, gbc);
		Edit.addActionListener(
				 new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JFrame editReminder = new JFrame("Edit Reminder");
						editReminder.getContentPane().setBackground(backgroundColor);
						EditReminder test3 = new EditReminder();
<<<<<<< HEAD
						test3.addComponentToPane(editReminder.getContentPane()); //editReminder.getContentPane()
						editReminder.setMinimumSize(new Dimension(800, 430));
=======
						test3.addComponentToPane(editReminder.getContentPane()); 
						editReminder.setMinimumSize(new Dimension(800, 490));
>>>>>>> b847d6774741433e4a7e5f26ac543619c9327630
						editReminder.pack();
						editReminder.setLocationRelativeTo(null);
						editReminder.setVisible(true);
				}
			}
		);
	
	}  
	
	//Initializing GUI
	public static void initGUI() {
		
		//Creates Reminder frame
		JFrame dash = new JFrame("Reminder");
		
		//GUI components get added to the frame
		addComponentsToPane(dash.getContentPane());  
		
		//Sets background color of frame
		dash.getContentPane().setBackground(backgroundColor);
		
		//When user closes the frame, the program quits
		dash.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		//Sets minimum size of frame
		dash.setMinimumSize(new Dimension(800, 490));
		
		dash.pack();
		
		//Sets frame in the middle of the screen
		dash.setLocationRelativeTo(null); 
		
		//Allows frame to be visible
		dash.setVisible(true); 
	}
	
	// Main - where we call initGUI
	public static void main(String[] args) {
		
		initGUI();
		
	}
	
}