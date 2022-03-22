package p1;

import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CreateReminder {
	
	public static void addComponentsToPane(Container pane) {
		
		//Set component orientation - left to right
	    pane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
	    pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
	    
	    addLabel("Reminder Name", pane);
	    addText("", pane);
	    addLabel("Description", pane);
	    addText("", pane);
	    addLabel("Set range", pane);
	    addText("", pane);
	    addButton("Submit", pane);
    }
 
    private static void addButton(String text, Container container) {
        JButton button = new JButton(text);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(button);
    }
    
    private static void addLabel(String text, Container container) {
        JLabel label = new JLabel(text);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(label);
    }
    
    private static void addText(String text, Container container) {
    	JTextField textfield = new JTextField(text);
    	
        textfield.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(textfield);
    }
    
    
 
	
}
