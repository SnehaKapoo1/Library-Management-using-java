package com.lc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.lc.main.DBConnection;
import com.lc.model.Book;

public class BookDaoImp implements BookDao{

	@Override
	public Book findBookById(int bid) {
		
		try {
			Connection connection = DBConnection.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultQuery = statement.executeQuery("select * from Book where bid = " + bid);
			
			if(resultQuery.next()) {
				
				int bid1 = resultQuery.getInt("bid");
				String title = resultQuery.getString("btitle");
				String author = resultQuery.getString("bauthor");
				
				Book b = new Book(bid1, title, author);
				return b;	
			}else {
				return null;
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Book addBook(Book book) {

		Connection connection = DBConnection.getConnection();
		try {
			PreparedStatement prepareStatement = connection.prepareStatement("insert into Book values( ?, ?, ?) ");
			
			prepareStatement.setInt(1, book.getBookId());
			prepareStatement.setString(2,  book.getTitle());
			prepareStatement.setString(3, book.getAuthor());
			
			int rowsUpdated = prepareStatement.executeUpdate(); // we can use prepareStatement.execute(); --> any sql stmnt

			if(rowsUpdated == 1) {
				return book;
			}
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return null;
	}

	public Book addBook(int bid, String title, String author) {
		
		return this.addBook(new Book(bid, title, author));
	}
	@Override
	public boolean removeBook(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

}
