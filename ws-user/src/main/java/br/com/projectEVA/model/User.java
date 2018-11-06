package br.com.projectEVA.model;

import java.util.Date;

public class User {

	private int id;
	private String name;
	private String surname;
	private String email;
	private Date birthdate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public User(int id, String name, String surname, String email, Date birthdate) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.birthdate = birthdate;
	}	
}
