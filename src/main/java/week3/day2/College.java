package week3.day2;

public class College extends University {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		College colObj1=new College();
		
		colObj1.ug();
		
		University colObj2University= new College();
		
		colObj2University.pg();
	}

	@Override
	public void ug() {
		// TODO Auto-generated method stub
		
		System.out.println("UG method implemented in College");
		
	}
	
	

}
