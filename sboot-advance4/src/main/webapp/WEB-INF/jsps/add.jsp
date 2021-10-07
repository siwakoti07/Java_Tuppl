<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="sum" method="post">
		First number <input type="text" name="num1" /> <br><br>
		Second number <input type="text" name="num2" /> <br><br>
	   <input type="submit" value="ADD" />
	</form>
	 <h1>The sum is ${result}</h1>
</body>
</html>