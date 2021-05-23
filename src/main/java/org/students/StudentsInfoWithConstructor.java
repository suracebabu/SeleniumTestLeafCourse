package org.students;

public class StudentsInfoWithConstructor {
	
	int studentID;
	String studentName;
	String StudentEmail;
	double phoneNumber;
	
	public StudentsInfoWithConstructor()
	{
     this(220898,"Kenn");
		
		
	}
	
	public StudentsInfoWithConstructor(int studentID) {
		this.studentID=studentID;
			System.out.println("Get Student info with ID"+studentID);
		
	}

	public StudentsInfoWithConstructor(int studentID, String studentName) {
		this.studentID=studentID;
		this.studentName=studentName;
		
		System.out.println("Get Student info with ID & Student name"+"\n"+studentID+"\n"+studentName);
		
	}
	
	public StudentsInfoWithConstructor(String  StudentEmail,double phoneNumber) {
		
		this.StudentEmail=StudentEmail;
		this.phoneNumber=phoneNumber;
		System.out.println("Get Student info with email & Phonenumber "+"\n"+StudentEmail+"\n"+phoneNumber);
		
	}
	
	public static void main(String[] args) {
		
		StudentsInfoWithConstructor stuObj1= new StudentsInfoWithConstructor("testgmail@123.com",7878898998d);
		

		
	}
	
	
}
