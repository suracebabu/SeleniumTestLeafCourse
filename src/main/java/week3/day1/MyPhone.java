package week3.day1;

public class MyPhone {

	
	public static void main(String[] args) {
		
		SmartPhone sm = new SmartPhone();
		
		AndriodPhone an = new AndriodPhone();
		
		AndriodPhone sm2= new SmartPhone();
		
		sm.connectWhatsapp();
		sm.makeCall();
		sm.sendMsg();
		sm.saveContact();
	    sm.takeVideo();
	    
	    an.takeVideo();
	    
	    sm2.takeVideo();
	}
}
