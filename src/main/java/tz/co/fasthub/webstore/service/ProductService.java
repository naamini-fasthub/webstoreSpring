package tz.co.fasthub.webstore.service;

import tz.co.fasthub.webstore.domain.Product;

import java.util.List;
import java.util.Map;

/**
 * Created by root on 1/3/17.
 */
public interface ProductService {
    void updateAllStock();

    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByFilter(Map<String, List<String>> filterParams);
    Product getProductById(String productID);

    void addProduct(Product product);

}
