package br.com.jhonfaccin.service;

import java.util.ArrayList;

import br.com.jhonfaccin.modelo.Animal;

public class AnimalService {
	private static ArrayList<Animal> animais;
	
	public AnimalService() {
		Animal cachorro = new Animal(1111,"cachorro");
		Animal gato = new Animal(2222,"gato");
		Animal cabrito = new Animal(3332,"cabrito");
		
		animais = new ArrayList<>();
		this.animais.add(cachorro);
		this.animais.add(gato);
		this.animais.add(cabrito);
	}

	
	public ArrayList<Animal> getAnimais() {
		return animais;
	}
}
