package com.pwskills.aman.factory;

import com.pwskills.aman.repository.IStudentRepo;
import com.pwskills.aman.repository.StudentRepoImpl;

public class StudentRepoFactory {
	private static StudentRepoImpl studentRepo = null;
	private StudentRepoFactory() {}
	
	//Singleton Pattern
	public static IStudentRepo getStudentRepo() {
		if(studentRepo == null) {
			studentRepo = new StudentRepoImpl();
		}
		return studentRepo;
	}
}
