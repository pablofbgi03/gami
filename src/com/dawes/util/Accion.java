package com.dawes.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.actividades.ActualizarActividadAccion;
import com.dawes.actividades.BorrarActividadAccion;
import com.dawes.actividades.InsertarActividadAccion;
import com.dawes.actividades.MostrarActividadAccion;
import com.dawes.clientes.ActualizarClientesAccion;
import com.dawes.clientes.BorrarClientesAccion;
import com.dawes.clientes.BuscarClientesAccion;
import com.dawes.clientes.InsertarClientesAccion;
import com.dawes.clientes.MostrarClientesAccion;
import com.dawes.clientes.MostrarFormularioActualizarClientes;
import com.dawes.noticias.BorrarNoticiasAccion;
import com.dawes.noticias.InsertarNoticiasAccion;
import com.dawes.noticias.ModificarNoticiasAccion;
import com.dawes.noticias.MostrarFormularioInsertarNoticiaAccion;
import com.dawes.noticias.MostrarFormularioModificarNoticiasAccion;
import com.dawes.noticias.MostrarNoticiasAccion;
import com.dawes.noticias.MostrarNoticiasIndexAccion;
import com.dawes.paradas.ActualizarParadasAccion;
import com.dawes.paradas.EliminarParadasAccion;
import com.dawes.paradas.InsertarParadasAccion;
import com.dawes.paradas.MostrarInsertarParadaAccion;
import com.dawes.paradas.MostrarParadaAccion;
import com.dawes.paradas.MostrarParadasAccion;
import com.dawes.paradas.MostrarParadasFrontAccion;
import com.dawes.premios.ActualizarPremioAccion;
import com.dawes.premios.BorrarPremiosAccion;
import com.dawes.premios.InsertarPremiosAccion;
import com.dawes.premios.MostrarPremiosAccion;
import com.dawes.premios.PreInsertarPremiosAccion;
import com.dawes.pruebaCultural.ActualizarPruebaCulturalAccion;
import com.dawes.pruebaCultural.EliminarPruebaCulturalAccion;
import com.dawes.pruebaCultural.InsertarPruebaCulturalAccion;
import com.dawes.pruebaCultural.MostrarPruebaCulturalAccion;
import com.dawes.pruebaCultural.MostrarPruebaCulturalFrontAccion;
import com.dawes.pruebaCultural.MostrarPruebaCulturalUnicaAccion;
import com.dawes.pruebaDeportiva.ActualizarPruebaDeportivaAccion;
import com.dawes.pruebaDeportiva.EliminarPruebaDeportivaAccion;
import com.dawes.pruebaDeportiva.InsertarPruebaDeportivaAccion;
import com.dawes.pruebaDeportiva.MostrarPruebaDeportivaAccion;
import com.dawes.pruebaDeportiva.MostrarPruebaDeportivaFrontAccion;
import com.dawes.pruebaDeportiva.MostrarPruebaDeportivaUnicaAccion;
import com.dawes.votos.ActualizarVotoAccion;
import com.dawes.votos.BorrarVotoAccion;
import com.dawes.votos.InsertarVotoAccion;
import com.dawes.votos.MostrarVotoAccion;
import com.dawes.comentarios.ActualizarComentarioAccion;
import com.dawes.comentarios.BorrarComentariosAccion;
import com.dawes.comentarios.InsertarComentariosAccion;
import com.dawes.comentarios.InsertarComentariosFrontAccion;
import com.dawes.comentarios.MostrarComentariosAccion;
import com.dawes.comentarios.PreInsertarComentarioAccion;
import com.dawes.itinerarios.ActualizarItinerariosAccion;
import com.dawes.itinerarios.EliminarItinerariosAccion;
import com.dawes.itinerarios.InsertarItinerariosAccion;
import com.dawes.itinerarios.MostrarItinerarioParadasAccion;
import com.dawes.itinerarios.MostrarItinerariosAccion;
import com.dawes.itinerarios.MostrarItinerariosIndexAccion;
import com.dawes.multimedias.ActualizarMultimediaAccion;
import com.dawes.multimedias.ArchivosMultimediaAccion;
import com.dawes.multimedias.BorrarMultimediaAccion;
import com.dawes.multimedias.InsertarMultimediaAccion;
import com.dawes.multimedias.InsertarMultimediaFrontAccion;
import com.dawes.multimedias.MostrarMultimediaAccion;
import com.dawes.multimedias.MostrarMultimediaComentariosAccion;

