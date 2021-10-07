package org.pack.tester;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.pack.entity.Bug;
import org.pack.utils.HibernateUtils;

public class CRUD_BugTester {

	public static void main(String[] args) {
		SessionFactory sessionFactory =  HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		//Bug bug = new Bug(1, "Simple", "low");	
		//session.save(bug);
		
//		Bug bug = session.get(Bug.class, 3);
//		System.out.println("Bug Name: "+ bug.getName());
//		System.out.println("Bug Type: "+ bug.getType());
		
//		Bug bug1 = new Bug(2, "xyz", "abc");
//		session.update(bug1);
		
		Bug bug2 = new Bug(4,"asa", "add");
		session.delete(bug2);
		
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
}
