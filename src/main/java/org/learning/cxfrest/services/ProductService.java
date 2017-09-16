package org.learning.cxfrest.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/product")
@Produces("application/json")
public interface ProductService {

	@GET
	@Path("/reply")
	public String reply(@QueryParam("name") String name);
}
