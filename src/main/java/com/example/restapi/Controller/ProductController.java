package com.example.restapi.Controller;


import com.example.restapi.Entity.Product;
import com.example.restapi.Service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping
    public Product save(@RequestBody Product product) {
        return service.save(product);
    }

    @GetMapping
    public List<Product> findAll() {
        return service.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }

}
