<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>List of All Mobiles:</h1>
<table border="2">
<tr><th>Mobile Id</th><th>Name</th><th>Price</th><th>Quantity</th></tr>
<c:forEach items="${list }" var="mobile">
<tr><td>${mobile.mobileId }<td>${mobile.name }<td>${mobile.price }<td>${mobile.quantity}</td></tr>
</c:forEach>
</table>
</body>
</html>