package org.pack.tester;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.pack.entity.Category;
import org.pack.entity.Product;

public class OTMTester {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		Product p1 = new Product("Dell_laptop",599);
		Product p2 = new Product("Lenovo_laptop",499);
		Product p3 = new Product("Acer_laptop",549);
		Product p4 = new Product("Samsung_mb",399);
		Product p5 = new Product("Apple_mb",499);
		Product p6 = new Product("Motorola_mb",299);
		
		List<Product> list1 = new ArrayList<Product>();
		list1.add(p1);
		list1.add(p2);
		list1.add(p3);
		
		List<Product> list2 = new ArrayList<Product>();
		list2.add(p4);
		list2.add(p5);
		list2.add(p6);
		
		Category c1 = new Category("Laptop", list1);
		Category c2 = new Category("Modile", list2);
		
		session.save(c1);
		session.save(c2);
		
		session.getTransaction().commit();
		session.close();

	}

}
