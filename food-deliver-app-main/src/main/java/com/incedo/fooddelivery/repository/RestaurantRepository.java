package com.incedo.fooddelivery.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.incedo.fooddelivery.model.Restaurant;

@Repository
public interface RestaurantRepository extends MongoRepository<Restaurant, String> {

}
