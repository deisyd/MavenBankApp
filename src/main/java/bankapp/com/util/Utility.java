package bankapp.com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Utility {
	private static final String CONNECTION_USERNAME = "postgres";
	private static final String CONNECTION_PASSWORD = "pass";
	private static final String CONNECTION_URL = "jdbc:postgresql://localhost:5432/postgres";
	private static Connection connection;
	
	public static Connection getConnection() throws SQLException {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException ex) {
			System.out.println("Could not register driver!");
			ex.printStackTrace();
		}
		if(connection == null || connection.isClosed()) {
			connection = DriverManager.getConnection(CONNECTION_URL, CONNECTION_USERNAME, CONNECTION_PASSWORD);
		}
		return connection;
		
	}
}
