package com.lc.model;

public class Book {
	int bookId;
	String author;
	String title;
	
	public Book(int bookId, String author, String title) {
		super();
		this.bookId = bookId;
		this.author = author;
		this.title = title;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", author=" + author + ", title=" + title + "]";
	}
	
	

}
