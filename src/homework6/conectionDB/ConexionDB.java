package homework6.conectionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    private static final String jdcUrl = "jdbc:h2:~/personas";
    private static final String username = "sas";
    private static final String password = "";
    public static Connection getConnection(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(jdcUrl, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
