<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>show all</title>
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
 
  <table class="table">
    <thead>
      <tr>
        <th>id</th>
        <th>name</th>
        <th>sal</th>
        <th>Email</th>
        <th>pass</th>
        <th>action</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${empList}" var="item"> 

      <tr>
        <td>${item.employeeId}</td>
        <td>${item.employeeName}</td>
        <td>${item.salary}</td>
        <td>${item.emailId}</td>
        <td>${item.password}</td>
        <td>
        <a href="updateEmp?employeeId=${item.employeeId}">update</a>
        </td>
      </tr>
      </c:forEach>
     
    </tbody>
  </table>
</div>




</body>
</html>