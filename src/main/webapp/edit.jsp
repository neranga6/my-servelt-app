<!-- edit.jsp -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Item</title>
</head>
<body>
<h1>Edit Item</h1>
<form action="UpdateItemServlet" method="post">
    <input type="hidden" name="id" value="${itemToEdit.id}">
    <label for="name">Item Name:</label>
    <input type="text" name="name" value="${itemToEdit.name}">
    <br>
    <label for="options">Select an option:</label>
    <select name="selectedOption">
        <option value="Option 1">Option 1</option>
        <option value="Option 2">Option 2</option>
        <option value="Option 3">Option 3</option>
        <option value="Option 4">Option 4</option>
    </select>
    <br>
    <input type="submit" value="Save">
</form>
</body>
</html>

