package com.japy.productmicroservice.Service;

import com.japy.productmicroservice.Entity.ProductEntity;
import com.japy.productmicroservice.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductEntity> findAll() {
        return productRepository.findAll();
    }

    public Optional<ProductEntity> findById(String s) {
        return productRepository.findById(s);
    }

    public ProductEntity save(ProductEntity entity) {
        return productRepository.save(entity);
    }

    public Iterable<ProductEntity> findAllById(Iterable<String> strings) {
        return productRepository.findAllById(strings);
    }

    public void delete(ProductEntity entity) {
        productRepository.delete(entity);
    }
}
