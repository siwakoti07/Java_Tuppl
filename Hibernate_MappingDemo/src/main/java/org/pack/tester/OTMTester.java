package org.pack.tester;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.pack.entity.Address;
import org.pack.entity.Employee;
import org.pack.utils.HibernateUtils;

public class OTMTester {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		
		Address address1 = new Address();
		address1.setPincode(75062);
		address1.setState("Tx");

		Address address2 = new Address();
		address2.setPincode(74820);
		address2.setState("Ok");
		
		List <Address> addresses = new ArrayList<Address>();
		addresses.add(address1);
		addresses.add(address2);
		
		Employee emp1 = new Employee();
		emp1.setName("Ram");
		emp1.setSalary(65000);
		emp1.setAddresses(addresses);
		
		address1.setEmployee(emp1);
		address2.setEmployee(emp1);
		
		session.save(address1);
		session.save(address2);
		session.save(emp1);

		transaction.commit();
		session.close();
		sf.close();
	}

}
