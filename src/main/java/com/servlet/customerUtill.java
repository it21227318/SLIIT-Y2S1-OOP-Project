package com.servlet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;




public class customerUtill {
	
	private static boolean isSuccess ;
	private static Connection cn1 = null ;
	private static Statement st1 = null ;
	private static ResultSet rs1 = null ;
	
	
	public static List<customer> validate(String username , String password){
		
		ArrayList<customer> cs1 = new ArrayList<>();
		

		
		
		try {
			
			cn1 = databaseConnect.getConnection();
			st1 = cn1.createStatement();
			
			String sql = "select * from customer where username = '"+username+"' and password = '"+password+"' ";
			rs1 = st1.executeQuery(sql);
			
			if(rs1.next()) {
				int id = rs1.getInt(1);
				String name = rs1.getString(2);
				String phone = rs1.getString(3);
				String email = rs1.getString(4);
				String uname = rs1.getString(5);
				String pwrd = rs1.getString(6);
				
				customer cus1 = new customer(id,name,phone,email,uname,pwrd );
				cs1.add(cus1) ;
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return cs1 ;
	}
	
	public static boolean insertCustomer(String name , String phone , String email , String username , String password ) {
		
		boolean isSuccess = false ;
		

		
		try {
			
			cn1 = databaseConnect.getConnection();
			st1 = cn1.createStatement();
			
			String sql = " Insert into customer values (0, '"+name+"', '"+phone+"' , '"+email+"' , '"+username+"' , '"+password+"')";
			
			int rs2 = st1.executeUpdate(sql);
			
			if(rs2 > 0 ) {
				isSuccess = true ;
			}
			else {
				isSuccess = false ;
			}

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess ;
	}
	
	public static boolean updatecusdetails(String id , String name ,String phone, String email , String username , String password ) {
		
		boolean isSuccess = false ;
		
		try {
		
			cn1 = databaseConnect.getConnection();
			st1 = cn1.createStatement();
			
			String sql1 = "update customer set name = '"+name+"' , phone = '"+phone+"' , email = '"+email+"' , username = '"+username+"' , password = '"+password+"'"
					+ " where cusID = '"+id+"' ";
			
			int rs = st1.executeUpdate(sql1);
			
			if(rs > 0 ) {
				isSuccess = true ;
			}
			else {
				isSuccess = false ;
			}			
			
			
		}
		catch(Exception e ){
			e.printStackTrace();
			
		}
		
		return isSuccess ;
	}
	
	public static List<customer> getuserdata(String id){
		 
		int convertedID = Integer.parseInt(id);
		ArrayList<customer> cust1 = new ArrayList<>();
		
		try {
			cn1 = databaseConnect.getConnection();
			st1 = cn1.createStatement();
			
			String sql = "select * from customer where cusID = '"+convertedID+"' ";
			rs1 = st1.executeQuery(sql);
			while(rs1.next()) {
				int id1 = rs1.getInt(1);
				String name = rs1.getString(2);
				String phone = rs1.getString(3);
				String email = rs1.getString(4);
				String username = rs1.getString(5);
				String password = rs1.getString(6);
				
				customer c1 = new customer(id1,name,phone,email,username,password);
				cust1.add(c1);
				
			}
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return cust1;
	}
	
	public static boolean deleteCustomer(String id) {
		
		int convertedID1 = Integer.parseInt(id);
		
		try {
			
			cn1 = databaseConnect.getConnection();
			st1 = cn1.createStatement();
			
			String sql = "delete from customer where cusID = '"+convertedID1+"'";
			int rs2 = st1.executeUpdate(sql);
			
			if(rs2>0) {
				isSuccess = true ;
				
			}
			else {
				isSuccess = false ;
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return isSuccess ;
	}


}
