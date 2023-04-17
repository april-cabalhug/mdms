package DCIT60;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.JTable;
import java.awt.SystemColor;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class dashboard {

	private JFrame frmBesStudentInformation;
	private JTextField txtSearch;
	private JTable table;
	private JTable table_2;
	private JTable table_3;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dashboard window = new dashboard();
					window.frmBesStudentInformation.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public dashboard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBesStudentInformation = new JFrame();
		frmBesStudentInformation.setResizable(false);
		frmBesStudentInformation.setTitle("BES Student Information Management System");
		frmBesStudentInformation.setBounds(100, 100, 1075, 650);
		frmBesStudentInformation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBesStudentInformation.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 218, 185));
		panel_1.setBounds(3, 25, 1054, 25);
		frmBesStudentInformation.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("www.bes-online-portal.com");
		lblNewLabel_2.setForeground(SystemColor.textHighlight);
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(871, 5, 179, 14);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(220, 20, 60), 10));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(3, 49, 451, 557);
		frmBesStudentInformation.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 163, 431, 383);
		panel_2.add(tabbedPane);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Grade1-6", null, panel_4, null);
		panel_4.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(2, 2, 422, 286);
		panel_4.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"LRN", "Last Name", "First Name", "Middle Name", "Sex", "Address", "Contact Number"
			}
		));
		
		JButton btnClear_2_2 = new JButton("VIEW PROFILE");
		btnClear_2_2.setForeground(Color.WHITE);
		btnClear_2_2.setFont(new Font("Lucida Console", Font.BOLD, 14));
		btnClear_2_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnClear_2_2.setBackground(new Color(220, 20, 60));
		btnClear_2_2.setBounds(117, 299, 192, 45);
		panel_4.add(btnClear_2_2);
		table.getColumnModel().getColumn(5).setPreferredWidth(90);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("ALS", null, panel_6, null);
		panel_6.setLayout(null);
		
		table_1 = new JTable();
		table_1.setBounds(10, 11, 406, 283);
		panel_6.add(table_1);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("SPED", null, panel_7, null);
		panel_7.setLayout(null);
		
		table_2 = new JTable();
		table_2.setBounds(0, 0, 426, 305);
		panel_7.add(table_2);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("KINDER", null, panel_5, null);
		panel_5.setLayout(null);
		
		table_3 = new JTable();
		table_3.setBounds(10, 11, 406, 283);
		panel_5.add(table_3);
		
		JLabel lblNewLabel_1 = new JLabel("Student's Information");
		lblNewLabel_1.setBounds(88, 14, 263, 43);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(204, 0, 0));
		lblNewLabel_1.setFont(new Font("Bell MT", Font.BOLD, 18));
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Quick Search");
		lblNewLabel_1_1.setBounds(88, 44, 263, 36);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(new Color(204, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Calibri", Font.BOLD, 18));
		panel_2.add(lblNewLabel_1_1);
		
		JPanel UserPanel = new JPanel();
		UserPanel.setBounds(103, 86, 240, 45);
		UserPanel.setLayout(null);
		UserPanel.setBorder(new LineBorder(new Color(220, 20, 60), 2));
		UserPanel.setBackground(Color.WHITE);
		panel_2.add(UserPanel);
		
		txtSearch = new JTextField();
		txtSearch.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtSearch.getText().equals("Search")) {
					txtSearch.setText("");
				}
				else {
					txtSearch.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtSearch.getText().equals(""))
					txtSearch.setText("Search");
			}
		});
		txtSearch.setText("Search");
		txtSearch.setFont(new Font("Arial", Font.BOLD, 15));
		txtSearch.setColumns(10);
		txtSearch.setBorder(null);
		txtSearch.setBounds(48, 7, 182, 29);
		UserPanel.add(txtSearch);
		
		JLabel lblIconUsername_1 = new JLabel("");
		lblIconUsername_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblIconUsername_1.setIcon(new ImageIcon("C:\\Users\\frask\\eclipse-workspace\\MyProjects\\src\\DCIT60\\Images\\search.png"));
		lblIconUsername_1.setBackground(Color.WHITE);
		lblIconUsername_1.setBounds(2, 2, 43, 41);
		UserPanel.add(lblIconUsername_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBackground(new Color(220, 20, 60));
		panel.setBounds(1, 0, 1059, 609);
		frmBesStudentInformation.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(451, 50, 605, 556);
		panel_3.setBackground(Color.WHITE);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(60, 2, 483, 450);
		panel_3.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\frask\\eclipse-workspace\\MyProjects\\src\\DCIT60\\Images\\logo.png"));
		
		JLabel lblNewLabel_1_2 = new JLabel("STUDENT INFORMATION MANAGEMENT SYSTEM");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(new Color(204, 0, 0));
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblNewLabel_1_2.setBounds(60, 463, 483, 43);
		panel_3.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("For more information visit our website: www.bes-online-portal.com");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setForeground(new Color(204, 0, 0));
		lblNewLabel_1_2_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_2_1.setBounds(60, 502, 483, 43);
		panel_3.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Student's Entry");
		lblNewLabel_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(10, 6, 97, 14);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Print");
		lblNewLabel_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblNewLabel_2_1_1.setBounds(117, 7, 37, 14);
		panel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_3 = new JLabel("Settings");
		lblNewLabel_2_1_1_3.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblNewLabel_2_1_1_3.setBounds(163, 7, 53, 14);
		panel.add(lblNewLabel_2_1_1_3);
	}
}
