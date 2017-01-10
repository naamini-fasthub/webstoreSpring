package tz.co.fasthub.webstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tz.co.fasthub.webstore.domain.Product;
import tz.co.fasthub.webstore.domain.repository.ProductRepository;
import tz.co.fasthub.webstore.service.ProductService;

import java.util.List;
import java.util.Map;

/**
 * Created by root on 12/22/16.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void updateAllStock() {
        List<Product> allProducts = productRepository.getAllProducts();

        for(Product product : allProducts) {
            if(product.getUnitsInStock()<500)
                productRepository.updateStock(product.getProductId(), product.getUnitsInStock()+1000);
        }
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    public List<Product> getProductsByCategory(String category) {
        return productRepository.getProductsByCategory(category);
    }

    public List<Product> getProductsByFilter(Map<String, List<String>> filterParams) {
        return productRepository.getProductsByFilter(filterParams);
    }

    @Override
    public Product getProductById(String productID) {
        return productRepository.getProductById(productID);
    }

    @Override
    public void addProduct(Product product) {
        productRepository.addProduct(product);
    }

}


