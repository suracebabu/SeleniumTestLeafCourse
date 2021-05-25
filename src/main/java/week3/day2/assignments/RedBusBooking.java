package week3.day2.assignments;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBusBooking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		driver.findElementByXPath("//input[contains(@data-message,'source')]").sendKeys("C");
		Thread.sleep(3000);
		driver.findElementByXPath("//input[contains(@data-message,'source')]/following::li[@data-no='2']").click();
		driver.findElementByXPath("//input[contains(@data-message,'destination')]").sendKeys("SA");
		Thread.sleep(3000);
		driver.findElementByXPath("//input[contains(@data-message,'destination')]/following::li[@data-no='1']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//label[text()='Date']").click();
		driver.findElementByXPath("//td[text()='May 2021']/following::td/button").click();
		
		driver.findElementByXPath("//td[contains(@class,'wd') and text()='1']").click();
		
		driver.findElementByXPath("//button[text()='Search Buses']").click();
		
		Thread.sleep(3000);
		
		System.out.println("First Result"+driver.findElementByXPath("//span[contains(@class,'busFound')]").getText());
		
		driver.findElementByXPath("//i[contains(@class,'close')]").click();
		
		driver.findElementByXPath("//input[@type='checkbox'and @id='bt_SLEEPER']/parent::li").click();
		

		System.out.println("Second Result with Sleeper selected"+driver.findElementByXPath("//span[contains(@class,'busFound')]").getText());
		Thread.sleep(3000);
		driver.findElementByXPath("//label[@class='custom-checkbox' and @for='bt_AC']").click();
		System.out.println("Third Result with Sleeper & AC selected"+driver.findElementByXPath("//span[contains(@class,'busFound')]").getText());
	}

}
