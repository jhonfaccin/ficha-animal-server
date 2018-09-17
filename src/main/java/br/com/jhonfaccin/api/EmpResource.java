package br.com.jhonfaccin.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.jhonfaccin.banco.Dao;
import br.com.jhonfaccin.modelo.Animal;

@Path("emp")
public class EmpResource {
	
	@GET
    @Produces("application/json")
    public Animal getAll() {
		Dao empDao = new Dao();
		Animal x = empDao.addEmp();
    	return x;
    }
}
