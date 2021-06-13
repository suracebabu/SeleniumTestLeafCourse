package org.testcase;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass{

	@Test(dataProvider ="sendData")
	//either we can use method name or send name of dataprovider
		public void runCreateTestLead(String company,String firstName,String lName,String pNumber) {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("company");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("firstName");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("lName");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("pNumber");
		driver.findElement(By.name("submitButton")).click();
		
}
	
	@DataProvider 
	//(name="fetchData")
	public String[][] sendData() throws IOException{

		ReadExcel readExcelObj = new ReadExcel();
		
		String[][] data = readExcelObj.excelData("CreateLeadTestData");
		
		return data;
	}
	
	
	
	
	
	
}




//String data[][]= new String [2][4];
//data[0][0]="TestLeaf";
//data[0][1]="Hari";
//data[0][2]="R";
//data[0][3]="99";
//
//data[1][0]="Infosys";
//data[1][1]="Ram";
//data[1][2]="B";
//data[1][3]="88713240893";
//
//return data;

