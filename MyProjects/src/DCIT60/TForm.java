package DCIT60;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import com.toedter.calendar.JYearChooser;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import java.awt.Component;
import javax.swing.ScrollPaneConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.SystemColor;

public class TForm {

	private JFrame frmBesProfile;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_17;
	private JTextField textField_37;
	private JTextField textField_6;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_16;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_18;
	private JTextField textField_85;
	private JTextField textField_86;
	private JTextField textField_87;
	private JTextField textField_88;
	private JTextField textField_89;
	private JTextField textField_90;
	private JTextField textField_91;
	private JTextField textField_92;
	private JTextField textField_93;
	private JTextField textField_94;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_76;
	private JTextField textField_77;
	private JTextField textField_78;
	private JTextField textField_79;
	private JTextField textField_80;
	private JTextField textField_81;
	private JTextField textField_82;
	private JTextField textField_83;
	private JTextField textField_84;
	private JTextField textField_95;
	private JTextField textField_96;
	private JTextField textField_97;
	private JTextField textField_98;
	private JTextField textField_99;
	private JTextField textField_100;
	private JTextField textField_101;
	private JTextField textField_102;
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
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_103;
	private JTextField textField_104;
	private JTextField textField_105;
	private JTextField textField_106;
	private JTextField textField_107;
	private JTextField textField_108;
	private JTextField textField_109;
	private JTextField textField_110;
	private JTextField textField_111;
	private JTextField textField_112;
	private JTextField textField_113;
	private JTextField textField_114;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;
	private JTextField textField_64;
	private JTextField textField_65;
	private JTextField textField_66;
	private JTextField textField_67;
	private JTextField textField_68;
	private JTextField textField_69;
	private JTextField textField_70;
	private JTextField textField_71;
	private JTextField textField_72;
	private JTextField textField_73;
	private JTextField textField_74;
	private JTextField textField_75;
	private JTextField textField_115;
	private JTextField textField_116;
	private JTextField textField_117;
	private JTextField textField_118;
	private JTextField textField_119;
	private JTextField textField_120;
	private JTextField textField_121;
	private JTextField textField_122;
	private JTextField textField_123;
	private JTextField textField_124;
	private JTextField textField_125;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TForm window = new TForm();
					window.frmBesProfile.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBesProfile = new JFrame();
		frmBesProfile.setTitle("BES Student Profile");
		frmBesProfile.getContentPane().setBackground(new Color(220,20,60));
		frmBesProfile.setBounds(100, 100, 1366, 768);
		frmBesProfile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBesProfile.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 1340, 718);
		frmBesProfile.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Grade1-6", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new TitledBorder(new LineBorder(new Color(178, 34, 34)), "G1-6 STUDENT PROFILE", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_9.setBounds(10, 12, 1315, 667);
		panel.add(panel_9);
		panel_9.setLayout(null);
		
		JLabel lblSchoolYear = new JLabel("School Year:");
		lblSchoolYear.setBounds(10, 32, 73, 14);
		lblSchoolYear.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		panel_9.add(lblSchoolYear);
		
		JLabel lblMi_1 = new JLabel("-");
		lblMi_1.setBounds(253, 32, 15, 14);
		lblMi_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMi_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		panel_9.add(lblMi_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("No LRN");
		rdbtnNewRadioButton.setBounds(10, 53, 73, 23);
		rdbtnNewRadioButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		panel_9.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnWithLrn = new JRadioButton("With LRN");
		rdbtnWithLrn.setBounds(132, 53, 84, 23);
		rdbtnWithLrn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		panel_9.add(rdbtnWithLrn);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Returning (Balik-Aral)");
		rdbtnNewRadioButton_2.setBounds(253, 53, 151, 23);
		rdbtnNewRadioButton_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		panel_9.add(rdbtnNewRadioButton_2);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "STUDENT INFORMATION", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_11.setBounds(10, 98, 394, 411);
		panel_9.add(panel_11);
		panel_11.setLayout(null);
		
		JLabel lblPsaBirthCertificate = new JLabel("PSA Birth Certificate No.:");
		lblPsaBirthCertificate.setBounds(10, 25, 151, 14);
		panel_11.add(lblPsaBirthCertificate);
		lblPsaBirthCertificate.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		
		JLabel lblLrn = new JLabel("LRN:");
		lblLrn.setBounds(10, 50, 38, 14);
		panel_11.add(lblLrn);
		lblLrn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(10, 75, 73, 14);
		panel_11.add(lblFirstName);
		lblFirstName.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(10, 100, 73, 14);
		panel_11.add(lblLastName);
		lblLastName.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		
		JLabel lblMi_3_1 = new JLabel("Middle Name:");
		lblMi_3_1.setBounds(10, 125, 88, 14);
		panel_11.add(lblMi_3_1);
		lblMi_3_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		
		JLabel lblExtensionName_2_1 = new JLabel("Extension Name:");
		lblExtensionName_2_1.setBounds(10, 150, 103, 14);
		panel_11.add(lblExtensionName_2_1);
		lblExtensionName_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		
		textField = new JTextField();
		textField.setBounds(170, 23, 214, 20);
		panel_11.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(170, 48, 214, 20);
		panel_11.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(170, 73, 214, 20);
		panel_11.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(170, 98, 214, 20);
		panel_11.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(170, 123, 214, 20);
		panel_11.add(textField_4);
		textField_4.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(170, 148, 214, 20);
		panel_11.add(textField_17);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(170, 176, 214, 20);
		panel_11.add(dateChooser);
		
		JLabel lblDob = new JLabel("Date of Birth:");
		lblDob.setBounds(10, 180, 88, 14);
		panel_11.add(lblDob);
		lblDob.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		
		JLabel lblDob_1 = new JLabel("Sex:");
		lblDob_1.setBounds(10, 214, 34, 14);
		panel_11.add(lblDob_1);
		lblDob_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(170, 206, 214, 22);
		panel_11.add(comboBox);
		
		JLabel lblDob_1_1 = new JLabel("Age:");
		lblDob_1_1.setBounds(10, 239, 34, 14);
		panel_11.add(lblDob_1_1);
		lblDob_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		
		JLabel lblBelongingToAny = new JLabel("Belonging to any Indigenous People (IP)");
		lblBelongingToAny.setBounds(10, 289, 194, 14);
		panel_11.add(lblBelongingToAny);
		lblBelongingToAny.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		
		JLabel lblCommunityIndigenousCultural = new JLabel("Community Indigenous Cultural Community?");
		lblCommunityIndigenousCultural.setBounds(10, 314, 207, 14);
		panel_11.add(lblCommunityIndigenousCultural);
		lblCommunityIndigenousCultural.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("YES");
		chckbxNewCheckBox.setBounds(267, 285, 52, 43);
		panel_11.add(chckbxNewCheckBox);
		
		JLabel lblIfYesPlease = new JLabel("if Yes, please specify");
		lblIfYesPlease.setBounds(10, 339, 103, 14);
		panel_11.add(lblIfYesPlease);
		lblIfYesPlease.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		
		JCheckBox chckbxNo = new JCheckBox("NO");
		chckbxNo.setBounds(341, 285, 43, 43);
		panel_11.add(chckbxNo);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(170, 337, 214, 20);
		panel_11.add(textField_37);
		
		JLabel lblMotherTongue = new JLabel("Mother Tongue:");
		lblMotherTongue.setBounds(10, 366, 96, 14);
		panel_11.add(lblMotherTongue);
		lblMotherTongue.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(170, 364, 214, 20);
		panel_11.add(textField_6);
		
		JLabel lblDob_1_1_4 = new JLabel("Religion:");
		lblDob_1_1_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblDob_1_1_4.setBounds(10, 264, 64, 14);
		panel_11.add(lblDob_1_1_4);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(170, 262, 214, 20);
		panel_11.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(170, 237, 214, 20);
		panel_11.add(textField_15);
		
		JPanel panel_12 = new JPanel();
		panel_12.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_12.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "ADDRESS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_12.setBounds(10, 520, 813, 136);
		panel_9.add(panel_12);
		panel_12.setLayout(null);
		
		JLabel lblHouseNumberAnd = new JLabel("House Number and Street");
		lblHouseNumberAnd.setBounds(10, 22, 161, 14);
		panel_12.add(lblHouseNumberAnd);
		lblHouseNumberAnd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(299, 20, 504, 20);
		panel_12.add(textField_5);
		
		JLabel lblBarangay = new JLabel("Barangay");
		lblBarangay.setBounds(10, 47, 130, 14);
		panel_12.add(lblBarangay);
		lblBarangay.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		
		JLabel lblCityMunicipalityprovincecountry = new JLabel("City Municipality/Province/Country");
		lblCityMunicipalityprovincecountry.setBounds(10, 72, 214, 14);
		panel_12.add(lblCityMunicipalityprovincecountry);
		lblCityMunicipalityprovincecountry.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		
		JLabel lblZipCode = new JLabel("Zip Code");
		lblZipCode.setBounds(10, 97, 130, 14);
		panel_12.add(lblZipCode);
		lblZipCode.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(299, 45, 504, 20);
		panel_12.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(299, 70, 504, 20);
		panel_12.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(299, 95, 504, 20);
		panel_12.add(textField_13);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "PARENT'S/GUARDIAN'S INFORMATION", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_13.setBounds(414, 98, 409, 411);
		panel_9.add(panel_13);
		panel_13.setLayout(null);
		
		JLabel lblFathersName = new JLabel("Father's Name");
		lblFathersName.setBounds(10, 38, 96, 14);
		panel_13.add(lblFathersName);
		lblFathersName.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		
		JLabel lblFathersName_1 = new JLabel("Mother's Maiden Name");
		lblFathersName_1.setBounds(10, 138, 140, 14);
		panel_13.add(lblFathersName_1);
		lblFathersName_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		
		JLabel lblGuardiansName = new JLabel("Guardian's Name");
		lblGuardiansName.setBounds(10, 238, 117, 14);
		panel_13.add(lblGuardiansName);
		lblGuardiansName.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		
		JLabel lblTelephoneNumber = new JLabel("Telephone Number:");
		lblTelephoneNumber.setBounds(10, 338, 130, 14);
		panel_13.add(lblTelephoneNumber);
		lblTelephoneNumber.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		
		JLabel lblCellphoneNumber = new JLabel("Cellphone Number:");
		lblCellphoneNumber.setBounds(10, 363, 130, 14);
		panel_13.add(lblCellphoneNumber);
		lblCellphoneNumber.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(185, 57, 214, 20);
		panel_13.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(185, 82, 214, 20);
		panel_13.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(185, 107, 214, 20);
		panel_13.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(185, 338, 214, 20);
		panel_13.add(textField_10);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(185, 363, 214, 20);
		panel_13.add(textField_16);
		
		JLabel lblMiddleName = new JLabel("Middle Name:");
		lblMiddleName.setFont(new Font("Arial", Font.PLAIN, 13));
		lblMiddleName.setBounds(10, 313, 103, 14);
		panel_13.add(lblMiddleName);
		
		JLabel lblFirstName_4 = new JLabel("First Name:");
		lblFirstName_4.setFont(new Font("Arial", Font.PLAIN, 13));
		lblFirstName_4.setBounds(10, 288, 103, 14);
		panel_13.add(lblFirstName_4);
		
		JLabel lblLastName_4 = new JLabel("Last Name:");
		lblLastName_4.setFont(new Font("Arial", Font.PLAIN, 13));
		lblLastName_4.setBounds(10, 263, 103, 14);
		panel_13.add(lblLastName_4);
		
		JLabel lblLastName_4_1 = new JLabel("Last Name:");
		lblLastName_4_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblLastName_4_1.setBounds(10, 163, 103, 14);
		panel_13.add(lblLastName_4_1);
		
		JLabel lblFirstName_4_1 = new JLabel("First Name:");
		lblFirstName_4_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblFirstName_4_1.setBounds(10, 188, 103, 14);
		panel_13.add(lblFirstName_4_1);
		
		JLabel lblMiddleName_1 = new JLabel("Middle Name:");
		lblMiddleName_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblMiddleName_1.setBounds(10, 213, 103, 14);
		panel_13.add(lblMiddleName_1);
		
		JLabel lblLastName_4_2 = new JLabel("Last Name:");
		lblLastName_4_2.setFont(new Font("Arial", Font.PLAIN, 13));
		lblLastName_4_2.setBounds(10, 63, 103, 14);
		panel_13.add(lblLastName_4_2);
		
		JLabel lblFirstName_4_2 = new JLabel("First Name:");
		lblFirstName_4_2.setFont(new Font("Arial", Font.PLAIN, 13));
		lblFirstName_4_2.setBounds(10, 88, 103, 14);
		panel_13.add(lblFirstName_4_2);
		
		JLabel lblMiddleName_2 = new JLabel("Middle Name:");
		lblMiddleName_2.setFont(new Font("Arial", Font.PLAIN, 13));
		lblMiddleName_2.setBounds(10, 113, 103, 14);
		panel_13.add(lblMiddleName_2);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(185, 157, 214, 20);
		panel_13.add(textField_18);
		
		textField_85 = new JTextField();
		textField_85.setColumns(10);
		textField_85.setBounds(185, 182, 214, 20);
		panel_13.add(textField_85);
		
		textField_86 = new JTextField();
		textField_86.setColumns(10);
		textField_86.setBounds(185, 207, 214, 20);
		panel_13.add(textField_86);
		
		textField_87 = new JTextField();
		textField_87.setColumns(10);
		textField_87.setBounds(185, 257, 214, 20);
		panel_13.add(textField_87);
		
		textField_88 = new JTextField();
		textField_88.setColumns(10);
		textField_88.setBounds(185, 282, 214, 20);
		panel_13.add(textField_88);
		
		textField_89 = new JTextField();
		textField_89.setColumns(10);
		textField_89.setBounds(185, 307, 214, 20);
		panel_13.add(textField_89);
		
		JYearChooser yearChooser_1_1 = new JYearChooser();
		yearChooser_1_1.setBounds(284, 28, 120, 20);
		panel_9.add(yearChooser_1_1);
		
		JYearChooser yearChooser_1 = new JYearChooser();
		yearChooser_1.setBounds(123, 28, 120, 20);
		panel_9.add(yearChooser_1);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "For Returning Learners (Balik-Aral) and Those Who Shall Transfer/Move In", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_14.setBounds(833, 98, 472, 176);
		panel_9.add(panel_14);
		panel_14.setLayout(null);
		
		JLabel lblPsaBirthCertificate_2 = new JLabel("Last Grade Level Completed:");
		lblPsaBirthCertificate_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblPsaBirthCertificate_2.setBounds(10, 29, 182, 14);
		panel_14.add(lblPsaBirthCertificate_2);
		
		JLabel lblLrn_4 = new JLabel("Last School Year Completed:");
		lblLrn_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblLrn_4.setBounds(10, 54, 182, 14);
		panel_14.add(lblLrn_4);
		
		JLabel lblFirstName_5 = new JLabel("School Name:");
		lblFirstName_5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblFirstName_5.setBounds(10, 79, 114, 14);
		panel_14.add(lblFirstName_5);
		
		JLabel lblLastName_5 = new JLabel("School Address:");
		lblLastName_5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblLastName_5.setBounds(10, 104, 114, 14);
		panel_14.add(lblLastName_5);
		
		JLabel lblMi_3_1_1 = new JLabel("School ID:");
		lblMi_3_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblMi_3_1_1.setBounds(10, 129, 88, 14);
		panel_14.add(lblMi_3_1_1);
		
		textField_90 = new JTextField();
		textField_90.setColumns(10);
		textField_90.setBounds(248, 27, 214, 20);
		panel_14.add(textField_90);
		
		textField_91 = new JTextField();
		textField_91.setColumns(10);
		textField_91.setBounds(248, 52, 214, 20);
		panel_14.add(textField_91);
		
		textField_92 = new JTextField();
		textField_92.setColumns(10);
		textField_92.setBounds(248, 77, 214, 20);
		panel_14.add(textField_92);
		
		textField_93 = new JTextField();
		textField_93.setColumns(10);
		textField_93.setBounds(248, 102, 214, 20);
		panel_14.add(textField_93);
		
		textField_94 = new JTextField();
		textField_94.setColumns(10);
		textField_94.setBounds(248, 127, 214, 20);
		panel_14.add(textField_94);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "ACKNOWLEDGEMENT", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(833, 285, 472, 162);
		panel_9.add(panel_1);
		
		JLabel lblFirstName_5_2 = new JLabel("Requirements Submitted:");
		lblFirstName_5_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblFirstName_5_2.setBounds(10, 30, 156, 14);
		panel_1.add(lblFirstName_5_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Photocopy of birth certificate/baptismal certificate");
		chckbxNewCheckBox_3.setBounds(10, 51, 398, 23);
		panel_1.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("2x2 ID picture");
		chckbxNewCheckBox_4.setBounds(10, 77, 176, 23);
		panel_1.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Form 137");
		chckbxNewCheckBox_5.setBounds(10, 103, 97, 23);
		panel_1.add(chckbxNewCheckBox_5);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "STUDENT'S STATUS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2_1.setBounds(833, 458, 472, 89);
		panel_9.add(panel_2_1);
		
		JLabel lblFirstName_5_2_2_1_1 = new JLabel("Is this student still active?");
		lblFirstName_5_2_2_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblFirstName_5_2_2_1_1.setBounds(10, 32, 156, 14);
		panel_2_1.add(lblFirstName_5_2_2_1_1);
		
		JRadioButton rdbtnNewRadioButton_3_1 = new JRadioButton("Active");
		rdbtnNewRadioButton_3_1.setBounds(6, 53, 109, 23);
		panel_2_1.add(rdbtnNewRadioButton_3_1);
		
		JRadioButton rdbtnNewRadioButton_4_1 = new JRadioButton("Inactive");
		rdbtnNewRadioButton_4_1.setBounds(234, 53, 109, 23);
		panel_2_1.add(rdbtnNewRadioButton_4_1);
		
		JButton btnClear_2_1 = new JButton("CLEAR");
		btnClear_2_1.setForeground(Color.WHITE);
		btnClear_2_1.setFont(new Font("Lucida Console", Font.BOLD, 14));
		btnClear_2_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnClear_2_1.setBackground(new Color(220, 20, 60));
		btnClear_2_1.setBounds(833, 580, 220, 45);
		panel_9.add(btnClear_2_1);
		
		JButton btnUpdate_2_1 = new JButton("UPDATE");
		btnUpdate_2_1.setForeground(Color.WHITE);
		btnUpdate_2_1.setFont(new Font("Lucida Console", Font.BOLD, 14));
		btnUpdate_2_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnUpdate_2_1.setBackground(new Color(220, 20, 60));
		btnUpdate_2_1.setBounds(1085, 580, 220, 45);
		panel_9.add(btnUpdate_2_1);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Kinder", null, panel_6, null);
		panel_6.setLayout(null);
		
		JPanel panel_9_1 = new JPanel();
		panel_9_1.setLayout(null);
		panel_9_1.setBorder(new TitledBorder(new LineBorder(new Color(178, 34, 34)), "KINDER STUDENT PROFILE", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_9_1.setBounds(10, 11, 1315, 667);
		panel_6.add(panel_9_1);
		
		JLabel lblSchoolYear_1 = new JLabel("School Year:");
		lblSchoolYear_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblSchoolYear_1.setBounds(10, 32, 73, 14);
		panel_9_1.add(lblSchoolYear_1);
		
		JLabel lblMi_1_1 = new JLabel("-");
		lblMi_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMi_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblMi_1_1.setBounds(253, 32, 15, 14);
		panel_9_1.add(lblMi_1_1);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("No LRN");
		rdbtnNewRadioButton_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		rdbtnNewRadioButton_1.setBounds(10, 53, 73, 23);
		panel_9_1.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnWithLrn_1 = new JRadioButton("With LRN");
		rdbtnWithLrn_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		rdbtnWithLrn_1.setBounds(132, 53, 84, 23);
		panel_9_1.add(rdbtnWithLrn_1);
		
		JRadioButton rdbtnNewRadioButton_2_1 = new JRadioButton("Returning (Balik-Aral)");
		rdbtnNewRadioButton_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		rdbtnNewRadioButton_2_1.setBounds(253, 53, 151, 23);
		panel_9_1.add(rdbtnNewRadioButton_2_1);
		
		JPanel panel_11_1 = new JPanel();
		panel_11_1.setLayout(null);
		panel_11_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "STUDENT INFORMATION", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_11_1.setBounds(10, 98, 394, 411);
		panel_9_1.add(panel_11_1);
		
		JLabel lblPsaBirthCertificate_1 = new JLabel("PSA Birth Certificate No.:");
		lblPsaBirthCertificate_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblPsaBirthCertificate_1.setBounds(10, 25, 151, 14);
		panel_11_1.add(lblPsaBirthCertificate_1);
		
		JLabel lblLrn_1 = new JLabel("LRN:");
		lblLrn_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblLrn_1.setBounds(10, 50, 38, 14);
		panel_11_1.add(lblLrn_1);
		
		JLabel lblFirstName_1 = new JLabel("First Name:");
		lblFirstName_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblFirstName_1.setBounds(10, 75, 73, 14);
		panel_11_1.add(lblFirstName_1);
		
		JLabel lblLastName_1 = new JLabel("Last Name:");
		lblLastName_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblLastName_1.setBounds(10, 100, 73, 14);
		panel_11_1.add(lblLastName_1);
		
		JLabel lblMi_3_1_2 = new JLabel("Middle Name:");
		lblMi_3_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblMi_3_1_2.setBounds(10, 125, 88, 14);
		panel_11_1.add(lblMi_3_1_2);
		
		JLabel lblExtensionName_2_1_1 = new JLabel("Extension Name:");
		lblExtensionName_2_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblExtensionName_2_1_1.setBounds(10, 150, 103, 14);
		panel_11_1.add(lblExtensionName_2_1_1);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(170, 23, 214, 20);
		panel_11_1.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(170, 48, 214, 20);
		panel_11_1.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(170, 73, 214, 20);
		panel_11_1.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(170, 98, 214, 20);
		panel_11_1.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(170, 123, 214, 20);
		panel_11_1.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(170, 148, 214, 20);
		panel_11_1.add(textField_24);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(170, 176, 214, 20);
		panel_11_1.add(dateChooser_1);
		
		JLabel lblDob_2 = new JLabel("Date of Birth:");
		lblDob_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblDob_2.setBounds(10, 180, 88, 14);
		panel_11_1.add(lblDob_2);
		
		JLabel lblDob_1_2 = new JLabel("Sex:");
		lblDob_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblDob_1_2.setBounds(10, 214, 34, 14);
		panel_11_1.add(lblDob_1_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(170, 206, 214, 22);
		panel_11_1.add(comboBox_1);
		
		JLabel lblDob_1_1_1 = new JLabel("Age:");
		lblDob_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblDob_1_1_1.setBounds(10, 239, 34, 14);
		panel_11_1.add(lblDob_1_1_1);
		
		JLabel lblBelongingToAny_1 = new JLabel("Belonging to any Indigenous People (IP)");
		lblBelongingToAny_1.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		lblBelongingToAny_1.setBounds(10, 289, 194, 14);
		panel_11_1.add(lblBelongingToAny_1);
		
		JLabel lblCommunityIndigenousCultural_1 = new JLabel("Community Indigenous Cultural Community?");
		lblCommunityIndigenousCultural_1.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		lblCommunityIndigenousCultural_1.setBounds(10, 314, 207, 14);
		panel_11_1.add(lblCommunityIndigenousCultural_1);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("YES");
		chckbxNewCheckBox_1.setBounds(267, 285, 52, 43);
		panel_11_1.add(chckbxNewCheckBox_1);
		
		JLabel lblIfYesPlease_1 = new JLabel("if Yes, please specify");
		lblIfYesPlease_1.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		lblIfYesPlease_1.setBounds(10, 339, 103, 14);
		panel_11_1.add(lblIfYesPlease_1);
		
		JCheckBox chckbxNo_1 = new JCheckBox("NO");
		chckbxNo_1.setBounds(341, 285, 43, 43);
		panel_11_1.add(chckbxNo_1);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(170, 337, 214, 20);
		panel_11_1.add(textField_25);
		
		JLabel lblMotherTongue_1 = new JLabel("Mother Tongue:");
		lblMotherTongue_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblMotherTongue_1.setBounds(10, 366, 96, 14);
		panel_11_1.add(lblMotherTongue_1);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(170, 364, 214, 20);
		panel_11_1.add(textField_26);
		
		JLabel lblDob_1_1_4_1 = new JLabel("Religion:");
		lblDob_1_1_4_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblDob_1_1_4_1.setBounds(10, 264, 64, 14);
		panel_11_1.add(lblDob_1_1_4_1);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(170, 262, 214, 20);
		panel_11_1.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(170, 237, 214, 20);
		panel_11_1.add(textField_28);
		
		JPanel panel_12_1 = new JPanel();
		panel_12_1.setLayout(null);
		panel_12_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_12_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "ADDRESS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_12_1.setBounds(10, 520, 813, 136);
		panel_9_1.add(panel_12_1);
		
		JLabel lblHouseNumberAnd_1 = new JLabel("House Number and Street");
		lblHouseNumberAnd_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblHouseNumberAnd_1.setBounds(10, 22, 161, 14);
		panel_12_1.add(lblHouseNumberAnd_1);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(299, 20, 504, 20);
		panel_12_1.add(textField_29);
		
		JLabel lblBarangay_1 = new JLabel("Barangay");
		lblBarangay_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblBarangay_1.setBounds(10, 47, 130, 14);
		panel_12_1.add(lblBarangay_1);
		
		JLabel lblCityMunicipalityprovincecountry_1 = new JLabel("City Municipality/Province/Country");
		lblCityMunicipalityprovincecountry_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblCityMunicipalityprovincecountry_1.setBounds(10, 72, 214, 14);
		panel_12_1.add(lblCityMunicipalityprovincecountry_1);
		
		JLabel lblZipCode_1 = new JLabel("Zip Code");
		lblZipCode_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblZipCode_1.setBounds(10, 97, 130, 14);
		panel_12_1.add(lblZipCode_1);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(299, 45, 504, 20);
		panel_12_1.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(299, 70, 504, 20);
		panel_12_1.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(299, 95, 504, 20);
		panel_12_1.add(textField_32);
		
		JPanel panel_13_1 = new JPanel();
		panel_13_1.setLayout(null);
		panel_13_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "PARENT'S/GUARDIAN'S INFORMATION", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_13_1.setBounds(414, 98, 409, 411);
		panel_9_1.add(panel_13_1);
		
		JLabel lblFathersName_2 = new JLabel("Father's Name");
		lblFathersName_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblFathersName_2.setBounds(10, 38, 96, 14);
		panel_13_1.add(lblFathersName_2);
		
		JLabel lblFathersName_1_1 = new JLabel("Mother's Maiden Name");
		lblFathersName_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblFathersName_1_1.setBounds(10, 138, 140, 14);
		panel_13_1.add(lblFathersName_1_1);
		
		JLabel lblGuardiansName_1 = new JLabel("Guardian's Name");
		lblGuardiansName_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblGuardiansName_1.setBounds(10, 238, 117, 14);
		panel_13_1.add(lblGuardiansName_1);
		
		JLabel lblTelephoneNumber_1 = new JLabel("Telephone Number:");
		lblTelephoneNumber_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblTelephoneNumber_1.setBounds(10, 338, 130, 14);
		panel_13_1.add(lblTelephoneNumber_1);
		
		JLabel lblCellphoneNumber_1 = new JLabel("Cellphone Number:");
		lblCellphoneNumber_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblCellphoneNumber_1.setBounds(10, 363, 130, 14);
		panel_13_1.add(lblCellphoneNumber_1);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(185, 57, 214, 20);
		panel_13_1.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(185, 82, 214, 20);
		panel_13_1.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(185, 107, 214, 20);
		panel_13_1.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(185, 338, 214, 20);
		panel_13_1.add(textField_36);
		
		textField_103 = new JTextField();
		textField_103.setColumns(10);
		textField_103.setBounds(185, 363, 214, 20);
		panel_13_1.add(textField_103);
		
		JLabel lblMiddleName_3 = new JLabel("Middle Name:");
		lblMiddleName_3.setFont(new Font("Arial", Font.PLAIN, 13));
		lblMiddleName_3.setBounds(10, 313, 103, 14);
		panel_13_1.add(lblMiddleName_3);
		
		JLabel lblFirstName_4_3 = new JLabel("First Name:");
		lblFirstName_4_3.setFont(new Font("Arial", Font.PLAIN, 13));
		lblFirstName_4_3.setBounds(10, 288, 103, 14);
		panel_13_1.add(lblFirstName_4_3);
		
		JLabel lblLastName_4_3 = new JLabel("Last Name:");
		lblLastName_4_3.setFont(new Font("Arial", Font.PLAIN, 13));
		lblLastName_4_3.setBounds(10, 263, 103, 14);
		panel_13_1.add(lblLastName_4_3);
		
		JLabel lblLastName_4_1_1 = new JLabel("Last Name:");
		lblLastName_4_1_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblLastName_4_1_1.setBounds(10, 163, 103, 14);
		panel_13_1.add(lblLastName_4_1_1);
		
		JLabel lblFirstName_4_1_1 = new JLabel("First Name:");
		lblFirstName_4_1_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblFirstName_4_1_1.setBounds(10, 188, 103, 14);
		panel_13_1.add(lblFirstName_4_1_1);
		
		JLabel lblMiddleName_1_1 = new JLabel("Middle Name:");
		lblMiddleName_1_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblMiddleName_1_1.setBounds(10, 213, 103, 14);
		panel_13_1.add(lblMiddleName_1_1);
		
		JLabel lblLastName_4_2_1 = new JLabel("Last Name:");
		lblLastName_4_2_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblLastName_4_2_1.setBounds(10, 63, 103, 14);
		panel_13_1.add(lblLastName_4_2_1);
		
		JLabel lblFirstName_4_2_1 = new JLabel("First Name:");
		lblFirstName_4_2_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblFirstName_4_2_1.setBounds(10, 88, 103, 14);
		panel_13_1.add(lblFirstName_4_2_1);
		
		JLabel lblMiddleName_2_1 = new JLabel("Middle Name:");
		lblMiddleName_2_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblMiddleName_2_1.setBounds(10, 113, 103, 14);
		panel_13_1.add(lblMiddleName_2_1);
		
		textField_104 = new JTextField();
		textField_104.setColumns(10);
		textField_104.setBounds(185, 157, 214, 20);
		panel_13_1.add(textField_104);
		
		textField_105 = new JTextField();
		textField_105.setColumns(10);
		textField_105.setBounds(185, 182, 214, 20);
		panel_13_1.add(textField_105);
		
		textField_106 = new JTextField();
		textField_106.setColumns(10);
		textField_106.setBounds(185, 207, 214, 20);
		panel_13_1.add(textField_106);
		
		textField_107 = new JTextField();
		textField_107.setColumns(10);
		textField_107.setBounds(185, 257, 214, 20);
		panel_13_1.add(textField_107);
		
		textField_108 = new JTextField();
		textField_108.setColumns(10);
		textField_108.setBounds(185, 282, 214, 20);
		panel_13_1.add(textField_108);
		
		textField_109 = new JTextField();
		textField_109.setColumns(10);
		textField_109.setBounds(185, 307, 214, 20);
		panel_13_1.add(textField_109);
		
		JYearChooser yearChooser_1_1_1 = new JYearChooser();
		yearChooser_1_1_1.setBounds(284, 28, 120, 20);
		panel_9_1.add(yearChooser_1_1_1);
		
		JYearChooser yearChooser_1_2 = new JYearChooser();
		yearChooser_1_2.setBounds(123, 28, 120, 20);
		panel_9_1.add(yearChooser_1_2);
		
		JPanel panel_14_1 = new JPanel();
		panel_14_1.setLayout(null);
		panel_14_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "For Returning Learners (Balik-Aral) and Those Who Shall Transfer/Move In", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_14_1.setBounds(833, 98, 472, 176);
		panel_9_1.add(panel_14_1);
		
		JLabel lblPsaBirthCertificate_2_1 = new JLabel("Last Grade Level Completed:");
		lblPsaBirthCertificate_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblPsaBirthCertificate_2_1.setBounds(10, 29, 182, 14);
		panel_14_1.add(lblPsaBirthCertificate_2_1);
		
		JLabel lblLrn_4_1 = new JLabel("Last School Year Completed:");
		lblLrn_4_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblLrn_4_1.setBounds(10, 54, 182, 14);
		panel_14_1.add(lblLrn_4_1);
		
		JLabel lblFirstName_5_1 = new JLabel("School Name:");
		lblFirstName_5_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblFirstName_5_1.setBounds(10, 79, 114, 14);
		panel_14_1.add(lblFirstName_5_1);
		
		JLabel lblLastName_5_1 = new JLabel("School Address:");
		lblLastName_5_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblLastName_5_1.setBounds(10, 104, 114, 14);
		panel_14_1.add(lblLastName_5_1);
		
		JLabel lblMi_3_1_1_1 = new JLabel("School ID:");
		lblMi_3_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblMi_3_1_1_1.setBounds(10, 129, 88, 14);
		panel_14_1.add(lblMi_3_1_1_1);
		
		textField_110 = new JTextField();
		textField_110.setColumns(10);
		textField_110.setBounds(248, 27, 214, 20);
		panel_14_1.add(textField_110);
		
		textField_111 = new JTextField();
		textField_111.setColumns(10);
		textField_111.setBounds(248, 52, 214, 20);
		panel_14_1.add(textField_111);
		
		textField_112 = new JTextField();
		textField_112.setColumns(10);
		textField_112.setBounds(248, 77, 214, 20);
		panel_14_1.add(textField_112);
		
		textField_113 = new JTextField();
		textField_113.setColumns(10);
		textField_113.setBounds(248, 102, 214, 20);
		panel_14_1.add(textField_113);
		
		textField_114 = new JTextField();
		textField_114.setColumns(10);
		textField_114.setBounds(248, 127, 214, 20);
		panel_14_1.add(textField_114);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "ACKNOWLEDGEMENT", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1_1.setBounds(833, 285, 472, 162);
		panel_9_1.add(panel_1_1);
		
		JLabel lblFirstName_5_2_1 = new JLabel("Requirements Submitted:");
		lblFirstName_5_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblFirstName_5_2_1.setBounds(10, 30, 156, 14);
		panel_1_1.add(lblFirstName_5_2_1);
		
		JCheckBox chckbxNewCheckBox_3_1 = new JCheckBox("Photocopy of birth certificate/baptismal certificate");
		chckbxNewCheckBox_3_1.setBounds(10, 51, 456, 23);
		panel_1_1.add(chckbxNewCheckBox_3_1);
		
		JCheckBox chckbxNewCheckBox_4_1 = new JCheckBox("2x2 ID picture");
		chckbxNewCheckBox_4_1.setBounds(10, 77, 200, 23);
		panel_1_1.add(chckbxNewCheckBox_4_1);
		
		JCheckBox chckbxNewCheckBox_5_1 = new JCheckBox("Form 137");
		chckbxNewCheckBox_5_1.setBounds(10, 103, 97, 23);
		panel_1_1.add(chckbxNewCheckBox_5_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "STUDENT'S STATUS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2_2.setBounds(833, 458, 472, 89);
		panel_9_1.add(panel_2_2);
		
		JLabel lblFirstName_5_2_2_1_2 = new JLabel("Is this student still active?");
		lblFirstName_5_2_2_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblFirstName_5_2_2_1_2.setBounds(10, 32, 156, 14);
		panel_2_2.add(lblFirstName_5_2_2_1_2);
		
		JRadioButton rdbtnNewRadioButton_3_2 = new JRadioButton("Active");
		rdbtnNewRadioButton_3_2.setBounds(6, 53, 109, 23);
		panel_2_2.add(rdbtnNewRadioButton_3_2);
		
		JRadioButton rdbtnNewRadioButton_4_2 = new JRadioButton("Inactive");
		rdbtnNewRadioButton_4_2.setBounds(234, 53, 109, 23);
		panel_2_2.add(rdbtnNewRadioButton_4_2);
		
		JButton btnClear_2_2 = new JButton("CLEAR");
		btnClear_2_2.setForeground(Color.WHITE);
		btnClear_2_2.setFont(new Font("Lucida Console", Font.BOLD, 14));
		btnClear_2_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnClear_2_2.setBackground(new Color(220, 20, 60));
		btnClear_2_2.setBounds(833, 580, 220, 45);
		panel_9_1.add(btnClear_2_2);
		
		JButton btnUpdate_2_2 = new JButton("UPDATE");
		btnUpdate_2_2.setForeground(Color.WHITE);
		btnUpdate_2_2.setFont(new Font("Lucida Console", Font.BOLD, 14));
		btnUpdate_2_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnUpdate_2_2.setBackground(new Color(220, 20, 60));
		btnUpdate_2_2.setBounds(1085, 580, 220, 45);
		panel_9_1.add(btnUpdate_2_2);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("ALS", null, panel_7, null);
		panel_7.setLayout(null);
		
		JPanel panel_9_2 = new JPanel();
		panel_9_2.setLayout(null);
		panel_9_2.setBorder(new TitledBorder(new LineBorder(new Color(178, 34, 34)), "ALS STUDENT PROFILE", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_9_2.setBounds(10, 11, 1315, 668);
		panel_7.add(panel_9_2);
		
		JLabel lblLrn_2 = new JLabel("LRN");
		lblLrn_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblLrn_2.setBounds(14, 19, 32, 14);
		panel_9_2.add(lblLrn_2);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(115, 16, 236, 20);
		panel_9_2.add(textField_38);
		
		JLabel lblLrn_2_1 = new JLabel("(if available):");
		lblLrn_2_1.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		lblLrn_2_1.setBounds(45, 19, 63, 14);
		panel_9_2.add(lblLrn_2_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "PERSONAL INFORMATION", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(14, 44, 462, 613);
		panel_9_2.add(panel_3);
		
		JDateChooser dateChooser_2 = new JDateChooser();
		dateChooser_2.setBounds(234, 291, 214, 20);
		panel_3.add(dateChooser_2);
		
		JLabel lblDob_3 = new JLabel("Birthdate:");
		lblDob_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblDob_3.setBounds(11, 292, 63, 14);
		panel_3.add(lblDob_3);
		
		JLabel lblZipCode_2 = new JLabel("Province");
		lblZipCode_2.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		lblZipCode_2.setBounds(11, 262, 54, 14);
		panel_3.add(lblZipCode_2);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(234, 262, 214, 20);
		panel_3.add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(234, 233, 214, 20);
		panel_3.add(textField_40);
		
		JLabel lblCityMunicipalityprovincecountry_2 = new JLabel("Municipality/City");
		lblCityMunicipalityprovincecountry_2.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		lblCityMunicipalityprovincecountry_2.setBounds(11, 233, 83, 14);
		panel_3.add(lblCityMunicipalityprovincecountry_2);
		
		JLabel lblBarangay_2 = new JLabel("Barangay");
		lblBarangay_2.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		lblBarangay_2.setBounds(11, 200, 59, 14);
		panel_3.add(lblBarangay_2);
		
		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(234, 200, 214, 20);
		panel_3.add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(234, 169, 214, 20);
		panel_3.add(textField_42);
		
		JLabel lblHouseNumberAnd_2 = new JLabel("House No./Street/Sitio");
		lblHouseNumberAnd_2.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		lblHouseNumberAnd_2.setBounds(11, 169, 112, 14);
		panel_3.add(lblHouseNumberAnd_2);
		
		JLabel lblAddress_2 = new JLabel("Address:");
		lblAddress_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblAddress_2.setBounds(11, 142, 73, 14);
		panel_3.add(lblAddress_2);
		
		JLabel lblExtensionName_2 = new JLabel("Extension Name:");
		lblExtensionName_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblExtensionName_2.setBounds(11, 117, 103, 14);
		panel_3.add(lblExtensionName_2);
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(234, 116, 214, 20);
		panel_3.add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBounds(234, 85, 214, 20);
		panel_3.add(textField_44);
		
		JLabel lblMi_3 = new JLabel("Middle Name:");
		lblMi_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblMi_3.setBounds(11, 86, 88, 14);
		panel_3.add(lblMi_3);
		
		JLabel lblLastName_2 = new JLabel("Last Name:");
		lblLastName_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblLastName_2.setBounds(11, 54, 73, 14);
		panel_3.add(lblLastName_2);
		
		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBounds(234, 54, 214, 20);
		panel_3.add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBounds(234, 23, 214, 20);
		panel_3.add(textField_46);
		
		JLabel lblFirstName_2 = new JLabel("First Name:");
		lblFirstName_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblFirstName_2.setBounds(11, 23, 73, 14);
		panel_3.add(lblFirstName_2);
		
		JLabel lblDob_1_1_2 = new JLabel("Place of Birth");
		lblDob_1_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblDob_1_1_2.setBounds(11, 319, 83, 14);
		panel_3.add(lblDob_1_1_2);
		
		JLabel lblLrn_2_1_1 = new JLabel("(Municipality/City)");
		lblLrn_2_1_1.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		lblLrn_2_1_1.setBounds(93, 319, 87, 14);
		panel_3.add(lblLrn_2_1_1);
		
		textField_47 = new JTextField();
		textField_47.setColumns(10);
		textField_47.setBounds(234, 318, 214, 20);
		panel_3.add(textField_47);
		
		JLabel lblDob_3_1_1 = new JLabel("Civil Status:");
		lblDob_3_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblDob_3_1_1.setBounds(229, 347, 73, 14);
		panel_3.add(lblDob_3_1_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(93, 348, 98, 22);
		panel_3.add(comboBox_2);
		
		JLabel lblDob_3_1 = new JLabel("Sex:");
		lblDob_3_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblDob_3_1.setBounds(11, 347, 32, 14);
		panel_3.add(lblDob_3_1);
		
		JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.setBounds(350, 348, 99, 22);
		panel_3.add(comboBox_2_1);
		
		textField_48 = new JTextField();
		textField_48.setColumns(10);
		textField_48.setBounds(234, 378, 214, 20);
		panel_3.add(textField_48);
		
		JLabel lblDob_3_1_2 = new JLabel("Religion:");
		lblDob_3_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblDob_3_1_2.setBounds(11, 378, 57, 14);
		panel_3.add(lblDob_3_1_2);
		
		JLabel lblLrn_2_1_1_1 = new JLabel("(Specify ethnic group):");
		lblLrn_2_1_1_1.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		lblLrn_2_1_1_1.setBounds(24, 403, 112, 14);
		panel_3.add(lblLrn_2_1_1_1);
		
		JLabel lblDob_3_1_2_1 = new JLabel("IP");
		lblDob_3_1_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblDob_3_1_2_1.setBounds(11, 403, 18, 14);
		panel_3.add(lblDob_3_1_2_1);
		
		textField_49 = new JTextField();
		textField_49.setColumns(10);
		textField_49.setBounds(234, 403, 214, 20);
		panel_3.add(textField_49);
		
		textField_50 = new JTextField();
		textField_50.setColumns(10);
		textField_50.setBounds(234, 432, 214, 20);
		panel_3.add(textField_50);
		
		JLabel lblMotherTongue_2 = new JLabel("Mother Tongue:");
		lblMotherTongue_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblMotherTongue_2.setBounds(11, 432, 96, 14);
		panel_3.add(lblMotherTongue_2);
		
		JLabel lblDob_3_1_2_1_1 = new JLabel("PWD:");
		lblDob_3_1_2_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblDob_3_1_2_1_1.setBounds(11, 457, 38, 14);
		panel_3.add(lblDob_3_1_2_1_1);
		
		JComboBox comboBox_2_3 = new JComboBox();
		comboBox_2_3.setBounds(93, 458, 98, 22);
		panel_3.add(comboBox_2_3);
		
		JLabel lblCellphoneNumber_2 = new JLabel("Contact Number/s:");
		lblCellphoneNumber_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblCellphoneNumber_2.setBounds(11, 488, 130, 14);
		panel_3.add(lblCellphoneNumber_2);
		
		textField_51 = new JTextField();
		textField_51.setColumns(10);
		textField_51.setBounds(234, 487, 213, 20);
		panel_3.add(textField_51);
		
		JLabel lblDob_3_1_2_1_1_1 = new JLabel("4Ps:");
		lblDob_3_1_2_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblDob_3_1_2_1_1_1.setBounds(229, 457, 31, 14);
		panel_3.add(lblDob_3_1_2_1_1_1);
		
		JComboBox comboBox_2_2 = new JComboBox();
		comboBox_2_2.setBounds(350, 458, 98, 22);
		panel_3.add(comboBox_2_2);
		
		JLabel lblMotherTongue_2_1 = new JLabel("Name of Father/Legal Guardian:");
		lblMotherTongue_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblMotherTongue_2_1.setBounds(11, 506, 206, 14);
		panel_3.add(lblMotherTongue_2_1);
		
		textField_52 = new JTextField();
		textField_52.setText("Last Name");
		textField_52.setColumns(10);
		textField_52.setBounds(11, 525, 99, 20);
		panel_3.add(textField_52);
		
		textField_53 = new JTextField();
		textField_53.setText("First Name");
		textField_53.setColumns(10);
		textField_53.setBounds(124, 525, 99, 20);
		panel_3.add(textField_53);
		
		textField_54 = new JTextField();
		textField_54.setText("Middle Name");
		textField_54.setColumns(10);
		textField_54.setBounds(238, 525, 99, 20);
		panel_3.add(textField_54);
		
		textField_55 = new JTextField();
		textField_55.setText("Occupation");
		textField_55.setColumns(10);
		textField_55.setBounds(351, 525, 99, 20);
		panel_3.add(textField_55);
		
		JLabel lblMotherTongue_2_1_1 = new JLabel("Mother's Maiden Name:");
		lblMotherTongue_2_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblMotherTongue_2_1_1.setBounds(10, 550, 206, 14);
		panel_3.add(lblMotherTongue_2_1_1);
		
		textField_56 = new JTextField();
		textField_56.setText("Last Name");
		textField_56.setColumns(10);
		textField_56.setBounds(10, 569, 99, 20);
		panel_3.add(textField_56);
		
		textField_76 = new JTextField();
		textField_76.setText("First Name");
		textField_76.setColumns(10);
		textField_76.setBounds(123, 569, 99, 20);
		panel_3.add(textField_76);
		
		textField_77 = new JTextField();
		textField_77.setText("Middle Name");
		textField_77.setColumns(10);
		textField_77.setBounds(237, 569, 99, 20);
		panel_3.add(textField_77);
		
		textField_78 = new JTextField();
		textField_78.setText("Occupation");
		textField_78.setColumns(10);
		textField_78.setBounds(350, 569, 99, 20);
		panel_3.add(textField_78);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "EDUCATIONAL INFORMATION", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(486, 44, 386, 613);
		panel_9_2.add(panel_4);
		
		JLabel lblNewLabel = new JLabel("Last Grade Level Completed");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 18, 166, 15);
		panel_4.add(lblNewLabel);
		
		JLabel lblBarangay_2_1 = new JLabel("Elementary:");
		lblBarangay_2_1.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		lblBarangay_2_1.setBounds(10, 42, 56, 16);
		panel_4.add(lblBarangay_2_1);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(201, 34, 175, 22);
		panel_4.add(comboBox_4);
		
		JLabel lblCityMunicipalityprovincecountry_2_1 = new JLabel("Junior High School:");
		lblCityMunicipalityprovincecountry_2_1.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		lblCityMunicipalityprovincecountry_2_1.setBounds(10, 66, 98, 22);
		panel_4.add(lblCityMunicipalityprovincecountry_2_1);
		
		JComboBox comboBox_4_1 = new JComboBox();
		comboBox_4_1.setBounds(201, 67, 175, 22);
		panel_4.add(comboBox_4_1);
		
		JLabel lblZipCode_2_1 = new JLabel("Senior High School:");
		lblZipCode_2_1.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		lblZipCode_2_1.setBounds(10, 99, 98, 22);
		panel_4.add(lblZipCode_2_1);
		
		JComboBox comboBox_4_2 = new JComboBox();
		comboBox_4_2.setBounds(201, 100, 175, 22);
		panel_4.add(comboBox_4_2);
		
		JLabel lblWhyDidYou = new JLabel("Why did you drop out of school?");
		lblWhyDidYou.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblWhyDidYou.setBounds(10, 132, 185, 15);
		panel_4.add(lblWhyDidYou);
		
		JLabel lblLrn_2_1_1_2 = new JLabel("(For OSY only)");
		lblLrn_2_1_1_2.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		lblLrn_2_1_1_2.setBounds(209, 131, 73, 16);
		panel_4.add(lblLrn_2_1_1_2);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("No school in Barangay");
		chckbxNewCheckBox_2.setBounds(10, 153, 210, 23);
		panel_4.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_2_1 = new JCheckBox("Unable to pay for miscellaneous and other expenses");
		chckbxNewCheckBox_2_1.setBounds(10, 181, 325, 23);
		panel_4.add(chckbxNewCheckBox_2_1);
		
		JCheckBox chckbxNewCheckBox_2_2 = new JCheckBox("School too far from home");
		chckbxNewCheckBox_2_2.setBounds(10, 209, 185, 23);
		panel_4.add(chckbxNewCheckBox_2_2);
		
		JCheckBox chckbxNewCheckBox_2_1_1 = new JCheckBox("Needed to help family");
		chckbxNewCheckBox_2_1_1.setBounds(10, 237, 166, 23);
		panel_4.add(chckbxNewCheckBox_2_1_1);
		
		JLabel lblLrn_2_1_1_2_1 = new JLabel("Others:");
		lblLrn_2_1_1_2_1.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		lblLrn_2_1_1_2_1.setBounds(10, 265, 34, 16);
		panel_4.add(lblLrn_2_1_1_2_1);
		
		textField_79 = new JTextField();
		textField_79.setColumns(10);
		textField_79.setBounds(118, 265, 258, 20);
		panel_4.add(textField_79);
		
		JLabel lblHaveYouAttended = new JLabel("Have you attended ALS learning sessions before?");
		lblHaveYouAttended.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblHaveYouAttended.setBounds(10, 292, 294, 15);
		panel_4.add(lblHaveYouAttended);
		
		JComboBox comboBox_4_2_1 = new JComboBox();
		comboBox_4_2_1.setBounds(308, 289, 68, 22);
		panel_4.add(comboBox_4_2_1);
		
		JLabel lblLrn_2_1_1_2_2 = new JLabel("if Yes:");
		lblLrn_2_1_1_2_2.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		lblLrn_2_1_1_2_2.setBounds(10, 318, 34, 16);
		panel_4.add(lblLrn_2_1_1_2_2);
		
		JLabel lblLrn_2_1_1_2_3 = new JLabel("Name of the Program:");
		lblLrn_2_1_1_2_3.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		lblLrn_2_1_1_2_3.setBounds(10, 345, 120, 16);
		panel_4.add(lblLrn_2_1_1_2_3);
		
		textField_80 = new JTextField();
		textField_80.setColumns(10);
		textField_80.setBounds(118, 344, 258, 20);
		panel_4.add(textField_80);
		
		JLabel lblZipCode_2_1_1 = new JLabel("Level of Literacy:");
		lblZipCode_2_1_1.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		lblZipCode_2_1_1.setBounds(10, 375, 98, 22);
		panel_4.add(lblZipCode_2_1_1);
		
		JComboBox comboBox_4_2_2 = new JComboBox();
		comboBox_4_2_2.setBounds(201, 376, 175, 22);
		panel_4.add(comboBox_4_2_2);
		
		JLabel lblZipCode_2_1_1_1 = new JLabel("Year Attended:");
		lblZipCode_2_1_1_1.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		lblZipCode_2_1_1_1.setBounds(10, 408, 98, 22);
		panel_4.add(lblZipCode_2_1_1_1);
		
		JLabel lblZipCode_2_1_1_1_1 = new JLabel("Have you completed the Program?");
		lblZipCode_2_1_1_1_1.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		lblZipCode_2_1_1_1_1.setBounds(10, 441, 172, 22);
		panel_4.add(lblZipCode_2_1_1_1_1);
		
		JComboBox comboBox_4_2_3 = new JComboBox();
		comboBox_4_2_3.setBounds(201, 442, 175, 22);
		panel_4.add(comboBox_4_2_3);
		
		JLabel lblLrn_2_1_1_2_2_1 = new JLabel("if No, state the reason:");
		lblLrn_2_1_1_2_2_1.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		lblLrn_2_1_1_2_2_1.setBounds(10, 474, 114, 16);
		panel_4.add(lblLrn_2_1_1_2_2_1);
		
		textField_81 = new JTextField();
		textField_81.setColumns(10);
		textField_81.setBounds(118, 474, 258, 20);
		panel_4.add(textField_81);
		
		JLabel lblWhatLearningModalityies = new JLabel("What learning modality/ies do you prefer?");
		lblWhatLearningModalityies.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblWhatLearningModalityies.setBounds(10, 501, 247, 15);
		panel_4.add(lblWhatLearningModalityies);
		
		JCheckBox chckbxNewCheckBox_2_3 = new JCheckBox("Online");
		chckbxNewCheckBox_2_3.setFont(new Font("Arial", Font.PLAIN, 12));
		chckbxNewCheckBox_2_3.setBounds(10, 519, 75, 23);
		panel_4.add(chckbxNewCheckBox_2_3);
		
		JCheckBox chckbxNewCheckBox_2_4 = new JCheckBox("Television");
		chckbxNewCheckBox_2_4.setFont(new Font("Arial", Font.PLAIN, 12));
		chckbxNewCheckBox_2_4.setBounds(87, 519, 89, 23);
		panel_4.add(chckbxNewCheckBox_2_4);
		
		JCheckBox chckbxNewCheckBox_2_4_1 = new JCheckBox("Radio");
		chckbxNewCheckBox_2_4_1.setFont(new Font("Arial", Font.PLAIN, 12));
		chckbxNewCheckBox_2_4_1.setBounds(186, 519, 59, 23);
		panel_4.add(chckbxNewCheckBox_2_4_1);
		
		JCheckBox chckbxNewCheckBox_2_4_2 = new JCheckBox("Modular Learning");
		chckbxNewCheckBox_2_4_2.setFont(new Font("Arial", Font.PLAIN, 12));
		chckbxNewCheckBox_2_4_2.setBounds(247, 519, 129, 23);
		panel_4.add(chckbxNewCheckBox_2_4_2);
		
		JCheckBox chckbxNewCheckBox_2_3_1 = new JCheckBox("Combination of face to face with other modalities");
		chckbxNewCheckBox_2_3_1.setFont(new Font("Arial", Font.PLAIN, 12));
		chckbxNewCheckBox_2_3_1.setBounds(10, 544, 294, 23);
		panel_4.add(chckbxNewCheckBox_2_3_1);
		
		JCheckBox chckbxNewCheckBox_2_3_2 = new JCheckBox("Others:");
		chckbxNewCheckBox_2_3_2.setFont(new Font("Arial", Font.PLAIN, 12));
		chckbxNewCheckBox_2_3_2.setBounds(10, 569, 68, 23);
		panel_4.add(chckbxNewCheckBox_2_3_2);
		
		textField_82 = new JTextField();
		textField_82.setColumns(10);
		textField_82.setBounds(118, 570, 258, 20);
		panel_4.add(textField_82);
		
		JYearChooser yearChooser = new JYearChooser();
		yearChooser.setBounds(201, 410, 175, 20);
		panel_4.add(yearChooser);
		
		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "ACCESSIBILTY AND AVAILABILTY", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_10.setBounds(882, 44, 423, 364);
		panel_9_2.add(panel_10);
		
		JLabel lblHowFarIs = new JLabel("How far is it from your home to your learning center?");
		lblHowFarIs.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblHowFarIs.setBounds(10, 22, 317, 15);
		panel_10.add(lblHowFarIs);
		
		textField_83 = new JTextField();
		textField_83.setColumns(10);
		textField_83.setBounds(10, 48, 86, 20);
		panel_10.add(textField_83);
		
		textField_84 = new JTextField();
		textField_84.setColumns(10);
		textField_84.setBounds(207, 48, 86, 20);
		panel_10.add(textField_84);
		
		JLabel lblNewLabel_1 = new JLabel("in kms");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(106, 50, 46, 14);
		panel_10.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("in hours and mins");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(303, 50, 110, 14);
		panel_10.add(lblNewLabel_1_1);
		
		JLabel lblHowDoYou = new JLabel("How do you get from your home to your Learning Center?");
		lblHowDoYou.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblHowDoYou.setBounds(10, 79, 339, 15);
		panel_10.add(lblHowDoYou);
		
		JLabel lblNewLabel_1_2 = new JLabel("If OTHERS, please spcify:");
		lblNewLabel_1_2.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		lblNewLabel_1_2.setBounds(10, 110, 135, 14);
		panel_10.add(lblNewLabel_1_2);
		
		textField_95 = new JTextField();
		textField_95.setColumns(10);
		textField_95.setBounds(155, 108, 258, 20);
		panel_10.add(textField_95);
		
		JLabel lblWhenCanYou = new JLabel("When can you attend your learning session?");
		lblWhenCanYou.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblWhenCanYou.setBounds(10, 139, 268, 15);
		panel_10.add(lblWhenCanYou);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("What specific time can you be at your Learning Center?");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(10, 165, 317, 14);
		panel_10.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("MONDAY");
		lblNewLabel_1_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(10, 190, 65, 14);
		panel_10.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("TUESDAY");
		lblNewLabel_1_3_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_3_1.setBounds(10, 212, 65, 14);
		panel_10.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("THURSDAY");
		lblNewLabel_1_3_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_3_1_1.setBounds(10, 258, 65, 14);
		panel_10.add(lblNewLabel_1_3_1_1);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("WEDNESDAY");
		lblNewLabel_1_3_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_3_2.setBounds(10, 235, 86, 14);
		panel_10.add(lblNewLabel_1_3_2);
		
		JLabel lblNewLabel_1_3_1_2 = new JLabel("SATURDAY");
		lblNewLabel_1_3_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_3_1_2.setBounds(10, 306, 65, 14);
		panel_10.add(lblNewLabel_1_3_1_2);
		
		JLabel lblNewLabel_1_3_3 = new JLabel("FRIDAY");
		lblNewLabel_1_3_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_3_3.setBounds(10, 281, 65, 14);
		panel_10.add(lblNewLabel_1_3_3);
		
		JLabel lblNewLabel_1_3_1_2_1 = new JLabel("SUNDAY");
		lblNewLabel_1_3_1_2_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_3_1_2_1.setBounds(10, 330, 65, 14);
		panel_10.add(lblNewLabel_1_3_1_2_1);
		
		textField_96 = new JTextField();
		textField_96.setColumns(10);
		textField_96.setBounds(207, 187, 206, 20);
		panel_10.add(textField_96);
		
		textField_97 = new JTextField();
		textField_97.setColumns(10);
		textField_97.setBounds(207, 209, 206, 20);
		panel_10.add(textField_97);
		
		textField_98 = new JTextField();
		textField_98.setColumns(10);
		textField_98.setBounds(207, 232, 206, 20);
		panel_10.add(textField_98);
		
		textField_99 = new JTextField();
		textField_99.setColumns(10);
		textField_99.setBounds(207, 255, 206, 20);
		panel_10.add(textField_99);
		
		textField_100 = new JTextField();
		textField_100.setColumns(10);
		textField_100.setBounds(207, 278, 206, 20);
		panel_10.add(textField_100);
		
		textField_101 = new JTextField();
		textField_101.setColumns(10);
		textField_101.setBounds(207, 303, 206, 20);
		panel_10.add(textField_101);
		
		textField_102 = new JTextField();
		textField_102.setColumns(10);
		textField_102.setBounds(207, 327, 206, 20);
		panel_10.add(textField_102);
		
		JComboBox comboBox_4_2_1_1 = new JComboBox();
		comboBox_4_2_1_1.setBounds(345, 75, 68, 22);
		panel_10.add(comboBox_4_2_1_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "ACKNOWLEDGEMENT", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1_2.setBounds(882, 419, 423, 102);
		panel_9_2.add(panel_1_2);
		
		JLabel lblFirstName_5_2_3 = new JLabel("Requirements Submitted:");
		lblFirstName_5_2_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblFirstName_5_2_3.setBounds(10, 19, 156, 14);
		panel_1_2.add(lblFirstName_5_2_3);
		
		JCheckBox chckbxNewCheckBox_3_3 = new JCheckBox("Photocopy of birth certificate/baptismal certificate");
		chckbxNewCheckBox_3_3.setBounds(10, 40, 350, 23);
		panel_1_2.add(chckbxNewCheckBox_3_3);
		
		JCheckBox chckbxNewCheckBox_4_3 = new JCheckBox("2x2 ID picture");
		chckbxNewCheckBox_4_3.setBounds(10, 66, 170, 23);
		panel_1_2.add(chckbxNewCheckBox_4_3);
		
		JButton btnClear_3 = new JButton("CLEAR");
		btnClear_3.setForeground(Color.WHITE);
		btnClear_3.setFont(new Font("Lucida Console", Font.BOLD, 14));
		btnClear_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnClear_3.setBackground(new Color(220, 20, 60));
		btnClear_3.setBounds(882, 608, 204, 45);
		panel_9_2.add(btnClear_3);
		
		JButton btnUpdate_3 = new JButton("UPDATE");
		btnUpdate_3.setForeground(Color.WHITE);
		btnUpdate_3.setFont(new Font("Lucida Console", Font.BOLD, 14));
		btnUpdate_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnUpdate_3.setBackground(new Color(220, 20, 60));
		btnUpdate_3.setBounds(1101, 608, 204, 45);
		panel_9_2.add(btnUpdate_3);
		
		JPanel panel_2_2_1 = new JPanel();
		panel_2_2_1.setLayout(null);
		panel_2_2_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "STUDENT'S STATUS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2_2_1.setBounds(882, 532, 423, 65);
		panel_9_2.add(panel_2_2_1);
		
		JLabel lblFirstName_5_2_2_1_2_1 = new JLabel("Is this student still active?");
		lblFirstName_5_2_2_1_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblFirstName_5_2_2_1_2_1.setBounds(10, 17, 156, 14);
		panel_2_2_1.add(lblFirstName_5_2_2_1_2_1);
		
		JRadioButton rdbtnNewRadioButton_3_2_1 = new JRadioButton("Active");
		rdbtnNewRadioButton_3_2_1.setBounds(10, 38, 109, 23);
		panel_2_2_1.add(rdbtnNewRadioButton_3_2_1);
		
		JRadioButton rdbtnNewRadioButton_4_2_1 = new JRadioButton("Inactive");
		rdbtnNewRadioButton_4_2_1.setBounds(234, 38, 109, 23);
		panel_2_2_1.add(rdbtnNewRadioButton_4_2_1);
		
		JPanel panel_8 = new JPanel();
		tabbedPane.addTab("SPED", null, panel_8, null);
		panel_8.setLayout(null);
		
		JPanel panel_9_1_1 = new JPanel();
		panel_9_1_1.setLayout(null);
		panel_9_1_1.setBorder(new TitledBorder(new LineBorder(new Color(178, 34, 34)), "SPED STUDENT PROFILE", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_9_1_1.setBounds(10, 11, 1315, 667);
		panel_8.add(panel_9_1_1);
		
		JLabel lblSchoolYear_1_1 = new JLabel("School Year:");
		lblSchoolYear_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblSchoolYear_1_1.setBounds(10, 32, 73, 14);
		panel_9_1_1.add(lblSchoolYear_1_1);
		
		JLabel lblMi_1_1_1 = new JLabel("-");
		lblMi_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMi_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblMi_1_1_1.setBounds(253, 32, 15, 14);
		panel_9_1_1.add(lblMi_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("No LRN");
		rdbtnNewRadioButton_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		rdbtnNewRadioButton_1_1.setBounds(10, 53, 73, 23);
		panel_9_1_1.add(rdbtnNewRadioButton_1_1);
		
		JRadioButton rdbtnWithLrn_1_1 = new JRadioButton("With LRN");
		rdbtnWithLrn_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		rdbtnWithLrn_1_1.setBounds(132, 53, 84, 23);
		panel_9_1_1.add(rdbtnWithLrn_1_1);
		
		JRadioButton rdbtnNewRadioButton_2_1_1 = new JRadioButton("Returning (Balik-Aral)");
		rdbtnNewRadioButton_2_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		rdbtnNewRadioButton_2_1_1.setBounds(253, 53, 151, 23);
		panel_9_1_1.add(rdbtnNewRadioButton_2_1_1);
		
		JPanel panel_11_1_1 = new JPanel();
		panel_11_1_1.setLayout(null);
		panel_11_1_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "STUDENT INFORMATION", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_11_1_1.setBounds(10, 98, 394, 411);
		panel_9_1_1.add(panel_11_1_1);
		
		JLabel lblPsaBirthCertificate_1_1 = new JLabel("PSA Birth Certificate No.:");
		lblPsaBirthCertificate_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblPsaBirthCertificate_1_1.setBounds(10, 25, 151, 14);
		panel_11_1_1.add(lblPsaBirthCertificate_1_1);
		
		JLabel lblLrn_1_1 = new JLabel("LRN:");
		lblLrn_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblLrn_1_1.setBounds(10, 50, 38, 14);
		panel_11_1_1.add(lblLrn_1_1);
		
		JLabel lblFirstName_1_1 = new JLabel("First Name:");
		lblFirstName_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblFirstName_1_1.setBounds(10, 75, 73, 14);
		panel_11_1_1.add(lblFirstName_1_1);
		
		JLabel lblLastName_1_1 = new JLabel("Last Name:");
		lblLastName_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblLastName_1_1.setBounds(10, 100, 73, 14);
		panel_11_1_1.add(lblLastName_1_1);
		
		JLabel lblMi_3_1_2_1 = new JLabel("Middle Name:");
		lblMi_3_1_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblMi_3_1_2_1.setBounds(10, 125, 88, 14);
		panel_11_1_1.add(lblMi_3_1_2_1);
		
		JLabel lblExtensionName_2_1_1_1 = new JLabel("Extension Name:");
		lblExtensionName_2_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblExtensionName_2_1_1_1.setBounds(10, 150, 103, 14);
		panel_11_1_1.add(lblExtensionName_2_1_1_1);
		
		textField_57 = new JTextField();
		textField_57.setColumns(10);
		textField_57.setBounds(170, 23, 214, 20);
		panel_11_1_1.add(textField_57);
		
		textField_58 = new JTextField();
		textField_58.setColumns(10);
		textField_58.setBounds(170, 48, 214, 20);
		panel_11_1_1.add(textField_58);
		
		textField_59 = new JTextField();
		textField_59.setColumns(10);
		textField_59.setBounds(170, 73, 214, 20);
		panel_11_1_1.add(textField_59);
		
		textField_60 = new JTextField();
		textField_60.setColumns(10);
		textField_60.setBounds(170, 98, 214, 20);
		panel_11_1_1.add(textField_60);
		
		textField_61 = new JTextField();
		textField_61.setColumns(10);
		textField_61.setBounds(170, 123, 214, 20);
		panel_11_1_1.add(textField_61);
		
		textField_62 = new JTextField();
		textField_62.setColumns(10);
		textField_62.setBounds(170, 148, 214, 20);
		panel_11_1_1.add(textField_62);
		
		JDateChooser dateChooser_1_1 = new JDateChooser();
		dateChooser_1_1.setBounds(170, 176, 214, 20);
		panel_11_1_1.add(dateChooser_1_1);
		
		JLabel lblDob_2_1 = new JLabel("Date of Birth:");
		lblDob_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblDob_2_1.setBounds(10, 180, 88, 14);
		panel_11_1_1.add(lblDob_2_1);
		
		JLabel lblDob_1_2_1 = new JLabel("Sex:");
		lblDob_1_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblDob_1_2_1.setBounds(10, 214, 34, 14);
		panel_11_1_1.add(lblDob_1_2_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBounds(170, 206, 214, 22);
		panel_11_1_1.add(comboBox_1_1);
		
		JLabel lblDob_1_1_1_1 = new JLabel("Age:");
		lblDob_1_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblDob_1_1_1_1.setBounds(10, 239, 34, 14);
		panel_11_1_1.add(lblDob_1_1_1_1);
		
		JLabel lblBelongingToAny_1_1 = new JLabel("Belonging to any Indigenous People (IP)");
		lblBelongingToAny_1_1.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		lblBelongingToAny_1_1.setBounds(10, 289, 194, 14);
		panel_11_1_1.add(lblBelongingToAny_1_1);
		
		JLabel lblCommunityIndigenousCultural_1_1 = new JLabel("Community Indigenous Cultural Community?");
		lblCommunityIndigenousCultural_1_1.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		lblCommunityIndigenousCultural_1_1.setBounds(10, 314, 207, 14);
		panel_11_1_1.add(lblCommunityIndigenousCultural_1_1);
		
		JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("YES");
		chckbxNewCheckBox_1_1.setBounds(267, 285, 52, 43);
		panel_11_1_1.add(chckbxNewCheckBox_1_1);
		
		JLabel lblIfYesPlease_1_1 = new JLabel("if Yes, please specify");
		lblIfYesPlease_1_1.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		lblIfYesPlease_1_1.setBounds(10, 339, 103, 14);
		panel_11_1_1.add(lblIfYesPlease_1_1);
		
		JCheckBox chckbxNo_1_1 = new JCheckBox("NO");
		chckbxNo_1_1.setBounds(341, 285, 43, 43);
		panel_11_1_1.add(chckbxNo_1_1);
		
		textField_63 = new JTextField();
		textField_63.setColumns(10);
		textField_63.setBounds(170, 337, 214, 20);
		panel_11_1_1.add(textField_63);
		
		JLabel lblMotherTongue_1_1 = new JLabel("Mother Tongue:");
		lblMotherTongue_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblMotherTongue_1_1.setBounds(10, 366, 96, 14);
		panel_11_1_1.add(lblMotherTongue_1_1);
		
		textField_64 = new JTextField();
		textField_64.setColumns(10);
		textField_64.setBounds(170, 364, 214, 20);
		panel_11_1_1.add(textField_64);
		
		JLabel lblDob_1_1_4_1_1 = new JLabel("Religion:");
		lblDob_1_1_4_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblDob_1_1_4_1_1.setBounds(10, 264, 64, 14);
		panel_11_1_1.add(lblDob_1_1_4_1_1);
		
		textField_65 = new JTextField();
		textField_65.setColumns(10);
		textField_65.setBounds(170, 262, 214, 20);
		panel_11_1_1.add(textField_65);
		
		textField_66 = new JTextField();
		textField_66.setColumns(10);
		textField_66.setBounds(170, 237, 214, 20);
		panel_11_1_1.add(textField_66);
		
		JPanel panel_12_1_1 = new JPanel();
		panel_12_1_1.setLayout(null);
		panel_12_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_12_1_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "ADDRESS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_12_1_1.setBounds(10, 520, 813, 136);
		panel_9_1_1.add(panel_12_1_1);
		
		JLabel lblHouseNumberAnd_1_1 = new JLabel("House Number and Street");
		lblHouseNumberAnd_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblHouseNumberAnd_1_1.setBounds(10, 22, 161, 14);
		panel_12_1_1.add(lblHouseNumberAnd_1_1);
		
		textField_67 = new JTextField();
		textField_67.setColumns(10);
		textField_67.setBounds(299, 20, 504, 20);
		panel_12_1_1.add(textField_67);
		
		JLabel lblBarangay_1_1 = new JLabel("Barangay");
		lblBarangay_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblBarangay_1_1.setBounds(10, 47, 130, 14);
		panel_12_1_1.add(lblBarangay_1_1);
		
		JLabel lblCityMunicipalityprovincecountry_1_1 = new JLabel("City Municipality/Province/Country");
		lblCityMunicipalityprovincecountry_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblCityMunicipalityprovincecountry_1_1.setBounds(10, 72, 214, 14);
		panel_12_1_1.add(lblCityMunicipalityprovincecountry_1_1);
		
		JLabel lblZipCode_1_1 = new JLabel("Zip Code");
		lblZipCode_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblZipCode_1_1.setBounds(10, 97, 130, 14);
		panel_12_1_1.add(lblZipCode_1_1);
		
		textField_68 = new JTextField();
		textField_68.setColumns(10);
		textField_68.setBounds(299, 45, 504, 20);
		panel_12_1_1.add(textField_68);
		
		textField_69 = new JTextField();
		textField_69.setColumns(10);
		textField_69.setBounds(299, 70, 504, 20);
		panel_12_1_1.add(textField_69);
		
		textField_70 = new JTextField();
		textField_70.setColumns(10);
		textField_70.setBounds(299, 95, 504, 20);
		panel_12_1_1.add(textField_70);
		
		JPanel panel_13_1_1 = new JPanel();
		panel_13_1_1.setLayout(null);
		panel_13_1_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "PARENT'S/GUARDIAN'S INFORMATION", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_13_1_1.setBounds(414, 98, 409, 411);
		panel_9_1_1.add(panel_13_1_1);
		
		JLabel lblFathersName_2_1 = new JLabel("Father's Name");
		lblFathersName_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblFathersName_2_1.setBounds(10, 38, 96, 14);
		panel_13_1_1.add(lblFathersName_2_1);
		
		JLabel lblFathersName_1_1_1 = new JLabel("Mother's Maiden Name");
		lblFathersName_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblFathersName_1_1_1.setBounds(10, 138, 140, 14);
		panel_13_1_1.add(lblFathersName_1_1_1);
		
		JLabel lblGuardiansName_1_1 = new JLabel("Guardian's Name");
		lblGuardiansName_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblGuardiansName_1_1.setBounds(10, 238, 117, 14);
		panel_13_1_1.add(lblGuardiansName_1_1);
		
		JLabel lblTelephoneNumber_1_1 = new JLabel("Telephone Number:");
		lblTelephoneNumber_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblTelephoneNumber_1_1.setBounds(10, 338, 130, 14);
		panel_13_1_1.add(lblTelephoneNumber_1_1);
		
		JLabel lblCellphoneNumber_1_1 = new JLabel("Cellphone Number:");
		lblCellphoneNumber_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblCellphoneNumber_1_1.setBounds(10, 363, 130, 14);
		panel_13_1_1.add(lblCellphoneNumber_1_1);
		
		textField_71 = new JTextField();
		textField_71.setColumns(10);
		textField_71.setBounds(185, 57, 214, 20);
		panel_13_1_1.add(textField_71);
		
		textField_72 = new JTextField();
		textField_72.setColumns(10);
		textField_72.setBounds(185, 82, 214, 20);
		panel_13_1_1.add(textField_72);
		
		textField_73 = new JTextField();
		textField_73.setColumns(10);
		textField_73.setBounds(185, 107, 214, 20);
		panel_13_1_1.add(textField_73);
		
		textField_74 = new JTextField();
		textField_74.setColumns(10);
		textField_74.setBounds(185, 338, 214, 20);
		panel_13_1_1.add(textField_74);
		
		textField_75 = new JTextField();
		textField_75.setColumns(10);
		textField_75.setBounds(185, 363, 214, 20);
		panel_13_1_1.add(textField_75);
		
		JLabel lblMiddleName_3_1 = new JLabel("Middle Name:");
		lblMiddleName_3_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblMiddleName_3_1.setBounds(10, 313, 103, 14);
		panel_13_1_1.add(lblMiddleName_3_1);
		
		JLabel lblFirstName_4_3_1 = new JLabel("First Name:");
		lblFirstName_4_3_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblFirstName_4_3_1.setBounds(10, 288, 103, 14);
		panel_13_1_1.add(lblFirstName_4_3_1);
		
		JLabel lblLastName_4_3_1 = new JLabel("Last Name:");
		lblLastName_4_3_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblLastName_4_3_1.setBounds(10, 263, 103, 14);
		panel_13_1_1.add(lblLastName_4_3_1);
		
		JLabel lblLastName_4_1_1_1 = new JLabel("Last Name:");
		lblLastName_4_1_1_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblLastName_4_1_1_1.setBounds(10, 163, 103, 14);
		panel_13_1_1.add(lblLastName_4_1_1_1);
		
		JLabel lblFirstName_4_1_1_1 = new JLabel("First Name:");
		lblFirstName_4_1_1_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblFirstName_4_1_1_1.setBounds(10, 188, 103, 14);
		panel_13_1_1.add(lblFirstName_4_1_1_1);
		
		JLabel lblMiddleName_1_1_1 = new JLabel("Middle Name:");
		lblMiddleName_1_1_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblMiddleName_1_1_1.setBounds(10, 213, 103, 14);
		panel_13_1_1.add(lblMiddleName_1_1_1);
		
		JLabel lblLastName_4_2_1_1 = new JLabel("Last Name:");
		lblLastName_4_2_1_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblLastName_4_2_1_1.setBounds(10, 63, 103, 14);
		panel_13_1_1.add(lblLastName_4_2_1_1);
		
		JLabel lblFirstName_4_2_1_1 = new JLabel("First Name:");
		lblFirstName_4_2_1_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblFirstName_4_2_1_1.setBounds(10, 88, 103, 14);
		panel_13_1_1.add(lblFirstName_4_2_1_1);
		
		JLabel lblMiddleName_2_1_1 = new JLabel("Middle Name:");
		lblMiddleName_2_1_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblMiddleName_2_1_1.setBounds(10, 113, 103, 14);
		panel_13_1_1.add(lblMiddleName_2_1_1);
		
		textField_115 = new JTextField();
		textField_115.setColumns(10);
		textField_115.setBounds(185, 157, 214, 20);
		panel_13_1_1.add(textField_115);
		
		textField_116 = new JTextField();
		textField_116.setColumns(10);
		textField_116.setBounds(185, 182, 214, 20);
		panel_13_1_1.add(textField_116);
		
		textField_117 = new JTextField();
		textField_117.setColumns(10);
		textField_117.setBounds(185, 207, 214, 20);
		panel_13_1_1.add(textField_117);
		
		textField_118 = new JTextField();
		textField_118.setColumns(10);
		textField_118.setBounds(185, 257, 214, 20);
		panel_13_1_1.add(textField_118);
		
		textField_119 = new JTextField();
		textField_119.setColumns(10);
		textField_119.setBounds(185, 282, 214, 20);
		panel_13_1_1.add(textField_119);
		
		textField_120 = new JTextField();
		textField_120.setColumns(10);
		textField_120.setBounds(185, 307, 214, 20);
		panel_13_1_1.add(textField_120);
		
		JYearChooser yearChooser_1_1_1_1 = new JYearChooser();
		yearChooser_1_1_1_1.setBounds(284, 28, 120, 20);
		panel_9_1_1.add(yearChooser_1_1_1_1);
		
		JYearChooser yearChooser_1_2_1 = new JYearChooser();
		yearChooser_1_2_1.setBounds(123, 28, 120, 20);
		panel_9_1_1.add(yearChooser_1_2_1);
		
		JPanel panel_14_1_1 = new JPanel();
		panel_14_1_1.setLayout(null);
		panel_14_1_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "For Returning Learners (Balik-Aral) and Those Who Shall Transfer/Move In", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_14_1_1.setBounds(833, 98, 472, 176);
		panel_9_1_1.add(panel_14_1_1);
		
		JLabel lblPsaBirthCertificate_2_1_1 = new JLabel("Last Grade Level Completed:");
		lblPsaBirthCertificate_2_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblPsaBirthCertificate_2_1_1.setBounds(10, 29, 182, 14);
		panel_14_1_1.add(lblPsaBirthCertificate_2_1_1);
		
		JLabel lblLrn_4_1_1 = new JLabel("Last School Year Completed:");
		lblLrn_4_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblLrn_4_1_1.setBounds(10, 54, 182, 14);
		panel_14_1_1.add(lblLrn_4_1_1);
		
		JLabel lblFirstName_5_1_1 = new JLabel("School Name:");
		lblFirstName_5_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblFirstName_5_1_1.setBounds(10, 79, 114, 14);
		panel_14_1_1.add(lblFirstName_5_1_1);
		
		JLabel lblLastName_5_1_1 = new JLabel("School Address:");
		lblLastName_5_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblLastName_5_1_1.setBounds(10, 104, 114, 14);
		panel_14_1_1.add(lblLastName_5_1_1);
		
		JLabel lblMi_3_1_1_1_1 = new JLabel("School ID:");
		lblMi_3_1_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblMi_3_1_1_1_1.setBounds(10, 129, 88, 14);
		panel_14_1_1.add(lblMi_3_1_1_1_1);
		
		textField_121 = new JTextField();
		textField_121.setColumns(10);
		textField_121.setBounds(248, 27, 214, 20);
		panel_14_1_1.add(textField_121);
		
		textField_122 = new JTextField();
		textField_122.setColumns(10);
		textField_122.setBounds(248, 52, 214, 20);
		panel_14_1_1.add(textField_122);
		
		textField_123 = new JTextField();
		textField_123.setColumns(10);
		textField_123.setBounds(248, 77, 214, 20);
		panel_14_1_1.add(textField_123);
		
		textField_124 = new JTextField();
		textField_124.setColumns(10);
		textField_124.setBounds(248, 102, 214, 20);
		panel_14_1_1.add(textField_124);
		
		textField_125 = new JTextField();
		textField_125.setColumns(10);
		textField_125.setBounds(248, 127, 214, 20);
		panel_14_1_1.add(textField_125);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "ACKNOWLEDGEMENT", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1_3.setBounds(833, 285, 472, 162);
		panel_9_1_1.add(panel_1_3);
		
		JLabel lblFirstName_5_2_2 = new JLabel("Requirements Submitted:");
		lblFirstName_5_2_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblFirstName_5_2_2.setBounds(10, 30, 156, 14);
		panel_1_3.add(lblFirstName_5_2_2);
		
		JCheckBox chckbxNewCheckBox_3_2 = new JCheckBox("Photocopy of birth certificate");
		chckbxNewCheckBox_3_2.setBounds(10, 51, 250, 23);
		panel_1_3.add(chckbxNewCheckBox_3_2);
		
		JCheckBox chckbxNewCheckBox_4_2 = new JCheckBox("Assessment Report");
		chckbxNewCheckBox_4_2.setBounds(10, 77, 173, 23);
		panel_1_3.add(chckbxNewCheckBox_4_2);
		
		JCheckBox chckbxNewCheckBox_5_2 = new JCheckBox("Medical Certificate");
		chckbxNewCheckBox_5_2.setBounds(10, 103, 156, 23);
		panel_1_3.add(chckbxNewCheckBox_5_2);
		
		JButton btnClear_2 = new JButton("CLEAR");
		btnClear_2.setForeground(Color.WHITE);
		btnClear_2.setFont(new Font("Lucida Console", Font.BOLD, 14));
		btnClear_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnClear_2.setBackground(new Color(220, 20, 60));
		btnClear_2.setBounds(833, 580, 220, 45);
		panel_9_1_1.add(btnClear_2);
		
		JButton btnUpdate_2 = new JButton("UPDATE");
		btnUpdate_2.setForeground(Color.WHITE);
		btnUpdate_2.setFont(new Font("Lucida Console", Font.BOLD, 14));
		btnUpdate_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnUpdate_2.setBackground(new Color(220, 20, 60));
		btnUpdate_2.setBounds(1085, 580, 220, 45);
		panel_9_1_1.add(btnUpdate_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "STUDENT'S STATUS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(833, 458, 472, 89);
		panel_9_1_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblFirstName_5_2_2_1 = new JLabel("Is this student still active?");
		lblFirstName_5_2_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblFirstName_5_2_2_1.setBounds(10, 32, 156, 14);
		panel_2.add(lblFirstName_5_2_2_1);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Active");
		rdbtnNewRadioButton_3.setBounds(6, 53, 109, 23);
		panel_2.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Inactive");
		rdbtnNewRadioButton_4.setBounds(234, 53, 109, 23);
		panel_2.add(rdbtnNewRadioButton_4);
	}
}
