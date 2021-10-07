package org.pack.tester;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.pack.entity.Passport;
import org.pack.entity.Person;
import org.pack.utils.HibernateUtils;

public class OTOTester {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		
		Passport passport = new Passport();
		passport.setType("Working");
		
		Person person = new Person();
		person.setName("Laxman");
		person.setPassport(passport);
		
		session.save(passport);
		session.save(person);
		
		transaction.commit();
		session.close();
		sf.close();
	}

}
