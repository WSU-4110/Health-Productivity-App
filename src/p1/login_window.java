package p1;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class login_window
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		frame.setSize(500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		// user name
		JLabel usernameLabel = new JLabel("Username:");
		usernameLabel.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		usernameLabel.setBounds(10, 20, 150, 25);
		panel.add(usernameLabel);
		JTextField usernameTextField = new JTextField(20);
		usernameTextField.setBounds(150, 20, 165, 25);
		panel.add(usernameTextField);
		
		//password
		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		passwordLabel.setBounds(10, 75, 150, 25);
		panel.add(passwordLabel);
		JPasswordField passwordField = new JPasswordField(20);
		passwordField.setBounds(150, 75, 165, 25);
		panel.add(passwordField);
		
		// login button
		JButton loginButton = new JButton("Login");
		loginButton.setBounds(10, 125, 100, 25);
		panel.add(loginButton);
		
		// register button
		JButton registerButton = new JButton("Register");
		registerButton.setBounds(150, 125, 100, 25);
		panel.add(registerButton);
		
		frame.setVisible(true);
	}

}
