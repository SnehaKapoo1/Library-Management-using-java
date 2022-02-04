package com.lc.model;

public class Student {
	
	int memid;
	String name;
	boolean active;
	int numBooks;
	int roll;
	String branch;
	public Student(int memid, String name, boolean active, int numBooks, int roll, String branch) {
		super();
		this.memid = memid;
		this.name = name;
		this.active = active;
		this.numBooks = numBooks;
		this.roll = roll;
		this.branch = branch;
	}
	public Student() {
		super();
	}
	public int getMemid() {
		return memid;
	}
	public void setMemid(int memid) {
		this.memid = memid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public int getNumBooks() {
		return numBooks;
	}
	public void setNumBooks(int numBooks) {
		this.numBooks = numBooks;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [memid=" + memid + ", name=" + name + ", active=" + active + ", numBooks=" + numBooks
				+ ", roll=" + roll + ", branch=" + branch + "]";
	}
	
	

}
