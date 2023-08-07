package com.goldsilver.elasticsearch.controller;

import com.goldsilver.elasticsearch.model.Product;
import com.goldsilver.elasticsearch.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apis")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/findAll")
    Iterable<Product> findAll() {
        return productService.getProducts();

    }

    @PostMapping("/insert")
    public Product insertProduct(@RequestBody Product product) {
        return productService.insertProduct(product);
    }

}


