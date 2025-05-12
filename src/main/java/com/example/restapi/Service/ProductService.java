package com.example.restapi.Service;
import java.util.List;

import com.example.restapi.Entity.Product;
import com.example.restapi.Repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product save(Product product){
        return repository.save(product);
    }

    public List<Product> findAll(){
        return repository.findAll();
    }

    public void deleteById(long id){
        repository.deleteById(id);
    }

}
