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
 background-image: url("images/subjects.jpg");
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
<title>Subject Information</title>
</head>
<body>
<form action="insertSubject" method="post">
<h1>Subject Information</h1>
<input type="text" placeholder="Subject ID" name="subid">
<input type="text" placeholder="Name" name="Name">
<input type="text" placeholder="Lecturer in Charge" name="lecInCh">
<input type="submit" value="Insert">

</form>

<h1>Delete Subject Information</h1>
<form action="deletesubject" method="post">
<input type="text" placeholder="Subject ID" name="subid">
<input type="submit" value="Delete">
</form>
</body>
</html>