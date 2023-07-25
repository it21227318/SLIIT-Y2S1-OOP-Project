<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ABC COMPUTERS</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		
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
	
	<div class="form1">
		<form action ="signupServlet" method = "post"> 
			<p class ="p1" >Create New Account</p>
			
			Name<input name="name"	type="text" placeholder="Enter Name" required><br>
			Telephone<input name="phone" type="number" placeholder="Enter Telephone" required><br>
			E-mail<input name="email" type="text" placeholder="Enter E-mail" required><br>
			UserName<input name="username" type="text" placeholder="Enter Username" required><br>
			Password<input name="password" type="password" placeholder="Enter Password" required><br><br>
		
			<input type = "submit"  value = "Create Account">
		</form>
	</div>

</body>
</html>