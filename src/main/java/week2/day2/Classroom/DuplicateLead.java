package week2.day2.Classroom;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElementByXPath("//input[@name='USERNAME']").sendKeys("demosalesmanager");
		driver.findElementByXPath("//input[@name='USERNAME']/following::input").sendKeys("crmsfa");
		
		
		driver.findElementByXPath("//input[@name='USERNAME']/following::input[@value='Login']").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByXPath("//a[contains(text(),'Leads')]").click();
		
		driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
		
		driver.findElementByXPath("//span[contains(text(),'Email')]").click();
		
		driver.findElementByXPath("//input[@name='emailAddress' and @autocomplete='off']").sendKeys("test@gmail.com");
		driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
		
		Thread.sleep(3000);
		
	String firstLeadId=	driver.findElementByXPath("//div[contains(@class,'grid3-col-partyId') and (@unselectable='on')]/following::a[contains(@href,'partyId')][1]").getText();
		
	driver.findElementByXPath("(//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]//a[@class='linktext'])[1]").click();
	
	String orgLeadName=driver.findElementById("viewLead_firstName_sp").getText();
	
	System.out.println(orgLeadName);
	
	driver.findElementByXPath("//a[contains(text(),'Duplicate Lead')]").click();
	
	
	
	String windowsTitle=driver.getTitle();
	
	System.out.println(windowsTitle);			
	
	driver.findElementByXPath("//input[@value='Create Lead']").click();
	
	String duplicateName = driver.findElementByXPath("//span[contains(text(),'First name')]/following::span[@id='viewLead_firstName_sp']").getText();
	
	if(duplicateName.equalsIgnoreCase(orgLeadName))
		
	{System.out.println("Duplicate Name is same as original name");
	}
		
	else
		System.out.println("test case failed");
	
	}

}
