package com.dxc.pms.dbcon;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {

	public DBConnection() {
		
	}
	
	public static Connection getConnection() {
		Properties properties = new Properties();
		String username =null;
		String password =null;
        String driver =null;
		String url =null;

		try {
			
			FileReader reader = new FileReader("C:\\Desktop\\Training\\Java Training\\ProductManagementSystem-jdbc\\URL_USERNAME_PASSWORD.properties");
			properties.load(reader);
			username = properties.getProperty("Username");
			password = properties.getProperty("Password");
			driver = properties.getProperty("Driver");
			url = properties.getProperty("Url");
		}catch(IOException e1) {
			e1.printStackTrace();
		}
		
		
		try {
			
			Class.forName(driver);
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url,username,password);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
