package com.iftm.genericStore.controllers;

import com.iftm.genericStore.entities.Product;
import com.iftm.genericStore.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/{id}")
    public Optional<Product> findById (@PathVariable String id) {
        return productService.findById(id);
    }

    @GetMapping
    public List<Product> findAll () {
        return productService.findAll();
    }

    @PostMapping
    public Product create (@RequestBody Product product) {
        return productService.create(product);
    }

    @PutMapping
    public Product update (@RequestBody Product product) {
        return productService.update(product);
    }

    @DeleteMapping("/{id}")
    public void deleteById (@PathVariable String id){
        productService.delete(id);
    }

    @DeleteMapping
    public void delete (@RequestBody Product product) {
        productService.delete(product);
    }

}