public abstract class Accion {

	// metodo abstracto ejecutar
	// le paso lo que recupera del servlet, peticion y respuesta.
	public abstract String ejecutar(HttpServletRequest request, HttpServletResponse response);

	// clase -->seleccion por el cliente.
	public static Accion getAccion(String tipo) {

		if (tipo.equals("InsertarComentariosFront")) {
			return new InsertarComentariosFrontAccion();
		}
		if (tipo.equals("InsertarMultimediaFront")) {
			return new InsertarMultimediaFrontAccion();
		}
		if (tipo.equals("MostrarMultimediaComentarios")) {
			return new MostrarMultimediaComentariosAccion();
		}
		if (tipo.equals("MostrarPruebaDeportivaUnica")) {
			return new MostrarPruebaDeportivaUnicaAccion();
		}
		if (tipo.equals("MostrarPruebaDeportivaFront")) {
			return new MostrarPruebaDeportivaFrontAccion();
		}
		if (tipo.equals("MostrarPruebaCulturalUnica")) {
			return new MostrarPruebaCulturalUnicaAccion();
		}
		if (tipo.equals("MostrarPruebaCulturalFront")) {
			return new MostrarPruebaCulturalFrontAccion();
		}
		if (tipo.equals("MostrarParadasFront")) {
			return new MostrarParadasFrontAccion();
		}
		if (tipo.equals("MostrarParada")) {
			return new MostrarParadaAccion();
		}
		if (tipo.equals("mostrarClientes")) {
			return new MostrarClientesAccion();
		}
		if (tipo.equals("insertarCliente")) {
			return new InsertarClientesAccion();
		}
		if (tipo.equals("borrarCliente")) {
			return new BorrarClientesAccion();
		}
		if (tipo.equals("ActualizarClientes")) {
			return new ActualizarClientesAccion();
		}
		if (tipo.equals("BuscarUsuarios")) {
			return new BuscarClientesAccion();
		}
		if (tipo.equals("MostrarFormularioActualizarClientes")) {
			return new MostrarFormularioActualizarClientes();
		}
		if (tipo.equals("mostrarComentario")) {
			return new MostrarComentariosAccion();
		}
		if (tipo.equals("insertarComentario")) {
			return new InsertarComentariosAccion();
		}
		if (tipo.equals("mostrarNoticias")) {
			return new MostrarNoticiasAccion();
		}
		if (tipo.equals("mostrarNoticiasIndex")) {
			return new MostrarNoticiasIndexAccion();
		}
		if (tipo.equals("insertarNoticia")) {
			return new InsertarNoticiasAccion();
		}
		if (tipo.equals("modificarNoticia")) {
			return new ModificarNoticiasAccion();
		}
		if (tipo.equals("borrarNoticia")) {
			return new BorrarNoticiasAccion();
		}
		if (tipo.equals("MostrarFormularioInsertarNoticia")) {
			return new MostrarFormularioInsertarNoticiaAccion();
		}
		if (tipo.equals("MostrarFormularioModificarNoticia")) {
			return new MostrarFormularioModificarNoticiasAccion();
		}
		if (tipo.equals("insertarItinerario")) {
			return new InsertarItinerariosAccion();
		}
		if (tipo.equals("borrarItinerario")) {
			return new EliminarItinerariosAccion();
		}
		if (tipo.equals("mostrarItinerario")) {
			return new MostrarItinerariosAccion();
		}
		if (tipo.equals("mostrarItinerarioIndex")) {
			return new MostrarItinerariosIndexAccion();
		}
		if (tipo.equals("MostrarItinerarioParadas")) {
			return new MostrarItinerarioParadasAccion();
		}
		if (tipo.equals("actualizarItinerario")) {
			return new ActualizarItinerariosAccion();
		}
		if (tipo.equals("insertarParada")) {
			return new InsertarParadasAccion();
		}
		if (tipo.equals("mostrarInsertarParada")) {
			return new MostrarInsertarParadaAccion();
		}
		if (tipo.equals("borrarParada")) {
			return new EliminarParadasAccion();
		}
		if (tipo.equals("mostrarParada")) {
			return new MostrarParadasAccion();
		}
		if (tipo.equals("actualizarParada")) {
			return new ActualizarParadasAccion();
		}
		if (tipo.equals("insertarPruebaCultural")) {
			return new InsertarPruebaCulturalAccion();
		}
		if (tipo.equals("borrarPruebaCultural")) {
			return new EliminarPruebaCulturalAccion();
		}
		if (tipo.equals("mostrarPruebaCultural")) {
			return new MostrarPruebaCulturalAccion();
		}
		if (tipo.equals("actualizarPruebaCultural")) {
			return new ActualizarPruebaCulturalAccion();
		}
		if (tipo.equals("insertarPruebaDeportiva")) {
			return new InsertarPruebaDeportivaAccion();
		}
		if (tipo.equals("borrarPruebaDeportiva")) {
			return new EliminarPruebaDeportivaAccion();
		}
		if (tipo.equals("mostrarPruebaDeportiva")) {
			return new MostrarPruebaDeportivaAccion();
		}
		if (tipo.equals("actualizarPruebaDeportiva")) {
			return new ActualizarPruebaDeportivaAccion();
		}
		if (tipo.equals("actualizarActividad")) {
			return new ActualizarActividadAccion();
		}
		if (tipo.equals("borrarActividad")) {
			return new BorrarActividadAccion();
		}
		if (tipo.equals("insertarActividad")) {
			return new InsertarActividadAccion();
		}
		if (tipo.equals("mostrarActividad")) {
			return new MostrarActividadAccion();
		}
		if (tipo.equals("actualizarMultimedia")) {
			return new ActualizarMultimediaAccion();
		}
		if (tipo.equals("borrarMultimedia")) {
			return new BorrarMultimediaAccion();
		}
		if (tipo.equals("insertarMultimedia")) {
			return new InsertarMultimediaAccion();
		}
		if (tipo.equals("mostrarMultimedia")) {
			return new MostrarMultimediaAccion();
		}
		if (tipo.equals("actualizarVoto")) {
			return new ActualizarVotoAccion();
		}
		if (tipo.equals("borrarVoto")) {
			return new BorrarVotoAccion();
		}
		if (tipo.equals("insertarVoto")) {
			return new InsertarVotoAccion();
		}
		if (tipo.equals("mostrarVoto")) {
			return new MostrarVotoAccion();
		}
		if (tipo.equals("insertarPremio")) {
			return new InsertarPremiosAccion();
		}
		if (tipo.equals("mostrarPremio")) {
			return new MostrarPremiosAccion();
		}
		if (tipo.equals("borrarPremio")) {
			return new BorrarPremiosAccion();
		}
		if (tipo.equals("actualizarPremio")) {
			return new ActualizarPremioAccion();
		}
		if (tipo.equals("actualizarComentario")) {
			return new ActualizarComentarioAccion();
		}
		if (tipo.equals("PreInsertarComentario")) {
			return new PreInsertarComentarioAccion();
		}
		if (tipo.equals("PreInsertarPremio")) {
			return new PreInsertarPremiosAccion();
		}
		if (tipo.equals("borrarComentario")) {
			return new BorrarComentariosAccion();
		}
		if (tipo.equals("BorrarSesion")) {
			return new BorrarSesionAccion();
		}
		if (tipo.equals("ArchivosMultimedia")) {
			return new ArchivosMultimediaAccion();
		}
				return null;
	}

}
