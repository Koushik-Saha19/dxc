package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcDemo2 {

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dxc","root","root");
		Statement stat = con.createStatement();
		ResultSet res = stat.executeQuery("select *from product");//ResultSet is a built in interface
		
		while(res.next()) {
			System.out.println(res.getString(1));
			System.out.println(res.getString(2));
			System.out.println(res.getString(3));
			System.out.println(res.getString(4));
		}
	}

}
