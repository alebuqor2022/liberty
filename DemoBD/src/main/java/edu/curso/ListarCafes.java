package edu.curso;

import java.sql.*;

public class ListarCafes
{
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/liberty";
        Connection con=null;
        Statement stmt=null;
        String query="Select * from cafes";

        try {
            con= DriverManager.getConnection(url,"root", "1234");
            stmt=con.createStatement();
            // stmt.executeUpdate(query); --> solo sirve para INSERT, UPDATE, DELETE
            ResultSet rs=stmt.executeQuery(query);

            while(rs.next()){
                String nombre=rs.getString("cof_name");
                float precio=rs.getFloat(4);
                System.out.println(nombre + " su precio es " + precio);
            }

            stmt.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
