package conf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface H2Connection {
    default Connection conectarDB() {

        Connection conexion = null;
        String url = "jdbc:h2:~/test";
        String usr = "username";
        String clave = "password";

        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }

        try {
            conexion = DriverManager.getConnection(url, usr, clave);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conexion;

    }
}
