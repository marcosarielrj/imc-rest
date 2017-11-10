package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/imcjaxrs")
public class ImcRest {

	@GET
	@Path("/calcularimc")
	@Produces("application/json")
	public Calculo calcularimc(@QueryParam("peso") double peso, @QueryParam("altura") String altura) {
	  Calculo c = new Calculo();
		
	  c.calcularimc(peso,altura);
	  return c;
	}
}