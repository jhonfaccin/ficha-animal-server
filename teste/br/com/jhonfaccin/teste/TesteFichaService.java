package br.com.jhonfaccin.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import br.com.jhonfaccin.modelo.Animal;
import br.com.jhonfaccin.modelo.Ficha;
import br.com.jhonfaccin.service.AnimalService;
import br.com.jhonfaccin.service.FichaService;

public class TesteFichaService {
	
	private Ficha ficha;
	private FichaService fichasService;
	private ArrayList<Animal> animais;
	
	@Before
	public void setUp() {
		animais = new AnimalService().getAnimais();
		ficha = new Ficha(11, new Date(), false, animais);
		fichasService = new FichaService();
		fichasService.adicionarFicha(ficha);
	}

	@Test
	public void adicionarFicha() throws Exception {
		assertEquals(1, fichasService.getFichas().size());
		assertEquals(3, fichasService.getFichas().get(0).getAnimais().size());
		assertEquals(new Integer(11), fichasService.getFichas().get(0).getId());
		assertEquals(false, fichasService.getFichas().get(0).getStatus());
		assertEquals(ficha.getDataDeCadastro().getTime(), fichasService.getFichas().get(0).getDataDeCadastro().getTime());
	}
	
	@Test
	public void buscarFichaPorId() throws Exception {
		Integer id = new Integer(11);
		assertEquals(ficha,fichasService.buscaPorId(id));
	}
	
	@Test
	public void buscarFichaPorIdComListaComDoisElementos() throws Exception {
		Ficha fichaId22 = new Ficha(22, new Date(), false, animais);
		fichasService.adicionarFicha(fichaId22);
		assertEquals(fichaId22,fichasService.buscaPorId(new Integer(22)));
	}
	
	@Test
	public void fichaInexistente() throws Exception {
		Integer id = new Integer(-1);
		assertEquals(null,fichasService.buscaPorId(id));
	}
	
	@Test
	public void removerFicha() throws Exception {
		Ficha fichaId22 = new Ficha(22, new Date(), false, animais);
		fichasService.adicionarFicha(fichaId22);
		fichasService.remover(fichaId22);
		assertEquals(1,fichasService.getFichas().size());
	}
	
	@Test
	public void atualizarUmaFicha() throws Exception {
		ficha.setStatus(true);
		fichasService.atualizarFicha(ficha);
		assertEquals(1, fichasService.getFichas().size());
		assertEquals(true, fichasService.getFichas().get(0).getStatus());
	}
	
	@Test
	public void atualizarFichaServiceComDuasFichas() throws Exception {
		Ficha fichaId22 = new Ficha(22, new Date(), false, animais);
		fichasService.adicionarFicha(fichaId22);
		fichaId22.setStatus(true);
		fichasService.atualizarFicha(fichaId22);
		assertEquals(2,fichasService.getFichas().size());
	}
	
	@Test
	public void tentaAtualizarFichaNaoCadastrada() throws Exception {
		Ficha fichaId22 = new Ficha(22, new Date(), false, animais);
		fichasService.atualizarFicha(fichaId22);
		assertEquals(1,fichasService.getFichas().size());
		assertEquals(ficha, fichasService.getFichas().get(0));
	}
}





