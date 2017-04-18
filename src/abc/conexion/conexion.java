package abc.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class conexion {
	
	private conexion(){}
	
	public static Connection getConnection() throws SQLException{
		
		Connection conn = null;
		
		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://127.0.0.1:3306/test";
			String user = "root";
			String pass = "halion";
			
			Class.forName(driver).newInstance();
			conn = DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException e) {
		    throw new SQLException("not found driver");
	    } catch (SQLException e) {
		    throw e;
	    } catch (Exception e) {
	    	throw new SQLException("Error connection in data base");
	    }
			return conn;
		
	}
}
