package abc.conexion;

import java.sql.Connection;
import java.sql.SQLException;

public class testConexion {
	public static void main(String[] args){
		
		try {
			Connection connection = conexion.getConnection();
			System.out.println("Conection ON");
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
