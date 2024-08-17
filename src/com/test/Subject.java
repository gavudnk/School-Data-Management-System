package com.test;

public class Subject {
	
	private int subid;
	private String Name;
	private String lechInCh;
	
	public Subject(int subid, String name, String lechInCh) {
		super();
		this.subid = subid;
		Name = name;
		this.lechInCh = lechInCh;
	}

	public int getSubid() {
		return subid;
	}

	public void setSubid(int subid) {
		this.subid = subid;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getLechInCh() {
		return lechInCh;
	}

	public void setLechInCh(String lechInCh) {
		this.lechInCh = lechInCh;
	}
	
	
}
