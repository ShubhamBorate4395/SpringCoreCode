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
				<h2 class="text-center mb-3">Edit The Product Details!!</h2>
				
				<!--Failed to convert value of type 'java.lang.String' to required type 'int'; 
					nested exception is java.lang.NumberFormatException this error handling we use below code  -->
				<form action="${pageContext.request.contextPath}/handal-product" method="post">
				
				<!-- this code we use here for server handler want know which id you hava updated.
				 here we use type="hidden" for hide from user we use here type="text" also   -->
					<input type="hidden" value="${product.id}" name="id"/>
					
					<div class="form-group">
						<label for="name">Product Name</label> <input type="text"
							class="form-control" id="name" aria-describedby="emailHelp"
							name="name" placeholder="enter your product name here" value="${product.name}">
					</div>

					<div class="form-group">
						<label for="description">Product Description</label>
						<textarea rows="5" class="form-control" id="description"
							name="description" placeholder="enter your product details here">${product.description}</textarea>
					</div>

					<div class="form-group">
						<label for="name">Product Price</label> 
						<input type="text"
							class="form-control" id="name" aria-describedby="emailHelp"
							name="price" placeholder="enter your product price here" value="${product.price}">
					</div>

					<div class="container text-center">
					
					<!-- this ref-link take us to home path our project -->
						<a href="${pageContext.request.contextPath}"
							class="btn btn-outline-danger">Back</a>
						<button type="submit" class="btn btn-primary">Update</button>
					</div>

				</form>
			</div>
		</div>
	</div>



</body>
</html>