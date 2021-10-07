package org.pack.tester;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.pack.entity.Student;
import org.pack.utils.HibernateUtils;

public class StudentTester {
	public static void main(String[] args) {
		
		//get the SessionFactory from util class
		SessionFactory sf = HibernateUtils.getSessionFactory();
		
		//open the session
		Session session = sf.openSession();
		
		//start the trxn
		Transaction txn = session.beginTransaction();
		
		//create student object from mapping it as a table in database
		Student student = new Student();
		student.setId(9);
		student.setName("Ram");
		
		//storing record in student table by using session.save() method
		session.save(student);
		txn.commit();
		session.close();
		sf.close();
	}

}
