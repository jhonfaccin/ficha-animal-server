package br.com.jhonfaccin.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.jhonfaccin.service.AnimalService;

public class TestServiceAnimal {
	
	@Before
	public void setUp() {
		AnimalService animal = new AnimalService();
	}

	@Test
	public void criaAnimalService() throws Exception {
//		assertEquals("1111", );
//		assertEquals("cachorro", actual);
	}
}
