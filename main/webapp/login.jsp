<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
fieldset {
	width: 400px;
	margin-left: 250px;
}
</style>
</head>
<body>

<fieldset>
<legend> Login Page</legend>
<form action="userlogin" method="post">
<label for="mail" >userEmail::</label><input type="text" name="email" id="mail"> <br><br>
<label for ="password">userPassword::</label> <input type="text" name="password" id="password"><br><br>
<input type="submit">

</form>
</fieldset>




</body>
</html>