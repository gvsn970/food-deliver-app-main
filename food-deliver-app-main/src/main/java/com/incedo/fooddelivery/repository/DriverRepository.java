package com.incedo.fooddelivery.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.incedo.fooddelivery.model.Driver;

@Repository
public interface DriverRepository extends MongoRepository<Driver, String> {

}
