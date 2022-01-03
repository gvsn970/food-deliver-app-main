package com.incedo.fooddelivery.service;

import java.util.List;

import com.incedo.fooddelivery.model.Comment;
import com.incedo.fooddelivery.model.Dish;
import com.incedo.fooddelivery.model.Restaurant;
import com.incedo.fooddelivery.model.RestaurantInfo;

public interface RestaurantService {

  int addDish(String id, Dish dish);

  int removeDish(String id, Dish dish);

  List<Dish> getAllDishes(String id);

  RestaurantInfo getInformation(String id);

  int updateInfo(String id, RestaurantInfo info);
}
