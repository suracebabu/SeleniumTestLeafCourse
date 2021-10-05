package stepsdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksImplementation extends BaseClass{

	@Before // import from io cucumber
	public void preCondition() {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("http://leaftaps.com/opentaps/control/main");
	}
	
	@After // import from io cucumber
	public void postCondition() {
		// TODO Auto-generated method stub

	}
	
}
