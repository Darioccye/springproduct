package com.api.springproduct.controller;


import com.api.springproduct.model.Product;
import com.api.springproduct.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apiproduct")
public class ProductController {

    @Autowired
    private ProductRepository repo;

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public List<Product> getProducts() {
        return repo.findAll();
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    public @ResponseBody Product getProductById(@PathVariable String id) {
        return repo.findById(id);
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public @ResponseBody Product createProduct(@RequestBody Product product) {
        return repo.save(product);
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
    public @ResponseBody Product deleteProductById(@PathVariable String id) {
        Product prod = repo.findById(id);
        if (prod == null) {
            return null;
        } else {
            repo.delete(prod);
            return prod;
        }
    }

    @RequestMapping(value="/products", method = RequestMethod.PUT)
    public @ResponseBody Product updateProduct(@RequestBody Product product) {
        return repo.save(product);
    }

}
