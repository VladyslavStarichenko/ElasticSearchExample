package com.goldsilver.elasticsearch.service;

import com.goldsilver.elasticsearch.model.Product;
import com.goldsilver.elasticsearch.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Iterable<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product insertProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Product product, int id) {
        Product product1 = productRepository.
                findById(id).orElseThrow(() ->
                        new RuntimeException("There is an error occurred in getting product with id: " + id));
        product1.setPrice(product.getPrice());
        return product1;
    }

    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }
}
