package org.pack.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="category_tb")
@Entity
public class Category {
	@Column(name="category_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(name="category_name")
	String name;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="cat_id")
	List<Product> ProdList;
	
	
	public Category() {
		
	}
	public Category(String name, List<Product> prodList) {
		this.name = name;
		ProdList = prodList;
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public List<Product> getProdList() {
		return ProdList;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setProdList(List<Product> prodList) {
		ProdList = prodList;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", ProdList=" + ProdList + "]";
	}
	

}
