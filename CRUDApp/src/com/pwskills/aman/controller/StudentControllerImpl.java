package com.pwskills.aman.controller;

import java.sql.SQLException;

import com.pwskills.aman.dto.Student;
import com.pwskills.aman.factory.StudentServiceFactory;
import com.pwskills.aman.service.IStudentService;

public class StudentControllerImpl implements IStudentController{

	@Override
	public int insertRecord(Student student) throws SQLException {
		IStudentService service = StudentServiceFactory.getStudentService();
		return service.insertRecord(student);
	}
	
}
