package com.pwskills.aman.repository;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.pwskills.aman.Utility.JDBCUtil;
import com.pwskills.aman.dto.Student;

public class StudentRepoImpl implements IStudentRepo {
	
	private static Connection connection = null;
	static {
		try {
			connection = JDBCUtil.getDBConnection();
		} catch (IOException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public int insertRecord(Student student) throws SQLException {
		Statement statement = null;
		if(connection != null) 
			statement = connection.createStatement();
			
		String sqlInsertQuery = null;
		sqlInsertQuery = String.format("insert into student values(%d,'%s',%d,'%s')",student.getSid(), student.getSname(), student.getSage(), student.getSaddress());
		System.out.println(sqlInsertQuery);
			
		if(statement != null && sqlInsertQuery != null) {
			return statement.executeUpdate(sqlInsertQuery);
		}
		return 0;
	}

}
