package week4.day1.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
	
		driver.get("https://jqueryui.com/sortable/");
		
		// WebElement men = driver.findElementByLinkText("Men");
		
		// WebElement men = driver.findElementByXPath("//a[text()='Men']");
		
		// create object for Action class
		
		
//		WebElement source = driver.findElementById("draggable");
//		
//		WebElement target = driver.findElementById("droppable");
		
		WebElement item1 = driver.findElementByXPath("//li[contains(text(),'Item 1')]");
		WebElement item2 = driver.findElementByXPath("//li[contains(text(),'Item 2')]");
		WebElement item3 = driver.findElementByXPath("//li[contains(text(),'Item 3')]");
		WebElement item4 = driver.findElementByXPath("//li[contains(text(),'Item 4')]");
		WebElement item5 = driver.findElementByXPath("//li[contains(text(),'Item 5')]");
		WebElement item6 = driver.findElementByXPath("//li[contains(text(),'Item 6')]");
		WebElement item7 = driver.findElementByXPath("//li[contains(text(),'Item 7')]");
		
			Actions builder= new Actions(driver);
		
		
		builder.clickAndHold(item1).moveToElement(item4).perform();
		
//		builder.keyDown(Keys.CONTROL).click(item1).click(item2).click(item3).click(item4).keyUp(Keys.CONTROL).perform();
	}


	}


