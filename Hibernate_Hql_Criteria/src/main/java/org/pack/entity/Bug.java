package org.pack.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "bug_tb")

public class Bug {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( name = "bug_id")
	private int id;
	@Column( name = "bug_name")
	private String name;
	@Column( name = "bug_type")
	private String type;
	
	public Bug() {
		
	}
	
	public Bug(int id, String name, String type) {
		this.id = id;
		this.name = name;
		this.type = type;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}

	
	

}
