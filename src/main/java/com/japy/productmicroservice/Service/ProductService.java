package com.japy.productmicroservice.Service;

import com.japy.productmicroservice.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


}
