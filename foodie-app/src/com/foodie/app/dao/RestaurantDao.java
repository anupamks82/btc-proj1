package com.foodie.app.dao;

import java.sql.SQLException;

import com.foodie.aap.model.Restaurant;

public interface RestaurantDao {
	public Restaurant addRestaurant(Restaurant restaurant) throws SQLException;

	public Restaurant searchByRestaurantLocation(int RestaurantLocation) throws SQLException;

	public boolean deleteByRestaurantId(int RestaurantId) throws SQLException;

	public Restaurant updateRestaurant(Restaurant restaurant) throws SQLException;

	public Restaurant getAllRestaurant() throws SQLException;

}
