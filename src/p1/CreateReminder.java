package p1;

import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;


interface Reminder {
	public void setReminderName(JTextField reminderName);
	public void setDescription(JTextField desc);
	public void setTime(Object time);
	public void setTime(Object time1, Object time2);
	public void setNumber(Object number);
	public void setNumber(int number1);
}

class CustomReminders implements Reminder {
	
	private JTextField reminderName;
	private JTextField desc;
	private Object time1;
	private Object time2;
	private int number1;
	private Object number;
	

	@Override
	public void setReminderName(JTextField reminderName) {
		this.reminderName = reminderName;
		
	}

	@Override
	public void setDescription(JTextField desc) {
		this.desc = desc;
		
	}

	@Override
	public void setTime(Object time) {
		this.time1 = time;
		
	}
	
	@Override
	public void setTime(Object time1, Object time2) {
		this.time1 = time1;
		this.time2 = time2;
		
	}

	@Override
	public void setNumber(int number) {
		this.number = number;
		
	}
	
	@Override
	public void setNumber(Object number1) {
		this.number = number1;
		
	}


}

interface ReminderBuilder {
	public void buildReminderName();
	public void buildDescription();
	public void buildTime();
	public void buildNumber();
	public CustomReminders getReminder();
}


public class CreateReminder extends Frame {
	private static final long serialVersionUID = 1L;
	
