package http;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

@Path("/clients")
public class Clients {

	@GET
	@Path("/test")
	public Response addUser(@Context HttpHeaders headers) {
		
		String authorization = headers.getRequestHeader("Authorization").get(0);
		
		return Response.status(200).entity("Authorization : " + authorization).build();
	}
	
}
