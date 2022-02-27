
package p1;
import java.awt.*;
import javax.swing.*;  
//import java.util.*;

public class SignInDash {
	  
	//Where we set up GUI components in Sign In Dashboard
	public static void addComponentsToPane(Container pane) {
	
		//Set component orientation - left to right
	    pane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
	    
	    //Initializing buttons and labels
		JButton b1, b2, b3, b4, b5;
		JLabel label1;
		
		//Set GridBag layout and constraints
		pane.setLayout(new GridBagLayout());  
		GridBagConstraints gbc = new GridBagConstraints(); 
		
		//External padding for each component (top, left, bottom, right)
		gbc.insets = new Insets (2, 5, 2, 5);
		
		
		//Reminders Title
			//Set font, font color, and background color
		label1 = new JLabel("Reminders Application", SwingConstants.CENTER);
		label1.setFont(new Font("Helvetica", Font.BOLD, 25));
		label1.setForeground(new Color(18,19,15));
		label1.setOpaque(true);
		label1.setBackground(new Color(91,146,121));
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
		
		
		//Create Reminder button
		b1 = new JButton("+ Create Reminder");
		//Grid positioning
		gbc.gridx = 0;
		gbc.gridy = 3;
		//Internal padding
		gbc.ipady = 20;
		//Spacing
		gbc.weightx = 0.2;
		gbc.weighty = 0;
		//Add component to pane, follows constraints
		pane.add(b1, gbc);
		
		
		//Account button
		b2 = new JButton("Account");
		//Grid positioning
		gbc.gridx = 1;
		gbc.gridy = 1;
		//Internal padding
		gbc.ipady = 0;
		//Spacing
		gbc.weightx = 0.2;
		gbc.weighty = 0;
		//Add component to pane, follows constraints
		pane.add(b2, gbc);
		
		
		//Sign Out button
		b3 = new JButton("Sign Out");
		//Grid positioning
		gbc.gridx = 1;
		gbc.gridy = 2;
		//Spacing
		gbc.weightx = 0.2;
		gbc.weighty = 0;
		//Add component to pane, follows constraints
		pane.add(b3, gbc);
		
		
		//Clock placeholder
		b4 = new JButton("Clock");
		//Grid positioning
		gbc.gridx = 2;
		gbc.gridy = 3;
		//Internal padding
		gbc.ipady = 20;
		gbc.ipadx = 75;
		//Spacing
		gbc.weightx = 0.2;
		gbc.weighty = 0;
		//Add component to pane, follows constraints
		pane.add(b4, gbc);
		
		
		//Date placeholder
		b5 = new JButton("Date");
		//Grid positioning
		gbc.gridx = 2;
		gbc.gridy = 4;
		//Internal padding
		gbc.ipady = 10;
		gbc.ipadx = 75;
		//Spacing
		gbc.weightx = 0.2;
		gbc.weighty = 0;
		//Add component to pane, follows constraints
		pane.add(b5, gbc);
	
	}  
	
	//Initializing GUI
	public static void initGUI() {
		
		//Creates Reminder frame
		JFrame dash = new JFrame("Reminder");
		
		//GUI components get added to the frame
		addComponentsToPane(dash.getContentPane());  
		
		//Sets background color of frame
		dash.getContentPane().setBackground(new Color(234,230,229));
		
		//When user closes the frame, the program quits
		dash.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		//Sets frame in the middle of the screen
		dash.setLocationRelativeTo(null); 
		
		//Sets minimum size of frame
		dash.setMinimumSize(new Dimension(600, 250));
		
		//Allows frame to be visible
		dash.setVisible(true); 
	}
	
	// Main - where we call initGUI
	public static void main(String[] args) {
		
		initGUI();
		
	}
}