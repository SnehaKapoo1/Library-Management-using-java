package com.lc.service;

import com.lc.dao.StudentDao;
import com.lc.dao.StudentDaoImp;
import com.lc.model.Student;

public class StudentServiceImpl implements StudentService{
	
	StudentDao sdao = new StudentDaoImp();

	@Override
	public Student findById(int memid) {
		Student student = sdao.findById(memid);
		return student;
	}

	@Override
	public boolean checkLogin(String user, String password) {
		Student student = sdao.findById(Integer.parseInt(user));
		if(student == null) return false;
		System.out.println(student);
		return student.getName().trim().equals(password.trim());
	}

}
