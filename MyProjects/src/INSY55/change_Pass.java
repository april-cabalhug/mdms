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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class change_Pass {

	JFrame frame;
	private JPanel panel = new JPanel();
	
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	private JPasswordField pwdNewPass;
	private JPasswordField pwdNewPass_1;
	private JPasswordField pwdVerify;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					change_Pass window = new change_Pass();
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
	public change_Pass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 417, 330);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(204, 0, 0), 5));
		panel.setBackground(new Color(220, 20, 60));
		panel.setBounds(0, 0, 416, 330);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(134, 44, 276, 279);
		panel.add(panel_1);
		
		JButton btnChange = new JButton("CHANGE");
		btnChange.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				String oldpass,newpass,cnfpass;
				
				oldpass=pwdVerify.getText();
				newpass=pwdNewPass.getText();
				cnfpass=pwdNewPass_1.getText();
		if(newpass.equals(cnfpass)) {		
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con =  DriverManager.getConnection("jdbc:mysql://localhost/mdms","root","");
					Statement pst = con.createStatement();
					String sql="Select * from login where Password='"+pwdVerify.getText().toString()+"'";
					ResultSet rs=pst.executeQuery(sql);
					
					if(rs.next()) {
						pst = con.prepareStatement("update login set password=? where password = '"+pwdVerify.getText().toString()+"'");
			            ((PreparedStatement) pst).setString(1, newpass);
			            ((PreparedStatement)pst).executeUpdate();
						JOptionPane.showMessageDialog(null, "Password Updated Successfully!");
						
						frame.dispose();
					}
					else {
						JOptionPane.showMessageDialog(null, "Update Failed!");
						pwdVerify.requestFocus();}
					con.close();
					}
					catch(Exception e1) {System.out.print(e1);}

				}
			else {
				JOptionPane.showMessageDialog(null, "Password Doesn't Match!");
				pwdNewPass_1.requestFocus();}}
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
		btnChange.setBounds(95, 215, 89, 40);
		panel_1.add(btnChange);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(10, 148, 255, 30);
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
		pwdVerify.setBounds(4, 3, 248, 25);
		panel_2.add(pwdVerify);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(10, 91, 255, 30);
		panel_1.add(panel_3);
		
		pwdNewPass_1 = new JPasswordField();
		pwdNewPass_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				pwdNewPass_1.setEchoChar('*');
				pwdNewPass_1.setText("");
			}
			@SuppressWarnings("deprecation")
			@Override
			public void focusLost(FocusEvent e) {
				if (pwdNewPass_1.getText().equals("")) {
					pwdNewPass_1.setText("Re-type your new password");
					pwdNewPass_1.setEchoChar((char)0);
				}
			}
		});
		pwdNewPass_1.setText("Re-type your new password");
		pwdNewPass_1.setOpaque(false);
		pwdNewPass_1.setFont(new Font("Arial Narrow", Font.PLAIN, 15));
		pwdNewPass_1.setEchoChar(' ');
		pwdNewPass_1.setBorder(null);
		pwdNewPass_1.setBounds(3, 2, 248, 25);
		panel_3.add(pwdNewPass_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBounds(10, 36, 255, 30);
		panel_1.add(panel_4);
		
		pwdNewPass = new JPasswordField();
		pwdNewPass.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				pwdNewPass.setEchoChar('*');
				pwdNewPass.setText("");
			}
			@SuppressWarnings("deprecation")
			@Override
			public void focusLost(FocusEvent e) {
				if (pwdNewPass.getText().equals("")) {
					pwdNewPass.setText("New Password");
					pwdNewPass.setEchoChar((char)0);
				}
			}
		});
		pwdNewPass.setText("New Password");
		pwdNewPass.setOpaque(false);
		pwdNewPass.setFont(new Font("Arial Narrow", Font.PLAIN, 15));
		pwdNewPass.setEchoChar(' ');
		pwdNewPass.setBorder(null);
		pwdNewPass.setBounds(4, 2, 248, 25);
		panel_4.add(pwdNewPass);
		
		JLabel lblNewLabel = new JLabel("Change\r\n");
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblNewLabel.setBounds(11, 150, 113, 28);
		panel.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalTextPosition(SwingConstants.CENTER);
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblPassword.setBounds(11, 180, 113, 28);
		panel.add(lblPassword);
		
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
