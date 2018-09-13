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
		ficha.setId(fichas.size());
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


	public Ficha pesquisa(Integer id, Date dataInicio, Date dataFIm) {
		Ficha ficha = buscaPorId(id);
		if ( ficha != null) {
			return ficha;
		}else if (dataInicio != null){
			Ficha x  = buscaPorDataInicio(dataInicio);
		}
		return null;
	}


	private Ficha buscaPorDataInicio(Date dataInicio) {
		for (Ficha ficha : fichas) {
			if (ficha.getDataDeCadastro().getTime() == dataInicio.getTime()) {
				return ficha;
			}
		}
		return null;
	}

	public void atualizarFicha(Integer id, Ficha ficha) {
		// TODO Auto-generated method stub
		
	}

	public List<Ficha> buscaPorData(Date dataInicio, Date dataFim) {
		return null;
	}

}





