package p1;

import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JunitTesting {

	private static final String EXIT_ON_CLOSE = null;


	public void TransitionPage() {
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
		
		JTextArea text = new JTextArea();
		
		JScrollPane sp = new JScrollPane();
		sp.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		sp.setViewportView(text);
		
		add(sp);
		
		
	}
	
	public void add(JScrollPane sp) {
		// TODO Auto-generated method stub
		sp.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
	}

	public String setJMenuBar(String string) {
		// TODO Auto-generated method stub
		JMenu registrationMenu = new JMenu("Register");
		registrationMenu.setMnemonic('R');
		JMenu loginMenu = new JMenu("Login");
		registrationMenu.setMnemonic('L');
		return string;
	}

	public String setLocationRelativeTo(String one) {
		return one;
	}

	public int setSize(int i, int j) {
		return setSize(700,600);
	}

	public String setDefaultCloseOperation(String exitOnClose) {
		return "EXIT_ON_CLOSE";
	}

	public String setTitle(String one, String two) {
		return one + two;
	}

	public static void main(String[] args) {
		new TransitionPage() {
		}.setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent ev) {
		
		
	}

	public int size(int i) {
		// TODO Auto-generated method stub
		return 700;
	}

	
	public int add(int i) {
		// TODO Auto-generated method stub
		return 10;
	}

	

}
