<%-- 
    Document   : pictureGeo
    Created on : Jan 17, 2025, 1:13:23 AM
    Author     : bong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
        .geo{
            display: flex;
            flex-direction: column;
            align-items: center;
        }
    </style>
    <body>
        <div class="geo">
            <h1>${description}</h1>
            <img src="${imageSrc}" alt="${description}" width="400" height="300">
        </div>

    </body>
</html>
