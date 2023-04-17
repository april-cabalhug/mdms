package INSY55;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;

import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;
import java.awt.Window;

public class Main {

	JFrame frame;
	protected Window lblChangeUsername;
	protected Window lblChange;
	protected Window lblChangePassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 1003, 591);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(204, 0, 0), 5));
		panel.setBackground(new Color(220, 20, 60));
		panel.setBounds(0, 0, 1001, 589);
		frame.getContentPane().add(panel);
		
		JLabel lblExit = new JLabel("X");
		
		lblExit.setForeground(new Color(255, 255, 255));
		lblExit.setBounds(565, 7, 56, 40);
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
		lblExit.setBounds(937, 6, 56, 30);
		panel.add(lblExit);
		
		JPanel panel_1 = new JPanel();
		
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(170, 38, 826, 547);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_Modular = new JPanel();
		panel_Modular.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MSList ms = new MSList();
				ms.frame.setVisible(true);
				frame.dispose();
				panel_Modular.setBackground(new Color(220, 20, 60));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_Modular.setBackground(new Color(220, 20, 60));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_Modular.setBackground(new Color(240, 128, 128));
			}
		});
		panel_Modular.setBackground(new Color(240, 128, 128));
		panel_Modular.setBorder(new BevelBorder(BevelBorder.RAISED, Color.DARK_GRAY, null, Color.GRAY, null));
		panel_Modular.setBounds(135, 163, 227, 230);
		panel_1.add(panel_Modular);
		panel_Modular.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\frask\\eclipse-workspace\\MyProjects\\src\\INSY55\\Images\\modular.png"));
		lblNewLabel_1.setBounds(30, 22, 166, 154);
		panel_Modular.add(lblNewLabel_1);
		
		JLabel lblModular = new JLabel("MODULAR STUDENTS");
		
		lblModular.setFont(new Font("Leelawadee", Font.BOLD, 17));
		lblModular.setHorizontalAlignment(SwingConstants.CENTER);
		lblModular.setBounds(25, 187, 181, 20);
		panel_Modular.add(lblModular);
		
		JPanel panel_Printed = new JPanel();
		panel_Printed.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PSList ps = new PSList();
				ps.frame.setVisible(true);
				frame.dispose();
				panel_Modular.setBackground(new Color(220, 20, 60));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_Printed.setBackground(new Color(220, 20, 60));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_Printed.setBackground(new Color(240, 128, 128));
			}
		});
		panel_Printed.setLayout(null);
		panel_Printed.setBorder(new BevelBorder(BevelBorder.RAISED, Color.DARK_GRAY, null, Color.GRAY, null));
		panel_Printed.setBackground(new Color(240, 128, 128));
		panel_Printed.setBounds(457, 163, 227, 230);
		panel_1.add(panel_Printed);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\frask\\eclipse-workspace\\MyProjects\\src\\INSY55\\Images\\printed.png"));
		lblNewLabel_1_1.setBounds(39, 22, 159, 154);
		panel_Printed.add(lblNewLabel_1_1);
		
		JLabel lblPrinted = new JLabel("PRINTED STUDENTS");
		lblPrinted.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrinted.setFont(new Font("Leelawadee", Font.BOLD, 17));
		lblPrinted.setBounds(27, 187, 174, 20);
		panel_Printed.add(lblPrinted);
		
		JLabel lblNewLabel_3 = new JLabel("LIST OF STUDENTS");
		lblNewLabel_3.setForeground(new Color(220, 20, 60));
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD, 20));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(282, 47, 243, 36);
		panel_1.add(lblNewLabel_3);
		
		JPanel panel_change = new JPanel();
		panel_change.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblChange.setVisible(true);
				lblChangeUsername.setVisible(true);
				lblChangePassword.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_change.setVisible(false);
				lblChange.setVisible(false);
				lblChangeUsername.setVisible(false);
				lblChangePassword.setVisible(false);
			}
		});
		panel_change.setVisible(false);
		panel_change.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_change.setBounds(1, 83, 178, 81);
		panel_1.add(panel_change);
		panel_change.setLayout(null);
		
		JLabel lblChange = new JLabel("Change Username/Password");
		lblChange.setBounds(0, 0, 178, 27);
		panel_change.add(lblChange);
		lblChange.setFont(new Font("Arial Narrow", Font.BOLD, 13));
		lblChange.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblChange.setVisible(true);
				lblChange.setBackground(SystemColor.activeCaption);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblChange.setBackground(SystemColor.inactiveCaption);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				change_UserPass change = new change_UserPass();
				change.frame.setVisible(true);
			}
		});
		lblChange.setOpaque(true);
		lblChange.setBackground(SystemColor.inactiveCaption);
		lblChange.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblChangeUsername = new JLabel("Change Username");
		lblChangeUsername.setBounds(0, 27, 178, 27);
		panel_change.add(lblChangeUsername);
		lblChangeUsername.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblChangeUsername.setVisible(true);
				lblChangeUsername.setBackground(SystemColor.activeCaption);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblChangeUsername.setBackground(SystemColor.inactiveCaption);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				change_User changeUser = new change_User();
				changeUser.frame.setVisible(true);
			}
		});
		lblChangeUsername.setOpaque(true);
		lblChangeUsername.setHorizontalAlignment(SwingConstants.RIGHT);
		lblChangeUsername.setFont(new Font("Arial Narrow", Font.BOLD, 13));
		lblChangeUsername.setBackground(SystemColor.inactiveCaption);
		
		JLabel lblChangePassword = new JLabel("Change Password");
		lblChangePassword.setBounds(0, 54, 178, 27);
		panel_change.add(lblChangePassword);
		lblChangePassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblChangePassword.setVisible(true);
				lblChangePassword.setBackground(SystemColor.activeCaption);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblChangePassword.setBackground(SystemColor.inactiveCaption);
				panel_change.setVisible(false);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				change_Pass changePass = new change_Pass();
				changePass.frame.setVisible(true);
			}
		});
		lblChangePassword.setOpaque(true);
		lblChangePassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblChangePassword.setFont(new Font("Arial Narrow", Font.BOLD, 13));
		lblChangePassword.setBackground(SystemColor.inactiveCaption);
		
		JLabel lblRecord = new JLabel("RECORD");
		lblRecord.setIcon(new ImageIcon("C:\\Users\\frask\\eclipse-workspace\\MyProjects\\src\\INSY55\\Images\\record.png"));
		lblRecord.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				Records rec = new Records();
				rec.frame.setVisible(true);
				frame.dispose();
				lblRecord.setForeground(Color.BLACK);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				lblRecord.setForeground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblRecord.setForeground(Color.WHITE);
			}
		});
		lblRecord.setForeground(Color.WHITE);
		lblRecord.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRecord.setBounds(34, 79, 104, 30);
		panel.add(lblRecord);
		
		JLabel lblList = new JLabel("LIST");
		lblList.setIcon(new ImageIcon("C:\\Users\\frask\\eclipse-workspace\\MyProjects\\src\\INSY55\\Images\\list.png"));
		lblList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
			}
		});
		
		
		lblList.setForeground(Color.BLACK);
		lblList.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblList.setBounds(34, 38, 89, 30);
		panel.add(lblList);
		
		JLabel lblLogout = new JLabel("LOGOUT");
		
		
		lblLogout.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure want to logout?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0)
				{	
					Login log = new Login();
					log.frame.setVisible(true);
					frame.dispose();				
				}
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				lblLogout.setForeground(Color.BLACK);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblLogout.setForeground(Color.WHITE);
			}
			
		});
		
		lblLogout.setIcon(new ImageIcon("C:\\Users\\frask\\eclipse-workspace\\MyProjects\\src\\INSY55\\Images\\logout.png"));
		lblLogout.setForeground(Color.WHITE);
		lblLogout.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblLogout.setBounds(34, 161, 102, 35);
		panel.add(lblLogout);
		
		JLabel lblSettings = new JLabel("SETTINGS");
		lblSettings.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblSettings.setForeground(Color.BLACK);
				panel_change.setVisible(true);
				lblChange.setVisible(true);
				lblChangeUsername.setVisible(true);
				lblChangePassword.setVisible(true);
				}
			
			@Override
			public void mouseExited(MouseEvent e) {
					lblSettings.setForeground(Color.WHITE);
				}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				lblSettings.setForeground(Color.BLACK);
			}
		});
		lblSettings.setIcon(new ImageIcon("C:\\Users\\frask\\eclipse-workspace\\MyProjects\\src\\INSY55\\Images\\settings.png"));
		lblSettings.setForeground(Color.WHITE);
		lblSettings.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSettings.setBounds(34, 120, 142, 30);
		panel.add(lblSettings);
	}
}
