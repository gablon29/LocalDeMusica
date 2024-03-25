package homework5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:h2:~/tarjeta";
        String username = "gabriel";
        String password = "";
        String controller_Drive = "org.h2.Driver";

        try {
            Class.forName(controller_Drive);
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
//          String createSchema = "CREATE SCHEMA IF NOT EXISTS targetBank";
//          String createTable = "CREATE TABLE IF NOT EXISTS targetBank.creditsCard" +
//                    "(id INT PRIMARY KEY, number VARCHAR(50), titular VARCHAR(50))";
            String createRegister = "INSERT INTO targetBank.creditsCard (id, number, titular)" +
                    "VALUES (1, '123456789', 'Gabriel')," +
                    "(2, '987654321', 'Florencia')," +
                    "(3, '123789456','Ariel')";
            statement.executeUpdate(createRegister);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
