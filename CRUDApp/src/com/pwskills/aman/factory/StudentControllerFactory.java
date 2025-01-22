package com.pwskills.aman.factory;

import com.pwskills.aman.controller.IStudentController;
import com.pwskills.aman.controller.StudentControllerImpl;

public class StudentControllerFactory {
	private static IStudentController controller = null;
	
	
	public static IStudentController getStudentControllerObj() {
		if(controller == null) {
			controller = new StudentControllerImpl();
		}
		return controller;
	}
}
