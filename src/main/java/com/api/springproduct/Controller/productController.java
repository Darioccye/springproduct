package com.api.springproduct.Controller;


import com.api.springproduct.Model.product;
import com.api.springproduct.Repository.productRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apiproduct")
public class productController {

    @Autowired
    private productRepository repo;

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public List<product> getProducts() {
        return repo.findAll();
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    public @ResponseBody product getProductById(@PathVariable String id) {
        return repo.findById(id);
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public @ResponseBody product createProduct(@RequestBody product product) {
        return repo.save(product);
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
    public @ResponseBody product deleteProductById(@PathVariable String id) {
        product prod = repo.findById(id);
        if (prod == null) {
            return null;
        } else {
            repo.delete(prod);
            return prod;
        }
    }

    @RequestMapping(value="/products", method = RequestMethod.PUT)
    public @ResponseBody product updateProduct(@RequestBody product product) {
        return repo.save(product);
    }

}
