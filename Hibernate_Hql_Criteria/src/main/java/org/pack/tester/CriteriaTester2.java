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

public class CriteriaTester2 {
	public static void main(String[] args) {
		SessionFactory sessionFactory =  HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Bug> criteriaQuery = criteriaBuilder.createQuery(Bug.class);
		Root<Bug> root = criteriaQuery.from(Bug.class);   //this is the select from statement
		criteriaQuery.select(root).where(criteriaBuilder.equal(root.get("id"),1 ), criteriaBuilder.equal(root.get("name"),"xyz" )); //this is for where clause
		
		Query query = session.createQuery(criteriaQuery);
		List<Bug> bugs = query.getResultList();
		System.out.println("Bug type: "+ bugs.get(0).getType());
		
		transaction.commit();
		session.close();
		sessionFactory.close();
		
	}
}
