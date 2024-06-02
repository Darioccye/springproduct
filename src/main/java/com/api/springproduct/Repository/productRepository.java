package com.api.springproduct.Repository;

import com.api.springproduct.Model.product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface productRepository extends CrudRepository<product, Integer> {

    List<product> findAll();

    product findById(String id);

    void delete(product product);

    <prod extends product> prod save(prod product);

}
