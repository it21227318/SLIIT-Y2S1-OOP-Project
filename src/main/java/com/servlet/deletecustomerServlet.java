package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/deletecustomerServlet")
public class deletecustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		
		boolean istrue;
		
		istrue = customerUtill.deleteCustomer(id);
		
		if(istrue == true) {
			
			RequestDispatcher disp = request.getRequestDispatcher("signup.jsp");
			disp.forward(request,response);
		}
		else {
				
			List<customer> customerDetails = customerUtill.getuserdata(id);
			request.setAttribute("customerDetails", customerDetails);
			
			RequestDispatcher disp = request.getRequestDispatcher("userprofile.jsp");
			disp.forward(request,response);
		}
	}

}
