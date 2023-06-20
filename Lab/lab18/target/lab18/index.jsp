<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Print NCCS College</title>
</head>
<body>
    <h1>Print "NCCS College" 10 times.</h1>

    <%
        for (int i = 1; i <= 10; i++) { %>
            <p>NCCS College</p>
        <% }
    %>
</body>
</html>