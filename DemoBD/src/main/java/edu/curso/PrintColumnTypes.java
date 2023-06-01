package edu.curso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class PrintColumnTypes {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/liberty";
		Connection con=null;
		Statement stmt;
		String misql="Select * from cafes";
		
		try {
			con=DriverManager.getConnection(url, "root", "1234");
			stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(misql);// trae los datos
			ResultSetMetaData rsmd=rs.getMetaData();// trae info de la estructura del query
			// printColTypes(rsmd);
			
			int nroCols=rsmd.getColumnCount();
			for(int i=1; i<= nroCols; i++) {
				System.out.print(rsmd.getColumnName(i) + "   ");
			}
			System.out.println();
			while(rs.next()) {				
				for(int i=1; i<= nroCols; i++) {
					System.out.print(rs.getString(i)+ "  ");
				}
				System.out.println();
			}
			rs.close();
			stmt.close();
			con.close();
			
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void printColTypes(ResultSetMetaData rsmd) throws SQLException {
		int columns=rsmd.getColumnCount();
		for(int i=1; i<=columns; i++) {
			int jdbcType=rsmd.getColumnType(i);
			String formato=rsmd.getColumnTypeName(i);
			String nombre = rsmd.getColumnName(i);
			String tipo=rsmd.getColumnClassName(i);
			System.out.println(nombre + " tipo Java: "+ tipo + " la columna " + i + " es de tipo " +
			jdbcType + " su formato en BD es " + formato);
		}
	}
	/*
	La columna 1 es jdbcType 12, la cual es VARCHAR
	La columna 2 es jdbcType 4, la cual es INT
	La columna 3 es jdbcType 7, la cual es FLOAT
	La columna 4 es jdbcType 4, la cual es INT
	La columna 5 es jdbcType 4, la cual es INT
	*/	
	
}
