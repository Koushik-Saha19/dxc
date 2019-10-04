package jdbc;
//here we are creating a table
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcDemo3 {

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dxc","root","root");
		Statement stat = con.createStatement();
		stat.execute("create table pap (mypid int, ename varchar(20))");
		
		System.out.println("Table created");
	}

}

