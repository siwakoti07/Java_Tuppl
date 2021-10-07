package org.pack.tester;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.pack.entity.Bug;
import org.pack.utils.HibernateUtils;

public class HQLTester3 {

	public static void main(String[] args) {
		SessionFactory sessionFactory =  HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
//		Query query= session.createQuery("from Bug where name='xyz'");
//		List<Bug> bugs = query.getResultList();
//		System.out.println("Bug type is: "+ bugs.get(0).getType());
//		
//		Query query2= session.createQuery("from Bug where name='xyz' or id='1'");
//		List<Bug> bugs2 = query2.getResultList();
//		System.out.println("Bug type is: "+ bugs2.get(0).getType());
//		System.out.println("Bug type is: "+ bugs2.get(1).getType());
		
		String hql = "update Bug set type= :name where id= :id";
		Query query3=session.createQuery(hql);
		query3.setParameter("name", "bindass");
//		query3.setParameter("type", "nepali");
		query3.setParameter("id", 2);
		
		int rowsAffected = query3.executeUpdate();
		if(rowsAffected>0) {
			System.out.println(rowsAffected + "rows are affected.");
		}
		
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
}
