package com.foodie.app.service;

import java.sql.SQLException;

import com.foodie.aap.model.Restaurant;
import com.foodie.app.Exception.InvalideRestaurantId;
import com.foodie.app.ui.Employee;

public interface RestaurantService {
	public InvalideRestaurantId searchRestaurantLocation(int RestaurantId);
	public Restaurant updateRestaurant(Restaurant restaurant);
	public Restaurant getAllRestaurant() ;
	public boolean deleteByRestaurantId(int RestaurantId);
	public Restaurant addRestaruant(Restaurant restaurant);
}
