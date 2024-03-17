import org.h2.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


        public class Main {
            public static void main(String[] args) {
                // establecemos conexion
                String url = "jdbc:h2:~/personas";
                String username = "sa";
                String password = "";
                String Drive_DB = "org.h2.Driver";
                try {
                    Class.forName(Drive_DB);
                    Connection connection = DriverManager.getConnection(url, username,password);
                    Statement statement = connection.createStatement();
                    String insertNewRegister = "";
                    statement.executeUpdate(insertNewRegister);
                } catch (SQLException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }

        }

