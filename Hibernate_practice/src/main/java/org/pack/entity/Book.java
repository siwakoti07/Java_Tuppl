package org.pack.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "book_tb")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int isbn_num;
	@Column(name="book_name")
	private String name;
	
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
