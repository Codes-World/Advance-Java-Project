package com.pwskills.aman.factory;

import com.pwskills.aman.service.IStudentService;
import com.pwskills.aman.service.StudentServiceImpl;

public class StudentServiceFactory {
	private static IStudentService studentService = null;
	
	private StudentServiceFactory() {}
	
	public static IStudentService getStudentService() {
		if(studentService == null) {
			studentService = new StudentServiceImpl();
		}
		return studentService;
	}
}
