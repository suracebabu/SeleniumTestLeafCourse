package week4.day2.assignment;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IrctcAlert {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
	      //disable notification parameter
		  option.addArguments("--disable-notifications");
	      ChromeDriver driver = new ChromeDriver(option);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.findElementById("corover-close-btn").click();
		
		Thread.sleep(3000);
		
		driver.findElementByXPath("//button[contains(@class,'btn btn-primary')]").click();
	
		driver.findElementByXPath("//div[@class='h_menu_drop_button hidden-xs']").click();
		
		driver.findElementByXPath("//a[@href='https://www.air.irctc.co.in']//label[text()='FLIGHTS']").click();
		
Set<String> windowHandles2 = new LinkedHashSet<String>(driver.getWindowHandles());
		
		for (String windowNames:windowHandles2) {
			System.out.println(windowNames);
			
		}
		
		ArrayList<String> windowString = new ArrayList<String>(windowHandles2);
		
		String firstWindow= windowString.get(0);
		String secondWindow= windowString.get(1);
		
		
		driver.switchTo().window(secondWindow);
		
		System.out.println(driver.getTitle());
		
	
		
	File source =driver.getScreenshotAs(OutputType.FILE);
	File target= new File("./snaps/AirFlight.png");
	FileUtils.copyFile(source, target);
	driver.switchTo().window(firstWindow);
	driver.close();
	
	}

}
