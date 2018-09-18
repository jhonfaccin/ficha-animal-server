package br.com.jhonfaccin.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Dao {

	public Dao() {
		sessionFactory = new Configuration().configure() // configures settings from hibernate.cfg.xml
				.buildSessionFactory();
	}
	private SessionFactory sessionFactory;

	protected void commit(Session session) {
		session.getTransaction().commit();
		session.close();
	}

	protected Session getSession() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		return session;
		
	}

}