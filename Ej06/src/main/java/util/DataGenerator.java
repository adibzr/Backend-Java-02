package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

public class DataGenerator {

    private static String url = "jdbc:h2:~/test";
//    private static String url = "jdbc:h2:mem:test";
    private static String userName = "username";
    private static String password = "password";

    public static void generate() {

        String createTableFile = "src/main/resources/tables.sql";
        String createUsersFile = "src/main/resources/data.sql";

        try (Connection connection = DriverManager.getConnection(url, userName, password)) {
            executeSqlScript(connection, createTableFile);
            executeSqlScript(connection, createUsersFile);
            System.out.println("Usuarios generados.");

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void printUsers(){

        String selectQuery = "SELECT * FROM Users";

        try (Connection connection = DriverManager.getConnection(url, userName, password)) {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(selectQuery);
            while(result.next()) {
                System.out.println("UserId:" + result.getInt("id")
                        + " Nombre: " + result.getString("nombreapellido")
                        + " Mail: " + result.getString("mail")
                        + " Dirección: " + result.getString("DIRECCION")
                );
            }

        } catch (SQLException  e) {
            e.printStackTrace();
        }
    }

    public static void printDepartments(){

        String selectQuery = "SELECT * FROM departments";

        try (Connection connection = DriverManager.getConnection(url, userName, password)) {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(selectQuery);
            while(result.next()) {
                System.out.println("UserId:" + result.getInt("id")
                        + " Name: " + result.getString("name")
                        + " Description: " + result.getString("description")
                );
            }

        } catch (SQLException  e) {
            e.printStackTrace();
        }
    }

    private static void executeSqlScript(Connection connection, String filePath) throws IOException, SQLException {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath));
             Statement statement = connection.createStatement()) {

            String line;
            StringBuilder sql = new StringBuilder();

            while ((line = br.readLine()) != null) {
                sql.append(line).append("\n");
                if (line.trim().endsWith(";")) {
                    statement.execute(sql.toString());
                    sql.setLength(0);
                }
            }

            if (sql.length() > 0) {
                statement.execute(sql.toString());
            }
        }
    }
}
