<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student name is : ${name }</h1>
<h1>Student id is the : ${id }</h1>
<c:forEach var="item" items="${frnds }">
<h1>${item }</h1>
</c:forEach>
</body>
</html>