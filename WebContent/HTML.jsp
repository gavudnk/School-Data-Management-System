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
 background-image: url("images/school.jpg");
 position: fixed;
 top: 0;
 width: 100%;
 height: 100%;
 background-size:cover
}

.tab button:hover {
  background-color: #65AAE1;
}

.tab button {
  background-color: #CACACA;
  float: left;
  border: none;
  outline: none;
  cursor: pointer;
  padding: 50px 135px;
  transition: 0.3s;
}

</style>

<meta charset="ISO-8859-1">
<title>School Information Management System</title>
</head>
<body>


<h1 style="font-family:verdana;"><center>School Information Management System</center></h1>

<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>




<div class="tab">


  <button class="tablinks" onclick="window.location.href = 'form.jsp';">Student Information</button>
  <button class="tablinks" onclick="window.location.href = 'teacherForm.jsp';">Teacher Information</button>
  <button class="tablinks" onclick="window.location.href = 'subjectForm.jsp';">Subject Information</button>
  <button class="tablinks" onclick="window.location.href = 'examForm.jsp';">Exam Information</button>


</div>



</body>
</html>


