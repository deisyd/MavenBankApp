package bankapp.com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleConnection {
	private static final String CONNECTION_USERNAME = "postgres";
	
	private static final String CONNECTION_PASSWORD = "pass";
	
	private static final String CONNECTION_URL = "jdbc:postgresql://localhost:5432/postgres";
	
	// test connection
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException ex) {
			System.out.println("Could not register driver!");
			ex.printStackTrace();
		}
		
		// try to connect 
		try {
			Connection connection = DriverManager.getConnection(CONNECTION_URL, CONNECTION_USERNAME, CONNECTION_PASSWORD);
			System.out.println("Connection is valid: " + connection.isValid(5));
			connection.close();
		} catch (SQLException ex) {
			System.out.println("Failed to connect!");
			ex.printStackTrace();
		}
	}
}