package week4.day1.assignment;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTrainNamesAreUnique {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://erail.in/");

		driver.findElementByXPath("//input[@type='checkbox' and @title='View trains running on select date']").click();
		driver.findElementByXPath("//input[@id='txtStationFrom' and @title='Type SOURCE station code or name']").clear();
		driver.findElementByXPath("//input[@id='txtStationFrom' and @title='Type SOURCE station code or name']").sendKeys("MS",Keys.TAB);
		
		driver.findElementByXPath("//input[@id='txtStationTo' and @title='Enter DESTINATION station code or name']").clear();
		driver.findElementByXPath("//input[@id='txtStationTo' and @title='Enter DESTINATION station code or name']").sendKeys("mdu",Keys.TAB);
		
		Thread.sleep(3000);
		List<WebElement> allTrainNames = driver.findElementsByXPath("//table[contains(@class,'DataTable TrainList TrainListHeader')]//tr/td[2]");
		
	int noOfTrains=	allTrainNames.size();
		
	System.out.println(noOfTrains);
	
	Set<String> trainNames = new TreeSet<String>();
	for(WebElement allTrainElements:allTrainNames)
		
	{
		if (!trainNames.add(allTrainElements.getText()))
				
				{
				System.out.println(allTrainElements.getText());
				
		
	}
	
	
		
	}

}}
