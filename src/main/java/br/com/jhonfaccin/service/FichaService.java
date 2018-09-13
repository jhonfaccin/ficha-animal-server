package br.com.jhonfaccin.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.jhonfaccin.modelo.Ficha;

public class FichaService {
	private static final List<Ficha> fichas = new ArrayList<>();
	
	public FichaService() {
	}
	
	public Ficha adicionarFicha(Ficha ficha) {
		ficha.setId(fichas.size() + 1);
		fichas.add(ficha);
		return ficha;
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

	public void remover(Integer id) {
		Ficha fichaParaRemover = buscaPorId(id);
		if (fichaParaRemover != null) {
			fichas.remove(fichaParaRemover);
		}
	}

	public Ficha atualizarFicha(Integer id, Ficha ficha) {
		for (Ficha f : fichas) {
			if (f.getId() == ficha.getId()) {
				f.setAnimais(ficha.getAnimais());
				f.setAtivo(ficha.getAtivo());
				f.setDataDeCadastro(ficha.getDataDeCadastro());
				f.setObservacao(ficha.getObservacao());
				return ficha;
			}
		}
		return null;
	}

	public List<Ficha> buscaPorData(Date dataInicio, Date dataFim) {
		return fichas;
	}
}
