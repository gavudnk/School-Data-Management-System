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
 background-image: url("images/teacher.jpg");
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
<title>Teacher Information</title>
</head>
<body>
<form action="insertTeacher" method="post">
<h1>Teacher Information</h1>
<input type="text" placeholder="Teacher ID" name="tid">
<input type="text" placeholder="Name" name="Name">
<input type="text" placeholder="Address" name="address">
<input type="submit" value="Insert">

</form>

<h1>Delete Teacher Information</h1>
<form action="deleteTeacher" method="post">
<input type="text" placeholder="Teacher ID" name="tid">
<input type="submit" value="Delete">
</form>



</body>
</html>