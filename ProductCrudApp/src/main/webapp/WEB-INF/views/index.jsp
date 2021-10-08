<html>
<head>
<%@ include file="./base.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h2 class="text-center mb-3">Welcome To Product App!!</h2>

				<table class="table table-bordered">
					<thead class="thead-dark">
						<tr class="text-center">
							<th scope="col">Product_Id</th>
							<th scope="col">Product_Name</th>
							<th scope="col">Product_Desc</th>
							<th scope="col">Product_Price</th>
							<th scope="col">Product_Edit</th>
							<th scope="col">Product_Remove</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${product}" var="p">
						<tr>
							<th scope="row" class="text-center">PROD_ID ${p.id}</th>
							<td class="text-center">${p.name}</td>
							<td class="text-center">${p.description}</td>
							<td class="font-weight-bold text-center">&#x20B9 ${p.price}</td>
							
							<!-- update icon pass urlink which we used in controller -->
							<td class="text-center">
							<a href="update-product/${p.id}">
							<i class="fas fa-edit text-primary text-center" style="font-size:20px;"></i></a>
							</td>
		
		                   <!-- delete icon code urlink which we used in controller-->
							<td class="text-center">
							<a href="delete-product/${p.id}">
							<i class="fas fa-trash text-danger " style="font-size:20px;"></i></a>
							</td>
							
						</tr>
						</c:forEach>
					</tbody>
				</table>
				
				<div class="contanier text-center">
					<a href="add-product" class="btn btn-outline-success">Add Product</a>				
				</div>

			</div>
		</div>
	</div>
</body>
</html>
