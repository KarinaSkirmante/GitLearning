package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity //to use relation with other tables
@Table(name="DriverTable") //to create table automatically
public class Driver {
	//new comment

//second comment
	@Id //value will be unique
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID") //ID column will be in table
	private int id;
	
	@NotNull
	@Column(name="Name")
	private String name;
	
	@NotNull
	@Column(name="Speed")
	private String surname;
	
	
	public Driver() {
	}
	
	public Driver(String name, String surname) {
		setName(engine);
		setSurname(surname);
	}
	
	public int getID() {
		return id;
	}
	
	


}
