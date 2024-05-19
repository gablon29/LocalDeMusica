package pruebaSQL;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClassDaoImpl implements InterfazDaoNadadores {

    @Override
    public Nadadores getNadador(int id) {
        try(Connection connection = ConexionDB.getConextion()) {

            String sql = "SELECT * FROM NADADORES WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String nombre = resultSet.getString("name");
                return new Nadadores(nombre);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public List<Nadadores> getAllNadadores() {
        List<Nadadores> nadadores = new ArrayList<>();
        try(Connection con = ConexionDB.getConextion()) {
            String sql = "SELECT * FROM NADADORES";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                nadadores.add(new Nadadores(name));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return nadadores;
    }
}
