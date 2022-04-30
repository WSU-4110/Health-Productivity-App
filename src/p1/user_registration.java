package p1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class user_registration extends JFrame
{
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField firstname;
    private JTextField lastname;
    private JTextField email;
    private JTextField username;
    private JTextField mob;
    private JPasswordField passwordField;
    private JButton btnNewButton;
    private JButton registerButton;
    

    /**
     * Launch the application.
     */
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try
                {
                	user_registration frame = new user_registration();
                    frame.setVisible(true);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */

    public user_registration()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewUserRegister = new JLabel("New User Register");
        lblNewUserRegister.setFont(new Font("Times New Roman", Font.PLAIN, 42));
        lblNewUserRegister.setBounds(362, 52, 325, 50);
        contentPane.add(lblNewUserRegister);

        JLabel lblName = new JLabel("First name:");
        lblName.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        lblName.setBounds(58, 152, 99, 43);
        contentPane.add(lblName);

        JLabel lblNewLabel = new JLabel("Last name:");
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        lblNewLabel.setBounds(58, 243, 110, 29);
        contentPane.add(lblNewLabel);

        JLabel lblEmailAddress = new JLabel("Email\r\n address:");
        lblEmailAddress.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        lblEmailAddress.setBounds(58, 324, 124, 36);
        contentPane.add(lblEmailAddress);

        firstname = new JTextField();
        firstname.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        firstname.setBounds(214, 151, 228, 50);
        contentPane.add(firstname);
        firstname.setColumns(10);

        lastname = new JTextField();
        lastname.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        lastname.setBounds(214, 235, 228, 50);
        contentPane.add(lastname);
        lastname.setColumns(10);

        email = new JTextField();

        email.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        email.setBounds(214, 320, 228, 50);
        contentPane.add(email);
        email.setColumns(10);

        username = new JTextField();
        username.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        username.setBounds(707, 151, 228, 50);
        contentPane.add(username);
        username.setColumns(10);

        JLabel lblUsername = new JLabel("Username:");
        lblUsername.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        lblUsername.setBounds(542, 159, 99, 29);
        contentPane.add(lblUsername);

        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        lblPassword.setBounds(542, 245, 99, 24);
        contentPane.add(lblPassword);

        JLabel lblMobileNumber = new JLabel("Phone number:");
        lblMobileNumber.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        lblMobileNumber.setBounds(542, 329, 139, 26);
        contentPane.add(lblMobileNumber);

        mob = new JTextField();
        mob.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        mob.setBounds(707, 320, 228, 50);
        contentPane.add(mob);
        mob.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        passwordField.setBounds(707, 235, 228, 50);
        contentPane.add(passwordField);

        btnNewButton = new JButton("Register");
        btnNewButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String firstName = firstname.getText();
                String lastName = lastname.getText();
                String emailId = email.getText();
                String userName = username.getText();
                String mobileNumber = mob.getText();
                int len = mobileNumber.length();
                String password = passwordField.getText();

                String msg = "" + firstName;
                msg += " \n";
                if (len != 10)
                {
                    JOptionPane.showMessageDialog(btnNewButton, "Enter a valid phone number");
                }

                try
                {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/healthApp", "root", "password1234");

                    String query = "INSERT INTO users values('" + firstName + "','" + lastName + "','" + userName + "','" +
                        password + "','" + emailId + "','" + mobileNumber + "')";

                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0)
                    {
                        JOptionPane.showMessageDialog(btnNewButton, "User already exists");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(btnNewButton,
                            "Welcome, " + msg + "Your account is sucessfully created");
                    }
                    connection.close();
                }
                catch (Exception exception)
                {
                    exception.printStackTrace();
                }
            }
        });
        btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        btnNewButton.setBounds(499, 447, 259, 74);
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.setBackground(new Color(91,146,121));
        contentPane.add(btnNewButton);
        
        registerButton = new JButton("Back");
        registerButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
            	dispose();
                login_window ah = new login_window();
                ah.setVisible(true); 
            }
        });
        
        registerButton.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        registerButton.setBounds(199, 447, 259, 74);
        registerButton.setForeground(Color.WHITE);
        registerButton.setBackground(new Color(91,146,121));
        contentPane.add(registerButton);
    }
}
