package com.service.admin;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/admin")
public class TestAdmin {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getHello(){
		return "Hello NeemFluid";
	}
}
