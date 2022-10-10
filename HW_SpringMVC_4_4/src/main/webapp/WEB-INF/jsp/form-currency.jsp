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
<h2 align="center" style="color: blue">&nbsp&nbsp&nbspHere will be the exchange rates of the National Bank of Ukraine</h2>
    <form style="position:fixed; top:11%;left:72%;width:250px;" method="get" action="/">&nbsp&nbsp&nbsp<input width="right" type="submit" value="come back"></form>
<center>
    <table>

        <h2 style="color: crimson">Official exchange rate of Ukrainian hryvnia to foreign currency</h2>
        <thead style="background-color: olivedrab; border-style: solid; border-inline-end-width: medium; color: blue">
        <tr>
            <th style="width: 150px; float: left; display: block; border: 1px solid olivedrab; color: blue" margin: 0.95em>DATE</th>
            <th style="width: 150px; float: left; display: block; border: 1px solid olivedrab; color: blue">COD</th>
            <th style="width: 150px; float: left; display: block; border: 1px solid olivedrab; color: blue">CURRENCY
            </th>
            <th style="width: 150px; float: left; display: block; border: 1px solid olivedrab; color: blue">UNIT</th>
            <th style="width: 150px; float: left; display: block; border: 1px solid olivedrab; color: blue">AMOUNT</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="currency" items="${listCurrency}">
            <tr>&nbsp&nbsp&nbsp&nbsp
                <td align="center"
                    style="width: 150px; float: left; display: block; border: 1px solid burlywood">${currency.startDate}</td>
                <td align="center"
                    style="width: 150px; float: left; display: block; border: 1px solid burlywood">${currency.currencyCode}</td>
                <td align="center"
                    style="width: 150px; float: left; display: block; border: 1px solid burlywood">${currency.currencyCodeL}</td>
                <td style="width: 150px; float: left; display: block; border: 1px solid burlywood">${currency.unit}</td>
                <td style="width: 150px; float: left; display: block; border: 1px solid burlywood">${currency.amount}</td>
            </tr>

        </c:forEach>
        </tbody>

    </table>
</center>


</body>
</html>