package br.com.jhonfaccin.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.jhonfaccin.modelo.Ficha;

public class FichaService {
	private static final List<Ficha> fichas = new ArrayList<>();
	
	public FichaService() {
//		AnimalService animais = new AnimalService();
//		Ficha ficha1 = new Ficha(1111,new Date(),false,animais.getAnimais());
//		
//		fichas.add(ficha1);
	}
	
	
	public void adicionarFicha(Ficha ficha) {
		if (!fichas.contains(ficha)) {
			this.fichas.add(ficha);
		}
	}
	
	public List<Ficha> getFichas() {
		return this.fichas;
	}

	public Ficha buscaPorId(Integer id) {
		for (Ficha ficha : fichas) {
			if (ficha.getId().equals(id)) {
				return ficha;
			}
		}
		return null;
	}

	public void remover(Ficha ficha) {
		this.fichas.remove(ficha);
	}

}





