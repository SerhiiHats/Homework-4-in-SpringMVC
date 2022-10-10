<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>allcomments</title>
    <link href="/css/main.css" rel="stylesheet">
</head>
<body>

<center>
<table>
    <h2 style="color: crimson">&nbsp&nbsp&nbsp&nbsp
    &nbsp&nbsp&nbsp&nbspAll comments</h2>
    <thead style="background-color: olivedrab">
    <tr>
        <th style="width: 70px; float: left; display: block; border: 1px solid olivedrab; color: blue">ID</th>
        <th style="width: 200px; float: left; display: block; border: 1px solid olivedrab; color: blue">NAME</th>
        <th style="width: 470px; float: left; display: block; border: 1px solid olivedrab; color: blue">COMMENTS</th>
    </tr>
    </thead>
    <tbody>
    <%--    <c:forEach items="${listComments}" var="comment" varStatus="status">--%>
    <c:forEach var="comment" items="${listComments}">
        <tr>&nbsp&nbsp&nbsp&nbsp
            <td style="width: 70px; float: left; display: block; border: 1px solid burlywood">${comment.id}</td>
            <td style="width: 200px; float: left; display: block; border: 1px solid burlywood">${comment.name}</td>
            <td style="width: 470px; float: left; display: block; border: 1px solid burlywood">${comment.description}</td>
        </tr>

    </c:forEach>
    </tbody>
</table>
    <form method="get" action="/comment">
    <p>&nbsp&nbsp&nbsp<input type="submit" value="come back"></p>
</form>
</center>


</body>
</html>