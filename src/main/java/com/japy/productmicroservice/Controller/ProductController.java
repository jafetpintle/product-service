package com.japy.productmicroservice.Controller;

import com.japy.productmicroservice.Entity.ProductEntity;
import com.japy.productmicroservice.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductEntity> getAllProducts(){
        return productService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createProduct(@RequestBody ProductEntity productEntity){
        productService.save(productEntity);
    }


}
