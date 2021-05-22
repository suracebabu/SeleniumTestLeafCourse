package org.student;

import org.department.Department;

public class Student extends Department{
	
	
	public void studentName () {
		
		System.out.println("Student name- Dayton");
		
	}
	
	public void studentDept() {
		
		System.out.println("Student Dept- Control System Engg");
		
	}

	
	public void studentId() {
		
		System.out.println("Student ID- 22001");
		
	}
	
	public static void main(String[] args) {
		
		Student stuObj= new Student();
		
		stuObj.collegeName();
		stuObj.collegeCode();
		stuObj.collegeRank();
		
		stuObj.deptName();
		stuObj.studentName();
		stuObj.studentId();
		stuObj.studentDept();
	}
}
