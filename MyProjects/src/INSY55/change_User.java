package INSY55;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class change_User {

	JFrame frame;
	private JPanel panel = new JPanel();
	private JTextField txtNewUser;
	
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	private JPasswordField pwdVerify;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					change_User window = new change_User();
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
	public change_User() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 417, 242);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(204, 0, 0), 5));
		panel.setBackground(new Color(220, 20, 60));
		panel.setBounds(0, 0, 416, 242);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(134, 44, 276, 191);
		panel.add(panel_1);
		
		JButton btnChange = new JButton("CHANGE");
		btnChange.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				String uid,oldpass;
				
				uid=txtNewUser.getText();
				oldpass=pwdVerify.getText();
				
			
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con =  DriverManager.getConnection("jdbc:mysql://localhost/mdms","root","");
					Statement pst = con.createStatement();
					String sql="Select * from login where Password='"+pwdVerify.getText().toString()+"'";
					ResultSet rs=pst.executeQuery(sql);
					
					if(rs.next()) {
						pst = con.prepareStatement("update login set username= ? where password = '"+pwdVerify.getText().toString()+"'");
						((PreparedStatement) pst).setString(1, uid);
			            ((PreparedStatement)pst).executeUpdate();
						JOptionPane.showMessageDialog(null, "Username Updated Successfully!");
						
						frame.dispose();
					}
					else {
						JOptionPane.showMessageDialog(null, "Update Failed!");
						pwdVerify.requestFocus();}
					con.close();
					}
					catch(Exception e1) {System.out.print(e1);}

				}
			});
		btnChange.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnChange.setBackground(new Color(204, 0, 0));
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				btnChange.setBackground(new Color(204, 0, 0));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnChange.setBackground(new Color(220, 20, 60));
			}
		});
		btnChange.setForeground(Color.WHITE);
		btnChange.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnChange.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnChange.setBackground(new Color(220, 20, 60));
		btnChange.setBounds(95, 128, 89, 40);
		panel_1.add(btnChange);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(10, 66, 255, 30);
		panel_1.add(panel_2);
		
		pwdVerify = new JPasswordField();
		pwdVerify.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				pwdVerify.setEchoChar('*');
				pwdVerify.setText("");
			}
			@SuppressWarnings("deprecation")
			@Override
			public void focusLost(FocusEvent e) {
				if (pwdVerify.getText().equals("")) {
					pwdVerify.setText("Type your old password for verification");
					pwdVerify.setEchoChar((char)0);
				}
			}
		});
		pwdVerify.setText("Type your old password for verification");
		pwdVerify.setOpaque(false);
		pwdVerify.setFont(new Font("Arial Narrow", Font.PLAIN, 15));
		pwdVerify.setEchoChar(' ');
		pwdVerify.setBorder(null);
		pwdVerify.setBounds(4, 1, 248, 25);
		panel_2.add(pwdVerify);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setBounds(10, 18, 255, 30);
		panel_1.add(panel_5);
		
		txtNewUser = new JTextField();
		txtNewUser.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtNewUser.getText().equals("New Username")) {
					txtNewUser.setText("");
				}
				else {
					txtNewUser.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtNewUser.getText().equals(""))
					txtNewUser.setText("New Username");
			}
		});
		txtNewUser.setBounds(3, 3, 248, 25);
		panel_5.add(txtNewUser);
		txtNewUser.setOpaque(false);
		txtNewUser.setText("New Username");
		txtNewUser.setFont(new Font("Arial Narrow", Font.PLAIN, 15));
		txtNewUser.setColumns(10);
		txtNewUser.setBorder(null);
		
		JLabel lblNewLabel = new JLabel("Change\r\n");
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblNewLabel.setBounds(14, 104, 113, 28);
		panel.add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setHorizontalTextPosition(SwingConstants.CENTER);
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblUsername.setBounds(14, 134, 113, 28);
		panel.add(lblUsername);
		
		JLabel lblExit = new JLabel("X");
		lblExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure want to exit?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0)
					frame.dispose();
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
		lblExit.setBounds(353, 9, 56, 30);
		panel.add(lblExit);
	}
}
