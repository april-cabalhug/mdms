package INSY55;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;
import java.awt.event.ActionListener;

public class Login {

	JFrame frame;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 629, 287);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(204, 0, 0), 5));
		panel.setBackground(new Color(220, 20, 60));
		panel.setBounds(0, 2, 628, 285);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(6, 6, 271, 272);
		lblLogo.setIcon(new ImageIcon("C:\\Users\\frask\\eclipse-workspace\\MyProjects\\src\\INSY55\\Images\\logo2.jpg"));
		lblLogo.setBackground(Color.WHITE);
		panel.add(lblLogo);
		
		JPanel UserPanel = new JPanel();
		UserPanel.setBounds(334, 54, 240, 45);
		UserPanel.setLayout(null);
		UserPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		UserPanel.setBackground(Color.WHITE);
		panel.add(UserPanel);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Arial", Font.BOLD, 15));
		txtUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtUsername.getText().equals("Username")) {
					txtUsername.setText("");
				}
				else {
					txtUsername.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtUsername.getText().equals(""))
					txtUsername.setText("Username");
			}
		});
		txtUsername.setText("Username");
		txtUsername.setColumns(10);
		txtUsername.setBorder(null);
		txtUsername.setBounds(48, 7, 182, 29);
		UserPanel.add(txtUsername);
		
		JLabel lblIconUsername_1 = new JLabel("");
		lblIconUsername_1.setIcon(new ImageIcon("C:\\Users\\frask\\eclipse-workspace\\MyProjects\\src\\INSY55\\Images\\user.png"));
		lblIconUsername_1.setBackground(Color.WHITE);
		lblIconUsername_1.setBounds(3, 3, 40, 40);
		UserPanel.add(lblIconUsername_1);
		
		JPanel PassPanel = new JPanel();
		PassPanel.setBounds(334, 132, 239, 45);
		PassPanel.setLayout(null);
		PassPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PassPanel.setBackground(Color.WHITE);
		panel.add(PassPanel);
		
		txtPassword = new JPasswordField();
		txtPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtPassword.setEchoChar('*');
				txtPassword.setText("");
			}
			@SuppressWarnings("deprecation")
			@Override
			public void focusLost(FocusEvent e) {
				if (txtPassword.getText().equals("")) {
					txtPassword.setText("Password");
					txtPassword.setEchoChar((char)0);
				}
			}
		});
		txtPassword.setText("Password");
		txtPassword.setFont(new Font("Arial", Font.BOLD, 15));
		txtPassword.setEchoChar(' ');
		txtPassword.setBorder(null);
		txtPassword.setBounds(46, 9, 184, 27);
		PassPanel.add(txtPassword);
		
		JLabel lblIconPassword_1 = new JLabel("");
		lblIconPassword_1.setIcon(new ImageIcon("C:\\Users\\frask\\eclipse-workspace\\MyProjects\\src\\INSY55\\Images\\pass.png"));
		lblIconPassword_1.setBackground(Color.WHITE);
		lblIconPassword_1.setBounds(3, 3, 40, 38);
		PassPanel.add(lblIconPassword_1);
		
		JLabel lblExit = new JLabel("X");
		lblExit.setBounds(565, 7, 56, 30);
		
		lblExit.setForeground(new Color(255, 255, 255));
		lblExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure want to exit?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0)
					
					System.exit(0);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				lblExit.setForeground(Color.BLACK);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblExit.setForeground(Color.WHITE);
			}
			
		});
		
		lblExit.setHorizontalAlignment(SwingConstants.CENTER);
		lblExit.setForeground(Color.WHITE);
		lblExit.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		panel.add(lblExit);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con =  DriverManager.getConnection("jdbc:mysql://localhost/mdms","root","");
					Statement stmt = con.createStatement();
					String sql="Select * from login where username='"+txtUsername.getText()+"' and Password='"+txtPassword.getText().toString()+"'";
					ResultSet rs=stmt.executeQuery(sql);
					if(rs.next()) {
						JOptionPane.showMessageDialog(null, "Access Granted!");
						
						Main ListTab = new Main();
						ListTab.frame.setVisible(true);
						frame.dispose();
					}
					else {
						JOptionPane.showMessageDialog(null, "Access Denied!");}
					con.close();
					txtUsername.setText("");
					txtPassword.setText("");
					txtUsername.requestFocus();}
					catch(Exception e1) {System.out.print(e1);}
			}
		});
		btnLogin.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				btnLogin.setForeground(Color.WHITE);
				btnLogin.setBackground(new Color(240,128,128));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnLogin.setForeground(new Color(220, 20, 60));
				btnLogin.setBackground(SystemColor.inactiveCaptionBorder);
			}
		});
		btnLogin.setBounds(410, 210, 89, 40);
		btnLogin.setForeground(new Color(220, 20, 60));
		btnLogin.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnLogin.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnLogin.setBackground(SystemColor.inactiveCaptionBorder);
		panel.add(btnLogin);
		
		JLabel lblIconUsername = new JLabel("");
		lblIconUsername.setBackground(Color.WHITE);
		lblIconUsername.setBounds(327, 96, 40, 40);
		frame.getContentPane().add(lblIconUsername);
		
		JLabel lblIconPassword = new JLabel("");
		lblIconPassword.setBackground(Color.WHITE);
		lblIconPassword.setBounds(327, 175, 40, 38);
		frame.getContentPane().add(lblIconPassword);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
