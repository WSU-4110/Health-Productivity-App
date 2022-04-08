package p1;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;
import javax.swing.SwingConstants;

public class drinkWater implements CreateReminderInterface
{
	public static void addComponentToPane(Container pane)
	{
		//Initializing buttons and labels
				JButton submit;
				JLabel title, name, desc, time, ounces, hours, and, space, space2;
				JTextField reminderName, description;
							
				pane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
				pane.setLayout(new GridBagLayout());  
				GridBagConstraints gbc = new GridBagConstraints(); 
				gbc.insets = new Insets (2, 5, 2, 5);	
			
			//Create Ranged Time Reminders Title
				title = new JLabel("Create Water Reminder", SwingConstants.CENTER);
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
				reminderName = new JTextField("Drink water!");
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
			
			//Weight
				//Either manually put in here or pulled from database?
				time = new JLabel("Weight");
				time.setFont(new Font("Helvetica", Font.BOLD, 13));
				time.setForeground(new Color(30, 47, 39));
				//Grid positioning
				gbc.gridx = 1;
				gbc.gridy = 5;
				//Internal padding
				gbc.ipady = 1;
				//Spacing
				gbc.weightx = 0.2;
				gbc.weighty = 0;
				//As window resizes, components stretch horizontally
				gbc.fill = GridBagConstraints.HORIZONTAL;
				//Add component to pane, follows constraints
				pane.add(time, gbc);
				
			//Space
				space = new JLabel("");
				//Grid positioning
				gbc.gridx = 1;
				gbc.gridy = 6;
				//Internal padding
				gbc.ipady = 5;
				//Spacing
				gbc.weightx = 0.2;
				gbc.weighty = 0;
				//As window resizes, components stretch horizontally
				gbc.fill = GridBagConstraints.BOTH;
				//Add component to pane, follows constraints
				pane.add(space, gbc);
				
			//Ounces of water to drink
				//weight in pounds * .5 ounces
				ounces = new JLabel("How much water to drink in a day");
				ounces.setFont(new Font("Helvetica", Font.BOLD, 13));
				ounces.setForeground(new Color(30, 47, 39));
				//Grid positioning
				gbc.gridx = 1;
				gbc.gridy = 7;
				//Internal padding
				gbc.ipady = 1;
				//Spacing
				gbc.weightx = 0.2;
				gbc.weighty = 0;
				//As window resizes, components stretch horizontally
				gbc.fill = GridBagConstraints.HORIZONTAL;
				//Add component to pane, follows constraints
				pane.add(ounces, gbc);
				
			//Space
				space = new JLabel("");
				//Grid positioning
				gbc.gridx = 1;
				gbc.gridy = 8;
				//Internal padding
				gbc.ipady = 5;
				//Spacing
				gbc.weightx = 0.2;
				gbc.weighty = 0;
				//As window resizes, components stretch horizontally
				gbc.fill = GridBagConstraints.BOTH;
				//Add component to pane, follows constraints
				pane.add(space, gbc);
			
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
				String times[] = { "00:00", "01:00", "02:00",
				        "03:00", "04:00", "05.00", "06.00", "07.00",
				        "08.00", "09.00", "10.00", "11:00", "12:00", "13:00", "14:00",
				        "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00",
				        "22:00", "23:00"};
				JSpinner spinner = new JSpinner(new SpinnerListModel(times));
				JComponent editor = spinner.getEditor();
				JSpinner.DefaultEditor spinnerEditor = (JSpinner.DefaultEditor)editor;
				spinnerEditor.getTextField().setHorizontalAlignment(JTextField.LEFT);
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
				pane.add(spinner, gbc);
				
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
				JSpinner spinner2 = new JSpinner(new SpinnerListModel(times));
				editor = spinner2.getEditor();
				spinnerEditor = (JSpinner.DefaultEditor)editor;
				spinnerEditor.getTextField().setHorizontalAlignment(JTextField.LEFT);
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
				pane.add(spinner2, gbc);
				
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
				
			//Space
				space2 = new JLabel("");
				//Grid positioning
				gbc.gridx = 1;
				gbc.gridy = 15;
				//Internal padding
				gbc.ipady = 5;
				//Spacing
				gbc.weightx = 0.2;
				gbc.weighty = 0;
				//As window resizes, components stretch horizontally
				gbc.fill = GridBagConstraints.BOTH;
				//Add component to pane, follows constraints
				pane.add(space2, gbc);
	}
}