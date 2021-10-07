package org.pack.tester;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.pack.entity.City;
import org.pack.entity.People;
import org.pack.utils.HibernateUtils;

public class MTMTester {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		
		City city1 = new City();
		city1.setName("Irving");
		
		City city2 = new City();
		city2.setName("Ada");
		
		People people1 = new People();
		people1.setName("Ram");
		
		People people2 = new People();
		people2.setName("Shyam");
		
		List<City> cities = new ArrayList<City>();
		cities.add(city1);
		cities.add(city2);
		
		List<People> people = new ArrayList<People>();
		people.add(people1);
		people.add(people2);
		
		city1.setPeople(people);
		city2.setPeople(people);
		
		people1.setCities(cities);
		people2.setCities(cities);
		
		session.save(people1);
		session.save(people2);
		session.save(city1);
		session.save(city2);
		
		transaction.commit();
		session.close();
		sf.close();
	}

}
