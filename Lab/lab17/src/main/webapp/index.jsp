<%@ page isErrorPage="true" %>
<%@ page import="java.io.*" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Exception Handling Example</title>
</head>
<body>
    <h1>Exception Handling Example</h1>
    <%
        try{
            int num1 = 10;
            int num2 = 0;
            int result = num1 / num2;
        } catch (ArithmeticException e){
            out.println("ArithmeticException occured: " + e.getMessage());
        } catch (Exception e) {
            out.println("Exception occured: " + e.getMessage());
        }
    %>
</body>
</html>