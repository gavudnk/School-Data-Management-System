<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>


<head>
<link rel="stylesheet" type="text/css" href="css/style.css"/>

<style type="text/css">

 {
	margin:0;
	padding:0;
	box-sizing:border-box;
	-webkit-box-sizing:border-box;
	-moz-box-sizing:border-box;
	-webkit-font-smoothing:antialiased;
	-moz-font-smoothing:antialiased;
	-o-font-smoothing:antialiased;
	font-smoothing:antialiased;
	text-rendering:optimizeLegibility;
}

body {
	font-family:"Open Sans", Helvetica, Arial, sans-serif;
	font-weight:300;
	font-size: 12px;
	line-height:30px;
	color:#777;
	background-image: url("images/computer.jpg");
}


.container {
	max-width:600px;
	width:100%;
	margin:0 auto;
	position:relative;
}

#contact input[type="text"], #contact input[type="email"], #contact input[type="tel"], #contact input[type="url"], #contact textarea, #contact button[type="submit"] { font:400 12px/16px "Open Sans", Helvetica, Arial, sans-serif; }

#contact {
	background:#F9F9F9;
	padding:25px;
	margin:50px 0;
}

#contact h3 {
	color: #F96;
	display: block;
	font-size: 30px;
	font-weight: 400;
}

#contact h4 {
	margin:5px 0 15px;
	display:block;
	font-size:13px;
	font-weight:bold;
	color:black;
}

fieldset {
	border: medium none !important;
	margin: 0 0 10px;
	min-width: 80%;
	padding: 0;
	width: 80%;
}

#contact input[type="text"], #contact input[type="email"], #contact input[type="tel"], #contact input[type="url"], #contact textarea {
	width:80%;
	border:1px solid #CCC;
	background:#FFF;
	margin:0 0 5px;
	padding:10px;
}

#contact input[type="text"]:hover, #contact input[type="email"]:hover, #contact input[type="tel"]:hover, #contact input[type="url"]:hover, #contact textarea:hover {
	-webkit-transition:border-color 0.3s ease-in-out;
	-moz-transition:border-color 0.3s ease-in-out;
	transition:border-color 0.3s ease-in-out;
	border:1px solid #AAA;
}

#contact textarea {
	height:100px;
	max-width:80%;
  resize:none;
}

#contact button[type="submit"] {
	cursor:pointer;
	width:20%;
	border:none;
	background:#0CF;
	color:#FFF;
	margin:0 0 5px;
	padding:10px;
	font-size:15px;
}


#contact button[type="submit"]:hover {
	background:#09C;
	-webkit-transition:background 0.3s ease-in-out;
	-moz-transition:background 0.3s ease-in-out;
	transition:background-color 0.3s ease-in-out;
}

#contact button[type="submit"]:active { box-shadow:inset 0 1px 3px rgba(0, 0, 0, 0.5); }

#contact input:focus, #contact textarea:focus {
	outline:0;
	border:1px solid #999;
}
::-webkit-input-placeholder {
 color:#888;
}
:-moz-placeholder {
 color:#888;
}
::-moz-placeholder {
 color:#888;
}
:-ms-input-placeholder {
 color:#888;
}

.image1 {
	margin-left:20px;
}

.image2 {
	margin-right:20px;
}


</style>

<meta charset="ISO-8859-1">
	
	<title>Welcome</title>
	
	 
	</head>

	<body>
	
	

<div class="container">  

	
	
	


<form name="Sign in"  action = "LogIn" onsubmit="return validateForm()" id="contact" method="post">
 <br>
	<h1 style="font-family:verdana;"><center>School Information Management System</center></h1>
 <br>
	

	
    
	<center>
	<fieldset>
      <input placeholder="User Name" type="text" name="UserName" tabindex="2">
    </fieldset>
	
	<fieldset>
      <input placeholder="Password" type="password" name="Password" tabindex="2">
    </fieldset>
	
	</center>
	<br>
	
	<center>
	<fieldset>
      <button name="Sign in" type="submit" id="contact-submit" >Sign in</button>
    </fieldset>
    </center>
	
  </form>
  

 
  
</div>

	

	</body>