	public static void addCustomComponentsToPane(Container pane) {
		
		//Initializing buttons and labels
		//JButton submit;
		//JLabel title, name, desc, time, space, space2;
		//JTextField reminderName, description;
				
		pane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		pane.setLayout(new GridBagLayout());  
		GridBagConstraints gbc = new GridBagConstraints(); 
		gbc.insets = new Insets (2, 5, 2, 5);	
	
		
		class SpecificTimeBuilder implements ReminderBuilder {
			
			private CustomReminders reminder;
			
			public SpecificTimeBuilder() {
				this.reminder = new CustomReminders();
			}

			@Override
			public void buildReminderName() {
				//Create Specific Time Reminders Title
				JLabel title = new JLabel("Create Specific Time Reminder", SwingConstants.CENTER);
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
				JLabel name = new JLabel("Reminder Name");
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
				JTextField reminderName = new JTextField("");
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
			
				reminder.setReminderName(reminderName);
				
			}

			@Override
			public void buildDescription() {
				//Description
				JLabel desc = new JLabel("Description");
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
				JTextField description = new JTextField("");
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
				
				reminder.setDescription(description);
				
				
			}

			@Override
			public void buildTime() {
				//Time
				JLabel time = new JLabel("At what time would you like to be reminded?");
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
				
				
				//Time Spinner
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
				gbc.gridy = 6;
				//Internal padding
				gbc.ipady = 5;
				//Spacing
				gbc.weightx = 0.2;
				gbc.weighty = 0;
				//As window resizes, components stretch horizontally
				gbc.fill = GridBagConstraints.HORIZONTAL;
				//Add component to pane, follows constraints
				pane.add(spinner, gbc);
				
				//Submit
				JButton submit = new JButton("Submit");
				submit.setFont(new Font("Helvetica", Font.BOLD, 13));
				submit.setForeground(Color.WHITE);
				submit.setBackground(new Color(91,146,121));
				//Grid positioning
				gbc.gridx = 1;
				gbc.gridy = 7;
				//Internal padding
				gbc.ipady = 1;
				//Spacing
				gbc.weightx = 0.2;
				gbc.weighty = 0;
				//As window resizes, components stretch horizontally
				gbc.fill = GridBagConstraints.NONE;
				//Add component to pane, follows constraints
				pane.add(submit, gbc);
				
			//Space
				JLabel space2 = new JLabel("");
				//Grid positioning
				gbc.gridx = 1;
				gbc.gridy = 8;
				//Internal padding
				gbc.ipady = 100;
				//Spacing
				gbc.weightx = 0.2;
				gbc.weighty = 0;
				//As window resizes, components stretch horizontally
				gbc.fill = GridBagConstraints.BOTH;
				//Add component to pane, follows constraints
				pane.add(space2, gbc);
				
			//Space
				JLabel space = new JLabel("");
				//Grid positioning
				gbc.gridx = 1;
				gbc.gridy = 7;
				//Internal padding
				gbc.ipady = 50;
				//Spacing
				gbc.weightx = 0.2;
				gbc.weighty = 0;
				//As window resizes, components stretch horizontally
				gbc.fill = GridBagConstraints.BOTH;
				//Add component to pane, follows constraints
				pane.add(space, gbc);
				
				reminder.setTime(spinner.getValue());
				
			}
			
			
			@Override
			public void buildNumber() {
				reminder.setNumber(1);
				
			}

			@Override
			public CustomReminders getReminder() {
				return this.reminder;
			}
			
		}
		
		class RangedTimeBuilder implements ReminderBuilder {
			
			private CustomReminders reminder;
			
			public RangedTimeBuilder() {
				this.reminder = new CustomReminders();
			}

			@Override
			public void buildReminderName() {
				JLabel title = new JLabel("Create Ranged Time Reminder", SwingConstants.CENTER);
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
				JLabel name = new JLabel("Reminder Name");
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
				JTextField reminderName = new JTextField("");
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
				
				reminder.setReminderName(reminderName);
				
			}

			@Override
			public void buildDescription() {
				//Description
				JLabel desc = new JLabel("Description");
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
				JTextField description = new JTextField("");
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
				
				reminder.setDescription(description);
				
			}

			@Override
			public void buildTime() {
			//Between what hours
				JLabel hours = new JLabel("Between the hours of");
				hours.setFont(new Font("Helvetica", Font.BOLD, 13));
				hours.setForeground(new Color(30, 47, 39));
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
				pane.add(hours, gbc);
				
			//Time Spinner 1
				String times[] = { "00:00", "01:00", "02:00",
				        "03:00", "04:00", "05.00", "06.00", "07.00",
				        "08.00", "09.00", "10.00", "11:00", "12:00", "13:00", "14:00",
				        "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00",
				        "22:00", "23:00"};
				JSpinner spinner1 = new JSpinner(new SpinnerListModel(times));
				JComponent editor = spinner1.getEditor();
				JSpinner.DefaultEditor spinnerEditor = (JSpinner.DefaultEditor)editor;
				spinnerEditor.getTextField().setHorizontalAlignment(JTextField.LEFT);
				//Grid positioning
				gbc.gridx = 1;
				gbc.gridy = 8;
				//Internal padding
				gbc.ipady = 5;
				//Spacing
				gbc.weightx = 0.2;
				gbc.weighty = 0;
				//As window resizes, components stretch horizontally
				gbc.fill = GridBagConstraints.HORIZONTAL;
				//Add component to pane, follows constraints
				pane.add(spinner1, gbc);
				
			//And
				JLabel and = new JLabel("and");
				and.setFont(new Font("Helvetica", Font.BOLD, 13));
				and.setForeground(new Color(30, 47, 39));
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
				pane.add(and, gbc);
				
			//Time Spinner 2
				JSpinner spinner2 = new JSpinner(new SpinnerListModel(times));
				editor = spinner2.getEditor();
				spinnerEditor = (JSpinner.DefaultEditor)editor;
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
				pane.add(spinner2, gbc);
				
			//Space
				JLabel space = new JLabel("");
				//Grid positioning
				gbc.gridx = 1;
				gbc.gridy = 11;
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
				JButton submit = new JButton("Submit");
				submit.setFont(new Font("Helvetica", Font.BOLD, 13));
				submit.setForeground(Color.WHITE);
				submit.setBackground(new Color(91,146,121));
				//Grid positioning
				gbc.gridx = 1;
				gbc.gridy = 12;
				//Internal padding
				gbc.ipady = 1;
				//Spacing
				gbc.weightx = 0.2;
				gbc.weighty = 0;
				//As window resizes, components stretch horizontally
				gbc.fill = GridBagConstraints.NONE;
				//Add component to pane, follows constraints
				pane.add(submit, gbc);
				
			//Space
				JLabel space2 = new JLabel("");
				//Grid positioning
				gbc.gridx = 1;
				gbc.gridy = 13;
				//Internal padding
				gbc.ipady = 10;
				//Spacing
				gbc.weightx = 0.2;
				gbc.weighty = 0;
				//As window resizes, components stretch horizontally
				gbc.fill = GridBagConstraints.BOTH;
				//Add component to pane, follows constraints
				pane.add(space2, gbc);
				
				reminder.setTime(spinner1, spinner2);
				
			}

			@Override
			public void buildNumber() {
				//Time
				JLabel time = new JLabel("How many times would you like to be reminded?");
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
				
			//How many times
				JSpinner spinner3 = new JSpinner(new SpinnerNumberModel(2, 2, 24, 1));
				JComponent editor = spinner3.getEditor();
				JSpinner.DefaultEditor spinnerEditor = (JSpinner.DefaultEditor)editor;
				spinnerEditor.getTextField().setHorizontalAlignment(JTextField.LEFT);
				//Grid positioning
				gbc.gridx = 1;
				gbc.gridy = 6;
				//Internal padding
				gbc.ipady = 5;
				//Spacing
				gbc.weightx = 0.2;
				gbc.weighty = 0;
				//As window resizes, components stretch horizontally
				gbc.fill = GridBagConstraints.HORIZONTAL;
				//Add component to pane, follows constraints
				pane.add(spinner3, gbc);
				
				reminder.setNumber(spinner3);
				
			}

			@Override
			public CustomReminders getReminder() {
				return this.reminder;
			}
			
		}
		
	
}
	

}

class AddComponents {
	private ReminderBuilder reminderBuilder;
	
	public AddComponents(ReminderBuilder reminderBuilder) {
		this.reminderBuilder = reminderBuilder;
	}
	
	public CustomReminders getReminder() {
		return this.reminderBuilder.getReminder();
	}
	
	public void constructReminder() {
		this.reminderBuilder.buildReminderName();
		this.reminderBuilder.buildDescription();
		this.reminderBuilder.buildTime();
		this.reminderBuilder.buildTime();
	}
	
}