package homework7TestIntegrationAndMokito.domain;

import homework7TestIntegrationAndMokito.conecctionDB.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public void addProduct(int id, String name) {
        try (Connection connection = ConnectionDB.getConnection()) {
            String sql = "INSERT INTO productos (id, name) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            boolean resp = preparedStatement.execute();
            if (resp) {
                System.out.println("El producto se agrego con exito");
            }
            else {
                System.out.println("Ups algo salio mal");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public List<Product> getTotalProduct(){
        List<Product> products = new ArrayList<>();
        try(Connection connection = ConnectionDB.getConnection()) {
            //creamos la consulta
            String sql = "SELECT * FROM productos";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            // guardamos en una varible de resultSet para ver la respuesta
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                // instanciamos cada resultado y lo guardamos dentro de nuestra lista de productos.
                products.add(new Product(name, id));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return products;
    }
    public Product getProduct(int id) {
        return null;
    }
}
