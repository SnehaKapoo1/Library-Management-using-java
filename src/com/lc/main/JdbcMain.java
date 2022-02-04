package com.lc.main;

import java.sql.Connection;
import java.util.Scanner;

import com.lc.dao.BookDaoImp;
import com.lc.dao.StudentDaoImp;
import com.lc.model.Book;
import com.lc.model.Student;

public class JdbcMain {
	
	public static void main(String []args) {
		try {
			Connection connection = DBConnection.getConnection();
			System.out.println(connection);
			
//			StudentDaoImp studao = new StudentDaoImp();
//			
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("Enter memId"); int memid = sc.nextInt();
//			System.out.println("Enter name"); String name = sc.next();
//			System.out.println("Enter roll"); int roll = sc.nextInt();
//			System.out.println("Enter branch"); String branch = sc.next();
			
			/*
			 * Student studentAdded = studao.addStudent(memid, name, true, 0, roll, branch);
			 * System.out.println(studentAdded);
			 */
			
//		Student updateStudent = studao.updateStudent(name, true, 0, roll, branch, memid);
//		System.out.println(updateStudent);
			
			BookDaoImp bmpdao = new BookDaoImp();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter bId"); int bid = sc.nextInt();
			System.out.println("Enter btitle"); String btitle = sc.next();
			System.out.println("Enter bauthor"); String bauthor = sc.next();
			
			//Book findBookById = bmpdao.findBookById(bid);
			//System.out.println(findBookById);
			
		    Book addBook = bmpdao.addBook(bid, btitle, bauthor);
		    System.out.println(addBook);
		    
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
		   DBConnection.closeConnection();
		}
	}

}
