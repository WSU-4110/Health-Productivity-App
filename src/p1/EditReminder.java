package p1;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class EditReminder {
	public static void addComponentToPane(Container pane)
	{
		// initializing buttons and labels
		JButton submit, decline;
		JLabel title, name;
		JTextField reminderName;
		
		pane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		pane.setLayout(new GridBagLayout());  
		GridBagConstraints gbc = new GridBagConstraints(); 
		gbc.insets = new Insets (2, 5, 2, 5);	
		
		//Create Ranged Time Reminders Title
		title = new JLabel("Which reminder would you like to edit?", SwingConstants.CENTER);
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
		reminderName = new JTextField("");
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
		
		//Submit
		submit = new JButton("Submit");
		submit.setFont(new Font("Helvetica", Font.BOLD, 13));
		submit.setForeground(Color.WHITE);
		submit.setBackground(new Color(91,146,121));
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
		pane.add(submit, gbc);
		
		decline = new JButton("Decline");
		decline.setFont(new Font("Helvetica", Font.BOLD, 13));
		decline.setForeground(Color.WHITE);
		decline.setBackground(new Color(91,146,121));
		//Grid positioning
		gbc.gridx = 0;
		gbc.gridy = 3;
		//Internal padding
		gbc.ipady = 1;
		//Spacing
		gbc.weightx = 0.2;
		gbc.weighty = 0;
		//As window resizes, components stretch horizontally
		gbc.fill = GridBagConstraints.HORIZONTAL;
		//Add component to pane, follows constraints
		pane.add(decline, gbc);
	}
}
