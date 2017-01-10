package tz.co.fasthub.webstore.domain.repository;

import tz.co.fasthub.webstore.domain.Product;

import java.util.List;
import java.util.Map;

public interface ProductRepository {

    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByFilter(Map<String,List<String>> filterParams);
    Product getProductById(String productID);

    void updateStock(String productId, long noOfUnits);
    void addProduct(Product product);
}
