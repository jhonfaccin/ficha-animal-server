package br.com.jhonfaccin.service;

import java.util.Date;
import java.util.List;

import br.com.jhonfaccin.banco.Dao;
import br.com.jhonfaccin.modelo.Ficha;

public class FichaService {
	
	public FichaService() {
	}
	
	public void adicionarFicha(Ficha ficha) {
		Dao dao = new Dao();
		dao.cadastrarFicha(ficha);
	}
	
	public List<Ficha> getFichas() {
		Dao dao = new Dao();
		return dao.buscarFichas();
	}

	public Ficha buscaPorId(Integer id) {
		Dao dao = new Dao();
		return dao.buscarFichaPorId(id);
	}

	public void remover(Integer id) {
		Ficha fichaParaRemover = buscaPorId(id);
		if (fichaParaRemover != null) {
			Dao dao = new Dao();
			dao.excluirFicha(fichaParaRemover);
		}
	}

	public List<Ficha> buscaPorData(Date dataInicio, Date dataFim) {
		Dao dao = new Dao();
		List<Ficha> fichas = dao.buscarPorData(dataInicio,dataFim);
		return fichas;
	}

	public void atualizarFicha(Integer id, Ficha ficha) {
		Dao dao = new Dao();
		dao.atualizarFicha(id,ficha);
	}
}
