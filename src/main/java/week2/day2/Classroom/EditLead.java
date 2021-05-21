package week2.day2.Classroom;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElementByXPath("//input[@class='inputLogin' and @id='username']").sendKeys("demosalesmanager");
		
		
		driver.findElementByXPath("//input[@type='password']").sendKeys("crmsfa");
		
		
		driver.findElementByXPath("//input[@value='Login']").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByXPath("//a[contains(text(),'Create Lead')]").click();//
		
		driver.findElementByLinkText("Leads").click();
		
		String firstLeadID = driver.findElementByXPath("(//td[contains(@class,'partyId')]/following::div/a[contains(@class,'linktext')])[1]").getText();
		
		System.out.println(firstLeadID);
		
		Thread.sleep(3000);
		
		driver.findElementByXPath("(//td[contains(@class,'partyId')]/following::div/a[contains(@class,'linktext')])[1]").click();
		
		System.out.println(driver.getTitle());
		
		

		
		String originalCompanyName = driver.findElementById("viewLead_companyName_sp").getText();
		
		System.out.println(originalCompanyName);
		
		driver.findElementByLinkText("Edit").click();
		
		driver.findElementById("updateLeadForm_companyName").clear();
		
		String modCompanyName= originalCompanyName+"mod";
				
		driver.findElementById("updateLeadForm_companyName").sendKeys(modCompanyName);
		
		driver.findElementByXPath("//input[@value='Update']").click();
		
	
		String updatedCompanyName= driver.findElementById("viewLead_companyName_sp").getText();
		
		
		if(updatedCompanyName.equalsIgnoreCase(modCompanyName+" (10095"))
		
		{
			System.out.println("CompanyName is properly updated");
			
		}
		
		{	System.out.println("CompanyName update failed");}
		
		
		
		
	}

}
