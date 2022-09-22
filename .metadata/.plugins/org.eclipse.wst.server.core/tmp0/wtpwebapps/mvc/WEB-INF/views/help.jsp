
<%@page import="java.time.LocalDateTime" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>this is help page</h1>
<a href="Clickk">go</a>
<%

String s= (String)request.getAttribute("name");
int roll =(Integer)request.getAttribute("rollno");
LocalDateTime td =(LocalDateTime)request.getAttribute("time");

%>

<h2><%=s %></h2>

<h2>roll number is : <%=roll %></h2>
<h1>local date and  time is :<%=td %></h1>
</body>
</html>