<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Result</title>
</head>
<body>
<h1>Search Result Page</h1>

<table border="1">
	
	<th>product_id</th>
	<th>product_categoryid</th>
	<th>product_subcategoryid</th>
	<th>product_name</th>
	<th>product_price</th>
	<th>prodcut_qty</th>
	<th>product_desc</th>
	<th>merchant_id</th>
	<th>brand_name</th>
	
	<c:forEach items="${resutlist}" var="result">
		<tr>
			<td>${result.product_id}</td>
			<td>${result.product_categoryid}</td>
			<td>${result.product_subcategoryid}</td>
			<td>${result.product_name}</td>
			<td>${result.product_price}</td>
			<td>${result.prodcut_qty}</td>
			<td>${result.product_desc}</td>
			<td>${result.merchant_id}</td>
			<td>${result.brand_name}</td>			
		</tr>
	</c:forEach>
</table>
</body>
</html>
