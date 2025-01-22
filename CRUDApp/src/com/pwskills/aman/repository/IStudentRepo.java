package com.pwskills.aman.repository;

import java.sql.SQLException;

import com.pwskills.aman.dto.Student;

public interface IStudentRepo {
	// C - Create
	// R - Read
	// U - Update
	// D - Delete
		
	public int insertRecord(Student student) throws SQLException;
}
