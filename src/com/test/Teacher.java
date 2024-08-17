package com.test;

public class Teacher {
	
	private int tid;
	private String Name;
	private String Address;
	
	public Teacher(int tid, String name, String address) {
		super();
		this.tid = tid;
		Name = name;
		Address = address;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	
	
	
	

}
