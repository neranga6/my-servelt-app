<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Form Example</title>
</head>
<body>
<h1>Form Example</h1>
<form method="post" action="submit">
    Name: <input type="text" name="name"><br>
    Age: <input type="text" name="age"><br>
    Date: <input type="text" name="date"><br>
    <input type="submit" value="Submit">
</form>
<c:if test="${not empty submitted}">
    <h2>Submitted Data:</h2>
    <p>Name: ${name}</p>
    <p>Age: ${age}</p>
    <p>Date: ${date}</p>
</c:if>
</body>
</html>
