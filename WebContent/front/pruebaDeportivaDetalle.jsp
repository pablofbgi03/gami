<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ taglib
uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> <%@ taglib
uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Paradas</title>

<!-- Bootstrap core CSS -->
<link href="front/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="front/css/modern-business.css" rel="stylesheet">

</head>

<body>

	<!-- Navigation -->
	<nav
		class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark fixed-top">
		<div class="container">
			<a class="navbar-brand" href="../mostrarItinerarioIndex.do">GamiTour</a>
			<button class="navbar-toggler navbar-toggler-right" type="button"
				data-toggle="collapse" data-target="#navbarResponsive"
				aria-controls="navbarResponsive" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item"><a class="nav-link"
						href="../mostrarItinerarios.do">Itinerarios</a></li>
					<li class="nav-item"><a class="nav-link"
						href="../mostrarNoticias.do">Noticias</a></li>
					<li class="nav-item"><a class="nav-link"
						href="../mostrarMultimedia.do">Multimedia</a></li>
					<li class="nav-item"><a class="nav-link" href="contacto.html">Contacto</a>
					</li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdownBlog"
						data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"
						style="color: #ffffff;"> Iniciar Sesión </a>
						<div class="dropdown-menu dropdown-menu-right"
							aria-labelledby="navbarDropdownBlog">
							<a class="dropdown-item" href="../login.jsp">Usuario</a> <a
								class="dropdown-item" href="#">Nuevo usuario</a> <a
								class="dropdown-item" href="../login.jsp" style="color: red;">Administrador</a>
						</div></li>
				</ul>
			</div>
		</div>
	</nav>

	<!-- Page Content -->
	<div class="container">

		<!-- Page Heading/Breadcrumbs -->
		<h1 class="mt-4 mb-3">Prueba Deportiva</h1>

		<!-- Intro Content -->
		<div class="row">
			<div class="col-lg-6">
				<h4>${prueba.nombre}</h4>
				<h2>${prueba.pregunta}</h2>
				<br>
				<p>
					${prueba.fechainicio}<br> ${prueba.fechafin}<br>
					${prueba.explicacion}<br> ${prueba.puntos}<br>
				</p>
			</div>
		</div>
		<div class="row">
			<a href="front/multimediaInsertar.jsp?id=${prueba.idpruebadeportiva}">Insertar Multimedia</a>
			<c:forEach items="${listaMultimedia}" var="multimedia">
				<div class="col-lg-4 mb-4">
					<div class="card h-100">
						<h4 class="card-header">
							<c:out value="${multimedia.fecha}" />
						</h4>
						<div class="card-body">
							<p class="card-text">
								<c:out value="${multimedia.imagen}" /><br>
								<c:out value="${multimedia.video}" />
							</p>
						</div>
						<div class="card-footer">
							<a
								href="MostrarMultimediaComentarios.do?idmultimedia=${multimedia.idmultimedia}">Ver multimedia
							</a>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
	<!-- /.container -->

	<!-- Footer -->
	<footer class="py-5 bg-dark">
		<div class="container-fluid">
			<div class="row">
				<div class="col-2"></div>
				<div class="col-2">
					<p class="m-0 text-center text-white">Copyright &copy; GamiTour
						2018</p>
				</div>
				<div class="col-5"></div>
				<div class="col-2">
					<p>
						<a href="#">Contacto</a> | <a href="#">Acerca de</a>
					</p>
				</div>
			</div>
		</div>
		<!-- /.container -->
	</footer>

	<!-- Bootstrap core JavaScript -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>

</html>
