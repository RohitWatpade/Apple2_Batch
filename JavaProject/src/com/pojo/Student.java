package com.pojo;

public class Student {


	int id, marks;
	long contact;
	String name, email, dept;
	
	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public long getContact() {
		return contact;
	}


	public void setContact(long contact) {
		this.contact = contact;
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


	public void setId(int id) {
		this.id = id;
	}



	public int getId() {
		return id;
	}
	
	
	public String tostring()
	{
		return id+" "+name+" "+dept+" "+ marks+" "+contact+" "+email; 
	}
}
