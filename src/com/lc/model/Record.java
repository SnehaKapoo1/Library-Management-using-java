package com.lc.model;

import java.sql.Date;

public class Record {
	
	Student student;
	Book book;
	int recordId;
	Date issueDate;
    Date retDate;
    int fine;
	public Record(Student student, Book book, int recordId, Date issueDate, Date retDate, int fine) {
		super();
		this.student = student;
		this.book = book;
		this.recordId = recordId;
		this.issueDate = issueDate;
		this.retDate = retDate;
		this.fine = fine;
	}
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public int getRecordId() {
		return recordId;
	}
	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public Date getRetDate() {
		return retDate;
	}
	public void setRetDate(Date retDate) {
		this.retDate = retDate;
	}
	public int getFine() {
		return fine;
	}
	public void setFine(int fine) {
		this.fine = fine;
	}

	@Override
	public String toString() {
		return "Record [student=" + student + ", book=" + book + ", recordId=" + recordId + ", issueDate=" + issueDate
				+ ", retDate=" + retDate + ", fine=" + fine + "]";
	}
    
	
    

}
