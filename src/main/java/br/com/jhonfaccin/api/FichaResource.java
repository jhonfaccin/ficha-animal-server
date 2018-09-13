package br.com.jhonfaccin.api;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.com.jhonfaccin.modelo.Ficha;
import br.com.jhonfaccin.service.FichaService;

	
@Path("ficha")
public class FichaResource {
	@GET
    @Produces("application/json")
    public List<Ficha> getAll() {
    	return new FichaService().getFichas();
    }
	
	@GET
    @Produces("application/json")
	@Path("{id}")
    public Ficha get(@PathParam("id") Integer id) {
    	return new FichaService().buscaPorId(id);
    }	
	
	@POST
    @Produces("application/json")
    public Ficha criar(Ficha ficha) {
		FichaService fichaService = new FichaService();
		fichaService.adicionarFicha(ficha);
		return ficha;
	}
}
