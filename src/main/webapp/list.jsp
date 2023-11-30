<!-- list.jsp -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Item List</title>
</head>
<body>
<h1>Item List</h1>
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Action</th>
    </tr>
    <c:forEach items="${itemList}" var="item">
        <tr>
            <td>${item.id}</td>
            <td>${item.name}</td>
            <td><a href="EditItemServlet?id=${item.id}">Edit</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
