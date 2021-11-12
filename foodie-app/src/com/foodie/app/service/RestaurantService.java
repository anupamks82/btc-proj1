package com.foodie.app.service;

import java.sql.SQLException;

import com.foodie.aap.model.Restaurant;

public interface RestaurantService {
	public RestaurantService addEmployee(Restaurant restaurant);
	public Restaurant searchRestaurantLocation(int RestaurantId);
	public boolean deleteEmployeeById(int RestaurantId);
	public Restaurant updateRestaurant(Restaurant restaurant);
	public Restaurant getAllRestaurant() ;
	public boolean deleteByRestaurantId(int RestaurantId);
}
