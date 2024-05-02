package homework5.connectionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDb {
    private static final String url = "jdbc:h2:~/tarjeta";
    private static final String username = "gabriel";
    private static final String password = "";

    public static Connection getConection(){
            Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
