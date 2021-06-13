package week4.day1.assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.FindsByXPath;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.snapdeal.com/");
		
	WebElement mensFashion = driver.findElementByLinkText("Men's Fashion");
    // WebElement shirts = driver.findElementByXPath("(//span[text()='Shirts'and @class='linkTest'])[1]");
	WebElement shirts = driver.findElementByXPath("//a[text()='Shirts']");
	
	
	Actions builder = new Actions(driver);
		
	builder.moveToElement(mensFashion).perform();
	Thread.sleep(2000);
	builder.moveToElement(shirts).click(shirts).perform();

	WebElement firstImage = driver.findElementByXPath("(//picture[@class='picture-elem']//img)[1]");
	builder.moveToElement(firstImage).perform();
	WebElement quickView = driver.findElementByXPath("(//picture[@class='picture-elem']//img/following::div[contains(text(),'Quick View')])[1]");
	builder.click(quickView).perform();
	
	driver.quit();
	
	
	}

}
