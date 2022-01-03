package com.incedo.fooddelivery.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.incedo.fooddelivery.model.SearchEngine;

public interface SearchEngineRepository extends MongoRepository<SearchEngine, String> {

}
