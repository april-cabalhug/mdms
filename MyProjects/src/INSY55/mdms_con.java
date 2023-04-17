package INSY55;

import java.sql.*;
import javax.swing.*;

public class mdms_con {
	public static Connection ConnectDB()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mdms", "root","");
			return conn;
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Connection Error!");
			return null;
		}
	}
}
