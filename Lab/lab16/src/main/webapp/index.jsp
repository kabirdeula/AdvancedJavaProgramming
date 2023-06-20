<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form Data Display</title>
</head>
<body>
    <h1>Form Data Display</h1>
    <form action="display.jsp" method="post">

        <label for="name">Name:</label>
        <input type="text" name="name" id="name"><br/>
        
        <label for="email">Email:</label>
        <input type="email" name="email" id="email"><br/>
        
        <label for="message">Message:</label>
        <textarea name="message" id="message" cols="40" rows="5"></textarea><br/>
        <input type="submit" value="Submit">
    </form>
</body>
</html>