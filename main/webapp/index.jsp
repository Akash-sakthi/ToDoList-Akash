<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">


	#maindiv{
	border: 1px solid black;
	height: 100vh;
	display: flex;
	flex-direction: row;
	justify-content: center;
	background-image: url("https://media.istockphoto.com/id/646388134/photo/printed-circuit-board-in-the-server-executes-the-code.jpg?s=612x612&w=0&k=20&c=o0JIlY7n2EJpbVh14PbCKkzcHR15raQgp9XnIgwsvrM=");
	background-size: 100% 100%;
	}
	*{
	 margin: 0px;
	 padding: 0px;
	}
  #mydiv{
  border: 1px solid black;
  height: 200px;
  width: 200px;
  display: flex;
  flex-direction: row;
  justify-content: center;
  margin-top: 50px;
  background-image: url("https://cdn.pixabay.com/photo/2023/01/08/22/08/ai-generated-7706228_640.jpg");
  background-repeat: no-repeat;
  background-size: 100% 100%;
  border-radius: 10px;
  
  }
  .anchor{
  border: 1px solid black;
  width:100px;
  height:20px;
  border-radius:10px;
  background-color: wheat;
  text-align: center;
  margin-top: 50px;
  flex-flow: 10px;
  
  }
  
</style>
</head>
<body>
<div id ="maindiv">
<div id="mydiv">
<a href="signup.jsp"  class="anchor">Signup</a>
<br>
<a href="login.jsp" class="anchor">Login</a>
</div>
</div>
</body>
</html>