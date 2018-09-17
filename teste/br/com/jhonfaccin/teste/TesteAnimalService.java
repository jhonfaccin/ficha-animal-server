package br.com.jhonfaccin.teste;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import br.com.jhonfaccin.modelo.Animal;
import br.com.jhonfaccin.service.AnimalService;

public class TesteAnimalService {
	

	@Test
	public void buscarTodosOsAnimaisDoBanco() throws Exception {
		AnimalService animalService = new AnimalService();
		List<Animal> animais = animalService.getAnimais();
		
		assertEquals(4, animais.size());
		assertEquals(new Integer(1), animais.get(0).getId());
		assertEquals("cachorro", animais.get(0).getNome());
		assertEquals(new Integer(2), animais.get(1).getId());
		assertEquals("gato", animais.get(1).getNome());
		assertEquals(new Integer(3), animais.get(2).getId());
		assertEquals("cabrito", animais.get(2).getNome());
		assertEquals(new Integer(4), animais.get(3).getId());
		assertEquals("papagaio", animais.get(3).getNome());
	}
}


