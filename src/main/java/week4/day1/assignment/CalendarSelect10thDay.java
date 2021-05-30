package week4.day1.assignment;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarSelect10thDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
	    driver.get("http://leafground.com/pages/Calendar.html");
	    
	    driver.findElementByXPath("//input[@id='datepicker']").click();
	    
	    driver.findElementByXPath("//a[@title='Next']").click();
	    
	    List<WebElement> selectedMonthWeeks = driver.findElementsByXPath("//table[@class='ui-datepicker-calendar']/tbody/tr");
	    
	    
	    int noOfWeeks= selectedMonthWeeks.size();
	    
	    for(int i=1;i<=noOfWeeks;i++) {
	   List<WebElement> noOfWeekDays = driver.findElementsByXPath("//table[@class='ui-datepicker-calendar']/tbody/tr["+i+"]/td");	
	    	
	   int weekDays = noOfWeekDays.size();
	    	
	    	   for(int j=1;j<=weekDays;j++) {
	    		   
	    	String date=  driver.findElementByXPath("//table[@class='ui-datepicker-calendar']/tbody/tr["+i+"]/td["+j+"]").getText();
	    		
	    	if(date.equals("10")) {
	    			    		
	    	System.out.println("Date"+date);
	    	
	    	driver.findElementByXPath("//table[@class='ui-datepicker-calendar']/tbody/tr["+i+"]/td["+j+"]/a").click();
	    	
	    	   }
	    	
	    	
	    }
	}

}}
