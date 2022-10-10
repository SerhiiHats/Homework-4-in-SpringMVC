<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>index</title>
    <link href="/css/main.css" rel="stylesheet">
</head>

<body>
<h2 style="color: olivedrab; margin-left: 100px">Hello, I'm a beginner Java developer and this is my first web
    application</h2>
<h2 style="color: blue; margin-left: 100px; margin-right: 300px">This is a test start page for educational purposes, on
    this page you can view the official exchange rates of the National Bank of Ukraine, you can leave your comments,
    complaints and wishes, and also access a test JSON file with exchange rate data (not real rates) for study. So let's
    get down to the controls at the bottom</h2>
<br>

<form method="get" action="/currencies-official"><input style="margin-left: 100px" type="submit" value="exchange rates">
    <b style="margin-left: 30px">but if you want to get the JSON file then it is located at
        “http://localhost:8080/exchange” for studying, you can use POSTMAN</b>
</form>
<br>
<form method="get" action="/uuid-demo"><input style="margin-left: 100px" type="submit" value="random uuid">
    <b style="margin-left: 50px">but if you want to get a JSON file then it's localed at “http://localhost:8080/uuid” for study
        you, can use POSTMAN</b>
</form>
<br>
<form method="get" action="/comment"><input style="margin-left: 100px" type="submit" value="leave a comment"></form>


</body>
</html>