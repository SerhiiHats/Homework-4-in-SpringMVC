<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>uuid</title>
    <link href="/css/main.css" rel="stylesheet">
</head>
<body>
<br>
    <h2 style="color: crimson">&nbsp&nbsp&nbsp&nbsp
        &nbsp&nbsp&nbsp&nbspThis is random UUID:</h2>
    <h2 align="center" style="width: 500px; float: left; display: block; border: 1px solid burlywood">${uuid}</h2>
<br>
<form method="get" action="/">&nbsp&nbsp&nbsp<input type="submit" value="come back">
</form>

</body>
</html>