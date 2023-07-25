<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ABC COMPUTERS</title>

		<link rel="stylesheet" href="assets/css/forms.css">
		<link rel="stylesheet" href="assets/css/all.css">
</head>
<body>

	<div class="topnav">
		<div class = " nav1 ">
  			<h2>ABC ONLINE COMPUTER SPARE PARTS STORE</h2>
  			<h4>POWERED BY XYZ CO-OPERETIONS</h4>
  			<a href ="Home.html"> Home</a>
  			<a href ="Home.html"> About</a>
 			<a href ="Home.html"> Contact</a>
 		</div>
	</div>

	<%
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String uname = request.getParameter("username");
		String pwd = request.getParameter("password");
	%>
	
	<form action ="deletecustomerServlet" method = "post"> 
	
		ID number <input name="id"	type="text" 	value = "<%=id %>" readonly><br>
		Name<input name="name"	type="text" 	value = "<%=name %>" readonly><br>
		Telephone<input name="phone" type="text" value = "<%= phone%>" readonly><br>
		E-mail<input name="email" type="text"  value = "<%=email %>" readonly><br>
		UserName<input name="username" type="text"  value = "<%= uname%>" readonly><br>
		
		<input type = "submit" name = "submit" value = "Delete Account">
	</form>	
	
	

</body>
</html>