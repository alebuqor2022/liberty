package edu.curso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearProveedores {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/liberty";
		Connection con=null;
		Statement stmt;
		String misql="create table proveedores ("
				+ "sup_name varchar(32), " 
				+ "sup_id int(5) primary key, " 
				+ "street varchar(40), " 
				+ "city varchar(20), " 
				+ "state char(2), " 
				+ "zip char(5))";
		
		try {
			con=DriverManager.getConnection(url, "root", "1234");
			stmt=con.createStatement();
			stmt.executeUpdate(misql);
			
			stmt.close();
			con.close();
			
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}



	}

}
