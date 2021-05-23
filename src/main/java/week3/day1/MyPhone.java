package week3.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyPhone {

	WebDriver driver = new ChromeDriver();
	
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
