package stepsdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LeadsTestCases extends BaseClass {
//	public ChromeDriver driver;

	/* CTRL+SHIFT+/
	 * @Given ("Open_the_Chrome_Browser") public void openBrowser(){
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
	 * driver.manage().window().maximize(); }
	 */

	@Given("Load the application URL {string}")
	public void	loadURL(String url){
		driver.get(url);

	}



	@Given ("Enter_the_companyName as {string}")
	public void enterCompanyName(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
	}
	
	@Given ("Enter_the_firstName as {string}")
	public void enterFirstName(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
	}

	@Given ("Enter_the_lastName as {string}")
	public void enterLastName(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
	}

	@Given ("Enter_the_phoneNumber as {string}")
	public void enterPhoneNumber(String phoneNumber) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phoneNumber);
	}
	



	@When("Click_on_CreateLead_SubmitButton")
	public void clickCreateLeadSubmit() {
		
		driver.findElement(By.name("submitButton")).click();
	}
	
	@And("Click_CRM_Link")
	public void clickCRMLink() {
	driver.findElement(By.linkText("CRM/SFA")).click();	
	}
	
	@Given("Click_on_Lead_Link")
	public void click_Lead_Link() {
	driver.findElement(By.linkText("Leads")).click();

	}
	
	@Given("Click_on_Create_Lead")
	public void click_Create_Lead() {
	driver.findElementByLinkText("Create Lead").click();
	}
	@Given("Find_Lead_through_Phone_Number as {string}")
	public void find_Lead_through_PhoneNumber(String phoneNumber) throws InterruptedException {
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNumber);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}
	
	@When("Edit_the_first_lead_companyName as {string}")
	public void edit_the_first_Lead_Company_Name(String companyName) {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName);
		
	}
	
	@When("Delete_the_First_Lead")
	public void delete_First_Lead() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Delete")).click();
	}
	
	@When("Click_Edit_Submit")
	public void editSubmit() {
		driver.findElement(By.name("submitButton")).click();
	}
	
	@Then("Verify_Lead_information_is_Edited_Successfully")
	public void verifyEditLeadInformation() {
		System.out.println("Lead Information is updated successfully ");
	}
	
	@Then("Verify_Lead_information_is_deleted_Successfully")
	public void verifyDeleteLeadInformation() {
		System.out.println("Lead Information is deleted successfully ");
	}
	
	@Given("Click_on_Find_Lead")
	@Then("Home_page_should_be_displayed")
	public void verifyDemoSalesManager() {
		System.out.println("verify salesmanager displayed");
	}

	@Then("DemoSalesManager_should_be_displayed")
	public void verifyDemoSalesManager2() {
		System.out.println("verify salesmanager displayed2");
	}

	@Then("New_CreateLead_information_is_Created")
	public void newCreateLeadInfoCreated() {
		System.out.println("Create LeadInfo created successfully");
	}
	@But("Error_message_should_be_displayed")
	public void errorMessageDisplayed() {
			System.out.println("Error message should be displayed");
	}
	
	@And("Close_the_Browser_Window")
	public void close_the_browser() {
		driver.close();
	}
	}
