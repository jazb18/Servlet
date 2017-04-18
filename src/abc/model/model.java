package abc.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import abc.employee;
import abc.common.DTO;
import abc.conexion.conexion;

public class model extends DTO<employee> {

	@Override
	public List<employee> list() {

		List<employee> employees = new ArrayList<>();

		try {
			Connection conn = conexion.getConnection();
			String sql = "SELECT * FROM EMPLOYEE";
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);

			if (result.next()) {
				employee emp = new employee();
				emp.setId(result.getInt("id"));
				emp.setName(result.getString("name"));
				employees.add(emp);
			}

			result.close();
			statement.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return employees;
	}

	@Override
	public int save() {
		
		int iresult = 0;
		
		try {
			Connection conn = conexion.getConnection();
			String sql = "INSERT INTO EMPLOYEE (name,joining_date,salary,ssn)" 
			+ " values (?,?,?,?)";

			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, "Vicky mio");
			pstm.setString(2, "1990-08-10");
			pstm.setInt(3, 6000);
			pstm.setString(4, "ssn00000004");
			
			iresult = pstm.executeUpdate() == 1 ? 1 : 0;
			
			pstm.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return iresult; 

	}

}
