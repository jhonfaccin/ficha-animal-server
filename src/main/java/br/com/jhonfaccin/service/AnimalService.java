package br.com.jhonfaccin.service;

import java.util.ArrayList;
import java.util.List;

import br.com.jhonfaccin.dao.AnimalDao;
import br.com.jhonfaccin.modelo.Animal;

public class AnimalService {
	private final ArrayList<Animal> animais = new ArrayList<>();

	public AnimalService() {
	}

	public ArrayList<Animal> getAnimais() {
		AnimalDao dao = new AnimalDao();
		List<Animal> animais = dao.buscarAnimais();
		this.animais.addAll(animais);
		return this.animais;
	}
}
