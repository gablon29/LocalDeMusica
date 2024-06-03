package homework7TestIntegrationAndMokito.dao;

import homework7TestIntegrationAndMokito.domain.Product;
import homework7TestIntegrationAndMokito.domain.ShoppingCart;


public class ProductServiceImpl implements ProductService{

    ShoppingCart shoppingCart;

    public ProductServiceImpl(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
    @Override
    public void addProductToCart(Product product, int quantity) {
        for (int i = 0; i < quantity; i++) {
            shoppingCart.addProduct(product);
        }
    }
}
