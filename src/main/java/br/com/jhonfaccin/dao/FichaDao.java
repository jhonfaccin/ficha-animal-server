package br.com.jhonfaccin.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.NoResultException;

import org.hibernate.Session;

import br.com.jhonfaccin.modelo.Animal;
import br.com.jhonfaccin.modelo.Ficha;

public class FichaDao extends Dao {

	public void cadastrarFicha(Ficha ficha) {
		Session session = getSession();
		session.save(ficha);
		commit(session);
		atualizarAnimais(ficha);
	}

	public void atualizarFicha(Integer id, Ficha ficha) {
		Session session = getSession();
		session.update(ficha);
		commit(session);
		atualizarAnimais(ficha);
	}

	private void atualizarAnimais(Ficha ficha) {
		if (ficha.getAnimais() != null) {
			int numeroDeAnimais = ficha.getAnimais().size();
			for (int i = 0; i < numeroDeAnimais; i++) {
				Animal animal = ficha.getAnimais().get(i);
				animal.setFichaId(ficha.getId());
				Session session = getSession();
				session.update(animal);
				commit(session);
			}
		}
	}

	public List<Ficha> buscarFichas() {
		Session session = getSession();
		List<Ficha> fichas = session.createNativeQuery("select * from ficha", Ficha.class).getResultList();
		commit(session);
		return fichas;
	}

	public Ficha buscarFichaPorId(Integer id) {
		Session session = getSession();
		try {
			Ficha ficha = session.createNativeQuery("SELECT * FROM ficha WHERE ficha.id =" + id, Ficha.class)
					.getSingleResult();
			ficha = animaisCadastradosNaFicha(id, ficha);
			return ficha;
		} catch (NoResultException e) {
			commit(session);
			return null;
		}
	}

	private Ficha animaisCadastradosNaFicha(Integer id, Ficha ficha) {
		Session session = getSession();
		List<Animal> animais = session
				.createNativeQuery("SELECT * FROM animal WHERE animal.ficha_id =" + id, Animal.class).getResultList();
		commit(session);
		ficha.setAnimais(animais);
		return ficha;
	}

	public void excluirFicha(Ficha fichaParaRemover) {
		Session session = getSession();
		session.delete(fichaParaRemover);
		commit(session);
	}

	public List<Ficha> buscarPorData(Long dataInicio, Long dataFim) {
		Session session = getSession();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		if (dataInicio != null && dataFim != null) {
			Date inicio = new Date(dataInicio);
			Date fim = new Date(dataFim);
			List<Ficha> fichas = session.createNativeQuery("select * from ficha where dataDeCadastro between '"
					+ sdf.format(inicio) + "' and '" + sdf.format(fim) + "'", Ficha.class).getResultList();
			commit(session);
			return fichas;
		}
		if (dataInicio != null && dataFim == null) {
			Date inicio = new Date(dataInicio);
			List<Ficha> fichas = session
					.createNativeQuery("select * from ficha where dataDeCadastro > '" + sdf.format(inicio) + "'",
							Ficha.class)
					.getResultList();
			commit(session);
			return fichas;
		}
		if (dataInicio == null && dataFim != null) {
			Date fim = new Date(dataFim);
			List<Ficha> fichas = session
					.createNativeQuery("select * from ficha where dataDeCadastro < '" + sdf.format(fim) + "'",
							Ficha.class)
					.getResultList();
			commit(session);
			return fichas;
		}

		commit(session);
		return null;
	}

}
