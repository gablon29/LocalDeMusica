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
    public void addProduct(Product product){ products.add(product);}
    public int getTotalProduct(){return products.size();}
    public List<Product> getProducts() {return products;}
}