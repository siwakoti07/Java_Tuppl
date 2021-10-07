package org.pack.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "book_tb")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int isbn_num;
	@Column(name = "book_name")
	private String name;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "author_book_tb", joinColumns = @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "author_id"))
	Set<Author> authors;
	
	public Book() {
	
	}

	
	public Book(String name, Set<Author> authors) {
		super();
		this.name = name;
		this.authors = authors;
	}


	public Book(String name) {
		super();
		this.name = name;
	}

	public Set<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}

	public int getIsbn_num() {
		return isbn_num;
	}

	public String getName() {
		return name;
	}

	public void setIsbn_num(int isbn_num) {
		this.isbn_num = isbn_num;
	}

	public void setName(String name) {
		this.name = name;
	}

}
