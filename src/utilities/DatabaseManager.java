package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
	private static Connection connection;

	private DatabaseManager() {}

	public static Connection initialize() {
		try {
			if (connection == null) {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DESPAT_FP", "", "");
				connection = conn;
				return connection;
			}
			
			return connection;

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static void initializeTable() {
		if(connection == null) {
			initialize();
		}
	}

}
