<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SAVE CUSTOMER</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" />
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/add-customer-style.css" />
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2 style="text-align: center;">CMS-Customer Management System</h2>
		</div>
	</div>

	<div id="container">
		<h3 style="text-align: center;">Save Customer</h3>

		<form:form action="saveCustomer" method="post" modelAttribute="customer">
			<!-- need to associate this data with customer id -->
			<form:hidden path="id"/>
			<table style="margin: auto;">
				<tbody>
					<tr>
						<td>First Name</td>
						<td><form:input path="firstName"/></td>
					</tr>
					<tr>
						<td>Last Name</td>
						<td><form:input path="lastName"/></td>
					</tr>
					<tr>
						<td>Email</td>
						<td><form:input path="email"/></td>
					</tr>
					<tr>
						<td></td>
						<td><input type='submit' value='Save' class='save'/></td>
					</tr>
				</tbody>
			</table>
		</form:form>

		<!-- Back to List Link -->
		<div class="back-link">
		<a href="${pageContext.request.contextPath}/customer/list" style="display:inline-block; text-decoration:none; background-color:#0099cc; color:white; padding:10px 20px; border-radius:5px; font-size:14px; font-weight:bold; transition:background-color 0.3s ease;">
            Back to List
        </a>

		</div>
	</div>
</body>
</html>
