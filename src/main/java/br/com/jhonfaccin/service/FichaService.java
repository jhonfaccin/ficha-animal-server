package br.com.jhonfaccin.service;

import java.util.Date;
import java.util.List;

import br.com.jhonfaccin.dao.FichaDao;
import br.com.jhonfaccin.modelo.Ficha;

public class FichaService {

	public FichaService() {
	}

	public void adicionarFicha(Ficha ficha) {
		FichaDao dao = new FichaDao();
		dao.cadastrarFicha(ficha);
	}

	public List<Ficha> getFichas() {
		FichaDao dao = new FichaDao();
		return dao.buscarFichas();
	}

	public Ficha buscaPorId(Integer id) {
		FichaDao dao = new FichaDao();
		return dao.buscarFichaPorId(id);
	}

	public void remover(Integer id) {
		Ficha fichaParaRemover = buscaPorId(id);
		if (fichaParaRemover != null) {
			FichaDao dao = new FichaDao();
			dao.excluirFicha(fichaParaRemover);
		}
	}

	public List<Ficha> buscaPorData(Date dataInicio, Date dataFim) {
		FichaDao dao = new FichaDao();
		List<Ficha> fichas = dao.buscarPorData(dataInicio, dataFim);
		return fichas;
	}

	public void atualizarFicha(Integer id, Ficha ficha) {
		FichaDao dao = new FichaDao();
		dao.atualizarFicha(id, ficha);
	}
}
