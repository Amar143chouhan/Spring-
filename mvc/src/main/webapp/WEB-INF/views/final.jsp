
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<p>Welcome to Spring MVC Tutorial</p>  


<%

String s =(String) request.getAttribute("name");
int id =(Integer)request.getAttribute("id");
List<String> l =(List<String>)request.getAttribute("f");
%>

 <% for(String str : l){
	
	
	%>
	
<h1><%=str %></h1>

<% }


%>


%>
<h1>name is : <%=s %></h1>
<h1>id is : <%=id %></h1>
</div>
</body>
</html>