package p1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class login_window extends JFrame
{

    private static final long serialVersionUID = 1L;
    private JTextField textField;
    private JPasswordField passwordField;
    private JButton btnNewButton;
    private JButton registerButton;
    private JLabel label;
    private JPanel contentPane;

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
                    login_window frame = new login_window();
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
    public login_window()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Login");
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setFont(new Font("Helvetica", Font.BOLD, 25));
        lblNewLabel.setBounds(423, 13, 273, 93);
        contentPane.add(lblNewLabel);

        textField = new JTextField();
        textField.setFont(new Font("Helvetica", Font.BOLD, 15));
        textField.setBounds(481, 170, 281, 68);
        contentPane.add(textField);
        textField.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Helvetica", Font.BOLD, 15));
        passwordField.setBounds(481, 286, 281, 68);
        contentPane.add(passwordField);

        JLabel lblUsername = new JLabel("Email:");
        lblUsername.setBackground(Color.BLACK);
        lblUsername.setForeground(Color.BLACK);
        lblUsername.setFont(new Font("Helvetica", Font.BOLD, 15));
        lblUsername.setBounds(250, 166, 193, 52);
        contentPane.add(lblUsername);

        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setForeground(Color.BLACK);
        lblPassword.setBackground(Color.CYAN);
        lblPassword.setFont(new Font("Helvetica", Font.BOLD, 15));
        lblPassword.setBounds(250, 286, 193, 52);
        contentPane.add(lblPassword);

        registerButton = new JButton("Register");
        registerButton.setFont(new Font("Helvetica", Font.BOLD, 15));
        registerButton.setBounds(345, 392, 162, 73);
        registerButton.setForeground(Color.WHITE);
        registerButton.setBackground(new Color(91,146,121));
        registerButton.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                dispose();
                user_registration ah = new user_registration();
                ah.setVisible(true);                    
            }
        });

        contentPane.add(registerButton);
        
        btnNewButton = new JButton("Login");
        btnNewButton.setFont(new Font("Helvetica", Font.BOLD, 15));
        btnNewButton.setBounds(545, 392, 162, 73);
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.setBackground(new Color(91,146,121));
        btnNewButton.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                String userName = textField.getText();
                String password = passwordField.getText();
                try
                {
                    Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/healthApp", "root", "password1234");

                    PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("SELECT email, password from users where email=? and password=?");

                    st.setString(1, userName);
                    st.setString(2, password);
                    ResultSet rs = st.executeQuery();
                    if (rs.next())
                    {
                        dispose();
                        SignInDash ah = new SignInDash();
                        ah.main(null);
                        JOptionPane.showMessageDialog(btnNewButton, "You have successfully logged in");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(btnNewButton, "Wrong Username & Password");
                    }
                }
                catch (SQLException sqlException)
                {
                    sqlException.printStackTrace();
                }
            }
        });

        contentPane.add(btnNewButton);

        label = new JLabel("");
        label.setBounds(0, 0, 1008, 562);
        contentPane.add(label);
    }
}
