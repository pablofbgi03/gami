package com.dawes.multimedias;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.dawes.modelo.Cliente;
import com.dawes.modelo.Comentario;
import com.dawes.modelo.Multimedia;
import com.dawes.modelo.PruebaDeportiva;
import com.dawes.modelo.Voto;
import com.dawes.service.ServiceCliente;
import com.dawes.service.ServiceClienteImpl;
import com.dawes.service.ServiceMultimedia;
import com.dawes.service.ServiceMultimediaImp;
import com.dawes.service.ServicePruebadeportiva;
import com.dawes.service.ServicePruebadeportivaImpl;
import com.dawes.util.Accion;

public class InsertarMultimediaAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {

		ServiceCliente sc = new ServiceClienteImpl();
		ServiceMultimedia sm = new ServiceMultimediaImp();
		ServicePruebadeportiva sp = new ServicePruebadeportivaImpl();

		Set<Comentario> comentarios = new HashSet<Comentario>(0);
		Set<Voto> votos = new HashSet<Voto>(0);

		Cliente clien = new Cliente();
		PruebaDeportiva pDep = new PruebaDeportiva();

		//clien = sc.buscarPorId(Integer.parseInt(request.getParameter("cliente")));
		clien = sc.buscarPorId(3);
		//pDep = sp.buscarPorId(Integer.parseInt(request.getParameter("pruebaDeportiva")));
		pDep = sp.buscarPorId(1);

		Date fecha = new Date();
		
		//Subida de fichero
		System.out.println("empieza la subida");
		String ubicacion ="C://imagenes"; 
	     
	    DiskFileItemFactory factory = new DiskFileItemFactory(); 
	    factory.setSizeThreshold(1024); 
	    factory.setRepository(new File(ubicacion)); 
	     
	    ServletFileUpload upload = new ServletFileUpload(factory); 
	     
	    try{ 
	        List<FileItem> partes = upload.parseRequest(request); 
	         
	        for(FileItem item:partes){ 
	            File file=new File(ubicacion,item.getName());
	            String imagen =item.getName();//Para introducir en la BD
	            String video = item.getName();
	            try {
					item.write(file);
				} catch (Exception e) {
					
					e.printStackTrace();
				} 
	        } 
	        System.out.println("#Subido correctamente"); 
	    }catch(FileUploadException e){ 
	            System.out.println("#error al subir archivo" + e); 
	        } 
	    
	    
	    //fin de la subida de fichero
		
		

		Multimedia multi = new Multimedia(clien, pDep, fecha, request.getParameter("comentario"),
				request.getParameter("imagen"), request.getParameter("video"),
				Integer.parseInt(request.getParameter("puntosAcumulados")), comentarios, votos);

		sm.insertar(multi);

		return "mostrarMultimedia.do";
	}

	
}
