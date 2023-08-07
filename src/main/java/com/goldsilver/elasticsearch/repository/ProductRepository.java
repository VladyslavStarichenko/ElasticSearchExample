package com.goldsilver.elasticsearch.repository;

import com.goldsilver.elasticsearch.model.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductRepository extends ElasticsearchRepository<Product,Integer> {
}


