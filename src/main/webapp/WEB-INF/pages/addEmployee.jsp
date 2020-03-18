<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Add new Employee</title>
</head>
<body>
<c:url value="/addEmployee" var="var"/>
<form action="${var}" method="POST">

    <label>PassportNumber</label>
    <input type="text" minlength="10" maxlength="10" required pattern="^[0-9]+$" name="passportNumber" placeholder="Only numbers"  required>
    <label>fName</label>
    <input type="text" name="fName" required>
    <label>sName</label>
    <input type="text" name="sName"  required>
    <label>Position</label>
    <input type="text" name="position" required>
    <label>Salary</label>
    <input type="number" name="salary" placeholder="Only numbers" required>

    <label>Department</label>
    <select name="departId" required>
          <option disabled>Choose department</option>
          <option value="1">Research</option>
          <option value="2">Marketing</option>
          <option value="3">Develop</option>
          <option value="4">Test</option>
          <option value="5">Bookkeeping</option>
          <option value="6">TopManagers</option>
     </select>
    <br>
    <br>
    <input type="submit" value="Add employee">
    <h2><a href="/departments/allEmployee">Back to all employees</a></h2>

</form>
</body>
</html>