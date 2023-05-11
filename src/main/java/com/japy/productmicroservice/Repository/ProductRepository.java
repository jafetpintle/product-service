package com.japy.productmicroservice.Repository;

import com.japy.productmicroservice.Entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductEntity, String> {

}
