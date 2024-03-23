package pruebaSQL;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:h2:~/personas";
        String username = "sa";
        String password = "";
        String Drive_DB = "org.h2.Driver";
        ClassDao classDao = new ClassDao();
        String nuevoRegistro = classDao.insertar(new Persona(2, "Lucas"));
        List<Persona> listaPersonas = new ArrayList<>();
        try {
            Class.forName(Drive_DB);
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            String peticion = "SELECT * FROM personas.amigos";
            ResultSet resultSet = statement.executeQuery(peticion);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Persona persona = new Persona(id, name);
                listaPersonas.add(persona);
            }
            for (Persona persona: listaPersonas
                 ) {
                System.out.println(persona);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
