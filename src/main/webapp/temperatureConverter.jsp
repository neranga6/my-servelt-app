<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Temperature Converter</title>
</head>
<body>
<h1>Celsius to Fahrenheit Converter</h1>

<form action="TemperatureConverterServlet" method="GET">
  Celsius: <input type="text" name="celsius">
  <input type="submit" value="Convert">
</form>

<c:if test="${not empty requestScope.result}">
  <p>Fahrenheit: ${requestScope.result}</p>
</c:if>

<c:if test="${not empty requestScope.error}">
  <p>Error: ${requestScope.error}</p>
</c:if>
</body>
</html>
