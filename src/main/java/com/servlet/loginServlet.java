package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("uid");
		String password = request.getParameter("pass");
		

		
		
		try {
		
			List<customer> customerDetails = customerUtill.validate(username,password);
			request.setAttribute("customerDetails", customerDetails);
			RequestDispatcher disp = request.getRequestDispatcher("userprofile.jsp");
			disp.forward(request,response);
					
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher disp = request.getRequestDispatcher("userprofile.jsp");
		disp.forward(request,response);
		
	}

}
