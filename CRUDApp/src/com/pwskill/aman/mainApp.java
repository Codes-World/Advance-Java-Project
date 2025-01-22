package com.pwskill.aman;

import java.sql.SQLException;
import java.util.Scanner;

import com.pwskills.aman.controller.IStudentController;
import com.pwskills.aman.dto.Student;
import com.pwskills.aman.factory.StudentControllerFactory;

public class mainApp {

	public static void main(String[] args) {
		IStudentController controller = StudentControllerFactory.getStudentControllerObj();
		Student student = new Student();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the sid:: ");
		Integer sid = sc.nextInt();
		
		System.out.print("Enter the sname:: ");
		String sname = sc.next();
		
		System.out.print("Enter the sage:: ");
		Integer sage = sc.nextInt();
		
		System.out.print("Enter the saddress:: ");
		String saddress = sc.next();
		
		student.setSid(sid);
		student.setSname(sname);
		student.setSage(sage);
		student.setSaddress(saddress);
		
		try {
			System.out.println("Number of records inserted is "+controller.insertRecord(student));
		} catch (SQLException e) {
			System.out.println("Insertion failure..");
		}
		sc.close();
	}

}
