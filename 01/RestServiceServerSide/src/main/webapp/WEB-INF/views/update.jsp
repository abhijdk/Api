<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" isErrorPage="false" isELIgnored="false" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body><a href="/Demo">Home</a><hr>
<h1>Student Update Form</h1>
<div align="center">
    <i>Modify Deteils</i>
    <form:form action="insertUpdate" modelAttribute="stu">
        <form:hidden path="id"/>


        <label>Student Name:</label>
        <form:input path="name" />
        <br />

        <input type="submit" value="submit" />

    </form:form>
</div>
</body>
</html>
