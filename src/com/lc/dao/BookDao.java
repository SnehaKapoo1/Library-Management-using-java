package com.lc.dao;

import com.lc.model.Book;
import com.lc.model.Student;

public interface BookDao {

	Book findBookById(int bookId);
	Book addBook(Book book);
	boolean removeBook(Book book);
	Book updateBook(Book book);
}
