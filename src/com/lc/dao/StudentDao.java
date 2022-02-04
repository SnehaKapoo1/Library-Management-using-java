package com.lc.dao;

import com.lc.model.Student;

public interface StudentDao {
	
	Student findById(int memid);
	Student addStudent(Student student);
	boolean removeStudent(Student student);
	Student updateStudent(Student student);
}
