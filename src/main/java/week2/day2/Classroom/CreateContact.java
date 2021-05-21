package week2.day2.Classroom;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElementById("username").sendKeys("demosalesmanager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByXPath("//input[@value='Login']").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Create Contact").click();
		
		driver.findElementById("firstNameField").sendKeys("Balaji");
		
		driver.findElementById("lastNameField").sendKeys("G");
		
		
		driver.findElementById("createContactForm_firstNameLocal").sendKeys("Venkat");
		
		driver.findElementById("createContactForm_lastNameLocal").sendKeys("Bala");
		
		
		driver.findElementByName("departmentName").sendKeys("Electrical");
		
		
		driver.findElementByName("description").sendKeys("testDescription");
		
		
		driver.findElementByXPath("//input[@id='createContactForm_primaryEmail' and @name='primaryEmail']").sendKeys("testgmail@gmail.com");
		
		
		Select selStateDropDown = new Select(driver.findElementByXPath("//select[@name='generalStateProvinceGeoId']"));
				
				selStateDropDown.selectByVisibleText("New York");
				driver.findElementByXPath("//input[@value='Create Contact']").click();
				
				driver.findElementByXPath("//a[contains(text(),'Edit')]").click();
						
				driver.findElementById("updateContactForm_description").clear();
				
				driver.findElementByXPath("//textarea[@id='updateContactForm_importantNote']").sendKeys("updatedes");
				
				driver.findElementByXPath("//input[@value='Update']").click();
				
				System.out.println(driver.getTitle());
				
				
				
		
			
		
		

	}

}
