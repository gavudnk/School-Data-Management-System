<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" type="text/css" href="css/style.css"/>
<style type="text/css">

body, html {
  height: 100%;
  margin: 0;
  font-family: verdana;
}

body {
 background-image: url("images/student.jpg");
 position: fixed;
 top: 0;
 width: 100%;
 height: 100%;
 background-size:cover
}

h1 {
        color: #ffffff;
        font-family: Verdana, Geneva, sans-serif;
}

</style>


<meta charset="ISO-8859-1">
<title>Student Information</title>
</head>
<body>
<form action="Insert" method="post">
<h1>Student Information</h1>
<input type="text" placeholder="Student ID" name="sid">
<input type="text" placeholder="Name" name="username">
<input type="text" placeholder="Address" name="Address">
<input type="submit" value="Insert">
</form>

<h1>Delete Student Information</h1>
<form action="DeleteServlet" method="post">
<input type="text" placeholder="Student ID" name="sid">
<input type="submit" value="Delete">
</form>


</body>
</html>