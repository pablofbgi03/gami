package com.dawes.multimedias;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.util.Accion;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import java.io.File;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import java.util.List;
import org.apache.commons.fileupload.FileItem;

public class ArchivosMultimediaAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
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
	            try {
					item.write(file);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
	        } 
	        System.out.println("#Subido correctamente"); 
	    }catch(FileUploadException e){ 
	            System.out.println("#error al subir archivo" + e); 
	        } 
		
		
		return null;
	}

}
