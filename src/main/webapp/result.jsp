<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Stored Procedure Result</title>
</head>
<body>
<h1>Stored Procedure Result</h1>
<ul>
  <% for (String value : (List<String>) request.getAttribute("resultList")) { %>
  <li><%= value %></li>
  <% } %>
</ul>
</body>
</html>

