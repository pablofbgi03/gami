<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

        <!DOCTYPE html>
        <html lang="es">

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <!-- Meta, title, CSS, favicons, etc. -->
            <meta charset="utf-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1">

            <title>DataTables | Gentelella</title>

            <!-- Bootstrap -->
            <link href="Administrador/vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
            <!-- Font Awesome -->
            <link href="Administrador/vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
            <!-- NProgress -->
            <link href="Administrador/vendors/nprogress/nprogress.css" rel="stylesheet">
            <!-- iCheck -->
            <link href="Administrador/vendors/iCheck/skins/flat/green.css" rel="stylesheet">
            <!-- Datatables -->
            <link href="Administrador/vendors/datatables.net-bs/css/dataTables.bootstrap.min.css" rel="stylesheet">
            <link href="Administrador/vendors/datatables.net-buttons-bs/css/buttons.bootstrap.min.css" rel="stylesheet">
            <link href="Administrador/vendors/datatables.net-fixedheader-bs/css/fixedHeader.bootstrap.min.css" rel="stylesheet">
            <link href="Administrador/vendors/datatables.net-responsive-bs/css/responsive.bootstrap.min.css" rel="stylesheet">
            <link href="Administrador/vendors/datatables.net-scroller-bs/css/scroller.bootstrap.min.css" rel="stylesheet">

            <!-- Custom Theme Style -->
            <link href="Administrador/build/css/custom.min.css" rel="stylesheet">
        </head>

        <body class="nav-md">
            <div class="container body">
                <div class="main_container">
                    <div class="col-md-3 left_col">
                        <div class="left_col scroll-view">
                            <div class="navbar nav_title" style="border: 0;">
                                <a href="index.html" class="site_title"><i class="fa fa-paw"></i> <span>GamiTour</span></a>
                            </div>

                            <div class="clearfix"></div>

                            <!-- menu profile quick info -->
                            <div class="profile clearfix">
                                <div class="profile_pic">
                                    <img src="images/img.jpg" alt="..." class="img-circle profile_img">
                                </div>
                                <div class="profile_info">
                                    <span>Bienvenido,</span>
                                    <h2>Administrador</h2>
                                </div>
                            </div>
                            <!-- /menu profile quick info -->

                            <br />

                            <!-- sidebar menu -->
                            <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
                                <div class="menu_section">
                                    <ul class="nav side-menu">
                                        <li><a><i class="fa fa-table"></i> Tablas <span class="fa fa-chevron-down"></span></a>
                                            <ul class="nav child_menu">
                                                <li><a href="mostrarActividad.do">Actividades</a></li>
                                            	<li><a href="mostrarClientes.do">Clientes</a></li>
                      							<li><a href="mostrarPremio.do">Premios</a></li>
                     							<li><a href="mostrarVoto.do">Votos</a></li>
                      							<li><a href="mostrarItinerario.do">Itinerarios</a></li>
                      							<li><a href="mostrarComentario.do">Comentarios</a></li>
                      							<li><a href="mostrarPremio.do">Premios</a></li>
                      							<li><a href="mostrarMultimedia.do">Multimedias</a></li>
                      							<li><a href="mostrarNoticias.do">Noticias</a></li>
                                            </ul>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                            <!-- /sidebar menu -->
                            <!-- /menu footer buttons -->
                            <div class="sidebar-footer hidden-small">
                                <a data-toggle="tooltip" data-placement="top" title="Logout" href="login.html">
                    <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
                  </a>
                            </div>
                            <!-- /menu footer buttons -->
                        </div>
                    </div>

                    <!-- top navigation -->
                    <div class="top_nav">
                        <div class="nav_menu">
                            <nav>
                                <div class="nav toggle">
                                    <a id="menu_toggle"><i class="fa fa-bars"></i></a>
                                </div>

                                <ul class="nav navbar-nav navbar-right">
                                    <li class="">
                                        <a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                        <img src="images/img.jpg" alt="">Administrador
                        <span class=" fa fa-angle-down"></span>
                      </a>
                                        <ul class="dropdown-menu dropdown-usermenu pull-right">
                                            <li><a href="javascript:;"> Perfil</a></li>
                                            <li>
                                                <a href="javascript:;">
                            <span>Opciones</span>
                          </a>
                                            </li>
                                            <li><a href="javascript:;">Ayuda</a></li>
                                            <li><a href="login.html"><i class="fa fa-sign-out pull-right"></i> Desconectar</a></li>
                                        </ul>
                                    </li>
                                </ul>
                            </nav>
                        </div>
                    </div>
                    <!-- /top navigation -->

                    <!-- page content -->
                    <div class="right_col" role="main">
                        <div class="">
                            <div class="page-title">
                                <div class="title_left">
                                    <h3>Tablas</h3>
                                </div>
                            </div>

                            <div class="clearfix"></div>

                            <div class="row">
                                <div class="col-md-12 col-sm-12 col-xs-12">
                                    <div class="x_panel">
                                        <div class="x_title">
                                            <div class="clearfix"></div>
                                        </div>
                                        <div class="x_content">
                                            <table id="datatable" class="table table-striped table-bordered">
                                            <tr>
                                                <a href="PreInsertarPremio.do">Insertar premio</a>
                                            </tr>
                                                <tr>
                                                    <th>Nombre</th>
                                                    <th>Descripci�n</th>
                                                    <th>Imagen</th>
                                                    <th>Fecha de activaci�n</th>
                                                    <th>Fecha de Consumo</th>
                                                    <th>Puntos</th>
                                                    <th>Cliente</th>
                                                    <th>Borrar</th>
                                                    <th>Actualizar</th>
                                                </tr>
                                                <c:forEach items="${listaPremios}" var="unPremio">
                                                    <tr>
                                                        <td>${unPremio.nombre}</td>
                                                        <td>${unPremio.descripcion}</td>
                                                        <td>${unPremio.imagen}</td>
                                                        <td>${unPremio.fechaactivacion}</td>
                                                        <td>${unPremio.fechaconsumo}</td>
                                                        <td>${unPremio.puntos}</td>
                                                        <td>${unPremio.cliente.idcliente}</td>
                                                        <td><a href="borrarPremio.do?idpremio=${unPremio.idpremio}">Borrar premio</a></td>
                                                        <td><a href="Administrador/Administrador/ActualizarPremio.jsp?idPremio=${unPremio.idpremio}&nombre=${unPremio.nombre}&descripcion=${unPremio.descripcion}
                                &imagen=${unPremio.imagen}&fechaactivacion=${unPremio.fechaactivacion}&fechaconsumo=${unPremio.fechaconsumo}
                                &puntos=${unPremio.puntos}&idcliente=6">Actualizar Premio</a>
                                                    </tr>
                                                </c:forEach>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- /page content -->

                    <!-- footer content -->
                    <footer>
                        <div class="pull-right">
                            GamiTour - Proyecto Desarrollo de aplicaciones Web
                        </div>
                        <div class="clearfix"></div>
                    </footer>
                    <!-- /footer content -->
                </div>
            </div>

            <!-- jQuery -->
            <script src="Administrador/vendors/jquery/dist/jquery.min.js"></script>
            <!-- Bootstrap -->
            <script src="Administrador/vendors/bootstrap/dist/js/bootstrap.min.js"></script>
            <!-- FastClick -->
            <script src="Administrador/vendors/fastclick/lib/fastclick.js"></script>
            <!-- NProgress -->
            <script src="Administrador/vendors/nprogress/nprogress.js"></script>
            <!-- iCheck -->
            <script src="Administrador/vendors/iCheck/icheck.min.js"></script>
            <!-- Datatables -->
            <script src="Administrador/vendors/datatables.net/js/jquery.dataTables.min.js"></script>
            <script src="Administrador/vendors/datatables.net-bs/js/dataTables.bootstrap.min.js"></script>
            <script src="Administrador/vendors/datatables.net-buttons/js/dataTables.buttons.min.js"></script>
            <script src="Administrador/vendors/datatables.net-buttons-bs/js/buttons.bootstrap.min.js"></script>
            <script src="Administrador/vendors/datatables.net-buttons/js/buttons.flash.min.js"></script>
            <script src="Administrador/vendors/datatables.net-buttons/js/buttons.html5.min.js"></script>
            <script src="Administrador/vendors/datatables.net-buttons/js/buttons.print.min.js"></script>
            <script src="Administrador/vendors/datatables.net-fixedheader/js/dataTables.fixedHeader.min.js"></script>
            <script src="Administrador/vendors/datatables.net-keytable/js/dataTables.keyTable.min.js"></script>
            <script src="Administrador/vendors/datatables.net-responsive/js/dataTables.responsive.min.js"></script>
            <script src="Administrador/vendors/datatables.net-responsive-bs/js/responsive.bootstrap.js"></script>
            <script src="Administrador/vendors/datatables.net-scroller/js/dataTables.scroller.min.js"></script>
            <script src="Administrador/vendors/jszip/dist/jszip.min.js"></script>
            <script src="Administrador/vendors/pdfmake/build/pdfmake.min.js"></script>
            <script src="Administrador/vendors/pdfmake/build/vfs_fonts.js"></script>

            <!-- Custom Theme Scripts -->
            <script src="Administrador/build/js/custom.min.js"></script>

        </body>

        </html>
