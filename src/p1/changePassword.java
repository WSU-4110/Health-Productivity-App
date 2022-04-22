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

public class changePassword extends JFrame
{

    private static final long serialVersionUID = 1L;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JPasswordField passwordField3;
    private JButton btnNewButton;
    private JButton backButton;
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
                    changePassword frame = new changePassword();
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
    public changePassword()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Change Password");
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblNewLabel.setBounds(423, 13, 273, 93);
        contentPane.add(lblNewLabel);

        passwordField1 = new JPasswordField();
        passwordField1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        passwordField1.setBounds(481, 170, 281, 68);
        contentPane.add(passwordField1);
        passwordField1.setColumns(10);

        passwordField2 = new JPasswordField();
        passwordField2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        passwordField2.setBounds(481, 258, 281, 68);
        contentPane.add(passwordField2);
        
        passwordField3 = new JPasswordField();
        passwordField3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        passwordField3.setBounds(481, 350, 281, 68);
        contentPane.add(passwordField3);

        JLabel lblOldPass = new JLabel("Old Password:");
        lblOldPass.setBackground(Color.BLACK);
        lblOldPass.setForeground(Color.BLACK);
        lblOldPass.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblOldPass.setBounds(250, 166, 193, 52);
        contentPane.add(lblOldPass);

        JLabel lblPassword1 = new JLabel("New Password:");
        lblPassword1.setForeground(Color.BLACK);
        lblPassword1.setBackground(Color.CYAN);
        lblPassword1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPassword1.setBounds(250, 258, 193, 52);
        contentPane.add(lblPassword1);
        
        JLabel lblPassword2 = new JLabel("Confirm New Password:");
        lblPassword2.setForeground(Color.BLACK);
        lblPassword2.setBackground(Color.CYAN);
        lblPassword2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPassword2.setBounds(250, 350, 193, 52);
        contentPane.add(lblPassword2);

        backButton = new JButton("Back");
        backButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
        backButton.setBounds(345, 450, 162, 73);
        backButton.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
            	dispose();
            	accountSettings a1 = new accountSettings();
				a1.main(null);
            }
        });

        contentPane.add(backButton);
        
        btnNewButton = new JButton("Confirm");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnNewButton.setBounds(545, 450, 162, 73);
        btnNewButton.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                dispose();
            }
        });

        contentPane.add(btnNewButton);

        label = new JLabel("");
        label.setBounds(0, 0, 1008, 562);
        contentPane.add(label);
    }
}