package br.com.jhonfaccin.service;

import java.util.ArrayList;
import java.util.List;

import br.com.jhonfaccin.modelo.Ficha;

public class FichaService {
	private final List<Ficha> fichas = new ArrayList<>();
	
//	static {
//		fichas.add(new Ficha(1, new Date(), false, null));
//		fichas.add(new Ficha(2, new Date(), false, null));
//	}

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





