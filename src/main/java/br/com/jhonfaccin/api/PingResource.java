package br.com.jhonfaccin.api;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("ping")
public class PingResource {

    @GET
    @Produces("application/json")
    public Date ping() {
        return new Date();
    }

}
