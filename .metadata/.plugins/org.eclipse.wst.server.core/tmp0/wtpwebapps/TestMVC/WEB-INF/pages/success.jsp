<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="springMvc.Model.User" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SUCCESS PAGE</title>
</head>
<body>

<%
User user =(User)request.getAttribute("user");
String s = (String)request.getAttribute("header");
out.println(user.getEmail());
out.println(user.getPassword());
out.println(user.getUsername());


%>


 
 <h1 class=text-center><%=s %></h1>

<h1 class=text-center><%=user.getEmail() %></h1>

<h1 class=text-center><%=user.getUsername() %></h1>

<h1 class=text-center><%=user.getPassword() %></h1>





<h1 class=text-center style="color: green">data added successfully</h1>
</div> 
</body>
</html>