<%-- 
    Document   : geo
    Created on : Jan 17, 2025, 1:12:29 AM
    Author     : bong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Favorite Geometry</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
        .form-group {
            margin-bottom: 10px;
        }
        label {
            font-weight: bold;
        }
        select {
            margin-left: 10px;
        }
        button {
            margin-top: 10px;
        }
    </style>
</head>
<body>

<h1>Please choose your favourite geometry:</h1>
<form action="/Prj_Lab1/geoServlet" method="post">
    <div class="form-group">
        <label for="geometry">Geometry:</label>
        <select id="geometry" name="geometry" required>
            <option value="circle">Circle</option>
            <option value="square">Square</option>
            <option value="triangle">Triangle</option>
            <option value="rectangle">Rectangle</option>
        </select>
    </div>
    <button type="submit">Choose</button>
</form>

</body>
</html>
