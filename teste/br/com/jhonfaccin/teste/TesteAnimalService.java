package br.com.jhonfaccin.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.jhonfaccin.modelo.Animal;
import br.com.jhonfaccin.service.AnimalService;

public class TesteAnimalService {
	
	private AnimalService animal;

	@Before
	public void setUp() {
		this.animal = new AnimalService();
	}

	@Test
	public void animais() throws Exception {
		Animal cachorro = animal.getAnimais().get(0);
		Animal gato = animal.getAnimais().get(1);
		Animal cabrito = animal.getAnimais().get(2);
		
		assertEquals(3,animal.getAnimais().size());
		assertEquals(new Integer(1111),cachorro.getId());
		assertEquals("cachorro",cachorro.getNome());
		assertEquals(new Integer(2222),gato.getId());
		assertEquals("gato",gato.getNome());
		assertEquals(new Integer(3333),cabrito.getId());
		assertEquals("cabrito",cachorro.getNome());
	}
}








