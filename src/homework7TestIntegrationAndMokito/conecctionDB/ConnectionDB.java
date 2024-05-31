package homework7TestIntegrationAndMokito.conecctionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    private static final String urlConnection = "jdbc:h2:~/productosHm7";
    private static final String username = "sa";
    private static final String password = "";

    public static Connection getConnection(){
        Connection connection = null;
        try{
           connection = DriverManager.getConnection(urlConnection, username,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
