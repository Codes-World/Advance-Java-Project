package com.pwskills.aman.service;
import java.sql.SQLException;

import com.pwskills.aman.dto.Student;
import com.pwskills.aman.factory.StudentRepoFactory;
import com.pwskills.aman.repository.IStudentRepo;

public class StudentServiceImpl implements IStudentService {

	@Override
	public int insertRecord(Student student) throws SQLException {
		//abstraction
		IStudentRepo repo = StudentRepoFactory.getStudentRepo();
		return repo.insertRecord(student);
	}

}
