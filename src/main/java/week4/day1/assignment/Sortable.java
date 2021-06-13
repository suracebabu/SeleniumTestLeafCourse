package week4.day1.assignment;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	// Launch the Application URL
		driver.get("https://jqueryui.com/sortable/");
		Thread.sleep(3000);
	// switching to iFrame	
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		
    // identify All Draggable webElements
		WebElement item1 = driver.findElementByXPath("//ul[@class='ui-sortable']/li[text()='Item 1']");
		WebElement item2 = driver.findElementByXPath("//li[contains(text(),'Item 2')]");
		WebElement item3 = driver.findElementByXPath("//li[contains(text(),'Item 3')]");
		WebElement item4 = driver.findElementByXPath("//li[contains(text(),'Item 4')]");
		WebElement item5 = driver.findElementByXPath("//li[contains(text(),'Item 5')]");
		WebElement item6 = driver.findElementByXPath("//li[contains(text(),'Item 6')]");
		WebElement item7 = driver.findElementByXPath("//li[contains(text(),'Item 7')]");
		
	//  initiating action class
		Actions builder= new Actions(driver);
			
    // Scroll to Source Element using JS Method
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", item1);
		
			
	// Perform sorting - drag and drop		
		builder.dragAndDrop(item1,item7).build().perform();
		builder.dragAndDrop(item2,item1).build().perform();
		builder.dragAndDrop(item3,item2).build().perform();
		builder.dragAndDrop(item4,item3).build().perform();
		builder.dragAndDrop(item5,item4).build().perform();
		builder.dragAndDrop(item6,item5).build().perform();
		
	// take screenshot
		
		File source =driver.getScreenshotAs(OutputType.FILE);
		File target= new File("./snaps/Sortable.png");
		FileUtils.copyFile(source, target);
		
	// quit the browser	
		driver.quit();

	}


	}


