package br.com.jhonfaccin.dao;

import java.util.List;

import org.hibernate.Session;

import br.com.jhonfaccin.modelo.Animal;

public class AnimalDao extends Dao {

	public List<Animal> buscarAnimais() {
		Session session = getSession();
		List<Animal> animais = session.createNativeQuery("select * from animal", Animal.class).getResultList();
		commit(session);
		return animais;
	}
}
