<!DOCTYPE html>
<html lang="en">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <meta charset="UTF-8">
    <title>addcomment</title>
    <link href="/css/main.css" rel="stylesheet">
</head>
<body>

<h2 style="margin-left: 100px"> Here you can leave your comment:</h2>
<div style="color: red; margin-left: 145px">${cannot_be_empty}</div>
<br>
<form name="addition" class="col mx-auto" action="/comment" method="post">
    <b style="margin-left: 10px">Your name:</b>
    <input name="username" type="text" style="width: 200px; height: 30px; margin-left: 33px"><br>
    <br>
    <b style="margin-left: 10px">Your comment:</b>
    <input name="user_comment" type="text" style="width: 200px; height: 60px; margin-left: 7px"><br>
    <br>
    <div><input style="margin-left: 120px" type="submit" value="send comment"></div>
</form>
<form method="get" action="/comment/all-comment">
    <p><input style="margin-left: 120px" type="submit" value="see all comments"></p>
</form>
<form method="get" action="/">
    <p><input style="margin-left: 120px" type="submit" value="come back"></p>
</form>
</body>
</html>