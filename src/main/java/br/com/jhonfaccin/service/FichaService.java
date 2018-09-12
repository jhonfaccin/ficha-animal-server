package br.com.jhonfaccin.service;

import java.util.ArrayList;

import br.com.jhonfaccin.modelo.Ficha;

public class FichaService {
	private static ArrayList<Ficha> fichas;
	
	public FichaService() {
		fichas = new ArrayList<>();
	}

	public void adicionarFicha(Ficha ficha) {
		fichas.add(ficha);
	}
	
	public ArrayList<Ficha> getFichas() {
		return fichas;
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
		fichas.remove(ficha);
	}

	public void atualizarFicha(Ficha ficha) {
		if(fichas.equals(ficha)) {
			int indice = fichas.indexOf(ficha);
			fichas.add(indice, ficha);
		}
	}
}





