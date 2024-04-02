<%@page import="java.util.Base64"%>
<%@page import="dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%HttpSession ses=request.getSession();%>
<%User user=(User)ses.getAttribute("user"); %>

<h1> Welcome <%=user.getUsername()%></h1>
<h2>Email:<%=user.getUseremail() %></h2>

<% String image =  new String(Base64.getEncoder().encode(user.getUserimage())); %>
<img alt="" src="data:image/jpeg;base64,<%= image%>"height="150px" width="250px">



</body>
</html>