package week1.day1;

// Access Specifier defined as public, it can be accessed from anywhere

// Block comment ctrl+shit+'/'
// to unBlock ctrl+shift+'\'
public class Mobile {

	// globalVariable, can be accessed by anymethod defined in the class
	
	public String[] phoneColor= {"Blue","Black","Grey","Red"};
	
	  public void makecall() {
	  
	  System.out.println("The function is used to make calls"); 
	  
	 // System.out.println(phoneColor[1]);
	  
	  int callDuration=50;
	 }
	  	 
	public void receiveCall() {
		System.out.println("The function is used to receive calls");
	}
	
	
	public static void main(String[] args) {
		Mobile m1= new Mobile();
		m1.makecall();
		m1.receiveCall();
		
		
	}
}
