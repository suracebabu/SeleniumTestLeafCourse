package week2.day2.Classroom;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
		
		
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		
		driver.findElementByXPath("//input[@value='Login']").click();
		
		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
		
		driver.findElementByXPath("//a[contains(text(),'Leads')]").click();
		
		driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
		
		driver.findElementByXPath("//span[contains(text(),'Phone')]").click();	
		
		driver.findElementByXPath("//input[@name='phoneCountryCode']").clear();
		driver.findElementByXPath("//input[@name='phoneCountryCode']").sendKeys("1");
		driver.findElementByXPath("//input[@name='phoneAreaCode']").sendKeys("216");
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("1234567890");
		
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		
		Thread.sleep(3000);
		
		String leadID= driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[@class='linktext'])[1]").getText();
		
		System.out.println(leadID);
		
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[@class='linktext'])[1]").click();
		driver.findElementByXPath("//a[contains(text(),'Delete')]").click();
		
		driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
		
		
		driver.findElementByXPath("//div/label[contains(text(),'Lead ID:')]/..//input[contains(@class,'x-form-text x-form-field')]").sendKeys(leadID);
		
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		
		Thread.sleep(3000);
		String verifyMessage=driver.findElementByXPath("//div[@class='x-paging-info']").getText();
		
		
		System.out.println(verifyMessage);
		
		driver.close();
	}

}
