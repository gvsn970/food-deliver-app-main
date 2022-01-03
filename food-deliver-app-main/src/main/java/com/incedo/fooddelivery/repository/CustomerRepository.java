package com.incedo.fooddelivery.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.incedo.fooddelivery.model.Customer;

@Repository()
public interface CustomerRepository extends MongoRepository<Customer, String> {

}
