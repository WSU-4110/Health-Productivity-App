package p1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.*;  
//import java.util.*;
import javax.swing.border.EmptyBorder;

public class accountSettings extends JFrame
{
	private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField firstname;
    private JTextField lastname;
    private JTextField email;
    private JTextField username;
    private JTextField mob;
    private JButton btnNewButton;
    private JButton passwordButton;
    

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
                	accountSettings frame = new accountSettings();
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

    public accountSettings()
    {
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.setForeground(new Color(20, 31, 26));
        //contentPane.setBackground(new Color(91,146,121));

        JLabel lblNewUserRegister = new JLabel("Account Settings");
        lblNewUserRegister.setFont(new Font("Helvetica", Font.BOLD, 25));
        lblNewUserRegister.setBounds(362, 52, 325, 50);
        lblNewUserRegister.setForeground(new Color(30, 47, 39));
        contentPane.add(lblNewUserRegister);

        JLabel lblName = new JLabel("First name:");
        lblName.setFont(new Font("Helvetica", Font.BOLD, 15));
        lblName.setBounds(58, 152, 99, 43);
        lblName.setForeground(new Color(30, 47, 39));
        contentPane.add(lblName);

        JLabel lblNewLabel = new JLabel("Last name:");
        lblNewLabel.setFont(new Font("Helvetica", Font.BOLD, 15));
        lblNewLabel.setBounds(58, 243, 110, 29);
        lblNewLabel.setForeground(new Color(30, 47, 39));
        contentPane.add(lblNewLabel);

        JLabel lblEmailAddress = new JLabel("Email:");
        lblEmailAddress.setFont(new Font("Helvetica", Font.BOLD, 15));
        lblEmailAddress.setBounds(58, 324, 124, 36);
        lblEmailAddress.setForeground(new Color(30, 47, 39));
        contentPane.add(lblEmailAddress);

        firstname = new JTextField();
        firstname.setFont(new Font("Helvetica", Font.BOLD, 15));
        firstname.setBounds(214, 151, 228, 50);
        firstname.setForeground(new Color(30, 47, 39));
        contentPane.add(firstname);
        firstname.setColumns(10);

        lastname = new JTextField();
        lastname.setFont(new Font("Helvetica", Font.BOLD, 15));
        lastname.setBounds(214, 235, 228, 50);
        contentPane.add(lastname);
        lastname.setColumns(10);

        email = new JTextField();

        email.setFont(new Font("Helvetica", Font.BOLD, 15));
        email.setBounds(214, 320, 228, 50);
        contentPane.add(email);
        email.setColumns(10);

        username = new JTextField();
        username.setFont(new Font("Helvetica", Font.BOLD, 15));
        username.setBounds(707, 151, 228, 50);
        contentPane.add(username);
        username.setColumns(10);

        JLabel lblUsername = new JLabel("Username:");
        lblUsername.setFont(new Font("Helvetica", Font.BOLD, 15));
        lblUsername.setBounds(542, 159, 99, 29);
        contentPane.add(lblUsername);

        JLabel lblMobileNumber = new JLabel("Phone number:");
        lblMobileNumber.setFont(new Font("Helvetica", Font.BOLD, 15));
        lblMobileNumber.setBounds(542, 243, 139, 26);
        contentPane.add(lblMobileNumber);

        mob = new JTextField();
        mob.setFont(new Font("Helvetica", Font.BOLD, 15));
        mob.setBounds(707, 235, 228, 50);
        contentPane.add(mob);
        mob.setColumns(10);

        btnNewButton = new JButton("Confirm");
        btnNewButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                dispose();
            }
        });
        btnNewButton.setFont(new Font("Helvetica", Font.BOLD, 15));
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.setBackground(new Color(91,146,121));
        btnNewButton.setBounds(499, 447, 259, 74);
        
        contentPane.add(btnNewButton);
        
        passwordButton = new JButton("Change Password");
        passwordButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
            	dispose();
                changePassword ah = new changePassword();
                ah.setVisible(true); 
            }
        });
        
        passwordButton.setFont(new Font("Helvetica", Font.BOLD, 15));
        passwordButton.setBounds(199, 447, 259, 74);
        passwordButton.setForeground(Color.WHITE);
        passwordButton.setBackground(new Color(91,146,121));
        contentPane.add(passwordButton);
    }
}
