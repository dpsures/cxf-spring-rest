package org.learning.cxfrest.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/api")
@Produces("application/json")
public interface AboutService {

	@GET
	@Path("/about")
	public String about();
	
	@GET
	@Path("/hello/{name}")
	public String sayHello(@PathParam("name") String name);
}
