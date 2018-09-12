package br.com.jhonfaccin.api;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.jhonfaccin.modelo.Animal;
import br.com.jhonfaccin.service.AnimalService;

	
@Path("animal")
public class AnimalResource {
    @GET
    @Produces("application/json")
    public List<Animal> getAll() {
    	return new AnimalService().getAnimais();
    }
}
