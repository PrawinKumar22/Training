<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${command}</h1>

<form action="/delete" method="post">
<label>ProductID</label>
	<input type="number" name="id">
	<input type="submit" value="delete">
	</form>

</body>
</html>