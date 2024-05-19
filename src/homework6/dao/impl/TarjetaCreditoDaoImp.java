package homework6.dao.impl;

import homework6.conectionDB.ConexionDB;
import homework6.dao.TarjetaCreditoDao;
import homework6.domain.TarjetaCredito;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TarjetaCreditoDaoImp implements TarjetaCreditoDao {
    @Override
    public TarjetaCredito getTarjetaDeCreditoById(int id) {
        try(Connection connection = ConexionDB.getConnection()) {
            String sql = "SELECT name, titular FROM tarjetasDeCredito WHERE id = ?";
            PreparedStatement preparedStatement =connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String numero = resultSet.getString("numero");
                String titular = resultSet.getString("titular");
                return new TarjetaCredito(numero, titular);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return null;
    }

    @Override
    public List<TarjetaCredito> getAllTarjetaDeCredito() {
        List<TarjetaCredito> tarjetaCreditos = new ArrayList<>();
        try(Connection connection = ConexionDB.getConnection()) {
            String sql = "SELECT name, titular FROM tarjetasDeCredito";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
