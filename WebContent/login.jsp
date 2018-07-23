<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<!-- Meta, title, CSS, favicons, etc. -->
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<title>Login GamiAstur</title>

	<!-- Bootstrap -->
	<link href="vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
	<!-- Font Awesome -->
	<link href="vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
	<!-- NProgress -->
	<link href="vendors/nprogress/nprogress.css" rel="stylesheet">
	<!-- Animate.css -->
	<link href="vendors/animate.css/animate.min.css" rel="stylesheet">

	<!-- Custom Theme Style -->
	<link href="build/css/custom.min.css" rel="stylesheet">
	</head>

	<body class="login">
	<div>
		<a class="hiddenanchor" id="signup"></a>
		<a class="hiddenanchor" id="signin"></a>

		<div class="login_wrapper">
		<div class="animate form login_form">
			<section class="login_content">
			<form action="BuscarUsuarios.do" method="post">
				<h1>Inicio de Sesi�n</h1>
				<div>
				<input type="text" name="email" class="form-control" placeholder="Usuario" required="" />
				</div>
				<div>
				<input type="password" name="password" class="form-control" placeholder="Contrase�a" required="" />
				</div>
				<div>
				<input class="btn btn-default submit" type="submit" value="Log in" />
				<a class="reset_pass" href="${pageContext.request.contextPath}/index.html">Salir</a>
				</div>

				<div class="clearfix"></div>

				<div class="separator">

				<div class="clearfix"></div>
				<br />

				<div>
					<p>GamiTour, Proyecto Ciclo Desarrollo de Aplicaciones Web</p>
				</div>
				</div>
			</form>
			</section>
		</div>
		</div>
	</div>
	</body>
</html>