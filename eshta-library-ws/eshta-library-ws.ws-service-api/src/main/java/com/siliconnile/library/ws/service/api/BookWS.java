package com.siliconnile.library.ws.service.api;



import javax.jws.WebService;
import javax.ws.rs.FormParam;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import javax.ws.rs.Produces;


import javax.ws.rs.core.MediaType;

import com.siliconnile.library.dto.BookDTO;

/**
 * User: Abdelrazik
 * Date: 07/5/14
 */
@Path("/")
@WebService
public interface BookWS {

	
	
    
    @POST
    @Path("/addOrUpdateNewBook")
    @Produces(MediaType.APPLICATION_JSON)
    BookDTO addOrUpdateNewBook(@FormParam ("id") Long id,@FormParam ("title") String title, @FormParam ("author") String author, @FormParam ("isbn") String isbn,  @FormParam ("pictureURL") String pictureURL);

    
    
    
	BookDTO getBookByid(long id);




	@GET
    @Path("/deleteBook")
    @Produces(MediaType.APPLICATION_JSON)
	void deleteBook(@QueryParam("id") Long id);
   
    
    


	
}
