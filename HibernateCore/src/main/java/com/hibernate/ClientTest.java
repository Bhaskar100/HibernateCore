package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientTest {

	public static void main(String args[]) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		Employee emp = new Employee(11, "ABCD");

		session.persist(emp);
		t.commit();
		session.close();
		System.out.println("successfully table created");
		System.out.println(" First Hibernate Application");
	}
}
