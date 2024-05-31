package homework7TestIntegrationAndMokito.dao;

import homework7TestIntegrationAndMokito.conecctionDB.ConnectionDB;
import homework7TestIntegrationAndMokito.domain.Product;
import homework7TestIntegrationAndMokito.domain.ShoppingCart;


public class ProductServiceImpl implements ProductService{

    ShoppingCart shoppingCart = new ShoppingCart();

    public ProductServiceImpl(ShoppingCart shoppingCart) {
        shoppingCart = this.shoppingCart;
    }
    @Override
    public void addProductToCart(Product product, int quantity) {

    }
}
