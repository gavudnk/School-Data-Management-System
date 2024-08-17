package com.test;

public class Student {
	
	private int SID;
	private String Name;
	private String Address;
	
	public Student(int sID, String name, String address) {
		super();
		SID = sID;
		Name = name;
		Address = address;
	}

	public int getSID() {
		return SID;
	}

	public void setSID(int sID) {
		SID = sID;
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
