package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExampleDB {

    public static void useDB(){

            String createTableQuery = "CREATE TABLE IF NOT EXISTS usuarios (id INT, nombre VARCHAR(50))";
            String insertQuery = "INSERT INTO usuarios VALUES (1, 'John Doe'), (2, 'Jane Smith')";
            String selectQuery = "Select * from Usuarios";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/ej", "username", "password");
            Statement statement = connection.createStatement();

            statement.executeUpdate(createTableQuery);
            statement.executeUpdate(insertQuery);

            ResultSet resultado = statement.executeQuery(selectQuery);
            while(resultado.next()) {
                System.out.println("User:" + resultado.getInt("id") + " Name: " + resultado.getString("nombre"));
            }

            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
