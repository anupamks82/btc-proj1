package com.foodie.app.ui;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.btc.app.exception.InvalidEmpNameException;
import com.btc.app.exception.InvalidEmployeeId;
import com.btc.app.model.Employee;
import com.foodie.aap.model.Restaurant;
import com.foodie.app.Exception.InvalideNameException;
import com.foodie.app.Exception.InvalideRestaurantId;
import com.foodie.app.Exception.NotFoundException;
import com.foodie.app.service.RestaurantService;
import com.foodie.app.service.RestaurantServiceImpl;

public class RestaurantAppUi {
	private Scanner scanner=new Scanner(System.in);
	private int restaurant;
	private String restaruantName;
	private int restaruantId;
	private static RestaurantService service=new RestaurantServiceImpl();
		public void addRestaurant() throws SQLException  {
			Restaurant restaurant= new Restaurant();
			System.out.println("Enter Restaurant Details :  ");
			System.out.print("Restaurant Id : ");
			int RestaurantId=scanner.nextInt();;
			try {
				
				if(restaruantId<1000)
				{
					throw new InvalideRestaurantId("Enter four digit EmployeeId : "+restaruantId);
				}
				restaurant.setRestaurantID(restaurant);
			} catch (InputMismatchException e) {
				e.getMessage();
				System.out.println("Enter the Integer Value ");
			}
			
				System.out.print("restaruant Name : ");
				String employeeName=scanner.next()+scanner.nextLine();
				try {
					if(employeeName.length()<2)
					{
						throw new InvalideNameException("Enter correct restaruant Name :"+employeeName);
					}
					restaurant.setRestaurantName(restaruantName);
				} catch (InputMismatchException e) {
					e.getMessage();
					System.out.println("Enter the correct name : "+restaruantName);
				}
				Restaurant savedRestaruant  =  service.addRestaruant (restaurant );
				System.out.println("Restaruant  Added Successfully..");
				System.out.println(savedRestaruant );
	}
		public void showEmployee() throws SQLException {
			System.out.println("Enter Employee Details :  ");
			System.out.print("Employee ID : ");
			int RestaurantId=0;
			try {
				RestaurantId=scanner.nextInt();
				if(RestaurantId<1000)
				{
					throw new InvalideRestaurantId("Enter four digit EmployeeId : "+restaruantId);
				}
			} catch (InputMismatchException e) {
				e.getMessage();
				System.out.println("Enter the Integer Value ");
			}
			
			InvalideRestaurantId restaurant = service.searchRestaurantLocation(RestaurantId);
			if(restaurant==null)
			{
				throw new NotFoundException("Employee ID Not Found : "+RestaurantId);
			}
			
			System.out.println(restaurant);
			
		}
		public void deleteRestaurantId() throws SQLException
		{
			System.out.println("Enter Employee Details :  ");
			System.out.print("Employee ID : ");
			int employeeId=0;
			try {
				employeeId=scanner.nextInt();
				if(employeeId<1000)
				{
					throw new InvalideRestaurantId("Enter four digit EmployeeId : "+employeeId);
				}
			} catch (InputMismatchException e) {
				e.getMessage();
				System.out.println("Enter the Integer Value ");
			}
			boolean value = service.deleteByRestaurantId(restaruantId);
			if(value)
			{
				System.out.println("Deleted Successfully");
			}
			else {
				throw new NotFoundException("Employee ID Not Found : "+restaruantId);
			}
			
	}
		
		
		
		public void updateEmployee() throws SQLException
		{
			System.out.println("Enter Employee Details :  ");
			System.out.print("Employee ID : ");
			int employeeId=0;
			try {
				employeeId=scanner.nextInt();
				if(employeeId<1000)
				{
					throw new InvalideRestaurantId("Enter four digit EmployeeId : "+RestaurantId);
				}
			} catch (InputMismatchException e) {
				// TODO: handle exception
				e.getMessage();
				System.out.println("Enter the Integer Value ");
			}
			Restaurant restaurant = service.searchRestaurantLocation(restaruantId);
			if(restaurant!=null) {
			System.out.println(restaurant);
			System.out.print("Employee Name : ");
			String RestaurantName=scanner.next()+scanner.nextLine();
			System.out.print("Email : ");
			String email=scanner.next()+scanner.nextLine();
			String dobString=scanner.next()+scanner.nextLine();
			LocalDate dob=LocalDate.parse(dobString);
			Employee employee1= new Employee(employeeId, employeeName, email, dob);
			 service.updateEmployee(employee1);
			 System.out.println("Update Successfully");
			}
			else {
				throw new NotFoundException("Employee ID Not Found : "+employeeId);
			}
		}
		}
	
	