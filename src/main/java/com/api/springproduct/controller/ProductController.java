package com.api.springproduct.controller;


import com.api.springproduct.model.Product;
import com.api.springproduct.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Product> getProducts() {
        return repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody Product getProductById(@PathVariable String id) {
        return repository.findById(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public @ResponseBody Product createProduct(@RequestBody Product product) {
        return repository.save(product);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public @ResponseBody Product deleteProductById(@PathVariable String id) {
        Product product = repository.findById(id);
        if (product == null) {
            return null;
        } else {
            repository.delete(product);
            return product;
        }
    }

    @RequestMapping(value="/", method = RequestMethod.PUT)
    public @ResponseBody Product updateProduct(@RequestBody Product product) {
        return repository.save(product);
    }

}
