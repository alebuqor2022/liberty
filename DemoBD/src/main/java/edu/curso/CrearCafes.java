package edu.curso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearCafes {
    public static void main(String[] args) {
        boolean check=chequearDriver();
        if(check){
            System.out.println("ok");
            conectar();
        } else {
            System.out.println("NO ok");
        }

    }

    static boolean chequearDriver(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("no encontro el driver");
            return false;
        }

        return true;
    }

    static void conectar(){
        String url="jdbc:mysql://localhost:3306/liberty";
        Connection con=null;
        Statement stmt=null;

        String query="create table cafes (" +
                "idcafe int primary key not null auto_increment, " +
                "cof_name varchar(32), " +
                "sup_id int(5), " +
                "price float" +
                ")";

        try {
            con= DriverManager.getConnection(url,"root", "1234");
            stmt=con.createStatement();
            stmt.executeUpdate(query);

            stmt.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


    }

}
