<%@ page import="com.abhi.web.model.Users" language="java"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Users</title>
</head>
<body bgcolor="cyan">
	In Show Users
	<%
/* Users user = (Users)request.getAttribute("myUser"); */
Users user = (Users)session.getAttribute("myUser");
out.println(user);
%>
</body>
</html>