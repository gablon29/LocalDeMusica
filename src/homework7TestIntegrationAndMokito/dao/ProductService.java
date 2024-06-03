package homework7TestIntegrationAndMokito.dao;

import homework7TestIntegrationAndMokito.domain.Product;

import java.util.List;

public interface ProductService {

  void addProductToCart(Product product, int quantity);
}
