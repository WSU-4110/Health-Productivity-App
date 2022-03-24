package p1;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class settings_window
{
	/* private static Connection connect = null;
	private static Statement statement = null;
	private static PreparedStatement preparedStatement = null;
	private static ResultSet resultSet = null; */
	
	public static void main(String[] args) throws SQLException
	{
		/* String query = "select * from account";	
		connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_test", "root", "password1234");
		statement = connect.createStatement();
		statement.executeUpdate(query); */
		
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
		usernameTextField.setText("MasrurAkif");
		usernameTextField.setBounds(160, 20, 165, 25);
		panel.add(usernameTextField);
		
		// first name
		JLabel firstNameLabel = new JLabel("First Name:");
		firstNameLabel.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		firstNameLabel.setBounds(10, 50, 150, 25);
		panel.add(firstNameLabel);
		JTextField firstNameTextField = new JTextField(20);
		firstNameTextField.setText("Masrur");
		firstNameTextField.setBounds(160, 50, 165, 25);
		panel.add(firstNameTextField);
				
		// last name
		JLabel lastNameLabel = new JLabel("Last Name:");
		lastNameLabel.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lastNameLabel.setBounds(10, 80, 150, 25);
		panel.add(lastNameLabel);
		JTextField lastNameTextField = new JTextField(20);
		lastNameTextField.setText("Akif");
		lastNameTextField.setBounds(160, 80, 165, 25);
		panel.add(lastNameTextField);
		
		// email
		JLabel emailLabel = new JLabel("Email:");
		emailLabel.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		emailLabel.setBounds(10, 110, 150, 25);
		panel.add(emailLabel);
		JTextField emailTextField = new JTextField(20);
		emailTextField.setText("masrurakif@wayne.edu");
		emailTextField.setBounds(160, 110, 165, 25);
		panel.add(emailTextField);
				
		// phone number
		JLabel phoneLabel = new JLabel("Phone Number:");
		phoneLabel.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		phoneLabel.setBounds(10, 140, 150, 25);
		panel.add(phoneLabel);
		JTextField phoneField = new JTextField(20);
		phoneField.setText("1234567890");
		phoneField.setBounds(160, 140, 165, 25);
		panel.add(phoneField);
		
		// submit
		JButton submitButton = new JButton("Submit");
		submitButton.setBounds(100, 200, 100, 25);
		panel.add(submitButton);
		
		frame.setVisible(true);
	}

}
