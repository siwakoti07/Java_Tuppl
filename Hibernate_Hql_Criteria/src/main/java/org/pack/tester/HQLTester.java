package org.pack.tester;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.pack.entity.Bug;
import org.pack.utils.HibernateUtils;

public class HQLTester {

	public static void main(String[] args) {
		SessionFactory sessionFactory =  HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query query= session.createQuery("from Bug");
		List<Bug> bugs = query.getResultList();
		
		for (Bug bug : bugs) {
			System.out.println("Bug: "+ bug.getName());
		}
		
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
}
