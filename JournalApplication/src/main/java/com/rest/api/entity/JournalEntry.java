package com.rest.api.entity;

public class JournalEntry 
{
	private long id;
	
	private String name;
	
	private String designation;
	
	private double sal;
	
	//Parameterized Constructor
	public JournalEntry(long id, String name, String designation, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.sal = sal;
	}
	
    public JournalEntry() {
		super();
		// TODO Auto-generated constructor stub
	}



	//Getter and Setter method
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	
	

}
