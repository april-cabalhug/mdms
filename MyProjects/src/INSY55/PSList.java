package INSY55;

import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.SystemColor;
import java.awt.Window;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class PSList {

	JFrame frame;
	private JTextField txtLRN;
	private JTextField txtSearch;
	private JTable tblPList;
	private JTextField txtLName;
	private JTextField txtMI;
	private JTextField txtFName;
	@SuppressWarnings("rawtypes")
	JComboBox comboBox_gsec;

	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	DefaultTableModel model = new DefaultTableModel();
	protected Window lblChange;
	protected Window lblChangeUsername;
	protected Window lblChangePassword;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PSList window = new PSList();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

		/**
		 * @wbp.parser.entryPoint
		 */
		public PSList() {
		initialize();
		
		Object col[] = {"No.","LRN","Last Name","First Name","M.I.","Grade & Section"};
		model.setColumnIdentifiers(col);
		tblPList.setModel(model);
				
		conn = mdms_con.ConnectDB();
		updateTable();
	}
	
	public void updateTable()
	{
		conn = mdms_con.ConnectDB();
		if (conn != null)
		{
			String sql="Select pstud_no,lrn,lname,fname,mname,gsec from plist";
		
		try
		{
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			Object[] columnData = new Object[6];
			
			while(rs.next())
			{
				columnData[0] = rs.getString("pstud_no");
				columnData[1] = rs.getString("lrn");
				columnData[2] = rs.getString("lname");
				columnData[3] = rs.getString("fname");
				columnData[4] = rs.getString("mname");
				columnData[5] = rs.getString("gsec");
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
		frame.setBounds(100, 100, 1007, 590);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(204, 0, 0), 5));
		panel.setBackground(new Color(220, 20, 60));
		panel.setBounds(-1, 0, 1007, 589);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(133, 38, 870, 547);
		panel.add(panel_1);
		
		JLabel lblNewLabel_3 = new JLabel("PRINTED STUDENTS");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(new Color(220, 20, 60));
		lblNewLabel_3.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 20));
		lblNewLabel_3.setBounds(285, 10, 584, 36);
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		scrollPane.setBounds(294, 52, 566, 484);
		panel_1.add(scrollPane);
		
		tblPList = new JTable();
		tblPList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = tblPList.getSelectedRow();
				DefaultTableModel model = (DefaultTableModel)tblPList.getModel();
				txtLRN.setText(model.getValueAt(i,1).toString());
				txtLName.setText(model.getValueAt(i,2).toString());
				txtFName.setText(model.getValueAt(i,3).toString());
				txtMI.setText(model.getValueAt(i,4).toString());
				String gsec = model.getValueAt(i,5).toString();
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
					case  "GRADE1-GARNET":
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
			}
		});
		tblPList.setFont(new Font("Tahoma", Font.PLAIN, 12));
		scrollPane.setViewportView(tblPList);
		tblPList.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tblPList.setBackground(SystemColor.menu);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.BLACK);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_4.setBounds(1, 1, 283, 545);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 11, 263, 43);
		panel_4.add(panel_3);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(220, 20, 60));
		
		JLabel lblSearch = new JLabel("SEARCH:");
		lblSearch.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSearch.setBounds(11, 13, 59, 14);
		panel_3.add(lblSearch);
		
		txtSearch = new JTextField();
		txtSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtLRN.setText("");
				txtLName.setText("");
	            txtLName.setText("");
	            txtFName.setText("");
	            txtMI.setText("");
	            comboBox_gsec.setSelectedIndex(0);
	            
	            txtSearch.requestFocus();
			}
		});
		txtSearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				DefaultTableModel table = (DefaultTableModel)tblPList.getModel();
				String search = txtSearch.getText().toUpperCase();
				TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
				tblPList.setRowSorter(tr);
				tr.setRowFilter(RowFilter.regexFilter(search));
				
				int position = txtSearch.getCaretPosition();
				txtSearch.setText(txtSearch.getText().toUpperCase());
				txtSearch.setCaretPosition(position);
			}
		});
		txtSearch.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtSearch.setColumns(10);
		txtSearch.setBounds(86, 11, 167, 22);
		panel_3.add(txtSearch);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.setBounds(10, 350, 263, 33);
		panel_4.add(btnAdd);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtLRN.getText().equals("") || txtFName.getText().equals("") || txtLName.getText().equals("") || comboBox_gsec.getSelectedItem().toString().equals(null))
				{
					JOptionPane.showMessageDialog(null, "Please fill in all required fields!");
				}
				else if(txtMI.getText().equals("")) {
					String sql=	"insert into plist (lrn,lname,fname,mname,gsec)values(?,?,?,?,?)";
					try {
							pst = conn.prepareStatement(sql);
							pst.setString(1, txtLRN.getText());
							pst.setString(2, txtLName.getText());
							pst.setString(3, txtFName.getText());
							pst.setString(4, txtMI.getText()+" ");
							pst.setString(5, comboBox_gsec.getSelectedItem().toString());
							pst.executeUpdate();
							DefaultTableModel model = (DefaultTableModel)tblPList.getModel();
							model.setRowCount(0);
							JOptionPane.showMessageDialog(null, "Successfully Saved!");
							updateTable();
							
							
							txtLRN.setText("");
				            txtLName.setText("");
				            txtFName.setText("");
				            txtMI.setText("");
				            comboBox_gsec.setSelectedIndex(0);
				            
				            txtLRN.requestFocus();
							
						}catch(Exception e1) {
							JOptionPane.showMessageDialog(null, e1);
						}			
				}
				else{
						String sql=	"insert into plist (lrn,lname,fname,mname,gsec)values(?,?,?,?,?)";
						try {
								pst = conn.prepareStatement(sql);
								pst.setString(1, txtLRN.getText());
								pst.setString(2, txtLName.getText());
								pst.setString(3, txtFName.getText());
								pst.setString(4, txtMI.getText());
								pst.setString(5, comboBox_gsec.getSelectedItem().toString());
								pst.executeUpdate();
								DefaultTableModel model = (DefaultTableModel)tblPList.getModel();
								model.setRowCount(0);
								JOptionPane.showMessageDialog(null, "Successfully Saved!");
								updateTable();
								
								txtLRN.setText("");
					            txtLName.setText("");
					            txtFName.setText("");
					            txtMI.setText("");
					            comboBox_gsec.setSelectedIndex(0);
					            
					            txtLRN.requestFocus();
						
					}catch(Exception e1) {
						JOptionPane.showMessageDialog(null, e1);
					}			
				}
				}
			});
		btnAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
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
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setFont(new Font("Lucida Console", Font.BOLD, 14));
		btnAdd.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnAdd.setBackground(new Color(220, 20, 60));
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtLRN.setText("");
	            txtLName.setText("");
	            txtFName.setText("");
	            txtMI.setText("");
	            comboBox_gsec.setSelectedIndex(0);
	            
	            txtLRN.requestFocus();
			}
		});
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
		btnClear.setBounds(10, 394, 263, 33);
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Lucida Console", Font.BOLD, 14));
		btnClear.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnClear.setBackground(new Color(220, 20, 60));
		panel_4.add(btnClear);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setBounds(10, 438, 263, 33);
		panel_4.add(btnUpdate);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tblPList.getSelectedRow() == -1) {
					JOptionPane.showMessageDialog(null, "Please select a row to edit!");
				}
				else {
					try {
					int row = tblPList.getSelectedRow();
					String value = tblPList.getModel().getValueAt(row, 0).toString();
					String sql = "update plist set lrn=?, lname=?, fname=?, mname=?, gsec=? where pstud_no =" +value;
					
						pst=conn.prepareStatement(sql);
						pst.setString(1, txtLRN.getText());
						pst.setString(2, txtLName.getText());
						pst.setString(3, txtFName.getText());
						pst.setString(4, txtMI.getText());
						String gsec;
						gsec=comboBox_gsec.getSelectedItem().toString();
						pst.setString(5, gsec);
						pst.executeUpdate();
						DefaultTableModel model = (DefaultTableModel)tblPList.getModel();
						model.setRowCount(0);
						JOptionPane.showMessageDialog(null, "Successfully Updated!");
						updateTable();
						
						txtLRN.setText("");
						txtLName.setText("");
			            txtLName.setText("");
			            txtFName.setText("");
			            txtMI.setText("");
			            comboBox_gsec.setSelectedIndex(0);
			            
			            txtLRN.requestFocus();
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, e2);
					}
				}
			}
		});
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
		btnUpdate.setForeground(Color.WHITE);
		btnUpdate.setFont(new Font("Lucida Console", Font.BOLD, 14));
		btnUpdate.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnUpdate.setBackground(new Color(220, 20, 60));
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setBounds(10, 485, 263, 33);
		panel_4.add(btnDelete);
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
				if(tblPList.getSelectedRow() == -1) {
					JOptionPane.showMessageDialog(null, "Please select a row to delete!");
				}
				else {
					int row = tblPList.getSelectedRow();
					String cell = tblPList.getModel().getValueAt(row, 0).toString();
					String sql = "delete from plist where pstud_no =" +cell;
					try {
						pst=conn.prepareStatement(sql);
						pst.execute();
						DefaultTableModel model = (DefaultTableModel)tblPList.getModel();
						model.setRowCount(0);
						JOptionPane.showMessageDialog(null, "Successfully Deleted!");
						updateTable();
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, e);
					}
				}
			}
		});
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Lucida Console", Font.BOLD, 14));
		btnDelete.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnDelete.setBackground(new Color(220, 20, 60));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setBounds(10, 86, 263, 223);
		panel_4.add(panel_2);
		panel_2.setLayout(null);
		
		txtMI = new JTextField();
		txtMI.setBounds(117, 129, 136, 22);
		panel_2.add(txtMI);
		txtMI.setForeground(Color.BLACK);
		txtMI.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				int position = txtMI.getCaretPosition();
				txtMI.setText(txtMI.getText().toUpperCase());
				txtMI.setCaretPosition(position);
			}
		});
		txtMI.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtMI.setColumns(10);
		
		txtLName = new JTextField();
		txtLName.setBounds(117, 100, 136, 22);
		panel_2.add(txtLName);
		txtLName.setForeground(Color.BLACK);
		txtLName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				int position = txtLName.getCaretPosition();
				txtLName.setText(txtLName.getText().toUpperCase());
				txtLName.setCaretPosition(position);
			}
		});
		txtLName.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtLName.setColumns(10);
		
		txtFName = new JTextField();
		txtFName.setBounds(117, 71, 136, 22);
		panel_2.add(txtFName);
		txtFName.setForeground(Color.BLACK);
		txtFName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				int position = txtFName.getCaretPosition();
				txtFName.setText(txtFName.getText().toUpperCase());
				txtFName.setCaretPosition(position);
			}
		});
		txtFName.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtFName.setColumns(10);
		
		txtLRN = new JTextField();
		txtLRN.setBounds(118, 38, 136, 22);
		panel_2.add(txtLRN);
		txtLRN.setForeground(Color.BLACK);
		txtLRN.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				int position = txtLRN.getCaretPosition();
				txtLRN.setText(txtLRN.getText().toUpperCase());
				txtLRN.setCaretPosition(position);
			}
		});
		txtLRN.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtLRN.setColumns(10);
		
		JLabel lblLrn = new JLabel("LRN:");
		lblLrn.setBounds(10, 40, 41, 14);
		panel_2.add(lblLrn);
		lblLrn.setForeground(Color.BLACK);
		lblLrn.setFont(new Font("Arial Narrow", Font.BOLD, 13));
		
		JLabel lblNewLabel = new JLabel("FIRST NAME:");
		lblNewLabel.setBounds(11, 75, 77, 14);
		panel_2.add(lblNewLabel);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Arial Narrow", Font.BOLD, 13));
		
		JLabel lblLastName = new JLabel("LAST NAME:");
		lblLastName.setBounds(10, 105, 77, 14);
		panel_2.add(lblLastName);
		lblLastName.setForeground(Color.BLACK);
		lblLastName.setFont(new Font("Arial Narrow", Font.BOLD, 13));
		
		JLabel lblMi = new JLabel("M.I.:");
		lblMi.setBounds(10, 134, 35, 14);
		panel_2.add(lblMi);
		lblMi.setForeground(Color.BLACK);
		lblMi.setFont(new Font("Arial Narrow", Font.BOLD, 13));
		
		JLabel lblGrade = new JLabel("GRADE & SECTION:");
		lblGrade.setBounds(10, 164, 105, 14);
		panel_2.add(lblGrade);
		lblGrade.setForeground(Color.BLACK);
		lblGrade.setFont(new Font("Arial Narrow", Font.BOLD, 13));
		
		comboBox_gsec = new JComboBox();
		comboBox_gsec.setModel(new DefaultComboBoxModel(new String[] {"-SELECT-", "ALS-DIAMOND", "ALS-RUBY", "ALS-EMERALD", "GRADE1-DIAMOND", "GRADE1-RUBY", "GRADE1-PEARL ", "GRADE1-TOPAZ ", "GRADE1-PERIDOT", "GRADE1-EMERALD", "GRADE1-GARNET", "GRADE1-OPAL ", "GRADE1-SAPPHIRE", "GRADE2-PEARL", "GRADE2-GARNET", "GRADE2-RUBY", "GRADE2-OPAL", "GRADE2-TOPAZ", "GRADE2-SAPPHIRE", "GRADE2-PERIDOT", "GRADE2-EMERALD", "GRADE3-PEARL", "GRADE3-TOPAZ", "GRADE3-GARNET", "GRADE3-RUBY", "GRADE3-JADE", "GRADE3-EMERALD", "GRADE3-SAPPHIRE", "GRADE3-OPAL", "GRADE3-ONYX", "GRADE3-PERIDOT", "GRADE4-PEARL", "GRADE4-GARNET", "GRADE4-ONYX", "GRADE4-SAPPHIRE", "GRADE4-RUBY", "GRADE4-OPAL", "GRADE4-EMERALD", "GRADE4-PERIDOT", "GRADE5-EMERALD", "GRADE5-RUBY", "GRADE5-OPAL", "GRADE5-GARNET", "GRADE5-TOPAZ", "GRADE5-SAPPHIRE", "GRADE5-ONYX", "GRADE5-JADE", "GRADE6-GARNET", "GRADE6-RUBY", "GRADE6-JADE", "GRADE6-EMERALD", "GRADE6-OPAL", "GRADE6-TOPAZ", "GRADE6-ONYX", "GRADE6-PERIDOT", "KINDER-DIAMOND", "KINDER-PEARL", "KINDER-JADE", "KINDER-RUBY", "SPED-DIAMOND", "SPED-PEARL", "SPED-RUBY"}));
		comboBox_gsec.setBounds(117, 161, 136, 22);
		comboBox_gsec.setSelectedIndex(0);
		panel_2.add(comboBox_gsec);
		
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
		lblRecord.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblRecord.setBounds(15, 79, 109, 30);
		panel.add(lblRecord);
		
		JLabel lblList = new JLabel("LIST");
		lblList.setIcon(new ImageIcon("C:\\Users\\frask\\eclipse-workspace\\MyProjects\\src\\INSY55\\Images\\list.png"));
		lblList.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				Main list = new Main();
				list.frame.setVisible(true);
				frame.dispose();
				lblList.setForeground(Color.BLACK);
			}
		});
		lblList.setForeground(Color.BLACK);
		lblList.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblList.setBounds(15, 38, 95, 30);
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
		lblLogout.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblLogout.setBounds(15, 161, 99, 35);
		panel.add(lblLogout);
		
		JLabel lblExit = new JLabel("X");
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
		lblExit.setBounds(946, 6, 56, 30);
		panel.add(lblExit);
		
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
		lblSettings.setBounds(15, 120, 142, 30);
		panel.add(lblSettings);
	}
}
