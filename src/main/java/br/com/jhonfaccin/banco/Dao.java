package br.com.jhonfaccin.banco;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.com.jhonfaccin.modelo.Animal;
import br.com.jhonfaccin.modelo.Ficha;

public class Dao {

	private SessionFactory sessionFactory;

	public Dao() {
		sessionFactory = new Configuration().configure() // configures settings from hibernate.cfg.xml
				.buildSessionFactory();
	}

	public Animal addEmp() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Animal animal= session.get(Animal.class, new Integer(1));
		session.getTransaction().commit();
		session.close();
		return animal;
	}

	public List<Animal> buscarAnimais() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		List<Animal> animais = session.createNativeQuery("select * from animal",Animal.class).getResultList(); 
		session.getTransaction().commit();
		session.close();
		return animais;
	}

	public void cadastrarFicha(Ficha ficha) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(ficha);
		session.getTransaction().commit();
		session.close();
		atualizarAnimais(ficha);
	}	
	
	public void atualizarFicha(Integer id, Ficha ficha) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(ficha);
		session.getTransaction().commit();
		session.close();
		atualizarAnimais(ficha);
	}

	private void atualizarAnimais(Ficha ficha) {
		if (ficha.getAnimais() != null) {
			int numeroDeAnimais = ficha.getAnimais().size();
			for (int i = 0; i < numeroDeAnimais; i++) {
				Animal animal = ficha.getAnimais().get(i);
				animal.setFichaId(ficha.getId());
				Session session = sessionFactory.openSession();
				session.beginTransaction();
				session.update(animal);
				session.getTransaction().commit();
				session.close();
			}
		}
	}

	public List<Ficha> buscarFichas() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		List<Ficha> fichas = session.createNativeQuery("select * from ficha",Ficha.class).getResultList(); 
		session.getTransaction().commit();
		session.close();
		return fichas;
	}

	public Ficha buscarFichaPorId(Integer id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Ficha ficha = session.createNativeQuery("SELECT * FROM ficha WHERE ficha.id ="+id,Ficha.class).getSingleResult();
		session.getTransaction().commit();
		session.close();
		ficha = animaisCadastradosNaFicha(id,ficha);
		return ficha;
	}

	private Ficha animaisCadastradosNaFicha(Integer id, Ficha ficha) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		List<Animal> animais = session.createNativeQuery("SELECT * FROM animal WHERE animal.ficha_id ="+id,Animal.class).getResultList();
		session.getTransaction().commit();
		session.close();
		ficha.setAnimais(animais);
		return ficha;
	}

	public void excluirFicha(Ficha fichaParaRemover) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(fichaParaRemover);
		session.getTransaction().commit();
		session.close();
	}

	public List<Ficha> buscarPorData(Date dataInicio, Date dataFim) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		List<Ficha> fichas = session.createNativeQuery("select * from ficha where dataDeCadastro between "+dataInicio.getTime()
				+ " and "+dataFim.getTime(),Ficha.class).getResultList();
		session.getTransaction().commit();
		session.close();
		return fichas;
	}

}
