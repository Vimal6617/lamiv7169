<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Product</title>
</head>
<body>
<div> Welcome to Add a product Page</div>
  
  	<form:form action="addproduct" method="POST" commandName="productdetails">
		<table>
			<tr>
                <td><spring:message code="productdetails.product_categoryid"/></td>
                <td><form:input path="product_categoryid"/></td>
               
            </tr>
         
            <tr>
                <td><spring:message code="productdetails.product_subcategoryid"/></td>
                <td><form:input path="product_subcategoryid" /></td>
               
            </tr>
     
            <tr>
                <td><spring:message code="productdetails.product_name"/></td>
                <td><form:input path="product_name"/></td>
             
            </tr>
     
            <tr>
               <td><spring:message code="productdetails.product_price"/></td>
                <td><form:input path="product_price"/></td>
                
            </tr>
             <tr>
                <td><spring:message code="productdetails.prodcut_qty"/></td>
                <td><form:input path="prodcut_qty" /></td>
                
            </tr>
             <tr>
                <td><spring:message code="productdetails.product_desc"/></td>
                <td><form:input path="product_desc" /></td>
                
            </tr>
             <tr>
                <td><spring:message code="productdetails.merchant_id"/></td>
                <td><form:input path="merchant_id"/></td>
                
            </tr>
      		<tr>
                <td><spring:message code="productdetails.brand_name"/></td>
                <td><form:input path="brand_name" /></td>
                
            </tr>
     
			<tr>
				<td colspan="2">
					<input type="submit" name="action" value="Add" />
					
				</td>
			</tr>
		</table>
	</form:form>
 
</body>
</html>