package com.foodie.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.foodie.app.dao.ConnectionUtil;
import com.foodie.aap.model.Restaurant;

public class RestaurantDaaoJdbcImpl implements RestaurantDao{
	private Connection con;
	
	private PreparedStatement smt;


	@Override
	public Restaurant addRestaurant(Restaurant restaurant) throws SQLException {
		// TODO Auto-generated method stubString dateString = employee.getDob().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		
		String query = "insert into employee values(?,?,?,?)";
		
		con=ConnectionUtil.getDbConnection();
		smt= con.prepareStatement(query);
		
		smt.setInt(1, Restaurant.getRestaurantID());
		smt.setString(2, Restaurant.getRestaurantName());
		smt.setString(3, query);
		smt.setString(4, Restaurant.getEmail());
		
		int insertedRowCount = smt.executeUpdate();
		if(insertedRowCount>0) {
			return restaurant;
	}

	@Override
	public Restaurant searchByRestaurantLocation(int RestaurantLocation) throws SQLException {
		// TODO Auto-generated method stub
		String query="select * from employee where empid=?";
		smt=con.prepareStatement(query);
		
		smt.setInt(1, RestaurantLocation);	
		
		ResultSet queryResult = smt.executeQuery();
		
		Restaurant res=null;
		
		if(queryResult.next()) {
			res=new Restaurant();
			res.setRestaurantLocation(RestaurantLocation);
			res.setRestaurantName(queryResult.getString("Rname"));
		}
		return res;
	}

	@Override
	public boolean deleteByRestaurantId(int RestaurantId) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Restaurant updateRestaurant(Restaurant restaurant) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Restaurant getAllRestaurant() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
