package com.dawes.clientes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Cliente;
import com.dawes.service.ServiceCliente;
import com.dawes.service.ServiceClienteImpl;
import com.dawes.util.Accion;

public class BuscarClientesAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// se recoge el nombre del formulario del login
				String email = request.getParameter("email");
				String pass = request.getParameter("password");
				String url = request.getContextPath();
				//Se manda a sesion el email
				request.getSession().setAttribute("email", email);
				// se busca el usuario
				ServiceCliente sc = new ServiceClienteImpl();
				Cliente cliente = sc.consultarUsuario(email);

				if (cliente != null) {

					if (pass.equals(cliente.getPassword())) {
						String rol = cliente.getRol().getNombre();
						// se asignan los atributos
						request.getSession().setAttribute("email", cliente.getEmail());
						request.getSession().setAttribute("rol", rol);
						System.out.println(url);
						System.out.println(rol);
						System.out.println(cliente.getEmail()+"  "+email);
						System.out.println(cliente.getPassword()+"   "+pass);
						// se devuelve la url
						// request.getSession().setAttribute("url",
						// request.getServletPath());
						if (rol.equals("Administrador"))
							return "index.html";
						if (rol.equals("Registrado"))
							return "index.html";

					} else
						System.out.println("Contraseña incorrecta");
					return "errorUser.jsp";
				} else {
					// si el usuario no existe, o hay errores, se devuelve a la pagina
					// de error
					request.getSession().setAttribute("error", "usuario o password erroneas");
					return "Administrador/Administrador/insertarCliente.html";
				}

			}
}


