package homework7TestIntegrationAndMokito.domain;

import homework7TestIntegrationAndMokito.conecctionDB.ConnectionDB;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> products = new ArrayList<>();
    private void addProduct(Product product){ products.add(product);}
    private List<Product> getTotalProduct(){return products;}
    public Product getProduct(Product product) {return product;}
}
//        try(Connection connection = ConnectionDB.getConnection()) {
//            //creamos la consulta
//            String sql = "SELECT * FROM productos";
//            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            // guardamos en una varible de resultSet para ver la respuesta
//            ResultSet resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()){
//                int id = resultSet.getInt("id");
//                String name = resultSet.getString("name");
//                // instanciamos cada resultado y lo guardamos dentro de nuestra lista de productos.
//                products.add(new Product(name, id));
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        return products;