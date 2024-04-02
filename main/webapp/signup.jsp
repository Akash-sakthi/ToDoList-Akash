<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">

#mydiv{
background-image: url("https://media.istockphoto.com/id/1392032022/vector/concept-of-cyber-security-or-private-key-abstract-3d-polygonal-wireframe-airplane-on-blue.jpg?s=1024x1024&w=is&k=20&c=XUiU4q-U6gpeaPDr0JviUxa0vkF2g0YL17oBIdMH_Ew=");
background-repeat: no-repeat;
background-size: 100% 100%;
}
.inp{
;
}
label {
	border: 1px solid black;
	
}

</style>
</head>
<body>


<div id="mydiv">
<fieldset>

<legend><h3>Welcome-SigninPage</h3></legend>

<form action="saveuser" method="post" enctype="multipart/form-data">

<label for="id">userId::</label> <input type="text" name="id" id="id" class="inp"><br><br>
<label for="name">userName::</label> <input type="text" name="name" id="name" class="inp"><br><br>
<label for="mail">userEmail::</label> <input type="email" name="email" id="mail" class="inp"><br><br>
<label for="contact">userContact::</label> <input type="text" name="contact" id="contact" class="inp"><br><br>
<label for="password">userPassword::</label> <input type="text" name="password" id="password" class="inp"><br><br>
<label for="image">userImage::</label> <input type="file" name="image" id="image" class="inp"><br><br>

<input type="submit" class="inp">
</form>


</fieldset>
</div>




</body>
</html>