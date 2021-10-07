package org.pack.tester;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.pack.entity.Bug;
import org.pack.utils.HibernateUtils;

public class HQLTester2 {

	public static void main(String[] args) {
		SessionFactory sessionFactory =  HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query query= session.createQuery("from Bug where name=?1");
		query.setParameter(1, "Little");
		List<Bug> bugs = query.getResultList();
		System.out.println("Bug type is: "+ bugs.get(0).getType());
		
		Query query2= session.createQuery("from Bug where name=?1 and id=?2");
		query2.setParameter(1, "Hacked");
		query2.setParameter(2, 4);
		List<Bug> bugs2 = query2.getResultList();
		System.out.println("Bug type is: "+ bugs2.get(0).getType());
		
		
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
}
