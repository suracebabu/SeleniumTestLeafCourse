package week4.day2.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDealAssig2 {

	public static void main(String[] args) throws InterruptedException,NumberFormatException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
				
		WebElement mensFashion = driver.findElementByLinkText("Men's Fashion");
		// WebElement shirts = driver.findElementByXPath("(//span[text()='Shirts'and @class='linkTest'])[1]");	
		
		WebElement sportShoes = driver.findElementByXPath("(//span[text()='Sports Shoes'])[1]");
		Actions builder = new Actions(driver);
		builder.moveToElement(mensFashion).perform();
		Thread.sleep(2000);
		builder.moveToElement(sportShoes).click(sportShoes).perform();
		
		driver.findElementByXPath("//div[text()='Training Shoes']").click();
		driver.findElementByXPath("//span[text()='Sort by:']/following-sibling::div").click();
		driver.findElementByXPath("//li[text()[normalize-space()='Price Low To High']]").click();
		
		
	 List<WebElement> shoePriceList = driver.findElementsByXPath("//span[@class='lfloat product-price']");
	 List<Integer> priceValueList = new ArrayList<Integer>();
	 
	int noOfShoes = shoePriceList.size();
	 
	for(int i=0;i<noOfShoes;i++)
				
	{
		String priceString =shoePriceList.get(i).getText().replaceAll("[Rs. ,]","");
		Integer priceValue=Integer.valueOf(priceString);
		priceValueList.add(priceValue);
		System.out.println(priceString);
	}
		 
          List<Integer> copy = new ArrayList(priceValueList);
          Collections.sort(copy);
         if(!copy.equals(priceValueList)){
        	System.out.println("The price values are not sorted");
        	System.out.println("Sorted Price List"+copy);
        	System.out.println("Sorted Display"+priceValueList);
        	}
         
         else
         {
        	 System.out.println("The prices are sorted correctly");
         }
        		 
     driver.findElementByXPath("//input[@placeholder='Search within category']").sendKeys("blue",Keys.ENTER);
     
     Thread.sleep(3000);
     WebElement firstImage = driver.findElementByXPath("(//div[@data-vendorcode='Sa490a'])[1]");
     builder.moveToElement(firstImage).build().perform();
     
 	WebElement quickView = driver.findElementByXPath("(//div[contains(text(),'Quick View')])[1]");
    Thread.sleep(3000);
	builder.moveToElement(firstImage).moveToElement(quickView).click().build().perform();
	
	Thread.sleep(3000);
 	String selectedItemPrice = driver.findElementByXPath("//span[@class='payBlkBig']").getText();
 	System.out.println(selectedItemPrice);

}}
