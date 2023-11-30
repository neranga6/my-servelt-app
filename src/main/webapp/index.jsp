<!DOCTYPE html>
<html>
<head>
    <title>JSON File Upload</title>
</head>
<body>
<h1>Upload JSON File</h1>
<form action="MyServlet" method="post" enctype="multipart/form-data">
    Select a JSON file to upload:
    <input type="file" name="jsonFile" id="jsonFile">
    <br><br>
    <input type="submit" value="Upload">
</form>
</body>
</html>
