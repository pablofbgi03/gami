package com.dawes.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BorrarSesionAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession(); 
		if (session != null) {
			session.removeAttribute("email");
			session.removeAttribute("rol");
			session.invalidate();
			System.out.println("logout fuera email y rol");
			return "logout.jsp";
		}else {
			System.out.println("No hay ninguna sesion activa");
			return "login.jsp";
		}
			
		
			
		
	}

}
