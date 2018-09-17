package br.com.jhonfaccin.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import br.com.jhonfaccin.modelo.Animal;
import br.com.jhonfaccin.modelo.Ficha;
import br.com.jhonfaccin.service.FichaService;

@Path("pesquisa")
public class PesquisaResource {
	
	@GET
    @Produces("application/json")
    public List<Ficha> get(@QueryParam("id") Integer id, @QueryParam("dataInicio") Long dataInicio, @QueryParam("dataFim") Long dataFim) {
		FichaService fichaService = new FichaService();
		Ficha ficha = fichaService.buscaPorId(id);
		List<Ficha> fichas = new ArrayList<>();
		fichas.add(ficha);
//		System.out.println(fichas.get(0).listaDeAnimais().get(0).getNome());
		return fichas;
//		if (id != null) {
//			Ficha ficha = fichaService.buscaPorId(id);
//			return ficha != null ? Arrays.asList(ficha) : null;
//		}
//		return fichaService.buscaPorData(new Date(dataInicio), new Date(dataFim));
//		return fichaService.getFichas();
    }	
	
}