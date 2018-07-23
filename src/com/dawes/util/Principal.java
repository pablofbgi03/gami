package com.dawes.util;

import java.util.Date;

import com.dawes.modelo.Noticia;
import com.dawes.service.ServiceCliente;
import com.dawes.service.ServiceClienteImpl;
import com.dawes.service.ServiceItinerario;
import com.dawes.service.ServiceItinerarioImpl;
import com.dawes.service.ServiceNoticia;
import com.dawes.service.ServiceNoticiaImp;
import com.dawes.service.ServiceParada;
import com.dawes.service.ServiceParadaImpl;
import com.dawes.service.ServicePruebacultural;
import com.dawes.service.ServicePruebaculturalImpl;
import com.dawes.service.ServicePruebadeportiva;
import com.dawes.service.ServicePruebadeportivaImpl;

public class Principal {

	ServiceParada sp = new ServiceParadaImpl();
	ServiceItinerario si = new ServiceItinerarioImpl();
	ServicePruebacultural spc = new ServicePruebaculturalImpl();
	ServicePruebadeportiva spd = new ServicePruebadeportivaImpl();
	ServiceNoticia sn = new ServiceNoticiaImp();
	ServiceCliente sc = new ServiceClienteImpl();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Principal p = new Principal();
		p.pruebas();
	}

	public void pruebas() {
		// Clase para probar si los metodos funcionan como deberían , ya que
		// muchos siguen el generic estos solo los probaremos una vez
		// Itinerario itinerario = new Itinerario("Gijon","1","40
		// minutos","gijon",null);
		// si.insertar(itinerario);
		// sp.borrar(sp.buscarPorId(1));
		// System.out.println(spc.buscarTodo());
		// System.out.println(spd.buscarTodo());
		// System.out.println(si.buscarParadas(itinerario));
		// Noticia noticia=new Noticia("Uno","Tres",new Date(),new Date(),null);
		// sn.insertar(noticia);
		// sn.actualizar(noticia);
		// System.out.println(sn.buscarTodo());
		// System.out.println((sn.buscarPorId(1)));
		//System.out.println(sc.buscarTodo());
		//System.out.println(sn.buscarTodo());
		System.out.println(sc.consultarUsuario("jose@jose.es"));
	}
}
