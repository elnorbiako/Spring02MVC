<%--
  Created by IntelliJ IDEA.
  User: norbiak
  Date: 26.04.18
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>

    <style>
        body {color: ${mainColor}; background-color:${subColor};}
        table, td {
            border: 1px solid black;
            padding: 3px;
            text-align: center;
        }
        td{
            background-color: darkgoldenrod;
        }
        table{
            background-color: chartreuse;
        }
    </style>
</head>
<body>
<h1>Witaj w widoku!</h1>
<h2>${size}</h2>

<table>
    <tr>
        <c:forEach begin="0" end="${size}" step="1" var="j">
            <c:if test="${j==0}">
                <th>x</th>
            </c:if>
            <c:if test="${j!=0}">
                <th>${j}</th>
            </c:if>
        </c:forEach>
    </tr>

    <c:forEach begin="1" end="${size}" step="1" var="i">
        <tr>
            <th>${i}</th>
            <c:forEach begin="1" end="${size}" step="1" var="j">
                <td>${i*j}</td>
            </c:forEach>
        </tr>
    </c:forEach>

</table>
</body>
</html>
