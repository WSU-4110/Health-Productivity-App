
package p1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.*;  
//import java.util.*;

public class SignInDash extends JFrame {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//Where we set up GUI components in Sign In Dashboard
	public static void addComponentsToPane(Container pane) {
	
		//Set component orientation - left to right
	    pane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
	    
	    //Initializing buttons and labels
		JButton specific, range, water, standing, account, signOut, date, placeHolder;
		JLabel label1, label2, label3, label4, label5;
		
		//Set GridBag layout and constraints
		pane.setLayout(new GridBagLayout());  
		GridBagConstraints gbc = new GridBagConstraints(); 
		
		//External padding for each component (top, left, bottom, right)
		gbc.insets = new Insets (2, 5, 2, 5);
		
		
		//Reminders Title
			//Set font, font color, and background color
		label1 = new JLabel("Reminders Application", SwingConstants.CENTER);
		label1.setFont(new Font("Helvetica", Font.BOLD, 25));
		label1.setForeground(new Color(20, 31, 26));
		//label1.setOpaque(true);
		//label1.setBackground(new Color(91,146,121));
		//Grid positioning
		gbc.gridx = 1;
		gbc.gridy = 0;
		//Internal padding
		gbc.ipady = 15;
		//Spacing
		gbc.weightx = 0.2;
		gbc.weighty = 0;
		//As window resizes, components stretch horizontally
		gbc.fill = GridBagConstraints.HORIZONTAL;
		//Add component to pane, follows constraints
		pane.add(label1, gbc);
		
		label2 = new JLabel("Custom Reminders", SwingConstants.CENTER);
		label2.setFont(new Font("Helvetica", Font.BOLD, 15));
		label2.setForeground(new Color(30, 47, 39));
		//Grid positioning
		gbc.gridx = 0;
		gbc.gridy = 3;
		//Internal padding
		gbc.ipady = 0;
		//Spacing
		gbc.weightx = 0.2;
		gbc.weighty = 0;
		//As window resizes, components stretch horizontally
		gbc.fill = GridBagConstraints.HORIZONTAL;
		//Add component to pane, follows constraints
		pane.add(label2, gbc);
		
		label5 = new JLabel("Current Reminders", SwingConstants.CENTER);
		label5.setFont(new Font("Helvetica", Font.BOLD, 15));
		label5.setForeground(new Color(30, 47, 39));
		//Grid positioning
		gbc.gridx = 1;
		gbc.gridy = 3;
		//Internal padding
		gbc.ipady = 0;
		//Spacing
		gbc.weightx = 0.2;
		gbc.weighty = 0;
		//As window resizes, components stretch horizontally
		gbc.fill = GridBagConstraints.HORIZONTAL;
		//Add component to pane, follows constraints
		pane.add(label5, gbc);
		
		//Create Specific Time Reminder button
		specific = new JButton("+ Create Specific Time Reminder");
		specific.setFont(new Font("Helvetica", Font.BOLD, 13));
		specific.setForeground(Color.WHITE);
		specific.setBackground(new Color(91,146,121));
		//Grid positioning
		gbc.gridx = 0;
		gbc.gridy = 4;
		//Internal padding
		gbc.ipady = 20;
		//Spacing
		gbc.weightx = 0.2;
		gbc.weighty = 0;
		//Add component to pane, follows constraints
		pane.add(specific, gbc);
		
		 specific.addActionListener(
				 new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JFrame createReminder = new JFrame("Create Specific Time Reminder");
						createReminder.getContentPane().setBackground(new Color(239, 245, 243));
						CreateReminder.addSpecificComponentsToPane(createReminder.getContentPane());  
						createReminder.setMinimumSize(new Dimension(800, 430));
						createReminder.pack();
						createReminder.setLocationRelativeTo(null);
						createReminder.setVisible(true); 
				}
			}
		);
		 
		//Create Ranged Reminder button
		range = new JButton("+ Create Ranged Time Reminder");
		range.setFont(new Font("Helvetica", Font.BOLD, 13));
		range.setForeground(Color.WHITE);
		range.setBackground(new Color(91,146,121));
		//Grid positioning
		gbc.gridx = 0;
		gbc.gridy = 5;
		//Internal padding
		gbc.ipady = 20;
		//Spacing
		gbc.weightx = 0.2;
		gbc.weighty = 0;
		//Add component to pane, follows constraints
		pane.add(range, gbc);
			
		 range.addActionListener(
				 new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JFrame createReminder = new JFrame("Create Ranged Time Reminder");
						createReminder.getContentPane().setBackground(new Color(239, 245, 243));
						CreateReminder.addRangedComponentsToPane(createReminder.getContentPane());  
						createReminder.setMinimumSize(new Dimension(800, 430));
						createReminder.pack();
						createReminder.setLocationRelativeTo(null);
						createReminder.setVisible(true); 
				}
			}
		);
		 
		label3 = new JLabel("Preset Reminders", SwingConstants.CENTER);
		label3.setFont(new Font("Helvetica", Font.BOLD, 15));
		label3.setForeground(new Color(30, 47, 39));
		//Grid positioning
		gbc.gridx = 0;
		gbc.gridy = 6;
		//Internal padding
		gbc.ipady = 0;
		//Spacing
		gbc.weightx = 0.2;
		gbc.weighty = 0;
		//As window resizes, components stretch horizontally
		gbc.fill = GridBagConstraints.HORIZONTAL;
		//Add component to pane, follows constraints
		pane.add(label3, gbc);
		 
		//Preset button 1
		water = new JButton("+ Drink Water");
		water.setFont(new Font("Helvetica", Font.BOLD, 13));
		water.setForeground(Color.WHITE);
		water.setBackground(new Color(91,146,121));
		//Grid positioning
		gbc.gridx = 0;
		gbc.gridy = 7;
		//Internal padding
		gbc.ipady = 20;
		//Spacing
		gbc.weightx = 0.2;
		gbc.weighty = 0;
		//Add component to pane, follows constraints
		pane.add(water, gbc);
		
		water.addActionListener(
				 new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JFrame createReminder = new JFrame("Create Water Reminder");
						createReminder.getContentPane().setBackground(new Color(239, 245, 243));
						CreateReminder.addWaterPresetComponentsToPane(createReminder.getContentPane());  
						createReminder.setMinimumSize(new Dimension(800, 430));
						createReminder.pack();
						createReminder.setLocationRelativeTo(null);
						createReminder.setVisible(true); 
				}
			}
		);
		
		//Preset button 2
		standing = new JButton("+ Standing Break");
		standing.setFont(new Font("Helvetica", Font.BOLD, 13));
		standing.setForeground(Color.WHITE);
		standing.setBackground(new Color(91,146,121));
		//Grid positioning
		gbc.gridx = 0;
		gbc.gridy = 8;
		//Internal padding
		gbc.ipady = 20;
		//Spacing
		gbc.weightx = 0.2;
		gbc.weighty = 0;
		//Add component to pane, follows constraints
		pane.add(standing, gbc);
		
		 standing.addActionListener(
				 new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JFrame createReminder = new JFrame("Create Ranged Time Reminder");
						createReminder.getContentPane().setBackground(new Color(239, 245, 243));
						CreateReminder.addStandingPresetComponentsToPane(createReminder.getContentPane());
						createReminder.setMinimumSize(new Dimension(800, 430));
						createReminder.pack();
						createReminder.setLocationRelativeTo(null);
						createReminder.setVisible(true); 
				}
			}
		);
		
	
		//Account button
		account = new JButton("Account");
		account.setFont(new Font("Helvetica", Font.BOLD, 13));
		account.setForeground(Color.WHITE);
		account.setBackground(new Color(69, 110, 91));
		//Grid positioning
		gbc.gridx = 1;
		gbc.gridy = 1;
		//Internal padding
		gbc.ipady = 0;
		//Spacing
		gbc.weightx = 0.2;
		gbc.weighty = 0;
		//Add component to pane, follows constraints
		pane.add(account, gbc);
		
		
		//Sign Out button
		signOut = new JButton("Sign Out");
		signOut.setFont(new Font("Helvetica", Font.BOLD, 13));
		signOut.setForeground(Color.WHITE);
		signOut.setBackground(new Color(69, 110, 91));
		//Grid positioning
		gbc.gridx = 1;
		gbc.gridy = 2;
		//Spacing
		gbc.weightx = 0.2;
		gbc.weighty = 0;
		//Add component to pane, follows constraints
		pane.add(signOut, gbc);
		
		//Reminder Placeholder
		placeHolder = new JButton("Test Reminder");
		placeHolder.setFont(new Font("Helvetica", Font.BOLD, 13));
		placeHolder.setForeground(Color.WHITE);
		placeHolder.setBackground(new Color(91,146,121));
		//Grid positioning
		gbc.gridx = 1;
		gbc.gridy = 4;
		//Spacing
		gbc.weightx = 0.2;
		gbc.weighty = 0;
		//Internal padding
		gbc.ipady = 20;
		//Add component to pane, follows constraints
		pane.add(placeHolder, gbc);
		
		
		//Clock
		label4 = new JLabel("Clock", SwingConstants.CENTER);
		label4.setFont(new Font("Helvetica", Font.BOLD, 15));
		label4.setForeground(new Color(30, 47, 39));
		//Grid positioning
		gbc.gridx = 2;
		gbc.gridy = 3;
		//Internal padding
		gbc.ipady = 0;
		gbc.ipadx = 190;
		//Spacing
		gbc.weightx = 0.2;
		gbc.weighty = 0;
		//Add component to pane, follows constraints
		pane.add(label4, gbc);
		
		
		//Date placeholder
		date = new JButton("Date Placeholder");
		date.setFont(new Font("Helvetica", Font.BOLD, 13));
		date.setForeground(Color.WHITE);
		date.setBackground(new Color(91,146,121));
		//Grid positioning
		gbc.gridx = 2;
		gbc.gridy = 4;
		//Internal padding
		gbc.ipady = 20;
		gbc.ipadx = 75;
		//Spacing
		gbc.weightx = 0.2;
		gbc.weighty = 0;
		//Add component to pane, follows constraints
		pane.add(date, gbc);
	
	}  
	
	//Initializing GUI
	public static void initGUI() {
		
		//Creates Reminder frame
		JFrame dash = new JFrame("Reminder");
		
		//GUI components get added to the frame
		addComponentsToPane(dash.getContentPane());  
		
		//Sets background color of frame
		dash.getContentPane().setBackground(new Color(239, 245, 243));
		
		//When user closes the frame, the program quits
		dash.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		//Sets minimum size of frame
		dash.setMinimumSize(new Dimension(800, 430));
		
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
	
    public void windowClosing(WindowEvent e) {
        dispose();
        System.exit(0);
    }

    public void windowOpened(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
	

}