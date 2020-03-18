<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>All employees</title>
</head>
<body>

<h2>All Employees</h2>
<table>
    <tr>
        <th>Id***</th>
        <th>PassportNumber***</th>
        <th>FirstName***</th>
        <th>SurName***</th>
        <th>Position***</th>
        <th>Salary***</th>
        <th>Department***</th>
        <th>Department Location***</th>
        <th>Action***</th>
    </tr>

    <c:forEach var="employee" items="${allEmployee}">
        <tr>
                <td>${employee.id}</td>
                <td>${employee.passportNumber}</td>
                <td>${employee.fName}</td>
                <td>${employee.sName}</td>
                <td>${employee.position}</td>
                <td>${employee.salary}</td>
                <td>${employee.depart.nameDep}</td>
                <td>${employee.depart.location}</td>
                <td>
                     <a href="/editEmployee/${employee.id}">edit</a>
                     <a href="/deleteEmployee/${employee.id}">delete</a>
                </td>
        </tr>
        </c:forEach>
        </table>

<c:url value="/addEmployee" var="addEmployee"/>
<h2><a href="${addEmployee}">Add new Employee</a></h2>
<h2><a href="/departments">Back to all departments</a></h2>
</body>
</html>