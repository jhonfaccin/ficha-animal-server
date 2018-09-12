package br.com.jhonfaccin.api;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.jhonfaccin.modelo.Animal;


@Path("ping")
public class PingResource {

    @GET
    @Produces("application/json")
    public Animal ping() {
    	return new Animal(111,"cachorro");
    }

}
