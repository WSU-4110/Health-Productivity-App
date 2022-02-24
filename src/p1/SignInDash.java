
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
	
	// main
	public static void main(String[] args) {
		
		initGUI();
		
	}
}


