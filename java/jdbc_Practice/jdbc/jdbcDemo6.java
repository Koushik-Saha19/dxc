package jdbc;
//in this program we are updating a table..which was created previously
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class jdbcDemo6 {

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter emp Id");int eId = scanner.nextInt();
		System.out.println("Enter emp newName to update");String newName = scanner.next();
		System.out.println("Enter emp newAddress to update");String newAddress = scanner.next();
		System.out.println("Enter emp newSalary to update");int newSalary = scanner.nextInt();
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded");
		
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dxc","root","root");
		PreparedStatement stat =con.prepareStatement("update employee set empName = ?, empAddress=?,salary=? where empId= " + eId);
		
		
		stat.setString(1,newName);
		stat.setString(2,newAddress);
		stat.setInt(3,newSalary);
		int rowsAffected = stat.executeUpdate();
		
		System.out.println(rowsAffected + " updated successfully");
		
	}

}

