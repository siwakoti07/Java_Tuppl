package org.pack.tester;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.pack.entity.Author;
import org.pack.entity.Book;

public class AuthorTester {
	
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		Book book1 = new Book();
		book1.setName("HarryPotter");
		Book book2 = new Book();
		book2.setName("LordOfTheRings");
		
		Author author1 = new Author("J.K Rowling");
		Author author2 = new Author("Tolkein");
		
		session.save(book1);
		session.save(book2);
		session.save(author1);
		session.save(author2);
	
		session.getTransaction().commit();
		session.close();
		
		
 	}

}
