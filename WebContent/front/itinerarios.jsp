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

                <title>Modern Business - Start Bootstrap Template</title>

                <!-- Bootstrap core CSS -->
                <link href="front/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

                <!-- Custom styles for this template -->
                <link href="front/css/modern-business.css" rel="stylesheet">

            </head>

            <body>

                <!-- Navigation -->
                <nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark fixed-top">
                    <div class="container">
                        <a class="navbar-brand" href="mostrarItinerarioIndex.do">GamiTour</a>
                        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="navbar-toggler-icon"></span>
                        </button>
                        <div class="collapse navbar-collapse" id="navbarResponsive">
                            <ul class="navbar-nav ml-auto">
                                <li class="nav-item">
                                    <a class="nav-link" href="mostrarItinerarios.do">Itinerarios</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="mostrarNoticias.do">Noticias</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="mostrarMultimedia.do">Multimedia</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="contacto.html">Contacto</a>
                                </li>
                                <li class="nav-item dropdown">
                                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownBlog" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="color:#ffffff;">
                                        Iniciar Sesión
                                    </a>
                                    <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownBlog">
                  						<a class="dropdown-item" href="login.jsp">Usuario</a>
                  						<a class="dropdown-item" href="#">Nuevo usuario</a>
                  						<a class="dropdown-item" href="login.jsp" style="color:red;">Administrador</a>
                					</div>
                                </li>
                            </ul>
                        </div>
                    </div>
                </nav>

                <!-- Page Content -->
                <div class="container">

                    <!-- Page Heading/Breadcrumbs -->
                    <h1 class="mt-4 mb-4">Itinerarios</h1>

                    <div class="row justify-content-center">

                        <!-- Entradas de los itinerarios -->
                        <div class="col-md-10">

                            <!-- Post itinerario -->
                            <c:forEach items="${listaItinerarios}" var="unItinerario">
                                <div class="card mb-4">
                                    <img class="card-img-top" src="http://placehold.it/750x300" alt="Card image cap">
                                    <div class="card-body">
                                        <h2 class="card-title"><c:out value="${unItinerario.nombre}" /></h2>
                                        <p class="card-text">
                                            <c:out value="${unItinerario.categoria}" /><br>
                                            <c:out value="${unItinerario.duracion}" /><br>
                                            <c:out value="${unItinerario.ubicacion}" />
                                        </p>
                                        <a href="MostrarItinerarioParadas.do?id=${unItinerario.iditinerario}">
                            				Ver itinerario</a>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                    </div>
                </div>
                <!-- /.row -->

                </div>
                <!-- /.container -->

                <!-- Footer -->
                <footer class="py-5 bg-dark">
                    <div class="container">
                        <p class="m-0 text-center text-white">Copyright &copy; Your Website 2018</p>
                    </div>
                    <!-- /.container -->
                </footer>

                <!-- Bootstrap core JavaScript -->
                <script src="front/vendor/jquery/jquery.min.js"></script>
                <script src="front/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

            </body>

            </html>
