<%-- 
    Document   : login
    Created on : Jan 16, 2025, 1:44:21 PM
    Author     : bong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Simple Calculator</title>
        <style>
            .form{
                display: flex;
                flex-direction: column;
                justify-items: center;
                align-items: center;
                gap:10px;
            }
            .form input{
                width: 200px;
            }
            .h2{
                font-size: 30px;
            }

        </style>
    </head>
    <body>
        <form class="form" action="/Prj_Lab1/loginServlet" method="post">
            <h2 class="h2">Login</h2>
            <div>
                Username:
                <input type="text" id="username" name="username" required><br>
            </div>
            <div>
                Password:
                <input type="password" id="password" name="password" required><br>
            </div>
            <button type="submit">Login</button>
        </form>
    </body>
</html>