package com.api.springproduct.repository;

import com.api.springproduct.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {

    List<Product> findAll();

    Product findById(String id);

    void delete(Product product);

    <prod extends Product> prod save(prod product);

}
