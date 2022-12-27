package com.pojo;

public class StudentL {
	int id;
	String name, email,dept;
	long contact;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
		
		
	}
	@Override
	public String toString() {
		return "StudentL [id=" + id + ", name=" + name + ", email=" + email + ", dept=" + dept + ", contact=" + contact
				+ "]";
	}

}
