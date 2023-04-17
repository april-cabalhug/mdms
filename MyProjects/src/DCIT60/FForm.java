package DCIT60;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.EtchedBorder;

public class FForm {

	private JFrame frmBesStudentFiles;
	private JTextField txtSearchByLrn;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FForm window = new FForm();
					window.frmBesStudentFiles.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBesStudentFiles = new JFrame();
		frmBesStudentFiles.setResizable(false);
		frmBesStudentFiles.setTitle("BES Student Files");
		frmBesStudentFiles.getContentPane().setBackground(new Color(220, 20, 60));
		frmBesStudentFiles.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 719, 353);
		frmBesStudentFiles.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Grade1-6", null, panel, null);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "STUDENT REQUIREMENTS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setLayout(null);
		
		JPanel UserPanel = new JPanel();
		UserPanel.setLayout(null);
		UserPanel.setBorder(new LineBorder(new Color(220, 20, 60), 2));
		UserPanel.setBackground(Color.WHITE);
		UserPanel.setBounds(10, 23, 315, 43);
		panel.add(UserPanel);
		
		txtSearchByLrn = new JTextField();
		txtSearchByLrn.setText("Search by LRN");
		txtSearchByLrn.setFont(new Font("Arial", Font.BOLD, 15));
		txtSearchByLrn.setColumns(10);
		txtSearchByLrn.setBorder(null);
		txtSearchByLrn.setBounds(48, 7, 257, 29);
		UserPanel.add(txtSearchByLrn);
		
		JLabel lblIconUsername_1 = new JLabel("");
		lblIconUsername_1.setIcon(new ImageIcon("C:\\Users\\frask\\eclipse-workspace\\MyProjects\\src\\DCIT60\\Images\\search.png"));
		lblIconUsername_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblIconUsername_1.setBackground(Color.WHITE);
		lblIconUsername_1.setBounds(4, 3, 43, 37);
		UserPanel.add(lblIconUsername_1);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblFirstName.setBounds(10, 91, 73, 14);
		panel.add(lblFirstName);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(126, 86, 199, 20);
		panel.add(textField_2);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblLastName.setBounds(10, 121, 73, 14);
		panel.add(lblLastName);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(126, 115, 199, 20);
		panel.add(textField_3);
		
		JLabel lblMiddleName = new JLabel("Middle Name:");
		lblMiddleName.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblMiddleName.setBounds(10, 149, 86, 14);
		panel.add(lblMiddleName);
		
		JLabel lblExtensionName = new JLabel("Extension Name:");
		lblExtensionName.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblExtensionName.setBounds(10, 174, 103, 14);
		panel.add(lblExtensionName);
		
		JLabel lblDob = new JLabel("D.O.B.:");
		lblDob.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblDob.setBounds(10, 203, 52, 14);
		panel.add(lblDob);
		
		JLabel lblDob_1 = new JLabel("Sex:");
		lblDob_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblDob_1.setBounds(10, 231, 34, 14);
		panel.add(lblDob_1);
		
		JLabel lblDob_1_1 = new JLabel("Address:");
		lblDob_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblDob_1_1.setBounds(10, 254, 63, 14);
		panel.add(lblDob_1_1);
		
		JLabel lblDob_1_1_1 = new JLabel("Contact Number:");
		lblDob_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblDob_1_1_1.setBounds(10, 284, 103, 14);
		panel.add(lblDob_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(126, 146, 199, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(126, 172, 199, 20);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(126, 200, 199, 20);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(126, 228, 199, 20);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(126, 253, 199, 20);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(126, 282, 199, 20);
		panel.add(textField_9);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(333, 10, 375, 308);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Photocopy of birth certificate/baptismal certificate");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 11, 350, 14);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.inactiveCaptionBorder);
		panel_2.setBorder(new LineBorder(SystemColor.windowBorder));
		panel_2.setBounds(10, 36, 350, 45);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("Choose File");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(10, 11, 103, 23);
		panel_2.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("No file chosen");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(123, 16, 111, 14);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("2x2 ID picture");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 92, 116, 14);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(SystemColor.inactiveCaptionBorder);
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new LineBorder(SystemColor.windowBorder));
		panel_2_1.setBounds(10, 117, 350, 45);
		panel_1.add(panel_2_1);
		
		JButton btnNewButton_1 = new JButton("Choose File");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.setBounds(10, 11, 103, 23);
		panel_2_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("No file chosen");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(123, 16, 111, 14);
		panel_2_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("Form 137");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(10, 173, 84, 14);
		panel_1.add(lblNewLabel_3);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBackground(SystemColor.inactiveCaptionBorder);
		panel_2_2.setLayout(null);
		panel_2_2.setBorder(new LineBorder(SystemColor.windowBorder));
		panel_2_2.setBounds(10, 198, 350, 45);
		panel_1.add(panel_2_2);
		
		JButton btnNewButton_2 = new JButton("Choose File");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_2.setBounds(10, 11, 103, 23);
		panel_2_2.add(btnNewButton_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("No file chosen");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(123, 16, 111, 14);
		panel_2_2.add(lblNewLabel_1_2);
		
		JButton btnClear_2_3 = new JButton("SUBMIT");
		btnClear_2_3.setForeground(Color.WHITE);
		btnClear_2_3.setFont(new Font("Lucida Console", Font.BOLD, 14));
		btnClear_2_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnClear_2_3.setBackground(new Color(220, 20, 60));
		btnClear_2_3.setBounds(10, 254, 171, 45);
		panel_1.add(btnClear_2_3);
		
		JButton btnUpdate_2_3 = new JButton("UPDATE");
		btnUpdate_2_3.setForeground(Color.WHITE);
		btnUpdate_2_3.setFont(new Font("Lucida Console", Font.BOLD, 14));
		btnUpdate_2_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnUpdate_2_3.setBackground(new Color(220, 20, 60));
		btnUpdate_2_3.setBounds(191, 254, 169, 45);
		panel_1.add(btnUpdate_2_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "STUDENT REQUIREMENTS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		tabbedPane.addTab("Kinder", null, panel_3, null);
		panel_3.setLayout(null);
		
		JPanel UserPanel_1 = new JPanel();
		UserPanel_1.setLayout(null);
		UserPanel_1.setBorder(new LineBorder(new Color(220, 20, 60), 2));
		UserPanel_1.setBackground(Color.WHITE);
		UserPanel_1.setBounds(10, 24, 315, 43);
		panel_3.add(UserPanel_1);
		
		textField = new JTextField();
		textField.setText("Search by LRN");
		textField.setFont(new Font("Arial", Font.BOLD, 15));
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBounds(48, 7, 257, 29);
		UserPanel_1.add(textField);
		
		JLabel lblIconUsername_1_1 = new JLabel("");
		lblIconUsername_1_1.setIcon(new ImageIcon("C:\\Users\\frask\\eclipse-workspace\\MyProjects\\src\\DCIT60\\Images\\search.png"));
		lblIconUsername_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblIconUsername_1_1.setBackground(Color.WHITE);
		lblIconUsername_1_1.setBounds(4, 3, 43, 37);
		UserPanel_1.add(lblIconUsername_1_1);
		
		JLabel lblFirstName_1 = new JLabel("First Name:");
		lblFirstName_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblFirstName_1.setBounds(10, 92, 73, 14);
		panel_3.add(lblFirstName_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(126, 87, 199, 20);
		panel_3.add(textField_1);
		
		JLabel lblLastName_1 = new JLabel("Last Name:");
		lblLastName_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblLastName_1.setBounds(10, 122, 73, 14);
		panel_3.add(lblLastName_1);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(126, 116, 199, 20);
		panel_3.add(textField_10);
		
		JLabel lblMiddleName_1 = new JLabel("Middle Name:");
		lblMiddleName_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblMiddleName_1.setBounds(10, 150, 86, 14);
		panel_3.add(lblMiddleName_1);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(126, 147, 199, 20);
		panel_3.add(textField_11);
		
		JLabel lblExtensionName_1 = new JLabel("Extension Name:");
		lblExtensionName_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblExtensionName_1.setBounds(10, 175, 103, 14);
		panel_3.add(lblExtensionName_1);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(126, 173, 199, 20);
		panel_3.add(textField_12);
		
		JLabel lblDob_2 = new JLabel("D.O.B.:");
		lblDob_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblDob_2.setBounds(10, 204, 52, 14);
		panel_3.add(lblDob_2);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(126, 201, 199, 20);
		panel_3.add(textField_13);
		
		JLabel lblDob_1_2 = new JLabel("Sex:");
		lblDob_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblDob_1_2.setBounds(10, 232, 34, 14);
		panel_3.add(lblDob_1_2);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(126, 229, 199, 20);
		panel_3.add(textField_14);
		
		JLabel lblDob_1_1_2 = new JLabel("Address:");
		lblDob_1_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblDob_1_1_2.setBounds(10, 255, 63, 14);
		panel_3.add(lblDob_1_1_2);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(126, 254, 199, 20);
		panel_3.add(textField_15);
		
		JLabel lblDob_1_1_1_1 = new JLabel("Contact Number:");
		lblDob_1_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblDob_1_1_1_1.setBounds(10, 285, 103, 14);
		panel_3.add(lblDob_1_1_1_1);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(126, 283, 199, 20);
		panel_3.add(textField_16);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_1.setBounds(333, 11, 375, 308);
		panel_3.add(panel_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("Photocopy of birth certificate/baptismal certificate");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(10, 11, 350, 14);
		panel_1_1.add(lblNewLabel_4);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setLayout(null);
		panel_2_3.setBorder(new LineBorder(SystemColor.windowBorder));
		panel_2_3.setBackground(SystemColor.inactiveCaptionBorder);
		panel_2_3.setBounds(10, 36, 350, 45);
		panel_1_1.add(panel_2_3);
		
		JButton btnNewButton_3 = new JButton("Choose File");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_3.setBounds(10, 11, 103, 23);
		panel_2_3.add(btnNewButton_3);
		
		JLabel lblNewLabel_1_3 = new JLabel("No file chosen");
		lblNewLabel_1_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(123, 16, 111, 14);
		panel_2_3.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("2x2 ID picture");
		lblNewLabel_2_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(10, 92, 124, 14);
		panel_1_1.add(lblNewLabel_2_1);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBorder(new LineBorder(SystemColor.windowBorder));
		panel_2_1_1.setBackground(SystemColor.inactiveCaptionBorder);
		panel_2_1_1.setBounds(10, 117, 350, 45);
		panel_1_1.add(panel_2_1_1);
		
		JButton btnNewButton_1_1 = new JButton("Choose File");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1_1.setBounds(10, 11, 103, 23);
		panel_2_1_1.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("No file chosen");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(123, 16, 111, 14);
		panel_2_1_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Form 137");
		lblNewLabel_3_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_1.setBounds(10, 173, 84, 14);
		panel_1_1.add(lblNewLabel_3_1);
		
		JPanel panel_2_2_1 = new JPanel();
		panel_2_2_1.setLayout(null);
		panel_2_2_1.setBorder(new LineBorder(SystemColor.windowBorder));
		panel_2_2_1.setBackground(SystemColor.inactiveCaptionBorder);
		panel_2_2_1.setBounds(10, 198, 350, 45);
		panel_1_1.add(panel_2_2_1);
		
		JButton btnNewButton_2_1 = new JButton("Choose File");
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_2_1.setBounds(10, 11, 103, 23);
		panel_2_2_1.add(btnNewButton_2_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("No file chosen");
		lblNewLabel_1_2_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_2_1.setBounds(123, 16, 111, 14);
		panel_2_2_1.add(lblNewLabel_1_2_1);
		
		JButton btnClear_2_2 = new JButton("SUBMIT");
		btnClear_2_2.setForeground(Color.WHITE);
		btnClear_2_2.setFont(new Font("Lucida Console", Font.BOLD, 14));
		btnClear_2_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnClear_2_2.setBackground(new Color(220, 20, 60));
		btnClear_2_2.setBounds(10, 254, 171, 45);
		panel_1_1.add(btnClear_2_2);
		
		JButton btnUpdate_2_2 = new JButton("UPDATE");
		btnUpdate_2_2.setForeground(Color.WHITE);
		btnUpdate_2_2.setFont(new Font("Lucida Console", Font.BOLD, 14));
		btnUpdate_2_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnUpdate_2_2.setBackground(new Color(220, 20, 60));
		btnUpdate_2_2.setBounds(191, 254, 169, 45);
		panel_1_1.add(btnUpdate_2_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "STUDENT REQUIREMENTS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		tabbedPane.addTab("ALS", null, panel_4, null);
		panel_4.setLayout(null);
		
		JPanel UserPanel_2 = new JPanel();
		UserPanel_2.setLayout(null);
		UserPanel_2.setBorder(new LineBorder(new Color(220, 20, 60), 2));
		UserPanel_2.setBackground(Color.WHITE);
		UserPanel_2.setBounds(10, 24, 315, 43);
		panel_4.add(UserPanel_2);
		
		textField_17 = new JTextField();
		textField_17.setText("Search by LRN");
		textField_17.setFont(new Font("Arial", Font.BOLD, 15));
		textField_17.setColumns(10);
		textField_17.setBorder(null);
		textField_17.setBounds(48, 7, 257, 29);
		UserPanel_2.add(textField_17);
		
		JLabel lblIconUsername_1_2 = new JLabel("");
		lblIconUsername_1_2.setIcon(new ImageIcon("C:\\Users\\frask\\eclipse-workspace\\MyProjects\\src\\DCIT60\\Images\\search.png"));
		lblIconUsername_1_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblIconUsername_1_2.setBackground(Color.WHITE);
		lblIconUsername_1_2.setBounds(4, 3, 43, 37);
		UserPanel_2.add(lblIconUsername_1_2);
		
		JLabel lblFirstName_2 = new JLabel("First Name:");
		lblFirstName_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblFirstName_2.setBounds(10, 92, 73, 14);
		panel_4.add(lblFirstName_2);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(126, 87, 199, 20);
		panel_4.add(textField_18);
		
		JLabel lblLastName_2 = new JLabel("Last Name:");
		lblLastName_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblLastName_2.setBounds(10, 122, 73, 14);
		panel_4.add(lblLastName_2);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(126, 116, 199, 20);
		panel_4.add(textField_19);
		
		JLabel lblMiddleName_2 = new JLabel("Middle Name:");
		lblMiddleName_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblMiddleName_2.setBounds(10, 150, 86, 14);
		panel_4.add(lblMiddleName_2);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(126, 147, 199, 20);
		panel_4.add(textField_20);
		
		JLabel lblExtensionName_2 = new JLabel("Extension Name:");
		lblExtensionName_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblExtensionName_2.setBounds(10, 175, 103, 14);
		panel_4.add(lblExtensionName_2);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(126, 173, 199, 20);
		panel_4.add(textField_21);
		
		JLabel lblDob_3 = new JLabel("D.O.B.:");
		lblDob_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblDob_3.setBounds(10, 204, 52, 14);
		panel_4.add(lblDob_3);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(126, 201, 199, 20);
		panel_4.add(textField_22);
		
		JLabel lblDob_1_3 = new JLabel("Sex:");
		lblDob_1_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblDob_1_3.setBounds(10, 232, 34, 14);
		panel_4.add(lblDob_1_3);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(126, 229, 199, 20);
		panel_4.add(textField_23);
		
		JLabel lblDob_1_1_3 = new JLabel("Address:");
		lblDob_1_1_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblDob_1_1_3.setBounds(10, 255, 63, 14);
		panel_4.add(lblDob_1_1_3);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(126, 254, 199, 20);
		panel_4.add(textField_24);
		
		JLabel lblDob_1_1_1_2 = new JLabel("Contact Number:");
		lblDob_1_1_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblDob_1_1_1_2.setBounds(10, 285, 103, 14);
		panel_4.add(lblDob_1_1_1_2);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(126, 283, 199, 20);
		panel_4.add(textField_25);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_2.setBounds(333, 11, 375, 308);
		panel_4.add(panel_1_2);
		
		JLabel lblNewLabel_5 = new JLabel("Photocopy of birth certificate/baptismal certificate");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(10, 55, 326, 14);
		panel_1_2.add(lblNewLabel_5);
		
		JPanel panel_2_4 = new JPanel();
		panel_2_4.setLayout(null);
		panel_2_4.setBorder(new LineBorder(SystemColor.windowBorder));
		panel_2_4.setBackground(SystemColor.inactiveCaptionBorder);
		panel_2_4.setBounds(10, 80, 350, 45);
		panel_1_2.add(panel_2_4);
		
		JButton btnNewButton_4 = new JButton("Choose File");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_4.setBounds(10, 11, 103, 23);
		panel_2_4.add(btnNewButton_4);
		
		JLabel lblNewLabel_1_4 = new JLabel("No file chosen");
		lblNewLabel_1_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_4.setBounds(123, 16, 111, 14);
		panel_2_4.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_2_2 = new JLabel("2x2 ID picture");
		lblNewLabel_2_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_2.setBounds(10, 136, 152, 14);
		panel_1_2.add(lblNewLabel_2_2);
		
		JPanel panel_2_1_2 = new JPanel();
		panel_2_1_2.setLayout(null);
		panel_2_1_2.setBorder(new LineBorder(SystemColor.windowBorder));
		panel_2_1_2.setBackground(SystemColor.inactiveCaptionBorder);
		panel_2_1_2.setBounds(10, 161, 350, 45);
		panel_1_2.add(panel_2_1_2);
		
		JButton btnNewButton_1_2 = new JButton("Choose File");
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1_2.setBounds(10, 11, 103, 23);
		panel_2_1_2.add(btnNewButton_1_2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("No file chosen");
		lblNewLabel_1_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_2.setBounds(123, 16, 111, 14);
		panel_2_1_2.add(lblNewLabel_1_1_2);
		
		JButton btnClear_2 = new JButton("SUBMIT");
		btnClear_2.setForeground(Color.WHITE);
		btnClear_2.setFont(new Font("Lucida Console", Font.BOLD, 14));
		btnClear_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnClear_2.setBackground(new Color(220, 20, 60));
		btnClear_2.setBounds(10, 254, 171, 45);
		panel_1_2.add(btnClear_2);
		
		JButton btnUpdate_2 = new JButton("UPDATE");
		btnUpdate_2.setForeground(Color.WHITE);
		btnUpdate_2.setFont(new Font("Lucida Console", Font.BOLD, 14));
		btnUpdate_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnUpdate_2.setBackground(new Color(220, 20, 60));
		btnUpdate_2.setBounds(191, 254, 169, 45);
		panel_1_2.add(btnUpdate_2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "STUDENT REQUIREMENTS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		tabbedPane.addTab("SPED", null, panel_5, null);
		panel_5.setLayout(null);
		
		JPanel UserPanel_3 = new JPanel();
		UserPanel_3.setLayout(null);
		UserPanel_3.setBorder(new LineBorder(new Color(220, 20, 60), 2));
		UserPanel_3.setBackground(Color.WHITE);
		UserPanel_3.setBounds(10, 24, 315, 43);
		panel_5.add(UserPanel_3);
		
		textField_26 = new JTextField();
		textField_26.setText("Search by LRN");
		textField_26.setFont(new Font("Arial", Font.BOLD, 15));
		textField_26.setColumns(10);
		textField_26.setBorder(null);
		textField_26.setBounds(48, 7, 257, 29);
		UserPanel_3.add(textField_26);
		
		JLabel lblIconUsername_1_3 = new JLabel("");
		lblIconUsername_1_3.setIcon(new ImageIcon("C:\\Users\\frask\\eclipse-workspace\\MyProjects\\src\\DCIT60\\Images\\search.png"));
		lblIconUsername_1_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblIconUsername_1_3.setBackground(Color.WHITE);
		lblIconUsername_1_3.setBounds(4, 3, 43, 37);
		UserPanel_3.add(lblIconUsername_1_3);
		
		JLabel lblFirstName_3 = new JLabel("First Name:");
		lblFirstName_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblFirstName_3.setBounds(10, 92, 73, 14);
		panel_5.add(lblFirstName_3);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(126, 87, 199, 20);
		panel_5.add(textField_27);
		
		JLabel lblLastName_3 = new JLabel("Last Name:");
		lblLastName_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblLastName_3.setBounds(10, 122, 73, 14);
		panel_5.add(lblLastName_3);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(126, 116, 199, 20);
		panel_5.add(textField_28);
		
		JLabel lblMiddleName_3 = new JLabel("Middle Name:");
		lblMiddleName_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblMiddleName_3.setBounds(10, 150, 86, 14);
		panel_5.add(lblMiddleName_3);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(126, 147, 199, 20);
		panel_5.add(textField_29);
		
		JLabel lblExtensionName_3 = new JLabel("Extension Name:");
		lblExtensionName_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblExtensionName_3.setBounds(10, 175, 103, 14);
		panel_5.add(lblExtensionName_3);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(126, 173, 199, 20);
		panel_5.add(textField_30);
		
		JLabel lblDob_4 = new JLabel("D.O.B.:");
		lblDob_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblDob_4.setBounds(10, 204, 52, 14);
		panel_5.add(lblDob_4);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(126, 201, 199, 20);
		panel_5.add(textField_31);
		
		JLabel lblDob_1_4 = new JLabel("Sex:");
		lblDob_1_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblDob_1_4.setBounds(10, 232, 34, 14);
		panel_5.add(lblDob_1_4);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(126, 229, 199, 20);
		panel_5.add(textField_32);
		
		JLabel lblDob_1_1_4 = new JLabel("Address:");
		lblDob_1_1_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblDob_1_1_4.setBounds(10, 255, 63, 14);
		panel_5.add(lblDob_1_1_4);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(126, 254, 199, 20);
		panel_5.add(textField_33);
		
		JLabel lblDob_1_1_1_3 = new JLabel("Contact Number:");
		lblDob_1_1_1_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblDob_1_1_1_3.setBounds(10, 285, 103, 14);
		panel_5.add(lblDob_1_1_1_3);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(126, 283, 199, 20);
		panel_5.add(textField_34);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_3.setBounds(333, 11, 375, 308);
		panel_5.add(panel_1_3);
		
		JLabel lblBirthCertificate = new JLabel("Birth Certificate");
		lblBirthCertificate.setFont(new Font("Arial", Font.PLAIN, 12));
		lblBirthCertificate.setBounds(10, 11, 274, 14);
		panel_1_3.add(lblBirthCertificate);
		
		JPanel panel_2_5 = new JPanel();
		panel_2_5.setLayout(null);
		panel_2_5.setBorder(new LineBorder(SystemColor.windowBorder));
		panel_2_5.setBackground(SystemColor.inactiveCaptionBorder);
		panel_2_5.setBounds(10, 25, 350, 45);
		panel_1_3.add(panel_2_5);
		
		JButton btnNewButton_5 = new JButton("Choose File");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_5.setBounds(10, 11, 103, 23);
		panel_2_5.add(btnNewButton_5);
		
		JLabel lblNewLabel_1_5 = new JLabel("No file chosen");
		lblNewLabel_1_5.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_5.setBounds(123, 16, 111, 14);
		panel_2_5.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_2_3 = new JLabel("Assessment Report");
		lblNewLabel_2_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_3.setBounds(10, 81, 171, 14);
		panel_1_3.add(lblNewLabel_2_3);
		
		JPanel panel_2_1_3 = new JPanel();
		panel_2_1_3.setLayout(null);
		panel_2_1_3.setBorder(new LineBorder(SystemColor.windowBorder));
		panel_2_1_3.setBackground(SystemColor.inactiveCaptionBorder);
		panel_2_1_3.setBounds(10, 95, 350, 45);
		panel_1_3.add(panel_2_1_3);
		
		JButton btnNewButton_1_3 = new JButton("Choose File");
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1_3.setBounds(10, 11, 103, 23);
		panel_2_1_3.add(btnNewButton_1_3);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("No file chosen");
		lblNewLabel_1_1_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_3.setBounds(123, 16, 111, 14);
		panel_2_1_3.add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_3_3 = new JLabel("Medical Certificate");
		lblNewLabel_3_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_3.setBounds(10, 166, 160, 14);
		panel_1_3.add(lblNewLabel_3_3);
		
		JPanel panel_2_2_3 = new JPanel();
		panel_2_2_3.setLayout(null);
		panel_2_2_3.setBorder(new LineBorder(SystemColor.windowBorder));
		panel_2_2_3.setBackground(SystemColor.inactiveCaptionBorder);
		panel_2_2_3.setBounds(10, 180, 350, 45);
		panel_1_3.add(panel_2_2_3);
		
		JButton btnNewButton_2_3 = new JButton("Choose File");
		btnNewButton_2_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_2_3.setBounds(10, 11, 103, 23);
		panel_2_2_3.add(btnNewButton_2_3);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("No file chosen");
		lblNewLabel_1_2_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_2_3.setBounds(123, 16, 111, 14);
		panel_2_2_3.add(lblNewLabel_1_2_3);
		
		JLabel lblNewLabel_6 = new JLabel("Leave empty if not needed");
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(10, 141, 350, 14);
		panel_1_3.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("Leave empty if not needed");
		lblNewLabel_6_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1.setForeground(Color.RED);
		lblNewLabel_6_1.setBounds(10, 226, 350, 14);
		panel_1_3.add(lblNewLabel_6_1);
		
		JButton btnClear_2_1 = new JButton("SUBMIT");
		btnClear_2_1.setForeground(Color.WHITE);
		btnClear_2_1.setFont(new Font("Lucida Console", Font.BOLD, 14));
		btnClear_2_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnClear_2_1.setBackground(new Color(220, 20, 60));
		btnClear_2_1.setBounds(10, 251, 171, 45);
		panel_1_3.add(btnClear_2_1);
		
		JButton btnUpdate_2_1 = new JButton("UPDATE");
		btnUpdate_2_1.setForeground(Color.WHITE);
		btnUpdate_2_1.setFont(new Font("Lucida Console", Font.BOLD, 14));
		btnUpdate_2_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnUpdate_2_1.setBackground(new Color(220, 20, 60));
		btnUpdate_2_1.setBounds(191, 251, 169, 45);
		panel_1_3.add(btnUpdate_2_1);
		frmBesStudentFiles.setBounds(100, 100, 755, 414);
		frmBesStudentFiles.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
