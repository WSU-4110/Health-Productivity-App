package p1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public abstract class TransitionPage extends JFrame implements ActionListener {
	
	JTextArea text;
	
	public TransitionPage() {
		setTitle("Health App Manu");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(700,600);
		setLocationRelativeTo(null);
		
		JMenuBar mbar = new JMenuBar();
		
		JMenu registrationMenu = new JMenu("Register");
		registrationMenu.setMnemonic('R');
		JMenu loginMenu = new JMenu("Login");
		registrationMenu.setMnemonic('L');
		
		
		mbar.add(registrationMenu);
		mbar.add(loginMenu);
		
		this.setJMenuBar(mbar);
		
		text = new JTextArea();
		
		JScrollPane sp = new JScrollPane();
		sp.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		sp.setViewportView(text);
		
		add(sp);
		
		
	}
	
	public static void main(String[] args) {
		new TransitionPage() {
		}.setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent ev) {
		
		
	}

	
}
