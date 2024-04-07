package homework6.conectionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

    private static final String url = "jdbc:h2:~/tar";
    private static final String username = "sa";
    private static final String password = "";

    public static Connection getConnectionDB(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url,username,password);
        }  catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
