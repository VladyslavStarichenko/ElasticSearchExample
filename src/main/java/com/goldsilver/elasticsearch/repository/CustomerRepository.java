package com.goldsilver.elasticsearch.repository;

import com.goldsilver.elasticsearch.model.Customer;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface CustomerRepository extends ElasticsearchRepository<Customer, String> {

    List<Customer> findByFirstname(String firstName);

}