<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 28-11-2023
  Time: 18:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head><h1>ClientSide</h1><hr>
    <title>Title</title>
</head>
<body>

<h3>College Name:- ${view.collegeName}</h3>
<h5><a href="form">Add new Student record</a></h5>

<table border="2">
    <thead>
    <tr>
        <th>Id</th>
        <th>Name</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="getAllStudent" items="${view.stu}">
        <tr>
            <th>${getAllStudent.id}</th>
            <th>${getAllStudent.name}</th>
            <th><a href="update?id=${getAllStudent.id}"> Update </a> </th>
            <td><a href="delete?id=${getAllStudent.id}" onclick="if(!(confirm('Are you sure you want to delete this product?'))) return false">Delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>



</body>
</html>
