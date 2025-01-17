<%-- 
    Document   : cal
    Created on : Jan 16, 2025, 2:01:44 PM
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
            }
            .input-group {
                width: 300px;
                display: flex;
                justify-content: space-between;
                align-items: center;
                margin-bottom: 10px;
            }
            .input-group input{
                height: 20px;
                width: 200px;
                display: flex;
                justify-content: space-between;
                align-items: center;
                border: 1px gainsboro solid;
                border-radius: 1px;
            }
            .result{
                width: 98px;
            }
            #select{
                display: flex;
                gap:30px;
                justify-content: normal;
            }
            .button{
                margin-left: 92px;
            }
        </style>
    </head>
    <body>
        <form class="form" action="/Prj_Lab1/calServlet" method="post">
            <h1>Calculate</h1>
            <div class="input-group">
                <label for="first">First:</label>
                <input type="number" id="first" name="first" value="${first}" required>
            </div>
            <div class="input-group">
                <label for="second">Second:</label>
                <input type="number" id="second" name="second" value="${second}" required>
            </div>
            <div class="input-group" id="select">
                <label for="operator">Operator:</label>
                <select id="operator" name="operator"  required>
                    <option value="+" ${operator == '+' ? 'selected' : ''}>+</option>
                    <option value="-" ${operator == '-' ? 'selected' : ''}>-</option>
                    <option value="*" ${operator == '*' ? 'selected' : ''}>*</option>
                    <option value="/" ${operator == '/' ? 'selected' : ''}>/</option>
                </select>
<!--                <option value="${operator}">${operator}</option>-->
            </div>
            <div class="input-group">
                <button class="button"type="submit">Compute</button></div>
            <div class="input-group">
                <label class="result" for="result">Result:</label>
                <input type="text" id="result" name="result" value="${result}" readonly><br>
            </div>
            <p>${message}</p>
        </form>
    </body>
</html>
