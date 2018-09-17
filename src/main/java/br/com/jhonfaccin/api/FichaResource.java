package br.com.jhonfaccin.api;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
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
    public void criar(Ficha ficha) {
		FichaService fichaService = new FichaService();
		fichaService.adicionarFicha(ficha);
	}
	
	@DELETE
    @Produces("application/json")
	@Path("{id}")
    public void excluir(@PathParam("id") Integer id) {
		FichaService fichaService = new FichaService();
		fichaService.remover(id);
	}
	
	@PUT
    @Produces("application/json")
	@Path("{id}")
    public void update(@PathParam("id") Integer id, Ficha ficha) {
		FichaService fichaService = new FichaService();
		fichaService.atualizarFicha(id, ficha);
	}
}


