package stepsdefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Login extends BaseClass {

	@Given("Enter the username as {string}")
	public void	enterUserName(String userName){
		driver.findElement(By.id("username")).sendKeys(userName);
	}

	@Given("Enter the password as {string}")
	public void	enterPassword(String password){
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@When("click on Login button")
	public void	clickLoginButton(){
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
}
