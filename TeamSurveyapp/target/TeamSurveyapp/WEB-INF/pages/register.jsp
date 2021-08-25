<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
	<style><%@include file="/WEB-INF/pages/style.css"%></style>
<title>Register here</title>
</head>
<body>
	<h1>Welcome To EMS !!!</h1>

	<a href="loginpage">Login here</a>
	<fieldset>
	
	<form action="addemployee" method="post">
		<div class="form-row">

			<div class="form-group">
				<label for="lblfname">First Name </label> 
				<input type="text" class="form-control" id="lblfname" name="txtfname"
					placeholder="Enter Name">
			</div>
			<div class="form-group">
				<label for="lblfname">Last Name </label> 
				<input type="text" class="form-control" id="lbllname" name="txtlname"
					placeholder="Enter Last Name">
			</div>
			<div>
				<label for="lblgender">Gender </label> <br/>
				<div class="form-check-inline">
				
				<label class="form-check-label" for="lblrdmale"> Male </label>
				<input class="form-check-input" type="radio" name="gender" id="lblgender" value="Male" checked> 
			
				<label class="form-check-label" for="lblrdfemale"> Female </label>
				<input class="form-check-input" type="radio" name="gender" id="lblgender" value="Female"> 
			</div>
			</div>
			
			<div class="form-group">
				<label for="lblemail">Email</label> 
				<input type="email" class="form-control" id="lblemail" name="txtemail"
					placeholder="Enter Email">
			</div>
		</div>
		<button type="submit" class="btn btn-primary">Sign-up</button>
	
	</form>

	</fieldset>

</body>
</html>