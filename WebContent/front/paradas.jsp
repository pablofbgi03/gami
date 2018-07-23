<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

            <!DOCTYPE html>
            <html lang="en">

            <head>

                <meta charset="utf-8">
                <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
                <meta name="description" content="">
                <meta name="author" content="">

                <title>Paradas</title>

                <!-- Bootstrap core CSS -->
                <link href="front/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

                <!-- Custom styles for this template -->
                <link href="front/css/modern-business.css" rel="stylesheet">

            </head>

            <body>

                <!-- Navigation -->
                <nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark fixed-top">
                    <div class="container">
                        <a class="navbar-brand" href="../mostrarItinerarioIndex.do">GamiTour</a>
                        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="navbar-toggler-icon"></span>
                        </button>
                        <div class="collapse navbar-collapse" id="navbarResponsive">
                            <ul class="navbar-nav ml-auto">
                                <li class="nav-item">
                                    <a class="nav-link" href="../mostrarItinerarios.do">Itinerarios</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="../mostrarNoticias.do">Noticias</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="../mostrarMultimedia.do">Multimedia</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="contacto.html">Contacto</a>
                                </li>
                                <li class="nav-item dropdown">
                                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownBlog" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="color:#ffffff;">
                                        Iniciar Sesión
                                    </a>
                                    <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownBlog">
                  						<a class="dropdown-item" href="../login.jsp">Usuario</a>
                  						<a class="dropdown-item" href="#">Nuevo usuario</a>
                  						<a class="dropdown-item" href="../login.jsp" style="color:red;">Administrador</a>
                					</div>
                                </li>
                            </ul>
                        </div>
                    </div>
                </nav>

                <!-- Page Content -->
                <div class="container">

                    <!-- Page Heading/Breadcrumbs -->
                    <h1 class="mt-4 mb-3">Paradas</h1>

                    <!-- Project One -->
                    <c:forEach items="${listaParadas}" var="parada">
                        <div class="row mb-5">
                            <div class="col-md-7">
                                <a href="MostrarParada.do?id=${parada.idparada}"> <img class="img-fluid rounded mb-3 mb-md-0" src="http://placehold.it/700x300" alt="">
				            </a>
                            </div>
                            <div class="col-md-5">
                                <h4>${parada.nombre}</h4>
                                <p>
                                    ${parada.numeroParada}<br> ${parada.ubicacion}
                                    <br><b>Historia:</b> ${parada.historia}
                                    <br><b>Anecdotario:</b> ${parada.anecdotario}
                                    <br><b>Gastronomia:</b> ${parada.gastronomia}
                                    <br> ${parada.imagen}
                                    <br>
                                    <a href="mostrarPruebaCultural.do?id=${parada.idparada}">Mostrar
                                        pruebas culturales</a><br>
                                    <a href="mostrarPruebaDeportiva.do?id=${parada.idparada}">Mostrar
                                            pruebas deportivas</a></p>
                            </div>
                        </div>
                    </c:forEach>
                    <!-- /.row -->
                </div>
                <!-- /.container -->

                <!-- Footer -->
                <footer class="py-5 bg-dark">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-2"></div>
                            <div class="col-2">
                                <p class="m-0 text-center text-white">Copyright &copy; GamiTour 2018</p>
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
                <script src="front/vendor/jquery/jquery.min.js"></script>
                <script src="front/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

            </body>

            </html>
