package DCIT60;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class LForm {

	private JFrame frmBesListOf;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private JTable table_5;
	private JTable table_6;
	private JTable table_7;
	private JTable table_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LForm window = new LForm();
					window.frmBesListOf.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBesListOf = new JFrame();
		frmBesListOf.setResizable(false);
		frmBesListOf.setTitle("BES List of Students");
		frmBesListOf.getContentPane().setBackground(new Color(220, 20, 60));
		frmBesListOf.setBounds(100, 100, 580, 548);
		frmBesListOf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBesListOf.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 544, 487);
		frmBesListOf.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Grade1", null, panel, null);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 57, 519, 334);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"", null, null, null, null, null, ""},
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
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"No.", "Last Name", "First Name", "Middle Name", "LRN", "Sex", "Grade & Section"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(36);
		table.getColumnModel().getColumn(6).setPreferredWidth(91);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("Total No. of Students..........     0");
		lblNewLabel.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(136, 401, 224, 27);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\frask\\eclipse-workspace\\MyProjects\\src\\DCIT60\\Images\\printer.png"));
		lblNewLabel_1.setBounds(494, 11, 35, 35);
		panel.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"School Year"}));
		comboBox.setBounds(250, 11, 100, 35);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Grade & Section"}));
		comboBox_1.setBounds(360, 11, 124, 35);
		panel.add(comboBox_1);
		
		JLabel lblNewLabel_2 = new JLabel("Grade 1 Student List");
		lblNewLabel_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 11, 230, 35);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Grade2", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\frask\\eclipse-workspace\\MyProjects\\src\\DCIT60\\Images\\printer.png"));
		lblNewLabel_1_1.setBounds(494, 11, 35, 35);
		panel_1.add(lblNewLabel_1_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"School Year"}));
		comboBox_2.setBounds(250, 11, 100, 35);
		panel_1.add(comboBox_2);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"Grade & Section"}));
		comboBox_1_1.setBounds(360, 11, 124, 35);
		panel_1.add(comboBox_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Grade 2 Student List");
		lblNewLabel_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(10, 11, 230, 35);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("Total No. of Students..........     0");
		lblNewLabel_3.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_3.setBounds(136, 401, 224, 27);
		panel_1.add(lblNewLabel_3);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 57, 519, 333);
		panel_1.add(scrollPane_2);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
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
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"No.", "Last Name", "First Name", "Middle Name", "LRN", "Sex", "Grade & Section"
			}
		));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(30);
		table_1.getColumnModel().getColumn(6).setPreferredWidth(91);
		scrollPane_2.setViewportView(table_1);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Grade3", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Users\\frask\\eclipse-workspace\\MyProjects\\src\\DCIT60\\Images\\printer.png"));
		lblNewLabel_1_2.setBounds(494, 11, 35, 35);
		panel_2.add(lblNewLabel_1_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"School Year"}));
		comboBox_3.setBounds(250, 11, 100, 35);
		panel_2.add(comboBox_3);
		
		JComboBox comboBox_1_2 = new JComboBox();
		comboBox_1_2.setModel(new DefaultComboBoxModel(new String[] {"Grade & Section"}));
		comboBox_1_2.setBounds(360, 11, 124, 35);
		panel_2.add(comboBox_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Grade 3 Student List");
		lblNewLabel_2_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblNewLabel_2_2.setBounds(10, 11, 230, 35);
		panel_2.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_4 = new JLabel("Total No. of Students..........     0");
		lblNewLabel_4.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_4.setBounds(136, 401, 224, 27);
		panel_2.add(lblNewLabel_4);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 57, 519, 333);
		panel_2.add(scrollPane_3);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
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
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"No.", "Last Name", "First Name", "Middle Name", "LRN", "Sex", "Grade & Section"
			}
		));
		table_2.getColumnModel().getColumn(0).setPreferredWidth(41);
		table_2.getColumnModel().getColumn(6).setPreferredWidth(98);
		scrollPane_3.setViewportView(table_2);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Grade4", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1_3 = new JLabel("");
		lblNewLabel_1_3.setIcon(new ImageIcon("C:\\Users\\frask\\eclipse-workspace\\MyProjects\\src\\DCIT60\\Images\\printer.png"));
		lblNewLabel_1_3.setBounds(494, 11, 35, 35);
		panel_3.add(lblNewLabel_1_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"School Year"}));
		comboBox_4.setBounds(250, 11, 100, 35);
		panel_3.add(comboBox_4);
		
		JComboBox comboBox_1_3 = new JComboBox();
		comboBox_1_3.setModel(new DefaultComboBoxModel(new String[] {"Grade & Section"}));
		comboBox_1_3.setBounds(360, 11, 124, 35);
		panel_3.add(comboBox_1_3);
		
		JLabel lblNewLabel_2_3 = new JLabel("Grade 4 Student List");
		lblNewLabel_2_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblNewLabel_2_3.setBounds(10, 11, 230, 35);
		panel_3.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_5 = new JLabel("Total No. of Students..........     0");
		lblNewLabel_5.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_5.setBounds(136, 401, 224, 27);
		panel_3.add(lblNewLabel_5);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(10, 57, 519, 333);
		panel_3.add(scrollPane_4);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
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
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"No.", "Last Name", "First Name", "Middle Name", "LRN", "Sex", "Grade & Section"
			}
		));
		table_3.getColumnModel().getColumn(0).setPreferredWidth(32);
		table_3.getColumnModel().getColumn(6).setPreferredWidth(99);
		scrollPane_4.setViewportView(table_3);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Grade5", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_1_4 = new JLabel("");
		lblNewLabel_1_4.setIcon(new ImageIcon("C:\\Users\\frask\\eclipse-workspace\\MyProjects\\src\\DCIT60\\Images\\printer.png"));
		lblNewLabel_1_4.setBounds(494, 11, 35, 35);
		panel_4.add(lblNewLabel_1_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"School Year"}));
		comboBox_5.setBounds(250, 11, 100, 35);
		panel_4.add(comboBox_5);
		
		JComboBox comboBox_1_4 = new JComboBox();
		comboBox_1_4.setModel(new DefaultComboBoxModel(new String[] {"Grade & Section"}));
		comboBox_1_4.setBounds(360, 11, 124, 35);
		panel_4.add(comboBox_1_4);
		
		JLabel lblNewLabel_2_4 = new JLabel("Grade 5 Student List");
		lblNewLabel_2_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblNewLabel_2_4.setBounds(10, 11, 230, 35);
		panel_4.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_6 = new JLabel("Total No. of Students..........     0");
		lblNewLabel_6.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_6.setBounds(136, 401, 224, 27);
		panel_4.add(lblNewLabel_6);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(10, 57, 519, 333);
		panel_4.add(scrollPane_5);
		
		table_4 = new JTable();
		table_4.setModel(new DefaultTableModel(
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
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"No.", "Last Name", "First Name", "Middle Name", "LRN", "Sex", "Grade & Section"
			}
		));
		table_4.getColumnModel().getColumn(0).setPreferredWidth(38);
		table_4.getColumnModel().getColumn(6).setPreferredWidth(99);
		scrollPane_5.setViewportView(table_4);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Grade6", null, panel_5, null);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_1_5 = new JLabel("");
		lblNewLabel_1_5.setIcon(new ImageIcon("C:\\Users\\frask\\eclipse-workspace\\MyProjects\\src\\DCIT60\\Images\\printer.png"));
		lblNewLabel_1_5.setBounds(494, 11, 35, 35);
		panel_5.add(lblNewLabel_1_5);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"School Year"}));
		comboBox_6.setBounds(250, 11, 100, 35);
		panel_5.add(comboBox_6);
		
		JComboBox comboBox_1_5 = new JComboBox();
		comboBox_1_5.setModel(new DefaultComboBoxModel(new String[] {"Grade & Section"}));
		comboBox_1_5.setBounds(360, 11, 124, 35);
		panel_5.add(comboBox_1_5);
		
		JLabel lblNewLabel_2_5 = new JLabel("Grade 6 Student List");
		lblNewLabel_2_5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblNewLabel_2_5.setBounds(10, 11, 230, 35);
		panel_5.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_7 = new JLabel("Total No. of Students..........     0");
		lblNewLabel_7.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_7.setBounds(136, 401, 224, 27);
		panel_5.add(lblNewLabel_7);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(10, 57, 519, 333);
		panel_5.add(scrollPane_6);
		
		table_5 = new JTable();
		table_5.setModel(new DefaultTableModel(
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
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"No.", "Last Name", "First Name", "Middle Name", "LRN", "Sex", "Grade & Section"
			}
		));
		table_5.getColumnModel().getColumn(6).setPreferredWidth(102);
		scrollPane_6.setViewportView(table_5);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Kinder", null, panel_7, null);
		panel_7.setLayout(null);
		
		JLabel lblNewLabel_1_6 = new JLabel("");
		lblNewLabel_1_6.setIcon(new ImageIcon("C:\\Users\\frask\\eclipse-workspace\\MyProjects\\src\\DCIT60\\Images\\printer.png"));
		lblNewLabel_1_6.setBounds(494, 11, 35, 35);
		panel_7.add(lblNewLabel_1_6);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"School Year"}));
		comboBox_7.setBounds(250, 11, 100, 35);
		panel_7.add(comboBox_7);
		
		JComboBox comboBox_1_6 = new JComboBox();
		comboBox_1_6.setModel(new DefaultComboBoxModel(new String[] {"Grade & Section"}));
		comboBox_1_6.setBounds(360, 11, 124, 35);
		panel_7.add(comboBox_1_6);
		
		JLabel lblNewLabel_2_6 = new JLabel("Kinder Student List");
		lblNewLabel_2_6.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblNewLabel_2_6.setBounds(10, 11, 230, 35);
		panel_7.add(lblNewLabel_2_6);
		
		JLabel lblNewLabel_8 = new JLabel("Total No. of Students..........     0");
		lblNewLabel_8.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_8.setBounds(136, 401, 224, 27);
		panel_7.add(lblNewLabel_8);
		
		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(10, 57, 519, 333);
		panel_7.add(scrollPane_7);
		
		table_6 = new JTable();
		table_6.setModel(new DefaultTableModel(
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
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"No.", "Last Name", "First Name", "Middle Name", "LRN", "Sex", "Grade & Section"
			}
		));
		table_6.getColumnModel().getColumn(0).setPreferredWidth(44);
		table_6.getColumnModel().getColumn(6).setPreferredWidth(102);
		scrollPane_7.setViewportView(table_6);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("ALS", null, panel_6, null);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_1_7 = new JLabel("");
		lblNewLabel_1_7.setIcon(new ImageIcon("C:\\Users\\frask\\eclipse-workspace\\MyProjects\\src\\DCIT60\\Images\\printer.png"));
		lblNewLabel_1_7.setBounds(494, 11, 35, 35);
		panel_6.add(lblNewLabel_1_7);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"School Year"}));
		comboBox_8.setBounds(250, 11, 100, 35);
		panel_6.add(comboBox_8);
		
		JComboBox comboBox_1_7 = new JComboBox();
		comboBox_1_7.setModel(new DefaultComboBoxModel(new String[] {"Grade & Section"}));
		comboBox_1_7.setBounds(360, 11, 124, 35);
		panel_6.add(comboBox_1_7);
		
		JLabel lblNewLabel_2_7 = new JLabel("ALS Student List");
		lblNewLabel_2_7.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblNewLabel_2_7.setBounds(10, 11, 230, 35);
		panel_6.add(lblNewLabel_2_7);
		
		JLabel lblNewLabel_9 = new JLabel("Total No. of Students..........     0");
		lblNewLabel_9.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_9.setBounds(136, 401, 224, 27);
		panel_6.add(lblNewLabel_9);
		
		JScrollPane scrollPane_8 = new JScrollPane();
		scrollPane_8.setBounds(10, 57, 519, 333);
		panel_6.add(scrollPane_8);
		
		table_7 = new JTable();
		table_7.setModel(new DefaultTableModel(
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
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"No.", "Last Name", "First Name", "Middle Name", "LRN", "Sex", "Grade & Section"
			}
		));
		table_7.getColumnModel().getColumn(0).setPreferredWidth(37);
		table_7.getColumnModel().getColumn(6).setPreferredWidth(107);
		scrollPane_8.setViewportView(table_7);
		
		JPanel panel_8 = new JPanel();
		tabbedPane.addTab("SPED", null, panel_8, null);
		panel_8.setLayout(null);
		
		JLabel lblNewLabel_1_8 = new JLabel("");
		lblNewLabel_1_8.setIcon(new ImageIcon("C:\\Users\\frask\\eclipse-workspace\\MyProjects\\src\\DCIT60\\Images\\printer.png"));
		lblNewLabel_1_8.setBounds(494, 11, 35, 35);
		panel_8.add(lblNewLabel_1_8);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"School Year"}));
		comboBox_9.setBounds(250, 11, 100, 35);
		panel_8.add(comboBox_9);
		
		JComboBox comboBox_1_8 = new JComboBox();
		comboBox_1_8.setModel(new DefaultComboBoxModel(new String[] {"Grade & Section"}));
		comboBox_1_8.setBounds(360, 11, 124, 35);
		panel_8.add(comboBox_1_8);
		
		JLabel lblNewLabel_2_8 = new JLabel("SPED Student List");
		lblNewLabel_2_8.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblNewLabel_2_8.setBounds(10, 11, 230, 35);
		panel_8.add(lblNewLabel_2_8);
		
		JLabel lblNewLabel_10 = new JLabel("Total No. of Students..........     0");
		lblNewLabel_10.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_10.setBounds(136, 401, 224, 27);
		panel_8.add(lblNewLabel_10);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 57, 519, 333);
		panel_8.add(scrollPane_1);
		
		table_8 = new JTable();
		table_8.setModel(new DefaultTableModel(
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
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"No.", "Last Name", "First Name", "Middle Name", "LRN", "Sex", "Grade & Section"
			}
		));
		table_8.getColumnModel().getColumn(0).setPreferredWidth(35);
		table_8.getColumnModel().getColumn(6).setPreferredWidth(101);
		scrollPane_1.setViewportView(table_8);
	}
}
