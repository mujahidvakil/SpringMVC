<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>This is the index page</h1>
<%
String name = (String)request.getAttribute("name");
String id = (String)request.getAttribute("id");
%>
<h1>Student name is <%=name %></h1>
<h1>Student id is <%=id %></h1>
</body>
</html>