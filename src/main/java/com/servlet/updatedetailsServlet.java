package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class updatedetailsServlet
 */
@WebServlet("/updatedetailsServlet")
public class updatedetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String uname = request.getParameter("username");
		String password = request.getParameter("password");
		
		boolean isTrue ;
		
		isTrue = customerUtill.updatecusdetails(id, name, phone, email, uname, password);
		
		if(isTrue == true) {
			
			List<customer> customerDetails = customerUtill.getuserdata(id);
			request.setAttribute("customerDetails",customerDetails);
			
			RequestDispatcher disp = request.getRequestDispatcher("userprofile.jsp");
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
