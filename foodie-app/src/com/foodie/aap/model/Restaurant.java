package com.foodie.aap.model;

public class Restaurant {
	private static  int restaurantID;
	private static String restaurantName;
	private String restaurantLocation;
	private String restaurantType;
	private String restaurantCategory;
	public static int getRestaurantID() {
		return restaurantID;
	}
	public static void setRestaurantID(int restaurantID) {
		this.restaurantID = restaurantID;
	}
	public static String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getRestaurantLocation() {
		return restaurantLocation;
	}
	public void setRestaurantLocation(int restaurantLocation2) {
		this.restaurantLocation = restaurantLocation2;
	}
	public String getRestaurantType() {
		return restaurantType;
	}
	public void setRestaurantType(String restaurantType) {
		this.restaurantType = restaurantType;
	}
	public String getRestaurantCategory() {
		return restaurantCategory;
	}
	public void setRestaurantCategory(String restaurantCategory) {
		this.restaurantCategory = restaurantCategory;
	}
	public Restaurant() {
		super();
		this.restaurantID = restaurantID;
		this.restaurantName = restaurantName;
		this.restaurantLocation = restaurantLocation;
		this.restaurantType = restaurantType;
		this.restaurantCategory = restaurantCategory;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((restaurantCategory == null) ? 0 : restaurantCategory.hashCode());
		result = prime * result + restaurantID;
		result = prime * result + ((restaurantLocation == null) ? 0 : restaurantLocation.hashCode());
		result = prime * result + ((restaurantName == null) ? 0 : restaurantName.hashCode());
		result = prime * result + ((restaurantType == null) ? 0 : restaurantType.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurant other = (Restaurant) obj;
		if (restaurantCategory == null) {
			if (other.restaurantCategory != null)
				return false;
		} else if (!restaurantCategory.equals(other.restaurantCategory))
			return false;
		if (restaurantID != other.restaurantID)
			return false;
		if (restaurantLocation == null) {
			if (other.restaurantLocation != null)
				return false;
		} else if (!restaurantLocation.equals(other.restaurantLocation))
			return false;
		if (restaurantName == null) {
			if (other.restaurantName != null)
				return false;
		} else if (!restaurantName.equals(other.restaurantName))
			return false;
		if (restaurantType == null) {
			if (other.restaurantType != null)
				return false;
		} else if (!restaurantType.equals(other.restaurantType))
			return false;
		return true;
	}
	public void addEmployee() {
		// TODO Auto-generated method stub
		
	}
	public void showEmployee() {
		// TODO Auto-generated method stub
		
	}
	public static String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	public static String getEmployeeName() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setPassword(String password) {
		// TODO Auto-generated method stub
		
	}
	public void setPhoneNo(int phone_no) {
		// TODO Auto-generated method stub
		
	}
	

}
