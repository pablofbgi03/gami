package com.dawes.util;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class Filter
 */
@WebFilter("/Filter")
public class Filter implements javax.servlet.Filter {

	/**
	 * Default constructor.
	 */
	public Filter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// Convertimos de ServletRequest a HttpServletRequest
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		boolean logueado = false;
		boolean autorizado = false;
		logueado = req.getSession() != null && req.getSession().getAttribute("email") != null;
		String url = req.getServletPath();
		System.out.println(url);

		// se comprueba si el atributo rol y la url son nulos, si la url
		// coincide con el rol, se autoriza
		if (req.getSession().getAttribute("rol") != null && url != null)
			if ((url).contains((String) req.getSession().getAttribute("rol")))
				autorizado = true;
		// System.out.println("usuario autorizado "+autorizado+"
		// "+((String)req.getSession().getAttribute("url")).contains((String)req.getSession().getAttribute("rol")));
		// si ambas variables son verdaderas pasa el filtro
		if (logueado && autorizado) {

			System.out.println("pasa por el chain");
			chain.doFilter(request, response);
		}

		// Si no est� autorizado se devuelve la p�gina de error
		if (logueado && !autorizado) {
			req.getSession().setAttribute("error", "Usuario no autorizado");
			System.out.println("Usuario logeado pero no autorizado " + autorizado);
			res.sendRedirect(req.getContextPath() + "/error.jsp");
		}

		// Si no est� registrado se devuelve la p�gina de login
		if (!logueado) {
			System.out.println("usuario no logeado");
			res.sendRedirect(req.getContextPath() + "/login.jsp");
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
