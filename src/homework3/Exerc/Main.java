package homework3.Exerc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // establecemos conexion
        String url = "jdbc:h2:~/test";
        String username = "sa";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, username,password);
            Statement statement = connection.createStatement();
            String createTable = "CREATE TABLE IF NOT EXISTS amigos_gabriel (id INT PRIMARY KEY AUTO_INCREMENT, nombre VARCHAR(50))";
            statement.executeUpdate(createTable);
            String insertRegistro = "INSERT INTO amigos_gabriel VALUES ('gabriel'), ('lucas')";
            statement.executeUpdate(insertRegistro);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        }

    }

