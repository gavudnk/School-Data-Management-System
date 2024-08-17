package com.test;

public class Exam {

	private int eid;
	private String Name;
	private String Duration;
	
	public Exam(int eid, String name, String duration) {
		super();
		this.eid = eid;
		Name = name;
		Duration = duration;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDuration() {
		return Duration;
	}

	public void setDuration(String duration) {
		Duration = duration;
	}
	
	
	
	
}
