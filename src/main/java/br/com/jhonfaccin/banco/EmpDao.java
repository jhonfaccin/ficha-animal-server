package br.com.jhonfaccin.banco;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmpDao {

	private static SessionFactory sessionFactory;

	public EmpDao() {
		sessionFactory = new Configuration().configure() // configures settings from hibernate.cfg.xml
				.buildSessionFactory();
	}

	public static void addEmp() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(new Emp(2,"Doutor Edi",30));
		session.getTransaction().commit();
		session.close();
	}

}
