package org.pack.tester;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.pack.entity.Bug;
import org.pack.utils.HibernateUtils;

public class CriteriaTester {
	public static void main(String[] args) {
		SessionFactory sessionFactory =  HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Bug> criteriaQuery = criteriaBuilder.createQuery(Bug.class);
		Root<Bug> root = criteriaQuery.from(Bug.class);
		criteriaQuery.select(root);
		Query query = session.createQuery(criteriaQuery);
		List<Bug> bugs = query.getResultList();
		
		for (Bug bug : bugs) {
			System.out.println("Bug name is ---> "+bug.getName());
		}
		
//		Criteria criteria = session.createCriteria(Bug.class); //deprecated (was used in Hibernate 3.x version)
//		List<Bug> bugs = criteria.list();
//		for (Bug bug : bugs) {
//			System.out.println("Bug name is -> "+bug.getName());
//		}
		
		transaction.commit();
		session.close();
		sessionFactory.close();
		
	}
}
