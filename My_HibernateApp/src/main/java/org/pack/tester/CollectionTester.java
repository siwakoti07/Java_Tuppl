package org.pack.tester;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.pack.entity.Country;
import org.pack.utils.HibernateUtils;

public class CollectionTester {
	
	public static void main(String[] args) {
		
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		
		List<String> cities = new ArrayList<String>();
		cities.add("Birtamod");
		cities.add("Damak");
		cities.add("Biratnagar");
		cities.add("Dharan");
		cities.add("Kathmandu");
		
		Country country = new Country();
		country.setName("Nepal");
		country.setCities(cities);
		
		session.save(country);
		transaction.commit();
		session.close();
		sf.close();
	}
}
