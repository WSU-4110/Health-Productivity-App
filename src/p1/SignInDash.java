/*
package p1;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
 
public class SignInDash {
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;
 
    public static void addComponentsToPane(Container pane) {
        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }
 
        JButton button;
    pane.setLayout(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    if (shouldFill) {
    //natural height, maximum width
    c.fill = GridBagConstraints.HORIZONTAL;
    }
 
    button = new JButton("Button 1");
    if (shouldWeightX) {
    c.weightx = 0.5;
    }
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 0;
    c.gridy = 0;
    pane.add(button, c);
 
    button = new JButton("Button 2");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.weightx = 0.5;
    c.gridx = 1;
    c.gridy = 0;
    pane.add(button, c);
 
    button = new JButton("Button 3");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.weightx = 0.5;
    c.gridx = 2;
    c.gridy = 0;
    pane.add(button, c);
 
    button = new JButton("Long-Named Button 4");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.ipady = 40;      //make this component tall
    c.weightx = 0.0;
    c.gridwidth = 3;
    c.gridx = 0;
    c.gridy = 1;
    pane.add(button, c);
 
    button = new JButton("5");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.ipady = 0;       //reset to default
    c.weighty = 1.0;   //request any extra vertical space
    c.anchor = GridBagConstraints.PAGE_END; //bottom of space
    c.insets = new Insets(10,0,0,0);  //top padding
    c.gridx = 1;       //aligned with button 2
    c.gridwidth = 2;   //2 columns wide
    c.gridy = 2;       //third row
    pane.add(button, c);
    }
 

    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("SignInDash");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}

*/

package p1;
import java.awt.*;
import javax.swing.*;  
import java.util.*;

public class SignInDash {
	
	final static boolean shouldFill = true;
	final static boolean shouldWeightX = true;
	final static boolean RIGHT_TO_LEFT = false;
	  
	public static void addComponentsToPane(Container pane) { 
	
	if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }
	  
	JButton button;  
	JLabel label;
	pane.setLayout(new GridBagLayout());  
	GridBagConstraints c = new GridBagConstraints();  
	GridBagConstraints d = new GridBagConstraints();  
	GridBagConstraints e = new GridBagConstraints(); 
	GridBagConstraints f = new GridBagConstraints();  
	GridBagConstraints g = new GridBagConstraints();  
	
	//c.insets = new Insets(5, 5, 5, 5);
	
	/*
	label = new JLabel();
	//c.weightx = 0.5;
	c.fill = GridBagConstraints.HORIZONTAL;
	c.gridx = 0;
	c.gridy = 0;
	pane.add(label, c); */
	  
	label = new JLabel("Reminders Application", SwingConstants.CENTER);
	label.setFont(new Font("Helvetica", Font.BOLD, 25));
	label.setForeground(new Color(120,147,149));
	c.fill = GridBagConstraints.NONE;
	c.weighty = 0.1;
	c.anchor = GridBagConstraints.NORTH;
	c.gridx = 1;  
	c.gridy = 0;  
	pane.add(label, c);  
	
	button = new JButton("Account");
	if (shouldWeightX) {
    d.weightx = 0.5;
    }
	//d.weightx = 1;
	d.weighty = 0.1;
	d.fill = GridBagConstraints.HORIZONTAL;
	//d.ipadx = 30;
	//d.ipady = 15;
	d.gridx = 0;
	d.gridy = 1;
	pane.add(button, d);


	button = new JButton("Sign Out");
	e.fill = GridBagConstraints.HORIZONTAL;
	//d.weightx = 1;
	e.weighty = 0.1;
	//d.ipadx = 30;
	//d.ipady = 15;
	e.gridx = 2;
	e.gridy = 1;
	pane.add(button, e);
	
	button = new JButton("+ Create reminder");
	//e.weightx = 0.2;
	f.weighty = 0.1;
	f.fill = GridBagConstraints.HORIZONTAL;
	//e.ipadx = 20;
	f.ipady = 15;
	//e.gridwidth = 2;
	f.gridx = 0;
	f.gridy = 2;
	pane.add(button, f);


	button = new JButton("Other 2");
	g.fill = GridBagConstraints.HORIZONTAL;
	//e.weightx = 0.2;
	g.weighty = 0.1;
	//e.ipadx = 20;
	//e.ipady = 20;
	g.gridx = 2;
	g.gridy = 2;
	pane.add(button, g);
	
	
	/*
	button = new JButton("+ Create reminder");  
	e.fill = GridBagConstraints.HORIZONTAL;  
	e.ipady = 20;      //make this component tall  
	//e.weighty = 0.0;  
	e.gridwidth = 1;  
	e.gridx = 0;  
	e.gridy = 3;  
	pane.add(button, e);  
	  
	button = new JButton("5");  
	e.fill = GridBagConstraints.HORIZONTAL;  
	//e.ipady = 1;       //reset to default  
	//e.weighty = 0.5;   //request any extra vertical space  
	//e.anchor = GridBagConstraints.PAGE_END; //bottom of space  
	e.insets = new Insets(3,0,0,0);  //top padding  
	e.gridx = 2;
	e.gridy = 2;    
	e.gridwidth = 3;  
	pane.add(button, e); */
	
	}  
	
	public static void initGUI() {
		JFrame dash = new JFrame("Reminders App");
		dash.getContentPane().setBackground(new Color(229,227,201));
		dash.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		addComponentsToPane(dash.getContentPane());  
		dash.pack();
		//dash.setMinimumSize(new Dimension(450, 300));
		dash.setLocationRelativeTo(null); 
		dash.setVisible(true); 
	}
	
	
	public static void main(String[] args) {
		
		initGUI();
		
	}
}


