<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home Page</title>
</head>
<body>
    <h2>Welcome, ${sessionScope.username}!</h2>
    <p>You have successfully logged in.</p>

    <!-- Logout Button -->
    <form action="logout" method="post">
        <input type="submit" value="Logout">
    </form>
</body>
</html>
