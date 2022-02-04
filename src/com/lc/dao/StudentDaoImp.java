package com.lc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.lc.main.DBConnection;
import com.lc.model.Student;

public class StudentDaoImp implements StudentDao 
{

	public Student findById(int memid) {
		try
		{
			Connection connection = DBConnection.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from student where memid = " + memid);

			if(resultSet.next())
			{
				int memid2 = resultSet.getInt("memid");
				String name = resultSet.getString("name");
				boolean active = resultSet.getBoolean("active");

				String strNum = resultSet.getString("numBooks");
				int numBooks = Integer.parseInt(strNum);

				int roll = resultSet.getInt("roll");
				String branch = resultSet.getString("branch");

				Student s = new Student(memid2, name, active, numBooks, roll, branch);
				return s;
			}else {
				return null;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}

	public Student addStudent(Student student){
		// give me student data object
		// some object is given to me, store it into the database
		Connection connection = DBConnection.getConnection();
		try {
			PreparedStatement prepareStatement = connection.prepareStatement("insert into Student values( ?, ?, ?, ?, ?, ?) ");

			prepareStatement.setInt(1, student.getMemid());
			prepareStatement.setString(2, student.getName());
			prepareStatement.setBoolean(3, student.isActive());
			prepareStatement.setInt(4, student.getNumBooks());
			prepareStatement.setInt(5, student.getRoll());
			prepareStatement.setString(6, student.getBranch());

			int rowsUpdated = prepareStatement.executeUpdate(); // we can use prepareStatement.execute(); --> any sql stmnt

			if(rowsUpdated == 1) {
				return student;
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return null;

	}
	
	public Student addStudent(int memid, String name, boolean active, int numBooks, int roll, String branch){
		return this.addStudent(new Student(memid, name, active, numBooks, roll, branch));
	}

	public boolean removeStudent(Student student) {
       
		return this.removeStudent(student.getMemid());
	}

	public boolean removeStudent(int memid) {

		Connection connection = DBConnection.getConnection();

		try {
			PreparedStatement pst = connection.prepareStatement("delete from Student where memid = ?");
			pst.setInt(1, memid);
             
			int rowDeleted = pst.executeUpdate();
			if(rowDeleted == 1) {
				return true;
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return false;

	}

	public Student updateStudent(Student student) {
		Connection connection = DBConnection.getConnection();
		String query = "update Student set name = ?, active = ?, numBooks = ?, roll = ?, branch = ? where memid = ?";
		
		try {
			PreparedStatement pst = connection.prepareStatement(query);
			
			pst.setString(1, student.getName());
			pst.setBoolean(2, student.isActive());
			pst.setInt(3, student.getNumBooks());
			pst.setInt(4, student.getRoll());
			pst.setString(5, student.getBranch());
			pst.setInt(6, student.getMemid());
			
			int executeUpdate = pst.executeUpdate();
			
			if(executeUpdate == 1) {
				return student;
			}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return null;
	}

	public Student updateStudent(String name, boolean active, int numBooks, int roll, String branch, int memid) {
		return this.updateStudent(new Student(memid, name, active, numBooks, roll, branch));
		
	}

}









