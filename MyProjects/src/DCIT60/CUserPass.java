package DCIT60;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;

public class CUserPass {

	private JFrame frmChangeUsernamepassword;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CUserPass window = new CUserPass();
					window.frmChangeUsernamepassword.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CUserPass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmChangeUsernamepassword = new JFrame();
		frmChangeUsernamepassword.setTitle("Change Username/Password");
		frmChangeUsernamepassword.setResizable(false);
		frmChangeUsernamepassword.getContentPane().setBackground(new Color(220, 20, 60));
		frmChangeUsernamepassword.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new LineBorder(new Color(204, 0, 0)));
		panel.setBounds(0, 1, 434, 219);
		frmChangeUsernamepassword.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Type your new username:");
		lblNewLabel.setFont(new Font("Arial Narrow", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 11, 139, 27);
		panel.add(lblNewLabel);
		
		JLabel lblTypeYourNew = new JLabel("Type your new password:");
		lblTypeYourNew.setFont(new Font("Arial Narrow", Font.BOLD, 13));
		lblTypeYourNew.setBounds(10, 49, 139, 27);
		panel.add(lblTypeYourNew);
		
		JLabel lblRetypeYourNew = new JLabel("Re-type your new password:");
		lblRetypeYourNew.setFont(new Font("Arial Narrow", Font.BOLD, 13));
		lblRetypeYourNew.setBounds(10, 87, 156, 27);
		panel.add(lblRetypeYourNew);
		
		JLabel lblTypeYourOldcurrent = new JLabel("Type your old/current password for verification:");
		lblTypeYourOldcurrent.setFont(new Font("Arial Narrow", Font.BOLD, 13));
		lblTypeYourOldcurrent.setBounds(10, 125, 256, 27);
		panel.add(lblTypeYourOldcurrent);
		
		textField = new JTextField();
		textField.setBorder(new LineBorder(new Color(178, 34, 34)));
		textField.setSelectedTextColor(SystemColor.menu);
		textField.setBounds(276, 129, 148, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBorder(new LineBorder(new Color(178, 34, 34)));
		textField_1.setSelectedTextColor(SystemColor.menu);
		textField_1.setColumns(10);
		textField_1.setBounds(276, 91, 148, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBorder(new LineBorder(new Color(178, 34, 34)));
		textField_2.setSelectedTextColor(SystemColor.menu);
		textField_2.setColumns(10);
		textField_2.setBounds(276, 53, 148, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBorder(new LineBorder(new Color(178, 34, 34)));
		textField_3.setSelectedTextColor(SystemColor.menu);
		textField_3.setColumns(10);
		textField_3.setBounds(276, 15, 148, 20);
		panel.add(textField_3);
		
		JButton btnChange = new JButton("CHANGE");
		btnChange.setForeground(Color.WHITE);
		btnChange.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnChange.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnChange.setBackground(new Color(220, 20, 60));	
		btnChange.setBounds(177, 163, 89, 40);
		panel.add(btnChange);
		frmChangeUsernamepassword.setBounds(100, 100, 450, 259);
		frmChangeUsernamepassword.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
