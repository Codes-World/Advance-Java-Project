package com.pwskills.aman.controller;

import java.sql.SQLException;

import com.pwskills.aman.dto.Student;

//IStudentController - 'I' represents interface
public interface IStudentController {
	// C - Create
	// R - Read
	// U - Update
	// D - Delete
	
	public int insertRecord(Student student) throws SQLException;

}
