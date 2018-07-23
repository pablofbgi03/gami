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

                <title>GamiTour</title>

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
                                    <a class="nav-link" href="MostrarItinerariosFront.do">Itinerarios</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="mostrarNoticias.do">Noticias</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="mostrarMultimedia.do">Multimedia</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="front/contacto.html">Contacto</a>
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

                <header>
                    <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                        <ol class="carousel-indicators">
                            <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                            <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                            <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                        </ol>
                        <div class="carousel-inner" role="listbox">
                            <!-- Slide One - Set the background image for this slide in the line below -->
                            <div class="carousel-item active" style="background-image: url('http://placehold.it/1900x1080')">
                                <div class="carousel-caption d-none d-md-block">
                                    <h3>First Slide</h3>
                                    <p>This is a description for the first slide.</p>
                                </div>
                            </div>
                            <!-- Slide Two - Set the background image for this slide in the line below -->
                            <div class="carousel-item" style="background-image: url('http://placehold.it/1900x1080')">
                                <div class="carousel-caption d-none d-md-block">
                                    <h3>Second Slide</h3>
                                    <p>This is a description for the second slide.</p>
                                </div>
                            </div>
                            <!-- Slide Three - Set the background image for this slide in the line below -->
                            <div class="carousel-item" style="background-image: url('http://placehold.it/1900x1080')">
                                <div class="carousel-caption d-none d-md-block">
                                    <h3>Third Slide</h3>
                                    <p>This is a description for the third slide.</p>
                                </div>
                            </div>
                        </div>
                        <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
          <span class="carousel-control-prev-icon" aria-hidden="true"></span>
          <span class="sr-only">Previous</span>
        </a>
                        <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
          <span class="carousel-control-next-icon" aria-hidden="true"></span>
          <span class="sr-only">Next</span>
        </a>
                    </div>
                </header>

                <!-- Page Content -->
                <div class="container">

                    <h1 class="my-4">Itinerarios más recientes</h1>

                    <!-- Marketing Icons Section -->
                    <div class="row">
                        <c:forEach items="${listaItinerarios}" var="unItinerario">
                            <div class="col-lg-4 mb-4">
                                <div class="card h-100">
                                    <h4 class="card-header">
                                        <c:out value="${unItinerario.nombre}" />
                                    </h4>
                                    <div class="card-body">
                                        <p class="card-text">
                                            <c:out value="${unItinerario.categoria}" />
                                            <c:out value="${unItinerario.duracion}" />
                                            <c:out value="${unItinerario.ubicacion}" />
                                        </p>
                                    </div>
                                    <div class="card-footer">
                                        <a href="MostrarItinerarioParadas.do?id=${unItinerario.iditinerario}">
                                        Ver itinerario</a>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                    <!-- /.row -->

                    <!-- Portfolio Section -->
                    <h2>Últimas Noticias</h2>

                    <div class="row">
                        <c:forEach items="${listaNoticias}" var="unNoticia">
                            <div class="col-lg-4 mb-4">
                                <div class="card h-100">
                                    <h4 class="card-header">
                                        <c:out value="${unNoticia.nombre}" />
                                    </h4>
                                    <div class="card-body">
                                        <p class="card-text">
                                            <c:out value="${unNoticia.texto}" />
                                            <c:out value="${unNoticia.fechaalta}" />
                                            <c:out value="${unNoticia.fechacaducidad}" />
                                        </p>
                                    </div>
                                    <div class="card-footer">
                                        <a href="front/noticia.jsp?idnoticia=${unNoticia.idnoticia}&nombre=${unNoticia.nombre}&texto=${unNoticia.texto}
											&fechaalta=${unNoticia.fechaalta}&fechacaducidad=${unNoticia.fechacaducidad}&imagen=${unNoticia.imagen}">Leer más</a>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                    <!-- /.row -->
                    <hr>
                    <!-- Call to Action Section -->
                    <div class="row mb-4 pr-3 pl-3">
                        <div class="col-md-8">
                            <p>Si tienes alguna duda, comentario o propuesta para mejorar nuestra web o alguno de nuestros servicios, puedes ponerte en contacto con nosotros pulsando éste botón.</p>
                        </div>
                        <div class="col-md-4">
                            <a class="btn btn-lg btn-secondary btn-block" href="#">¡Cuentanos!</a>
                        </div>
                    </div>
                </div>
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
                                    <a href="#">Contacto</a> |
                                    <a href="#">Acerca de</a>
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
