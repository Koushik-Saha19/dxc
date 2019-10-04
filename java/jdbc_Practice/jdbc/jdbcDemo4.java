package jdbc;
//in this program we are updating a table..which was created previously
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcDemo4 {

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dxc","root","root");
		Statement stat = con.createStatement();
		int rowsAffected1 = stat.executeUpdate("insert into employee value(98,'kife','pune',96)");
		
		int rowsAffected2 = stat.executeUpdate("update employee set salary=99 where empName=Jason");
		System.out.println(rowsAffected1 + "inserted created");
		System.out.println(rowsAffected2 + "updated created");
	}

}
