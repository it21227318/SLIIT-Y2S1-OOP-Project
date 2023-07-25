package com.servlet;

import java.sql.Connection;
import java.sql.DriverManager;

public class databaseConnect {
	
	private static String url  = "jdbc:mysql://localhost:3306/cspm" ;
	private static String user = "root";
	private static String password1 = "it21227318" ;
	private static Connection cn1 ;
	
	public static Connection getConnection() {
		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			cn1 = DriverManager.getConnection(url, user, password1) ;
			
		}
		catch(Exception e){
			System.out.println("connection failed");
		}
		
		return cn1 ;
	}

}
