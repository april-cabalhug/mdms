package DCIT60;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;

public class login {

	JFrame frame;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JTextField textField;
	private JPasswordField passwordField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 629, 286);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(204, 0, 0), 5));
		panel.setBackground(new Color(220, 20, 60));
		panel.setBounds(0, 0, 628, 285);
		frame.getContentPane().add(panel);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("C:\\Users\\frask\\eclipse-workspace\\MyProjects\\bin\\INSY55\\Images\\logo2.jpg"));
		lblLogo.setBackground(Color.WHITE);
		lblLogo.setBounds(6, 6, 271, 272);
		panel.add(lblLogo);
		
		JPanel UserPanel = new JPanel();
		UserPanel.setLayout(null);
		UserPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		UserPanel.setBackground(Color.WHITE);
		UserPanel.setBounds(334, 78, 240, 45);
		panel.add(UserPanel);
		
		textField = new JTextField();
		textField.setText("Username");
		textField.setFont(new Font("Arial", Font.BOLD, 15));
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBounds(48, 7, 182, 29);
		UserPanel.add(textField);
		
		JLabel lblIconUsername_1 = new JLabel("");
		lblIconUsername_1.setIcon(new ImageIcon("C:\\Users\\frask\\eclipse-workspace\\MyProjects\\bin\\INSY55\\Images\\user.png"));
		lblIconUsername_1.setBackground(Color.WHITE);
		lblIconUsername_1.setBounds(3, 3, 40, 40);
		UserPanel.add(lblIconUsername_1);
		
		JPanel PassPanel = new JPanel();
		PassPanel.setLayout(null);
		PassPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PassPanel.setBackground(Color.WHITE);
		PassPanel.setBounds(333, 156, 240, 45);
		panel.add(PassPanel);
		
		passwordField = new JPasswordField();
		passwordField.setText("Password");
		passwordField.setFont(new Font("Arial", Font.BOLD, 15));
		passwordField.setEchoChar(' ');
		passwordField.setBorder(null);
		passwordField.setBounds(46, 9, 184, 27);
		PassPanel.add(passwordField);
		
		JLabel lblIconPassword_1 = new JLabel("");
		lblIconPassword_1.setIcon(new ImageIcon("C:\\Users\\frask\\eclipse-workspace\\MyProjects\\bin\\INSY55\\Images\\pass.png"));
		lblIconPassword_1.setBackground(Color.WHITE);
		lblIconPassword_1.setBounds(2, 3, 40, 38);
		PassPanel.add(lblIconPassword_1);
		
		JLabel lblExit = new JLabel("X");
		lblExit.setHorizontalAlignment(SwingConstants.CENTER);
		lblExit.setForeground(Color.WHITE);
		lblExit.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblExit.setBounds(565, 7, 56, 30);
		panel.add(lblExit);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setForeground(new Color(220, 20, 60));
		btnLogin.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnLogin.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnLogin.setBackground(SystemColor.inactiveCaptionBorder);
		btnLogin.setBounds(410, 220, 89, 40);
		panel.add(btnLogin);
	}
}
