package com.foodie.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	public static Connection getDbConnection()throws SQLException {
		String dbUrl="jdbc:mysql://localhost:3306/foodie-db";
		String username="root";
		String password="Anupamks@8298";
		
		Connection con = DriverManager.getConnection(dbUrl,username,password);
		
		return con;
		
		
	}

}
