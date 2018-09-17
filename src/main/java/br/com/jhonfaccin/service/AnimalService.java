package br.com.jhonfaccin.service;

import java.util.ArrayList;
import java.util.List;

import br.com.jhonfaccin.banco.Dao;
import br.com.jhonfaccin.modelo.Animal;

public class AnimalService {
	private final ArrayList<Animal> animais = new ArrayList<>();

	public AnimalService() {
	}

	public ArrayList<Animal> getAnimais() {
		Dao dao = new Dao();
		List<Animal> animais = dao.buscarAnimais();
		this.animais.addAll(animais);
		return this.animais;
	}

}
