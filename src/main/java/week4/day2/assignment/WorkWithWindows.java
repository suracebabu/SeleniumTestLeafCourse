package week4.day2.assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkWithWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://testleaf.herokuapp.com/pages/Window.html");
		
		driver.getTitle();
		
		String windowName1= driver.getWindowHandle();
		
		System.out.println(windowName1);
		
		
		driver.findElementByXPath("//button[text()='Open Home Page']").click();
		
		Set<String> windowHandles2 = new LinkedHashSet<String>(driver.getWindowHandles());
		
		for (String windowNames:windowHandles2) {
			System.out.println(windowNames);
			
		}
		
		ArrayList<String> windowString = new ArrayList<String>(windowHandles2);
		
		String firstWindow= windowString.get(0);
		String secondWindow= windowString.get(1);
		
		
		driver.switchTo().window(secondWindow);
		
		System.out.println(driver.getTitle());
		
	
		driver.close();
		
		driver.switchTo().window(firstWindow);
		System.out.println(driver.getTitle());
		
	}

}
