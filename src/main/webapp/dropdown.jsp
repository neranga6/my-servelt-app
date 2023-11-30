<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Dropdown Menu Example</title>
    <script>
        function handleDropdownChange() {
            var selectedValue = document.getElementById("dropdown").value;
            alert("Selected option: " + selectedValue);
        }
    </script>
</head>
<body>
<h1>Dropdown Menu Example</h1>
<form>
    <label for="dropdown">Select an option:</label>
    <select id="dropdown" name="dropdown" onchange="handleDropdownChange()">
        <option value="option1">Option 1</option>
        <option value="option2">Option 2</option>
        <option value="option3">Option 3</option>
    </select>
</form>
</body>
</html>
