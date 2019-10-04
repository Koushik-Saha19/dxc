package jdbc;
//in this program we are updating a table..which was created previously
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class jdbcDemo5 {

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter emp Id");int eId = scanner.nextInt();
		System.out.println("Enter emp name");String ename = scanner.next();
		System.out.println("Enter emp address");String eaddress = scanner.next();
		System.out.println("Enter emp salary");int salary = scanner.nextInt();
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded");
		
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dxc","root","root");
		PreparedStatement stat =con.prepareStatement("insert into employee values(?,?,?,?)");
		
		stat.setInt(1,eId);
		stat.setString(2,ename);
		stat.setString(3,eaddress);
		stat.setInt(4,salary);
		int rowsAffected = stat.executeUpdate();
		
		System.out.println(rowsAffected + " inserted created");
		
	}

}
