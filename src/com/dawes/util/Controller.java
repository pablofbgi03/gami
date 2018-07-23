package com.dawes.util;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			
		RequestDispatcher despachador = null;
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String url=request.getServletPath();
		//recuperamos la clase seleccionada por el cliente (quitamos el .do)
		Accion accion = Accion.getAccion(url.substring(1,url.length()-3));
		
		//creamos objeto con la informacion que devuelve ejecutar y ejecuto
		//instaciamos el objeto con la informacion devuelta del metodo ejecutar
		despachador = request.getRequestDispatcher(accion.ejecutar(request, response));
		//pasamos el metodo a la vista
		despachador.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
