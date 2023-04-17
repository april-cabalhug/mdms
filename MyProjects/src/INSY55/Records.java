package INSY55;

import java.awt.EventQueue;
import java.sql.*;
import java.text.MessageFormat;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.border.EtchedBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTable;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Records {

	JFrame frame;
	private JTextField txtFName;
	private JTextField txtLName;
	private JTextField txtMI;
	private JTextField txtCName;
	private JTextField txtCRel;
	private JTextField txtSearch;
	private JTable tblRecords;

	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	DefaultTableModel model = new DefaultTableModel();
	private JTextField txtAdv;
	private JCheckBox chckbxModules;
	private JCheckBox chckbxLAS;
	private JCheckBox chckbxWHLP;
	private JCheckBox chckbxBooks;
	protected Window lblChangePassword;
	protected Window lblChange;
	protected Window lblChangeUsername;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Records window = new Records();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Records() {
		initialize();
		
		Object col[] = {"No.","Last Name","First Name","M.I.","Grade & Section","Adviser","Quarter","HandOut","Claimant's Name","Claimant's Relationship","Date"};
		model.setColumnIdentifiers(col);
		tblRecords.setModel(model);
				
		conn = mdms_con.ConnectDB();
		updateTable();
	}

	public void updateTable()
	{
		conn = mdms_con.ConnectDB();
		if (conn != null)
		{
			String sql="Select stud_no,lname,fname,mname,gsec,adviser,quarter,handout,cname,crel,date from drecord";
		
		try
		{
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			Object[] columnData = new Object[11];
			
			while(rs.next())
			{
				columnData[0] = rs.getString("stud_no");
				columnData[1] = rs.getString("lname");
				columnData[2] = rs.getString("fname");
				columnData[3] = rs.getString("mname");
				columnData[4] = rs.getString("gsec");
				columnData[5] = rs.getString("adviser");
				columnData[6] = rs.getString("quarter");
				columnData[7] = rs.getString("handout");
				columnData[8] = rs.getString("cname");
				columnData[9] = rs.getString("crel");
				columnData[10] = rs.getString("date");
				model.addRow(columnData);
			}
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		}
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 1255, 589);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(204, 0, 0), 5));
		panel.setBackground(new Color(220, 20, 60));
		panel.setBounds(2, 0, 1253, 589);
		frame.getContentPane().add(panel);
		
		JLabel lblExit = new JLabel("X");
		lblExit.setBounds(1191, 8, 56, 30);
		
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
		panel.setLayout(null);
		
		lblExit.setHorizontalAlignment(SwingConstants.CENTER);
		lblExit.setForeground(Color.WHITE);
		lblExit.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		panel.add(lblExit);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(131, 41, 1117, 541);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
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
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(9, 101, 253, 116);
		panel_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), new Color(160, 160, 160)), "STUDENT DETAILS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1_1.setBackground(SystemColor.menu);
		panel_1.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("First Name:");
		lblNewLabel_1_1.setBounds(10, 19, 79, 21);
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		panel_1_1.add(lblNewLabel_1_1);
		
		txtFName = new JTextField();
		txtFName.setBounds(117, 19, 124, 20);
		txtFName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				int position = txtFName.getCaretPosition();
				txtFName.setText(txtFName.getText().toUpperCase());
				txtFName.setCaretPosition(position);
			}
		});
		txtFName.setColumns(10);
		txtFName.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1_1.add(txtFName);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Last Name:");
		lblNewLabel_1_1_2.setBounds(10, 51, 79, 21);
		lblNewLabel_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_2.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		panel_1_1.add(lblNewLabel_1_1_2);
		
		txtLName = new JTextField();
		txtLName.setBounds(117, 51, 124, 20);
		txtLName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				int position = txtLName.getCaretPosition();
				txtLName.setText(txtLName.getText().toUpperCase());
				txtLName.setCaretPosition(position);
			}
		});
		txtLName.setColumns(10);
		txtLName.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1_1.add(txtLName);
		
		txtMI = new JTextField();
		txtMI.setBounds(117, 82, 124, 20);
		txtMI.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				int position = txtMI.getCaretPosition();
				txtMI.setText(txtMI.getText().toUpperCase());
				txtMI.setCaretPosition(position);
			}
		});
		txtMI.setColumns(10);
		txtMI.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1_1.add(txtMI);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("M.I.:");
		lblNewLabel_1_4_1.setBounds(10, 83, 38, 21);
		lblNewLabel_1_4_1.setForeground(Color.BLACK);
		lblNewLabel_1_4_1.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		panel_1_1.add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1 = new JLabel("DISTRIBUTION RECORDS");
		lblNewLabel_1.setBounds(270, 11, 846, 30);
		lblNewLabel_1.setForeground(new Color(204, 0, 0));
		lblNewLabel_1.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(9, 335, 253, 98);
		panel_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblHandOut = new JLabel("HandOut Given:");
		lblHandOut.setBounds(10, 6, 120, 21);
		lblHandOut.setForeground(Color.BLACK);
		lblHandOut.setFont(new Font("Arial", Font.BOLD, 15));
		panel_3.add(lblHandOut);
		
		chckbxModules = new JCheckBox("MODULES");
		chckbxModules.setBounds(6, 35, 97, 23);
		chckbxModules.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_3.add(chckbxModules);
		
		chckbxLAS = new JCheckBox("LAS");
		chckbxLAS.setBounds(6, 63, 97, 23);
		chckbxLAS.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_3.add(chckbxLAS);
		
		chckbxWHLP = new JCheckBox("WHLP");
		chckbxWHLP.setBounds(127, 35, 97, 23);
		chckbxWHLP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_3.add(chckbxWHLP);
		
		chckbxBooks = new JCheckBox("BOOKS");
		chckbxBooks.setBounds(127, 63, 97, 23);
		chckbxBooks.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_3.add(chckbxBooks);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(9, 226, 253, 98);
		panel_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Quarter:");
		lblNewLabel_1_3_1.setBounds(8, 38, 59, 21);
		lblNewLabel_1_3_1.setForeground(Color.BLACK);
		lblNewLabel_1_3_1.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		panel_4.add(lblNewLabel_1_3_1);
		
		JComboBox comboBox_quarter = new JComboBox();
		comboBox_quarter.setBounds(118, 39, 123, 22);
		comboBox_quarter.setModel(new DefaultComboBoxModel(new String[] {"-SELECT-","FIRST","SECOND","THIRD","FOURTH"}));
		panel_4.add(comboBox_quarter);
		
		JLabel lblNewLabel_1_2 = new JLabel("Adviser:");
		lblNewLabel_1_2.setBounds(9, 66, 69, 21);
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		panel_4.add(lblNewLabel_1_2);
		
		txtAdv = new JTextField();
		txtAdv.setBounds(118, 68, 123, 20);
		txtAdv.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				int position = txtAdv.getCaretPosition();
				txtAdv.setText(txtAdv.getText().toUpperCase());
				txtAdv.setCaretPosition(position);
			}
		});
		txtAdv.setColumns(10);
		txtAdv.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.add(txtAdv);
		
		JLabel lblNewLabel_1_3 = new JLabel("Grade & Section:");
		lblNewLabel_1_3.setBounds(9, 9, 110, 21);
		lblNewLabel_1_3.setForeground(Color.BLACK);
		lblNewLabel_1_3.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		panel_4.add(lblNewLabel_1_3);
		
		JComboBox comboBox_gsec = new JComboBox();
		comboBox_gsec.setBounds(118, 10, 123, 22);
		comboBox_gsec.setModel(new DefaultComboBoxModel(new String[] {"-SELECT-",
				"ALS-DIAMOND", "ALS-RUBY", "ALS-EMERALD",
				"GRADE1-DIAMOND", "GRADE1-RUBY", "GRADE1-PEARL", "GRADE1-TOPAZ", "GRADE1-PERIDOT", "GRADE1-EMERALD", "GRADE1-GARNET", "GRADE1-OPAL", "GRADE1-SAPPHIRE",
				"GRADE2-PEARL", "GRADE2-GARNET ", "GRADE2-RUBY", "GRADE2-OPAL", "GRADE2-TOPAZ", "GRADE2-SAPPHIRE", "GRADE2-PERIDOT", "GRADE2-EMERALD",
				"GRADE3-PEARL","GRADE3-TOPAZ","GRADE3-GARNET","GRADE3-RUBY","GRADE3-JADE","GRADE3-EMERALD","GRADE3-SAPPHIRE","GRADE3-OPAL","GRADE3-ONYX","GRADE3-PERIDOT",
				"GRADE4-PEARL", "GRADE4-GARNET", "GRADE4-ONYX", "GRADE4-SAPPHIRE", "GRADE4-RUBY", "GRADE4-OPAL", "GRADE4-EMERALD", "GRADE4-PERIDOT",
				"GRADE5-EMERALD", "GRADE5-RUBY", "GRADE5-OPAL", "GRADE5-GARNET","GRADE5-TOPAZ", "GRADE5-SAPPHIRE", "GRADE5-ONYX", "GRADE5-JADE",
				"GRADE6-GARNET", "GRADE6-RUBY", "GRADE6-JADE", "GRADE6-EMERALD", "GRADE6-OPAL", "GRADE6-TOPAZ", "GRADE6-ONYX", "GRADE6-PERIDOT",
				"KINDER-DIAMOND", "KINDER-PEARL", "KINDER-JADE", "KINDER-RUBY",
				"SPED-DIAMOND", "SPED-PEARL", "SPED-RUBY"
		}));
		panel_4.add(comboBox_gsec);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(9, 444, 253, 86);
		panel_1_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), new Color(160, 160, 160)), "CLAIMANT DETAILS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1_1_1.setBackground(SystemColor.menu);
		panel_1.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Name:");
		lblNewLabel_1_1_1.setBounds(8, 17, 54, 21);
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		panel_1_1_1.add(lblNewLabel_1_1_1);
		
		txtCName = new JTextField();
		txtCName.setBounds(115, 19, 126, 20);
		txtCName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				int position = txtCName.getCaretPosition();
				txtCName.setText(txtCName.getText().toUpperCase());
				txtCName.setCaretPosition(position);
			}
		});
		txtCName.setColumns(10);
		txtCName.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1_1_1.add(txtCName);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Modules");
		rdbtnNewRadioButton_1.setBounds(11, 145, 109, 23);
		rdbtnNewRadioButton_1.setOpaque(false);
		panel_1_1_1.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnLas_1 = new JRadioButton("LAS");
		rdbtnLas_1.setBounds(12, 171, 109, 23);
		rdbtnLas_1.setOpaque(false);
		panel_1_1_1.add(rdbtnLas_1);
		
		JRadioButton rdbtnWhlp_1 = new JRadioButton("WHLP");
		rdbtnWhlp_1.setBounds(110, 145, 109, 23);
		rdbtnWhlp_1.setOpaque(false);
		panel_1_1_1.add(rdbtnWhlp_1);
		
		JRadioButton rdbtnBooks_1 = new JRadioButton("Books");
		rdbtnBooks_1.setBounds(110, 171, 109, 23);
		rdbtnBooks_1.setOpaque(false);
		panel_1_1_1.add(rdbtnBooks_1);
		
		JLabel lblNewLabel_1_3_1_1_1 = new JLabel("HandOut Given:");
		lblNewLabel_1_3_1_1_1.setBounds(10, 124, 120, 21);
		lblNewLabel_1_3_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_3_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1_1_1.add(lblNewLabel_1_3_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Relationship:");
		lblNewLabel_1_1_1_1.setBounds(10, 53, 97, 21);
		lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		panel_1_1_1.add(lblNewLabel_1_1_1_1);
		
		txtCRel = new JTextField();
		txtCRel.setBounds(115, 55, 126, 20);
		txtCRel.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				int position = txtCRel.getCaretPosition();
				txtCRel.setText(txtCRel.getText().toUpperCase());
				txtCRel.setCaretPosition(position);
			}
		});
		txtCRel.setColumns(10);
		txtCRel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1_1_1.add(txtCRel);
		
		JButton btnAdd = new JButton("ADD");
		
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(txtFName.getText().equals("") || txtLName.getText().equals("") || comboBox_gsec.getSelectedItem().toString().equals(null) ||  txtAdv.getText().equals("") || comboBox_quarter.getSelectedItem().toString().equals(null) || txtCName.getText().equals("") || txtCName.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "Please fill in all required fields!");
			}
			else if(txtMI.getText().equals("")) {
				String sql=	"insert into drecord (lname,fname,mname,gsec,adviser,quarter,handout,cname,crel)values(?,?,?,?,?,?,?,?,?)";
				try {
						pst = conn.prepareStatement(sql);
						pst.setString(1, txtLName.getText());
						pst.setString(2, txtFName.getText());
						pst.setString(3, txtMI.getText()+" ");
						pst.setString(4, comboBox_gsec.getSelectedItem().toString());
						pst.setString(5, txtAdv.getText());
						pst.setString(6, comboBox_quarter.getSelectedItem().toString());
						String handout="";
						if(chckbxModules.isSelected()) {
							handout+=chckbxModules.getText()+" ";
						}
						if(chckbxLAS.isSelected()) {
							handout+=chckbxLAS.getText()+" ";
						}
						if(chckbxWHLP.isSelected()) {
							handout+=chckbxWHLP.getText()+" ";
						}
						if(chckbxBooks.isSelected()) {
							handout+=chckbxBooks.getText()+" ";
						}
						pst.setString(7, handout);
						pst.setString(8, txtCName.getText());
						pst.setString(9, txtCRel.getText());
						pst.executeUpdate();
						DefaultTableModel model = (DefaultTableModel)tblRecords.getModel();
						model.setRowCount(0);
						JOptionPane.showMessageDialog(null, "Successfully Saved!");
						updateTable();
						
						txtLName.setText("");
			            txtLName.setText("");
			            txtFName.setText("");
			            txtMI.setText("");
			            comboBox_gsec.setSelectedIndex(0);
			            txtAdv.setText("");
			            comboBox_quarter.setSelectedIndex(0);
			            chckbxModules.setSelected(false);
			            chckbxLAS.setSelected(false);
			            chckbxWHLP.setSelected(false);
			            chckbxBooks.setSelected(false);
			            txtCName.setText("");
			            txtCRel.setText("");
			            
			            txtFName.requestFocus();
						
					}catch(Exception e1) {
						JOptionPane.showMessageDialog(null, e1);
					}			
			}
			else{
					String sql=	"insert into drecord (lname,fname,mname,gsec,adviser,quarter,handout,cname,crel)values(?,?,?,?,?,?,?,?,?)";
					try {
							pst = conn.prepareStatement(sql);
							pst.setString(1, txtLName.getText());
							pst.setString(2, txtFName.getText());
							pst.setString(3, txtMI.getText());
							pst.setString(4, comboBox_gsec.getSelectedItem().toString());
							pst.setString(5, txtAdv.getText());
							pst.setString(6, comboBox_quarter.getSelectedItem().toString());
							String handout="";
							if(chckbxModules.isSelected()) {
								handout+=chckbxModules.getText()+" ";
							}
							if(chckbxLAS.isSelected()) {
								handout+=chckbxLAS.getText()+" ";
							}
							if(chckbxWHLP.isSelected()) {
								handout+=chckbxWHLP.getText()+" ";
							}
							if(chckbxBooks.isSelected()) {
								handout+=chckbxBooks.getText()+" ";
							}
							pst.setString(7, handout);
							pst.setString(8, txtCName.getText());
							pst.setString(9, txtCRel.getText());
							pst.executeUpdate();
							DefaultTableModel model = (DefaultTableModel)tblRecords.getModel();
							model.setRowCount(0);
							JOptionPane.showMessageDialog(null, "Successfully Saved!");
							updateTable();
							
							txtLName.setText("");
				            txtLName.setText("");
				            txtFName.setText("");
				            txtMI.setText("");
				            comboBox_gsec.setSelectedIndex(0);
				            txtAdv.setText("");
				            comboBox_quarter.setSelectedIndex(0);
				            chckbxModules.setSelected(false);
				            chckbxLAS.setSelected(false);
				            chckbxWHLP.setSelected(false);
				            chckbxBooks.setSelected(false);
				            txtCName.setText("");
				            txtCRel.setText("");
				            
				            txtFName.requestFocus();
					
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
				}			
			}
			}
		});

		
		btnAdd.setBounds(280, 43, 130, 47);
		btnAdd.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				/**Main list = new Main();
				*list.frame.setVisible(true);
				frame.dispose();*/
				btnAdd.setBackground(new Color(204, 0, 0));
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				btnAdd.setBackground(new Color(204, 0, 0));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnAdd.setBackground(new Color(220, 20, 60));
			}
		});
		btnAdd.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnAdd.setFont(new Font("Lucida Console", Font.BOLD, 14));
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setBackground(new Color(220, 20, 60));
		panel_1.add(btnAdd);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtLName.setText("");
	            txtLName.setText("");
	            txtFName.setText("");
	            txtMI.setText("");
	            comboBox_gsec.setSelectedIndex(0);
	            txtAdv.setText("");
	            comboBox_quarter.setSelectedIndex(0);
	            chckbxModules.setSelected(false);
	            chckbxLAS.setSelected(false);
	            chckbxWHLP.setSelected(false);
	            chckbxBooks.setSelected(false);
	            txtCName.setText("");
	            txtCRel.setText("");
	            
	            txtFName.requestFocus();
			}
		});
		btnClear.setBounds(454, 43, 130, 47);
		
		btnClear.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			btnClear.setBackground(new Color(204, 0, 0));
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			btnClear.setBackground(new Color(204, 0, 0));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			btnClear.setBackground(new Color(220, 20, 60));
		}
	});
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Lucida Console", Font.BOLD, 14));
		btnClear.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnClear.setBackground(new Color(220, 20, 60));
		panel_1.add(btnClear);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setBounds(629, 43, 130, 47);
		btnUpdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnUpdate.setBackground(new Color(204, 0, 0));
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				btnUpdate.setBackground(new Color(204, 0, 0));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnUpdate.setBackground(new Color(220, 20, 60));
			}
		});
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tblRecords.getSelectedRow() == -1) {
					JOptionPane.showMessageDialog(null, "Please select a row to edit!");
				}
				else {
					try {
					int row = tblRecords.getSelectedRow();
					String value = tblRecords.getModel().getValueAt(row, 0).toString();
					String sql = "update drecord set lname=?, fname=?, mname=?, gsec=?, adviser=?, quarter=?, handout=?, cname=?, crel=? where stud_no =" +value;
					
						pst=conn.prepareStatement(sql);
						pst.setString(1, txtLName.getText());
						pst.setString(2, txtFName.getText());
						pst.setString(3, txtMI.getText());
						String gsec;
						gsec=comboBox_gsec.getSelectedItem().toString();
						pst.setString(4, gsec);
						pst.setString(5, txtAdv.getText());
						String quarter;
						quarter=comboBox_quarter.getSelectedItem().toString();
						pst.setString(6, quarter);
						String handout="";
						if(chckbxModules.isSelected()) {
							handout+=chckbxModules.getText()+" ";
						}
						if(chckbxLAS.isSelected()) {
							handout+=chckbxLAS.getText()+" ";
						}
						if(chckbxWHLP.isSelected()) {
							handout+=chckbxWHLP.getText()+" ";
						}
						if(chckbxBooks.isSelected()) {
							handout+=chckbxBooks.getText()+" ";
						}
						pst.setString(7, handout);
						pst.setString(8, txtCName.getText());
						pst.setString(9, txtCRel.getText());
						pst.executeUpdate();
						DefaultTableModel model = (DefaultTableModel)tblRecords.getModel();
						model.setRowCount(0);
						JOptionPane.showMessageDialog(null, "Successfully Updated!");
						updateTable();
						
						txtLName.setText("");
			            txtLName.setText("");
			            txtFName.setText("");
			            txtMI.setText("");
			            comboBox_gsec.setSelectedIndex(0);
			            txtAdv.setText("");
			            comboBox_quarter.setSelectedIndex(0);
			            chckbxModules.setSelected(false);
			            chckbxLAS.setSelected(false);
			            chckbxWHLP.setSelected(false);
			            chckbxBooks.setSelected(false);
			            txtCName.setText("");
			            txtCRel.setText("");
			            
			            txtFName.requestFocus();
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, e2);
					}
				}
			}
		});
		btnUpdate.setForeground(Color.WHITE);
		btnUpdate.setFont(new Font("Lucida Console", Font.BOLD, 14));
		btnUpdate.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnUpdate.setBackground(new Color(220, 20, 60));
		panel_1.add(btnUpdate);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(9, 43, 253, 46);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBackground(new Color(220, 20, 60));
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("SEARCH:");
		lblNewLabel_2.setBounds(12, 15, 95, 14);
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_2.setForeground(Color.WHITE);
		panel_2.add(lblNewLabel_2);
		
		txtSearch = new JTextField();
		txtSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtLName.setText("");
	            txtLName.setText("");
	            txtFName.setText("");
	            txtMI.setText("");
	            comboBox_gsec.setSelectedIndex(0);
	            txtAdv.setText("");
	            comboBox_quarter.setSelectedIndex(0);
	            chckbxModules.setSelected(false);
	            chckbxLAS.setSelected(false);
	            chckbxWHLP.setSelected(false);
	            chckbxBooks.setSelected(false);
	            txtCName.setText("");
	            txtCRel.setText("");
	            
	            txtSearch.requestFocus();
			}
		});
		txtSearch.setBounds(117, 14, 123, 20);
		txtSearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				DefaultTableModel table = (DefaultTableModel)tblRecords.getModel();
				String search = txtSearch.getText().toUpperCase();
				TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
				tblRecords.setRowSorter(tr);
				tr.setRowFilter(RowFilter.regexFilter(search));
				
				int position = txtSearch.getCaretPosition();
				txtSearch.setText(txtSearch.getText().toUpperCase());
				txtSearch.setCaretPosition(position);
			}
		});
		txtSearch.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.add(txtSearch);
		txtSearch.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane(tblRecords,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBounds(278, 101, 829, 429);
		scrollPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.add(scrollPane);
		
		tblRecords = new JTable();
		tblRecords.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = tblRecords.getSelectedRow();
				DefaultTableModel model = (DefaultTableModel)tblRecords.getModel();			
				txtLName.setText(model.getValueAt(i,1).toString());
				txtFName.setText(model.getValueAt(i,2).toString());
				txtMI.setText(model.getValueAt(i,3).toString());
				String gsec = model.getValueAt(i,4).toString();
					switch(gsec) {
					case "ALS-DIAMOND":
						comboBox_gsec.setSelectedIndex(1);
						break;
					case "ALS-RUBY":
						comboBox_gsec.setSelectedIndex(2);
						break;
					case "ALS-EMERALD":
						comboBox_gsec.setSelectedIndex(3);
						break;
					case "GRADE1-DIAMOND":
						comboBox_gsec.setSelectedIndex(4);
						break;
					case "GRADE1-RUBY":
						comboBox_gsec.setSelectedIndex(5);
						break;
					case "GRADE1-PEARL":
						comboBox_gsec.setSelectedIndex(6);
						break;
					case "GRADE1-TOPAZ" :
						comboBox_gsec.setSelectedIndex(7);
						break;
					case "GRADE1-PERIDOT":
						comboBox_gsec.setSelectedIndex(8);
						break;
					case  "GRADE1-EMERALD":
						comboBox_gsec.setSelectedIndex(9);
						break;
					case "GRADE1-GARNET":
						comboBox_gsec.setSelectedIndex(10);
						break;
					case  "GRADE1-OPAL":
						comboBox_gsec.setSelectedIndex(11);
						break;
					case "GRADE1-SAPPHIRE":
						comboBox_gsec.setSelectedIndex(12);
						break;
					case "GRADE2-PEARL":
						comboBox_gsec.setSelectedIndex(13);
						break;
					case  "GRADE2-GARNET":
						comboBox_gsec.setSelectedIndex(14);
						break;
					case  "GRADE2-RUBY":
						comboBox_gsec.setSelectedIndex(15);
						break;
					case  "GRADE2-OPAL":
						comboBox_gsec.setSelectedIndex(16);
						break;
					case  "GRADE2-TOPAZ":
						comboBox_gsec.setSelectedIndex(17);
						break;
					case  "GRADE2-SAPPHIRE":
						comboBox_gsec.setSelectedIndex(18);
						break;
					case  "GRADE2-PERIDOT":
						comboBox_gsec.setSelectedIndex(19);
						break;
					case  "GRADE2-EMERALD":
						comboBox_gsec.setSelectedIndex(20);
						break;
					case "GRADE3-PEARL":
						comboBox_gsec.setSelectedIndex(21);
						break;
					case "GRADE3-TOPAZ":
						comboBox_gsec.setSelectedIndex(22);
						break;
					case "GRADE3-GARNET":
						comboBox_gsec.setSelectedIndex(23);
						break;
					case "GRADE3-RUBY":
						comboBox_gsec.setSelectedIndex(24);
						break;
					case "GRADE3-JADE":
						comboBox_gsec.setSelectedIndex(25);
						break;
					case "GRADE3-EMERALD":
						comboBox_gsec.setSelectedIndex(26);
						break;
					case "GRADE3-SAPPHIRE":
						comboBox_gsec.setSelectedIndex(27);
						break;
					case "GRADE3-OPAL":
						comboBox_gsec.setSelectedIndex(28);
						break;
					case "GRADE3-ONYX":
						comboBox_gsec.setSelectedIndex(29);
						break;
					case "GRADE3-PERIDOT":
						comboBox_gsec.setSelectedIndex(30);
						break;
					case "GRADE4-PEARL":
						comboBox_gsec.setSelectedIndex(31);
						break;
					case "GRADE4-GARNET":
						comboBox_gsec.setSelectedIndex(32);
						break;
					case "GRADE4-ONYX":
						comboBox_gsec.setSelectedIndex(33);
						break;
					case "GRADE4-SAPPHIRE":
						comboBox_gsec.setSelectedIndex(34);
						break;
					case "GRADE4-RUBY":
						comboBox_gsec.setSelectedIndex(35);
						break;
					case "GRADE4-OPAL":
						comboBox_gsec.setSelectedIndex(36);
						break;
					case "GRADE4-EMERALD":
						comboBox_gsec.setSelectedIndex(37);
						break;
					case "GRADE4-PERIDOT":
						comboBox_gsec.setSelectedIndex(38);
						break;
					case "GRADE5-EMERALD":
						comboBox_gsec.setSelectedIndex(39);
						break;
					case "GRADE5-RUBY":
						comboBox_gsec.setSelectedIndex(40);
						break;
					case "GRADE5-OPAL":
						comboBox_gsec.setSelectedIndex(41);
						break;
					case "GRADE5-GARNET":
						comboBox_gsec.setSelectedIndex(42);
						break;
					case "GRADE5-TOPAZ":
						comboBox_gsec.setSelectedIndex(43);
						break;
					case "GRADE5-SAPPHIRE":
						comboBox_gsec.setSelectedIndex(44);
						break;
					case "GRADE5-ONYX":
						comboBox_gsec.setSelectedIndex(45);
						break;
					case "GRADE5-JADE":
						comboBox_gsec.setSelectedIndex(46);
						break;
					case "GRADE6-GARNET":
						comboBox_gsec.setSelectedIndex(47);
						break;
					case "GRADE6-RUBY":
						comboBox_gsec.setSelectedIndex(48);
						break;
					case  "GRADE6-JADE":
						comboBox_gsec.setSelectedIndex(49);
						break;
					case "GRADE6-EMERALD":
						comboBox_gsec.setSelectedIndex(50);
						break;
					case "GRADE6-OPAL":
						comboBox_gsec.setSelectedIndex(51);
						break;
					case "GRADE6-TOPAZ":
						comboBox_gsec.setSelectedIndex(52);
						break;
					case "GRADE6-ONYX":
						comboBox_gsec.setSelectedIndex(53);
						break;
					case "GRADE6-PERIDOT":
						comboBox_gsec.setSelectedIndex(54);
						break;
					case "KINDER-DIAMOND":
						comboBox_gsec.setSelectedIndex(55);
						break;
					case "KINDER-PEARL":
						comboBox_gsec.setSelectedIndex(56);
						break;
					case "KINDER-JADE":
						comboBox_gsec.setSelectedIndex(57);
						break;
					case "KINDER-RUBY":
						comboBox_gsec.setSelectedIndex(58);
						break;
					case "SPED-DIAMOND":
						comboBox_gsec.setSelectedIndex(59);
						break;
					case "SPED-PEARL":
						comboBox_gsec.setSelectedIndex(60);
						break;
					case "SPED-RUBY":
						comboBox_gsec.setSelectedIndex(61);
						break;
				}
				txtAdv.setText(model.getValueAt(i,5).toString());	
				String quarter = model.getValueAt(i,6).toString();
					switch(quarter) {
					case "FIRST":
						comboBox_quarter.setSelectedIndex(1);
						break;
					case "SECOND":
						comboBox_quarter.setSelectedIndex(2);
						break;
					case "THIRD":
						comboBox_quarter.setSelectedIndex(3);
						break;
					case "FOURTH":
						comboBox_quarter.setSelectedIndex(4);
						break;
					}
					
				String handout=model.getValueAt(i,7).toString();
					switch(handout) {
					case "MODULES ":
						chckbxModules.setSelected(true);
						chckbxLAS.setSelected(false);
						chckbxWHLP.setSelected(false);
						chckbxBooks.setSelected(false);
						break;
					case "LAS ":
						chckbxModules.setSelected(false);
						chckbxLAS.setSelected(true);
						chckbxWHLP.setSelected(false);
						chckbxBooks.setSelected(false);
						break;
					case "WHLP ":
						chckbxModules.setSelected(false);
						chckbxLAS.setSelected(false);
						chckbxWHLP.setSelected(true);
						chckbxBooks.setSelected(false);
						break;
					case "BOOKS ":
						chckbxModules.setSelected(false);
						chckbxLAS.setSelected(false);
						chckbxWHLP.setSelected(false);
						chckbxBooks.setSelected(true);
						break;
					case "MODULES " + "LAS ":
						chckbxModules.setSelected(true);
						chckbxLAS.setSelected(true);
						chckbxWHLP.setSelected(false);
						chckbxBooks.setSelected(false);
						break;
					case "MODULES " + "WHLP ":
						chckbxModules.setSelected(true);
						chckbxLAS.setSelected(false);
						chckbxWHLP.setSelected(true);
						chckbxBooks.setSelected(false);
						break;
					case "MODULES " + "BOOKS ":
						chckbxModules.setSelected(true);
						chckbxLAS.setSelected(false);
						chckbxWHLP.setSelected(false);
						chckbxBooks.setSelected(true);
						break;
					case "LAS " + "WHLP ":
						chckbxModules.setSelected(false);
						chckbxLAS.setSelected(true);
						chckbxWHLP.setSelected(true);
						chckbxBooks.setSelected(false);
						break;
					case "LAS " + "MODULES ":
						chckbxModules.setSelected(true);
						chckbxLAS.setSelected(true);
						chckbxWHLP.setSelected(false);
						chckbxBooks.setSelected(false);
						break;
					case "LAS " + "BOOKS ":
						chckbxModules.setSelected(false);
						chckbxLAS.setSelected(true);
						chckbxWHLP.setSelected(false);
						chckbxBooks.setSelected(true);
						break;
					case "WHLP " + "BOOKS ":
						chckbxModules.setSelected(false);
						chckbxLAS.setSelected(false);
						chckbxWHLP.setSelected(true);
						chckbxBooks.setSelected(true);
						break;
					case "WHLP " + "LAS ":
						chckbxModules.setSelected(false);
						chckbxLAS.setSelected(true);
						chckbxWHLP.setSelected(true);
						chckbxBooks.setSelected(false);
						break;
					case "WHLP " + "MODULES ":
						chckbxModules.setSelected(true);
						chckbxLAS.setSelected(false);
						chckbxWHLP.setSelected(true);
						chckbxBooks.setSelected(false);
						break;
					case "Books " + "LAS ":
						chckbxModules.setSelected(false);
						chckbxLAS.setSelected(true);
						chckbxWHLP.setSelected(false);
						chckbxBooks.setSelected(true);
						break;
					case "BOOKS " + "WHLP ":
						chckbxModules.setSelected(false);
						chckbxLAS.setSelected(false);
						chckbxWHLP.setSelected(true);
						chckbxBooks.setSelected(true);
						break;
					case "BOOKS " + "MODULES ":
						chckbxModules.setSelected(true);
						chckbxLAS.setSelected(false);
						chckbxWHLP.setSelected(false);
						chckbxBooks.setSelected(true);
						break;
					case "BOOKS " + "MODULES " + "LAS ":
						chckbxModules.setSelected(true);
						chckbxLAS.setSelected(true);
						chckbxWHLP.setSelected(false);
						chckbxBooks.setSelected(true);
						break;
					case "BOOKS " + "MODULES " + "WHLP ":
						chckbxModules.setSelected(true);
						chckbxLAS.setSelected(false);
						chckbxWHLP.setSelected(true);
						chckbxBooks.setSelected(true);
						break;
					case "LAS " + "MODULES " + "WHLP":
						chckbxModules.setSelected(true);
						chckbxLAS.setSelected(true);
						chckbxWHLP.setSelected(false);
						chckbxBooks.setSelected(false);
						break;
					default:
						chckbxModules.setSelected(true);
						chckbxLAS.setSelected(true);
						chckbxWHLP.setSelected(true);
						chckbxBooks.setSelected(true);
						break;
					}
			
					txtCName.setText(model.getValueAt(i,8).toString());
					txtCRel.setText(model.getValueAt(i,9).toString());
			}
		});
		tblRecords.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane.setViewportView(tblRecords);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnDelete.setBackground(new Color(204, 0, 0));
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				btnDelete.setBackground(new Color(204, 0, 0));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnDelete.setBackground(new Color(220, 20, 60));
			}
		});
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tblRecords.getSelectedRow() == -1) {
					JOptionPane.showMessageDialog(null, "Please select a row to delete!");
				}
				else {
					int row = tblRecords.getSelectedRow();
					String cell = tblRecords.getModel().getValueAt(row, 0).toString();
					String sql = "delete from drecord where stud_no =" +cell;
					try {
						pst=conn.prepareStatement(sql);
						pst.execute();
						DefaultTableModel model = (DefaultTableModel)tblRecords.getModel();
						model.setRowCount(0);
						JOptionPane.showMessageDialog(null, "Successfully Deleted!");
						updateTable();
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, e);
					}
				}
			}
		});
		btnDelete.setBounds(803, 43, 130, 47);
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Lucida Console", Font.BOLD, 14));
		btnDelete.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnDelete.setBackground(new Color(220, 20, 60));
		panel_1.add(btnDelete);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					JasperDesign jdesign = JRXmlLoader.load("C:\\Users\\frask\\eclipse-workspace\\MyProjects\\src\\INSY55\\DRecords.jrxml");
					String query = "Select stud_no,lname,fname,mname,gsec,quarter,handout,cname,crel,date from drecord";					
					
					JRDesignQuery updateQuery = new JRDesignQuery();
					updateQuery.setText(query);
					
					jdesign.setQuery(updateQuery);
					
					JasperReport jreport = JasperCompileManager.compileReport(jdesign);
					JasperPrint jprint = JasperFillManager.fillReport(jreport, null,conn);
					
					JasperViewer.viewReport(jprint);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, e1);
				}
				
				/*MessageFormat header = new MessageFormat("DISTRIBUTION OF MODULES, LAS, WHLP and BOOKS (Hard Copy)");
				try {
					tblRecords.print(JTable.PrintMode.NORMAL, header, null);
				} catch (Exception e3) {
					JOptionPane.showMessageDialog(null, e3);
				}*/
				
			}
		});
		btnPrint.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnPrint.setBackground(new Color(204, 0, 0));
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				btnPrint.setBackground(new Color(204, 0, 0));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnPrint.setBackground(new Color(220, 20, 60));
			}
		});
		btnPrint.setBounds(977, 43, 130, 46);
		btnPrint.setForeground(Color.WHITE);
		btnPrint.setFont(new Font("Lucida Console", Font.BOLD, 14));
		btnPrint.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnPrint.setBackground(new Color(220, 20, 60));
		panel_1.add(btnPrint);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(1, 1, 269, 541);
		panel_5.setBackground(Color.BLACK);
		panel_1.add(panel_5);
		
		JLabel lblNewLabel = new JLabel("RECORD");
		lblNewLabel.setBounds(16, 83, 103, 30);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\frask\\eclipse-workspace\\MyProjects\\src\\INSY55\\Images\\record.png"));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel.add(lblNewLabel);
		
		JLabel lblList = new JLabel("LIST");
		lblList.setBounds(16, 42, 89, 30);
		lblList.setIcon(new ImageIcon("C:\\Users\\frask\\eclipse-workspace\\MyProjects\\src\\INSY55\\Images\\list.png"));
		lblList.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				Main list = new Main();
				list.frame.setVisible(true);
				frame.dispose();
				lblList.setForeground(Color.BLACK);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				lblList.setForeground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblList.setForeground(Color.WHITE);
			}
		});
		lblList.setForeground(Color.WHITE);
		lblList.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel.add(lblList);
		
		JLabel lblLogout = new JLabel("LOGOUT");
		lblLogout.setBounds(16, 165, 101, 30);
		
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
		lblLogout.setFont(new Font("Tahoma", Font.BOLD, 17));
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
		lblSettings.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblSettings.setBounds(16, 124, 142, 30);
		panel.add(lblSettings);
	}
}
