<!DOCTYPE html>
<html lang="en">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <meta charset="UTF-8">
    <title>addcomment</title>
    <link href="/css/main.css" rel="stylesheet">
</head>
<body>

<h2>&nbsp Here you can leave your comment:</h2>
<div style="color: red">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp${cannot_be_empty}</div>
<br>
<form name="addition" class="col mx-auto" action="/comment" method="post">
    &nbsp Your name:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input name="username" type="text" style="width: 200px; height: 30px;"><br>
    <br>
    &nbsp Your comment:&nbsp<input name="user_comment" type="text" style="width: 200px; height: 60px;"><br>
    <br>
    <div>&nbsp&nbsp<input type="submit" value="send comment"></div>
</form>

</body>
</html>