package com.soyhenry.ej11.conf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface MySQLConnection {

    default Connection conectarDB() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }

        Connection conexion = null;
        String url = "jdbc:mysql://localhost:3306/test";
        String usr = "root";
        String clave = "";


        try {
            conexion = DriverManager.getConnection(url, usr, clave);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conexion;

    }

}
