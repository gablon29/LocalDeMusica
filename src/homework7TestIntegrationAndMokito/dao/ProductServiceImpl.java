package homework7TestIntegrationAndMokito.dao;

import homework7TestIntegrationAndMokito.conecctionDB.ConnectionDB;
import homework7TestIntegrationAndMokito.domain.Product;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService{
    @Override
    public List<Product> addProductToCart() {
        List<Product> productos = new ArrayList<>();
        try(Connection connection = ConnectionDB.getConnection()) {

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
