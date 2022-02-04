package com.lc.service;

import com.lc.model.Student;

public interface StudentService {

	Student findById(int memid);
	boolean checkLogin(String user, String password);
}
