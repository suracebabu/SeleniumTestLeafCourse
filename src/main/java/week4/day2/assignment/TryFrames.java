package week4.day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TryFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.switchTo().frame(driver.findElementById("iframeResult"));
		
		driver.findElementByXPath("//button[text()='Try it']").click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.sendKeys("Suresh");
		
		alert.accept();
		
			
		String text = driver.findElementByXPath("//p[@id='demo']").getText();
		
		if(text.contains("Suresh"))
		{
			System.out.println("Alert message Accepeted"+"\t"+text);
			
		}
	
		else {
			System.out.println("Alert message not Accepted");
			
		}
	
		
		
	}

}
