package aplicacionFlorencia.dao.impl;

import aplicacionFlorencia.ConexionDB.ConexionDB;
import aplicacionFlorencia.dao.interfaces.PacienteDao;
import aplicacionFlorencia.dominio.Paciente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PacienteDaoImp implements PacienteDao {
    @Override
    public Paciente getPaciente(int id) {
        try(Connection connection = ConexionDB.getConnection()){
            String sql = "SELECT * FROM pacientes WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String patology = resultSet.getString("patology");
                return new Paciente(id, name, age, patology);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public List<Paciente> getAllPaciente() {
        List<Paciente> pacientes = new ArrayList<>();
        try(Connection con = ConexionDB.getConnection()){
            String sql = "SELECT * FROM pacientes";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String patology = resultSet.getString("patology");
                pacientes.add(new Paciente(id, name, age, patology));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return pacientes;
    }

    @Override
    public void cratePaciente(String name, int age, String patology) {
        try(Connection con = ConexionDB.getConnection()){
            String sql = "INSERT INTO pacientes (name, age, patology) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            preparedStatement.setString(3, patology);
            preparedStatement.execute();
            System.out.println("Datos ingresados con exito");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
