<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to Merchant Page</title>
</head>
<body>
	
<br/><br />
<spring:message code="merchantdetails.logged"/>: <sec:authentication property="name"/> <sec:authentication property="authorities"/>
<br />






<sec:authorize access="hasRole('MERCHANT')">
<div>MERCHANT</div>
</sec:authorize>



<a href="logout"><spring:message code="merchantdetails.logout"/></a>
</br>
<h2>HIiiiiiiiiiiiiiii</h2>

</br>
<div><a href="vimal.html">vimal</a></div>
	
</body>
</html>