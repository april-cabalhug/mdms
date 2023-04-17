package DCIT60;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class splash extends JFrame {

	 private JPanel contentPane;
	 private static JLabel lblCount_1;
	 private static JProgressBar progressBar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		int x;
			splash frame = new splash();
			frame.setVisible(true);
			try {
				for(x=0;x<=100;x++) {
					splash.progressBar.setValue(x);
					Thread.sleep(35);
					splash.lblCount_1.setText(Integer.toString(x)+" %");
					if(x==100) {
						login SignIn = new login();
						SignIn.frame.setVisible(true);
						frame.dispose();
					}
				}
				}catch (InterruptedException e) {
					e.printStackTrace();
			}
	}

	/**
	 * Create the frame.
	 */
	public splash() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 326);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setBounds(0, 0, 450, 324);
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.add(contentPane_1);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(204, 0, 0), 3));
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 449, 324);
		contentPane_1.add(panel);
		
		lblCount_1 = new JLabel("");
		lblCount_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCount_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCount_1.setBounds(389, 282, 56, 25);
		panel.add(lblCount_1);
		
		progressBar = new JProgressBar();
		progressBar.setForeground(new Color(204, 0, 0));
		progressBar.setBorder(new LineBorder(new Color(0, 0, 0)));
		progressBar.setBounds(3, 309, 443, 12);
		panel.add(progressBar);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("C:\\Users\\frask\\eclipse-workspace\\MyProjects\\src\\INSY55\\Images\\logo.jpg"));
		lblLogo.setBackground(Color.WHITE);
		lblLogo.setBounds(111, 62, 234, 217);
		panel.add(lblLogo);
		
		JLabel lblNewLabel = new JLabel("STUDENT INFORMATION MANAGEMENT SYSTEM");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(204, 0, 0));
		lblNewLabel.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 15));
		lblNewLabel.setBounds(27, 14, 395, 32);
		panel.add(lblNewLabel);
		
		JLabel lblLoad = new JLabel("Loading...");
		lblLoad.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLoad.setBounds(3, 282, 79, 25);
		panel.add(lblLoad);
	}
}