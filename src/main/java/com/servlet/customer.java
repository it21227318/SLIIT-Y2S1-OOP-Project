package com.servlet;

public class customer {
	private int cusID ;
	private String name ;
	private String phone ;
	private String email ;
	private String username ;
	private String password ;
	
	public customer(int cusID, String name,  String phone, String email, String username, String password) {
		this.cusID = cusID;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.username = username;
		this.password = password;
	}

	public int getCusID() {
		return cusID;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}


	

}
