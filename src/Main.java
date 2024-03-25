
import java.sql.*;


public class Main {
            public static void main(String[] args) {
                // establecemos conexion
                String url = "jdbc:h2:~/personas";
                String username = "sa";
                String password = "";
                String Drive_DB = "org.h2.Driver";
                try {
                    Class.forName(Drive_DB);
                    Connection connection = DriverManager.getConnection(url, username, password);
                    String insertRegister = "INSERT INTO personas.amigos (id, name) " +
                            "VALUES(?, ?)";
                    PreparedStatement preparedStatement = connection.prepareStatement(insertRegister);
                    preparedStatement.setInt(1, 1);
                    preparedStatement.setString(2, "Gabriel Londero");
                    int rowsInsert = preparedStatement.executeUpdate();
                    System.out.println("filas insertadas: " + rowsInsert);
                    preparedStatement.close();
                    connection.close();
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }

