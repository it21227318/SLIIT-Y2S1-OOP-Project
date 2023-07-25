<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
	
	<table>
	<c:forEach var="cust" items = "${customerDetails}">
	
	<c:set var = "id" value = "${cust.cusID}"></c:set>
	<c:set var = "name" value = "${cust.name}"></c:set>
	<c:set var = "phone" value = "${cust.phone}"></c:set>
	<c:set var = "email" value = "${cust.email}"></c:set>
	<c:set var = "uname" value = "${cust.username}"></c:set>
	<c:set var = "pwd" value = "${cust.password}"></c:set>
	
	<tr>
		<td>Customer ID : </td>
		<td>${cust.cusID}</td>
	</tr>
	<tr>
		<td>Customer Name : </td>
		<td>${cust.name}</td>
	</tr>

	<tr>
		<td>Customer Phone : </td>
		<td>${cust.phone}</td>
	</tr>
	<tr>
		<td>Customer E-mail : </td>
		<td>${cust.email}</td>
	</tr>
	<tr>
		<td>Customer UserName : </td>
		<td>${cust.username}</td>
	</tr>
	<tr>
		<td>Customer Password : </td>
		<td>${cust.password}</td>
	</tr>

	
	</c:forEach>
	</table>
	
	<c:url value="updatedetails.jsp" var ="updatecustomer">
		<c:param name="id" value ="${id}"></c:param>
		<c:param name="name" value ="${name}"></c:param>
		<c:param name="phone" value ="${phone}"></c:param>
		<c:param name="email" value ="${email}"></c:param>
		<c:param name="username" value ="${uname}"></c:param>
		<c:param name="password" value ="${pwd}"></c:param>
	</c:url>
	
	
	<a href = "${updatecustomer}">
		<input type="button" name = "update" value ="Update data"><br>
	</a>
	
	<c:url value="deletecustomer.jsp" var = "deletecus"> 
		<c:param name="id" value ="${id}"></c:param>
		<c:param name="name" value ="${name}"></c:param>
		<c:param name="phone" value ="${phone}"></c:param>
		<c:param name="email" value ="${email}"></c:param>
		<c:param name="username" value ="${uname}"></c:param>
		<c:param name="password" value ="${pwd}"></c:param>
	</c:url>
	
	<a href = "${deletecus}">
	<input type="button" name = "delete" value ="Delete Account">
	</a>
	
</body>
</html>