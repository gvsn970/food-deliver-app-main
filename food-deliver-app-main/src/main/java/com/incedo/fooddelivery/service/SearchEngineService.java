package com.incedo.fooddelivery.service;

import java.util.List;

import com.incedo.fooddelivery.model.Dish;
import com.incedo.fooddelivery.model.RestaurantInfo;

public interface SearchEngineService {
  void addRestaurant(String word, String restaurantId);
  List<String> searchRestaurant(String word);
  void removeRestaurant(String word, String restaurantId);
  void eraseInfo(RestaurantInfo info, String restaurantId);
  void eraseDishes(List<Dish> dishes, String restaurantId);
  void updateInfo(RestaurantInfo info, String restaurantId);
}
