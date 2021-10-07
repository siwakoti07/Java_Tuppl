<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">

${msg }
  <h2>registration form</h2>  
  <form action="register"  method="post">
    <div class="form-group">
      <label >Name:</label>
      <input type="text" class="form-control" name="employeeName">
    </div>
    <div class="form-group">
     <label >salary:</label>
      <input type="number" class="form-control" name="salary">
    </div>
     <div class="form-group">
    <label>Email address:</label>
    <input type="email" class="form-control"  name="emailId">
  </div>    
    <div class="form-group">
      <label>Password:</label>
      <input type="password" class="form-control"  name="password">
    </div>
   
    <button type="submit" class="btn btn-primary">Submit</button>
  </form>
</div>

</body>
</html>
