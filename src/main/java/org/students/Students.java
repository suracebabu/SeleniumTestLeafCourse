package org.students;

public class Students {
	
	
	
	public void getStudentInfo(int id) {
		
	
		System.out.println("Get Student info with ID"+id);
		
	}

	public void getStudentInfo(int id, String name) {
		
		
		System.out.println("Get Student info with ID & Student name"+"\n"+id+"\n"+name);
		
	}
	
	public void getStudentInfo(String  email,double phoneNumber) {
		
		
		System.out.println("Get Student info with email & Phonenumber "+"\n"+email+"\n"+phoneNumber);
		
	}
	
	public static void main(String[] args) {
		
		Students stuObj1= new Students();
		
		stuObj1.getStudentInfo(220527);
		stuObj1.getStudentInfo(220672, "Samatha");
		stuObj1.getStudentInfo("test@gmail.com",9099098988d);
		
		
	}
	
	
}
