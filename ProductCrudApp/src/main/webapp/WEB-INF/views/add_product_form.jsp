<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="./base.jsp"%>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h2 class="text-center mb-3">Fill The Product Details</h2>
				
				<form action="handal-product" method="post">

					<div class="form-group">
						<label for="name">Product Name</label> <input type="text"
							class="form-control" id="name" aria-describedby="emailHelp"
							name="name" placeholder="enter your product name here">
					</div>

					<div class="form-group">
						<label for="description">Product Description</label>
						<textarea rows="5" class="form-control" id="description"
							name="description" placeholder="enter your product details here"></textarea>
					</div>

					<div class="form-group">
						<label for="name">Product Price</label> 
						<input type="text"
							class="form-control" id="name" aria-describedby="emailHelp"
							name="price" placeholder="enter your product price here">
					</div>

					<div class="container text-center">
					
					<!-- this ref-link take us to home path our project -->
						<a href="${pageContext.request.contextPath}"
							class="btn btn-outline-danger">Back</a>
						<button type="submit" class="btn btn-primary">Add</button>
					</div>

				</form>
			</div>
		</div>
	</div>



</body>
</html>