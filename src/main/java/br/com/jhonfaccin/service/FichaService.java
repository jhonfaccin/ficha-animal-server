package br.com.jhonfaccin.service;

import java.util.Date;
import java.util.List;

import br.com.jhonfaccin.banco.Dao;
import br.com.jhonfaccin.modelo.Ficha;

public class FichaService {
//	private List<Ficha> fichas = new ArrayList<>();
	
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

//	public Ficha atualizarFicha(Integer id, Ficha ficha) {
//		for (Ficha f : fichas) {
//			if (f.getId() == ficha.getId()) {
////				f.setAnimais(ficha.listaDeAnimais());
//				f.setAtivo(ficha.getAtivo());
//				f.setDataDeCadastro(ficha.getDataDeCadastro());
//				f.setObservacao(ficha.getObservacao());
//				return ficha;
//			}
//		}
//		return null;
//	}

	public List<Ficha> buscaPorData(Date dataInicio, Date dataFim) {
		return null;
	}
}
