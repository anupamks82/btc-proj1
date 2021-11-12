package com.foodie.app.ui;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.foodie.aap.model.Restaurant;
import com.foodie.app.Exception.NotFoundException;
import com.foodie.app.service.RestaurantService;
import com.foodie.app.service.RestaurantServiceImpl;

public class RestaurantAppUi {
	private Scanner scanner=new Scanner(System.in);
	private int restaurant;
	private static RestaurantService service=new RestaurantServiceImpl();
	
	public void addUser() throws Exception  {
     Restaurant restaurant= new Restaurant();
		System.out.println("Enter User Details :  ");
		System.out.print("User ID : ");
		int RestaurantId=scanner.nextInt();
		try {
			
			if(RestaurantId<1000)
			{
				throw new Exception("Enter four digit User Id : "+RestaurantId);
			}
			Restaurant.setRestaurantID(RestaurantId);
		} catch (InputMismatchException e) {
			// TODO: handle exception
			e.getMessage();
			System.out.println("Enter the Integer Value ");
			System.out.print("Email : ");
			String email=scanner.next()+scanner.nextLine();
			String regex="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
			
				if(email.matches(regex)) {
					System.out.println("Correct Email Address");
					restaurant.setRestaurantCategory(email);
				}
				else {
					throw new Exception("Enter Correct Email Address");
				}
			
			System.out.print("Password : ");
			String password = scanner.next()+scanner.nextLine();
			if(password.length()<8)
			{
				throw new Exception("Passowrd Atleast 8 character");
			}
			else {
				restaurant.setPassword(password);
			}
			
		}

	}
	public void showrestaurantById() {
		System.out.print("User ID : ");
		int userId=0;
		try {
			userId=scanner.nextInt();
			if(userId<1000)
			{
				throw new Exception("Enter four digit UserId : "+userId);
			}
		} catch (InputMismatchException e) {
			// TODO: handle exception
			e.getMessage();
			System.out.println("Enter the Integer Value ");
		}
		
		public void showRestaurantById() {
			System.out.print("User ID : ");
			int userId=0;
			try {
				userId=scanner.nextInt();
				if(userId<1000)
				{
					throw new Exception("Enter four digit UserId : "+userId);
				}
			} catch (InputMismatchException e) {
				// TODO: handle exception
				e.getMessage();
				System.out.println("Enter the Integer Value ");
			}
			
			Restaurant user;
			try {
				user = service.searchRestaurantLocation(userId);
				if(user==null)
				{
					throw new NotFoundException("User ID Not Found : "+userId);
				}
				
				System.out.println(user); 
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		public void deleterestaurantById() 
		{
			System.out.print("User ID : ");
			int userId=0;
			try {
				userId=scanner.nextInt();
				if(userId<1000)
				{
					throw new Exception("Enter four digit UserId : "+userId);
				}
			} catch (InputMismatchException e) {
				// TODO: handle exception
				e.getMessage();
				System.out.println("Enter the Integer Value ");
			}
			
			try {
				boolean value = service.deleteByRestaurantId(userId);
				if(value==false)
				{
					throw new NotFoundException("User ID Not Found : "+userId);
				}
				else {
					System.out.println("Deleted Successfully");
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}restaurant;
		try {
			restaurant = service.searchRestaurantLocation(userId);
			if(restaurant==null)
			{
				throw new NotFoundException("User ID Not Found : "+userId);
			}
			
			System.out.println(restaurant); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void deleteRestaurantById() 
	{
		System.out.print("User ID : ");
		int userId=0;
		try {
			userId=scanner.nextInt();
			if(userId<1000)
			{
				throw new Exception("Enter four digit UserId : "+restaurant);
			}
		} catch (InputMismatchException e) {
			// TODO: handle exception
			e.getMessage();
			System.out.println("Enter the Integer Value ");
		}
		
		try {
			boolean value = service.deleteEmployeeById(restaurant);
			if(value==false)
			{
				throw new NotFoundException("User ID Not Found : "+userId);
			}
			else {
				System.out.println("Deleted Successfully");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
