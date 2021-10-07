package org.pack.tester;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.pack.entity.Author;
import org.pack.entity.Book;

public class MTMTester {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		Author a1 = new Author("Ram");
		Author a2 = new Author("Shyam");
		Author a3 = new Author("Hari");
		
		Set<Author> javaAuthors = new HashSet<Author>(); 
		Set<Author> cAuthors = new HashSet<Author>(); 
		Set<Author> PythonAuthors = new HashSet<Author>();
		
		javaAuthors.add(a1);
		javaAuthors.add(a2);
		cAuthors.add(a2);
		cAuthors.add(a3);
		PythonAuthors.add(a3);
		PythonAuthors.add(a1);
		
		Book  book1 = new Book("Java", javaAuthors);
		Book book2 = new Book("C", cAuthors);
		Book book3 = new Book("Pyhton", PythonAuthors);
		
		session.save(book1);
		session.save(book2);
		session.save(book3);

		
		session.getTransaction().commit();
		session.close();

	}

}
