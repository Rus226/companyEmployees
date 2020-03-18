<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>ResearchDepartment</title>
</head>
<body>

<h2>Research Department</h2>
<table>
    <tr>
        <th>Id***</th>
        <th>PassportNumber***</th>
        <th>FirstName***</th>
        <th>SurName***</th>
        <th>Position***</th>
        <th>Salary***</th>
        <th>Department***</th>
    </tr>

    <c:forEach var="employee" items="${researchDepartment}">
        <tr>
                <td>${employee.id}</td>
                <td>${employee.passportNumber}</td>
                <td>${employee.fName}</td>
                <td>${employee.sName}</td>
                <td>${employee.position}</td>

                <td>${employee.salary}</td>

                <td>${employee.depart.nameDep}</td>
        </tr>
        </c:forEach>
        </table>


<h2><a href="/departments">Back to all departments</a></h2>
</body>
</html>


