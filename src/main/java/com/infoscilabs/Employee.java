package com.infoscilabs;

public class Employee {
	private String id;
	private String name;
	private String profession;
	private String email;
	
	
	
	public Employee(String id, String name, String profession, String email) {
		super();
		this.id = id;
		this.name = name;
		this.profession = profession;
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
