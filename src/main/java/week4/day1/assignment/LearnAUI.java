package week4.day1.assignment;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
	//	driver.get("https://www.myntra.com/");
		
//		driver.get("http://leafground.com/pages/drop.html");
		
		driver.get("http://leafground.com/pages/selectable.html");
		
		// WebElement men = driver.findElementByLinkText("Men");
		
		// WebElement men = driver.findElementByXPath("//a[text()='Men']");
		
		// create object for Action class
		
		
//		WebElement source = driver.findElementById("draggable");
//		
//		WebElement target = driver.findElementById("droppable");
		
		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement item2 = driver.findElementByXPath("//li[text()='Item 2']");
		WebElement item3 = driver.findElementByXPath("//li[text()='Item 3']");
		WebElement item4 = driver.findElementByXPath("//li[text()='Item 4']");
		
		Point location = item1.getLocation();
		int x = location.getX();
		int y =location.getY();
		
		System.out.println("get location of x and y"+ x+"\t"+y);
				
		Actions builder= new Actions(driver);
		
		//builder.moveToElement(men).perform();
		
		//builder.contextClick(men).perform();
		
	    //builder.moveToElement(men).doubleClick().perform();
		
//		builder.dragAndDrop(source, target).perform();
		
//		builder.dragAndDropBy(source,100, 100).perform();
		
		builder.clickAndHold(item1).moveToElement(item4).release().perform();
		
//		builder.keyDown(Keys.CONTROL).click(item1).click(item2).click(item3).click(item4).keyUp(Keys.CONTROL).perform();
	}

}
