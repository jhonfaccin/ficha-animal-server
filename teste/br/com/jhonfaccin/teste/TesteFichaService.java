//package br.com.jhonfaccin.teste;
//
//import static org.junit.Assert.*;
//
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.Date;
//
//import org.junit.Test;
//
//import br.com.jhonfaccin.modelo.Animal;
//import br.com.jhonfaccin.modelo.Ficha;
//import br.com.jhonfaccin.service.AnimalService;
//import br.com.jhonfaccin.service.FichaService;
//
//public class TesteFichaService {
//
//	@Test
//	public void adicionarFicha() throws Exception {
//		ArrayList<Animal> animais = new AnimalService().getAnimais();
//		Ficha ficha = new Ficha(11, new Date(), false, animais);
//		FichaService fichasService = new FichaService();
//		fichasService.adicionarFicha(ficha);
//		
//		assertEquals(1, fichasService.getFichas().size());
//		assertEquals(3, fichasService.getFichas().get(0).getAnimais().size());
//		assertEquals(new Integer(11), fichasService.getFichas().get(0).getId());
//		assertEquals(false, fichasService.getFichas().get(0).getStatus());
//		assertEquals(ficha.getDataDeCadastro().getTime(), fichasService.getFichas().get(0).getDataDeCadastro().getTime());
//	}
//	
//	@Test
//	public void adicionarFichaJaCadastrada() throws Exception {
//		ArrayList<Animal> animais = new AnimalService().getAnimais();
//		Ficha ficha = new Ficha(11, new Date(), false, animais);
//		FichaService fichasService = new FichaService();
//		fichasService.adicionarFicha(ficha);
//		fichasService.adicionarFicha(ficha);
//		
//		assertEquals(1, fichasService.getFichas().size());
//		assertEquals(3, fichasService.getFichas().get(0).getAnimais().size());
//		assertEquals(new Integer(11), fichasService.getFichas().get(0).getId());
//		assertEquals(false, fichasService.getFichas().get(0).getStatus());
//		assertEquals(ficha.getDataDeCadastro().getTime(), fichasService.getFichas().get(0).getDataDeCadastro().getTime());
//	}
//	
//	@Test
//	public void buscarFichaPorId() throws Exception {
//		ArrayList<Animal> animais = new AnimalService().getAnimais();
//		Ficha ficha = new Ficha(11, new Date(), false, animais);
//		FichaService fichasService = new FichaService();
//		fichasService.adicionarFicha(ficha);
//		
//		Integer id = new Integer(11);
//		assertEquals(ficha,fichasService.buscaPorId(id));
//	}
//	
////	@Test
////	public void pesquisaPorIntervaloDeData() throws Exception {
////		ArrayList<Animal> animais = new AnimalService().getAnimais();
////		SimpleDateFormat simpleDate = new SimpleDateFormat("dd/MM/yyyy");
////		Date data = simpleDate.parse("21/12/2017");
////		Ficha ficha2017 = new Ficha(11, data, false, animais);
////		data = simpleDate.parse("21/12/2019");
////		Ficha ficha2019 = new Ficha(33, data, true, animais);
////		FichaService fichasService = new FichaService();
////		fichasService.adicionarFicha(ficha2017);
////		fichasService.adicionarFicha(ficha2019);
////		
////		assertEquals(3, fichasService.getFichas().size());
////	}
//	
//	@Test
//	public void buscarFichaPorIdComListaComDoisElementos() throws Exception {
//		ArrayList<Animal> animais = new AnimalService().getAnimais();
//		Ficha ficha = new Ficha(11, new Date(), false, animais);
//		FichaService fichasService = new FichaService();
//		fichasService.adicionarFicha(ficha);
//		Ficha fichaId22 = new Ficha(22, new Date(), true, animais);
//		fichasService.adicionarFicha(fichaId22);
//		
//		assertEquals(2, fichasService.getFichas().size());
//		assertEquals(fichaId22,fichasService.buscaPorId(new Integer(22)));
//	}
//	
//	@Test
//	public void fichaInexistente() throws Exception {
//		ArrayList<Animal> animais = new AnimalService().getAnimais();
//		Ficha ficha = new Ficha(11, new Date(), false, animais);
//		FichaService fichasService = new FichaService();
//		fichasService.adicionarFicha(ficha);
//		Integer id = new Integer(-1);
//		
//		assertEquals(1,fichasService.getFichas().size());
//		assertEquals(null,fichasService.buscaPorId(id));
//	}
//	
//	@Test
//	public void removerFicha() throws Exception {
//		ArrayList<Animal> animais = new AnimalService().getAnimais();
//		Ficha ficha = new Ficha(11, new Date(), false, animais);
//		FichaService fichasService = new FichaService();
//		fichasService.adicionarFicha(ficha);
//		Ficha fichaId22 = new Ficha(22, new Date(), false, animais);
//		fichasService.adicionarFicha(fichaId22);
//		fichasService.remover(fichaId22);
//		
//		assertEquals(1,fichasService.getFichas().size());
//		assertEquals(new Integer(11), fichasService.getFichas().get(0).getId());
//	}
//	
//}
//
//
//
//
//
