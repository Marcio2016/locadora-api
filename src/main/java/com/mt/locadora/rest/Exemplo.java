package com.mt.locadora.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.mt.locadora.model.Fabricante;


@Path("oi")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Exemplo {

	@GET	
	public Response mostrar() {
		Fabricante f = new Fabricante();
		f.setCodigo(1L);
		f.setNome("lalalala");
		
		return Response.ok().entity(f).build();
	}
}
