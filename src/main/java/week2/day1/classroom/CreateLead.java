package week2.day1.classroom;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		//Step1******* Launch the Application *****************************************************************************
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		//Step2**********Enter UserName and Password Using Id Locator*********************************************************
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
			
		driver.findElementById("password").sendKeys("crmsfa");
	
		//Step3**********Click on Login Button using Class Locator*********************************************************
				
		driver.findElementByClassName("decorativeSubmit").click();
		
		
		String loadedURLTitle = driver.getTitle();
		
		System.out.println(loadedURLTitle);
		
		if (loadedURLTitle.equalsIgnoreCase("Leaftaps - TestLeaf Automation Platform"))
			
		{System.out.println("The Application title is verified successfully");
					
		}
		
		else
		{
			System.out.println("The Application title is not matching");
			
		}
		
		//Step4********** Click on CRM/SFA Link******************************************************************************
		driver.findElementByLinkText("CRM/SFA").click();
		
		
		//Step5*********** Click on Leads Button*****************************************************************************
		
		driver.findElementByLinkText("Create Lead").click();
		
		//Step6a************************Enter all fields in the create lead form*********************************************************************
		
		driver.findElementById("createLeadForm_companyName").sendKeys("Telecom");
		
		driver.findElementById("createLeadForm_firstName").sendKeys("Stan");
		
		driver.findElementById("createLeadForm_lastName").sendKeys("Warinka");
		
		Select selSource = new Select(driver.findElementById("createLeadForm_dataSourceId"));
		
		selSource.selectByVisibleText("Employee");
		
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Stantheman");
		
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Mr");
		
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Automation QA");
		
		driver.findElementByName("annualRevenue").sendKeys("100K");
		
		Select selIndustry = new Select(driver.findElementById("createLeadForm_industryEnumId"));
		selIndustry.selectByVisibleText("Insurance");
		
		Select selOwnership = new Select(driver.findElementById("createLeadForm_ownershipEnumId"));
		selOwnership.selectByVisibleText("LLC/LLP");
		
		driver.findElementById("createLeadForm_sicCode").sendKeys("testSIC");
		driver.findElementById("createLeadForm_description").sendKeys("Test data-Desc1");
		driver.findElementById("createLeadForm_importantNote").sendKeys("testImportfield");
		
		Select SelMarketCamp = new Select(driver.findElementById("createLeadForm_marketingCampaignId"));
		SelMarketCamp.selectByVisibleText("Demo Marketing Campaign");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("L");
		driver.findElementById("createLeadForm_birthDate").sendKeys("01/01/1995");
		driver.findElementById("createLeadForm_departmentName").sendKeys("Elect");
		
		Select selPreCurrency=	new Select(driver.findElementById("createLeadForm_currencyUomId"));
		selPreCurrency.selectByVisibleText("BSD - Bahaman Dollar");
		
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("25");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("4");
		
		//Step6b*******************contact information***************************************************************
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").clear();
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("+1");
		
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("216");
		
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("440");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("TestSam@gmail.com");
		

		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("1234567890");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("SamAssistant");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("http://dummyurl.com");
		
		//Step6c*******************Primary Addresss***************************************************************
		driver.findElementById("createLeadForm_generalToName").sendKeys("primarynametest");
		
		driver.findElementByName("generalAddress1").sendKeys("ColumbusRoad");
		driver.findElementById("createLeadForm_generalCity").sendKeys("Naperville");
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("9999");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("8999");
		
		driver.findElementById("createLeadForm_generalAttnName").sendKeys("GenAtten");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Address2");
		Select selState=new Select(driver.findElementById("createLeadForm_generalStateProvinceGeoId"));
		selState.selectByVisibleText("Arkansas");
		
		Select selCountry=	new Select(driver.findElementById("createLeadForm_generalCountryGeoId"));
		selCountry.selectByVisibleText("United States");
		
		driver.findElementByClassName("smallSubmit").click();
		//Step7********************Duplicate Lead button***************************************************************
		driver.findElementByLinkText("Duplicate Lead").click();
		
		String existingCompanyName= driver.findElementById("createLeadForm_companyName").getAttribute("value");
		
		
		
		System.out.println("Existing Company Name"+existingCompanyName);
		
		driver.findElementById("createLeadForm_companyName").clear();
		driver.findElementById("createLeadForm_companyName").sendKeys("Airtel");
		
		String modifiedCompanyname = driver.findElementById("createLeadForm_companyName").getAttribute("value");
		
		if(!existingCompanyName.equalsIgnoreCase("Verizon"))
		{
			
			System.out.println("Company name modified from "+"\t"+existingCompanyName+"\n"+" to new company name"+"\t"+ modifiedCompanyname);
			
			driver.findElementByClassName("smallSubmit").click();
			driver.close();
			
		}
		
		else
			System.out.println("Company name not modified");
		
		
	}

}
