package week4.day2.assignment;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Open the application URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// User login with valid credentials
		driver.findElementByXPath("//input[@class='inputLogin' and @id='username']").sendKeys("demosalesmanager");
		driver.findElementByXPath("//input[@type='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@value='Login']").click();
		
		// open CRM
		driver.findElementByLinkText("CRM/SFA").click();
		
		// Click Leads Link
		driver.findElementByXPath("//a[contains(text(),'Leads')]").click();
		
		//Click on Merge Leads
		driver.findElementByXPath("//a[text()='Merge Leads']").click();
		
		driver.findElementByXPath("(//input[@id='partyIdFrom']/following::img[@alt='Lookup'])[1]").click();
		
		// switching to new window- code not optimised
		Set<String> getAllWindows = new LinkedHashSet<String>(driver.getWindowHandles());
		for (String windowNames:getAllWindows) {
			System.out.println("Printing window names"+windowNames);
			
		}
		ArrayList<String> windowString = new ArrayList<String>(getAllWindows);
		String firstWindow= windowString.get(0);
		String secondWindow= windowString.get(1);
		driver.switchTo().window(secondWindow);
		// Switching to new window with Lead from selection--
		//Enter Lead ID and click search
		driver.findElementByXPath("//label[.='Lead ID:']/following::input[@name='id']").sendKeys("10134");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[@class='linktext']").click();
		//Switching back to main window
		driver.switchTo().window(firstWindow);
		
		//Selecting the Lead to lookup
		driver.findElementByXPath("(//input[@id='partyIdFrom']/following::img[@alt='Lookup'])[2]").click();
		// switching to second window
		
		// switching back to secondary window
		
		for (String childWin : driver.getWindowHandles()) {
		if (!childWin.equals(firstWindow)) {
		driver.switchTo().window(childWin);
		
		}}

		driver.findElementByXPath("//label[.='Lead ID:']/following::input[@name='id']").sendKeys("10135");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[@class='linktext']").click();
		
		driver.switchTo().window(firstWindow);
		driver.findElementByXPath("//a[text()='Merge']").click();
		
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		// Search in the find lead, make sure no records found after merging
		driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
		driver.findElementByXPath("//label[.='Lead ID:']/following::input[@name='id']").sendKeys("10134");
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		Thread.sleep(3000);
	String searchResultText= driver.findElementByXPath("//div[@class='x-paging-info']").getText();
	
	System.out.println(searchResultText);
		
		
		if(searchResultText.equalsIgnoreCase("No records to display")) 
		{
			
			System.out.println("Merge is successful, Unable to find the old lead ID");
		}
		
		else {
			System.out.println("merge process was not successful");
		}
		
		

	}

}
