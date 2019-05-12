<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="ISO-8859-1">
<title>Factura</title>
<link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet" />
<link href="lib/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet" />
</head>
<body>
	<div class="form-control form-control-lg">
		<nav class="navbar navbar-inverse navbar-fixed-top">
			<ul class="nav navbar-nav">
				<li><a class="navbar-brand" href="/home.jsp">Home</a></li>
				<li class="active"><a class="navbar-brand" href="/invoice.jsp">Factura</a></li>
				<li><a class="navbar-brand" href="/report1.jsp">Reporte 1</a></li>
				<li><a class="navbar-brand" href="/report2.jsp">Reporte 2</a></li>
			</ul>
		</nav>
	</div>
	<br><br><br><br>
	<div class="container">
		<!-- Example row of columns -->
		<div class="row">
			<div class="col-md-12 text-center">
				<form th:action="@{/invoice}" th:object="${invoiceForm}" method="post">
					<label for="cliente">Cliente:</label>
					<input id="cliente" placeholder="Cliente" type="text" />
					<label for="camarero">Camarero:</label>
					<input id="camarero" placeholder="Camarero" type="text" />
					<label for="mesa">Mesa:</label>
					<input id="mesa" placeholder="Mesa"	type="text" />
					<input type="submit" value="Submit" id="button-1" />
				</form>
			</div>
		</div>
	</div>
</body>
</html>