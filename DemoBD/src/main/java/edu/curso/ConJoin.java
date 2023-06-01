package edu.curso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConJoin {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/liberty";
		Connection con=null;
		Statement stmt;
		String misql="SELECT sup_name, cof_name, price FROM "
				+ "cafes INNER JOIN proveedores "
				+ "ON cafes.sup_id=proveedores.sup_id "
				+ "ORDER BY sup_name";
		try {
			con=DriverManager.getConnection(url, "root", "1234");
			stmt=con.createStatement();
			
			ResultSet rs=stmt.executeQuery(misql);
			
			while(rs.next()) {
				String proveedor=rs.getString("sup_name");
				String cafe=rs.getString("cof_name");
				float precio=rs.getFloat(3);
				System.out.println(proveedor + " vende " + cafe + " a $ " + precio);
			}
			
			
			stmt.close();
			con.close();
			
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

}
