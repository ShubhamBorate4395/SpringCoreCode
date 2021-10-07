<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- added for errors handling on form -->

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- added for mapping resources files -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page isELIgnored="false"%>

<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
	


<title>www.signup.com</title>
</head>
<body class="" style="background: #e2e2e2;">

	<div class="container mt-4">
		<div class="row">
			<div class="col-md-8 offset-md-2">
				<div class="card">
					<div class="card-body">
						<h3 class="text-center">Complex Form</h3>
						
						<!-- Doing Errors on form fill  -->
						<div class="alert alert-danger" role="alert">
							
							<!-- this code shows us erros which did on form when we fill the form  -->
							<form:errors path="student.*"></form:errors>
						
						</div>
							
						<form action="handalForm" method="post">

							<!-- Name Field -->

							<div class="form-group">
								<label for="exampleInputEmail1">Name</label> <input type="text"
									class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp" placeholder="enter your name"
									name="name">
							</div>

							<!-- Id Field -->

							<div class="form-group">
								<label for="id">Id</label> <input type="text"
									class="form-control" id="id" aria-describedby="emailHelp"
									placeholder="enter your id" name="id">
							</div>

							<!-- DOB Field -->

							<div class="form-group">
								<label for="dob">DOB</label> <input type="text"
									class="form-control" id="dob" aria-describedby="emailHelp"
									placeholder="dd/mm/yyyy" name="dob">
							</div>
							<!-- Here above we manualy type the data -->

							<!-- Address Field -->
							<p>Address</p>
							<div class="card">
								<div class="card-body">

									<div class="form-group">
										<label for="state">State</label> <input type="text"
											class="form-control" name="address.state"
											placeholder="enter your state" />
									</div>

									<div class="form-group">
										<label for="city">City</label> <input type="text"
											class="form-control" name="address.city"
											placeholder="enter your city" />
									</div>


								</div>
							</div>

							<!-- Courses Field -->

							<br>
							<div class="form-group">
								<label for="courses">Select Courses</label> <select
									class="form-control" id="courses" name="courses" multiple>
									<option>Java</option>
									<option>Python</option>
									<option>Django</option>
									<option>Spring</option>
									<option>SQL</option>
								</select>
							</div>

							<!-- Gender Field -->

							<div class="form-group">
								<span class="mr-3">Select Gender</span>

								<div class="form-check form-check-inline">
									<input class="form-check-input" name="gender" type="radio"
										id="inlineRadio1" value="male"> <label
										class="form-check-label" for="inlineRadio1">Male</label>
								</div>

								<div class="form-check form-check-inline">
									<input class="form-check-input" name="gender" type="radio"
										id="inlineRadio2" value="female"> <label
										class="form-check-label" for="inlineRadio2">Female</label>
								</div>

							</div>

							<!-- Student Type Field -->

							<div class="form-group">
								<label for="studentType">Select Type</label> <select
									class="form-control" name="type">
									<option value="old student">Old Student</option>
									<option value="normal student">Normal Student</option>
								</select>
							</div>

							<!-- Button Field -->

							<div class="container text-center">
								<button type="submit" class="btn btn-primary">Submit</button>
							</div>


						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>