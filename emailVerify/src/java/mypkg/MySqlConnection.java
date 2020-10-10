package mypkg;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlConnection {
	static Connection conn;
	
	public static Connection getConnection() {

		try {
			
			System.out.println("Connecting... ");
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// Database link, username and password
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "zapro", "root");
			System.out.println("Connection Succeeded");
			
		} catch (Exception e) {
			System.out.println(" Error at MySqlConnection.java: " + e);
		}
		
		return conn;
	}
	
}
