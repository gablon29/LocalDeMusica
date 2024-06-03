package homework7TestIntegrationAndMokito.dao;

import homework7TestIntegrationAndMokito.domain.Product;
import homework7TestIntegrationAndMokito.domain.ShoppingCart;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static  org.mockito.Mockito.*;
class ProductServiceImplTest {

    @Test
    @DisplayName("Prueba de test con junit y mockito")
    public void pruebaTestShoppingCart(){
        //GIVEN
        // Generamos el mock
        ShoppingCart carrito = mock(ShoppingCart.class);
        ProductService productService = new ProductServiceImpl(carrito);
        Product product = new Product("televisor", 233);
        int quantity = 2;
        //WHEN
        productService.addProductToCart(product, quantity);
        //THEN
        verify(carrito, times(quantity)).addProduct(product);
    }
}