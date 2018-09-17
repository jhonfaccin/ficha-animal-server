package br.com.jhonfaccin.teste;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

import br.com.jhonfaccin.modelo.Animal;
import br.com.jhonfaccin.modelo.Ficha;
import br.com.jhonfaccin.service.AnimalService;
import br.com.jhonfaccin.service.FichaService;

public class TesteFichaServic {
	

	@Test
	public void adicionarFicha() throws Exception {
		ArrayList<Animal> animais = new AnimalService().getAnimais();
		Ficha ficha = new Ficha(new Date(),"observacao",false,animais);
		FichaService fichasService = new FichaService();
		fichasService.adicionarFicha(ficha);
		
//		assertEquals(1, fichasService.getFichas().size());
//		assertEquals(3, fichasService.getFichas().get(0).getAnimais().size());
		assertEquals(new Integer(11), fichasService.getFichas().get(0).getId());
//		assertEquals(false, fichasService.getFichas().get(0).getStatus());
		assertEquals(ficha.getDataDeCadastro().getTime(), fichasService.getFichas().get(0).getDataDeCadastro().getTime());
	}
	
}





