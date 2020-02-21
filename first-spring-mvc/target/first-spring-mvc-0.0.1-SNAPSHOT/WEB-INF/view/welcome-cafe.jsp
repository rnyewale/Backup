<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lost In Space Cafe</title>
</head>
<body>
	<form action="processOrder">
		<div align="center">
			<h1 align="center">LOST IN SPACE CAFE</h1>
			<label for="item_name">Item Name:</label> 
			<input type="text" name="food_type" id="item_name" placeholder="food type ??"/>
			<input type="submit" name="submit" value="Order now" />
		</div>
	</form>
</body>
</html>