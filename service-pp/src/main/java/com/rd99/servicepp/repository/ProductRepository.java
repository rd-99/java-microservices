package com.rd99.servicepp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.rd99.servicepp.model.Product;
public interface ProductRepository extends MongoRepository<Product , String> {
}
