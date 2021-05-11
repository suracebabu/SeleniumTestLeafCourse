package week1.day1;

import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.taskdefs.WaitFor.Unit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Precondition setup the driver for automation, webdrivermanager will download the chromedriver version for the version of browser
		WebDriverManager.chromedriver().setup();
		
		// if the above code not written, we need to download manually and set the system path
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\surac\\eclipse-workspace\\Drivers\\chromedriver.exe");
		
		System.out.println(System.getProperty("webdriver.chrome.driver"));
		
		
		
		// open chrome browser
		
		ChromeDriver driver = new ChromeDriver();
		
		System.out.println(driver.manage());
		
		driver.manage().window().maximize();
		
		//	need to use the http in the get request	
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// ctrl+2+L
		// WebElement userName = driver.findElementById("username");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement userName = driver.findElementByXPath("//input[@class='inputLogin']");
		userName.sendKeys("Demosalesmanager");
		
		WebElement password = driver.findElementById("password");
		password.sendKeys("crmsfa");
		
		//System.out.println(driver.findElement(By.id("password")));
		
		WebElement loginButton = driver.findElementByClassName("decorativeSubmit");
		loginButton.click();
		
		
		WebElement demoSalesManagerLink = driver.findElementByPartialLinkText("CRM/SFA");
		demoSalesManagerLink.click();
		
		
		WebElement leadsLink = driver.findElementByLinkText("Leads");
		leadsLink.click();
		
		
		WebElement createLeadLink = driver.findElementByPartialLinkText("Create Lead");
		createLeadLink.click();
		
		WebElement companyName = driver.findElementById("createLeadForm_companyName");
		
		companyName.sendKeys("Telecom");
		
		
		WebElement firstName = driver.findElementById("createLeadForm_firstName");
		
		firstName.sendKeys("Aravind");
		
		WebElement lastName = driver.findElementById("createLeadForm_lastName");
		
		lastName.sendKeys("Suram");
		
		Select sourceSelectDropdown = new Select(driver.findElementById("createLeadForm_dataSourceId"));
		
		sourceSelectDropdown.selectByValue("LEAD_EMPLOYEE");
		
		Select industrySelectDropdown = new Select(driver.findElementById("createLeadForm_industryEnumId"));
		
		industrySelectDropdown.selectByVisibleText("Finance");
		
		WebElement createLeadSubmitButton = driver.findElementByName("submitButton");
		
		createLeadSubmitButton.click();
		
		//
		
//    	most preferred option is id followed by class name
//		
//		tagName is used when we want to find multiple elements or collection because same tag might be used in other elements
	}

}
