<%@ page contentType="text/html;charset=UTF-8" language="java" %>
       <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
       <html>
       <head>
           <title>Edit</title>
       </head>
       <body>
       <c:url value="/editEmployee" var="var"/>
       <form action="${var}" method="POST">

               <input type="hidden" name="id" value="${employee.id}">
               <label>PassportNumber</label>
               <input type="text" minlength="10" maxlength="10" required pattern="^[ 0-9]+$" placeholder="Only numbers"
                                                name="passportNumber" value="${employee.passportNumber}" required>
               <label>fName</label>
               <input type="text" name="fName" value="${employee.fName}" required>
               <label>sName</label>
               <input type="text" name="sName" value="${employee.sName}" required>
               <label>Position</label>
               <input type="text" name="position" value="${employee.position}" required>
               <label>Salary</label>
               <input type="number" placeholder="Only numbers" name="salary" value="${employee.salary}" required>

               <label>Department</label>
               <select name="departId" required>
                   <option  disabled>Choose department</option>
                   <option selected  value="${employee.depart.id}">CurrentDepartment</option>
                   <option value="1">Research</option>
                   <option value="2">Marketing</option>
                   <option value="3">Develop</option>
                   <option value="4">Test</option>
                   <option value="5">Bookkeeping</option>
                   <option value="6">TopManagers</option>
               </select>
               <br>
               <br>
               <input type="submit" value="Edit employee">
               <h2><a href="/departments/allEmployee">Back to all employees</a></h2>
       </form>
       </body>
       </html>