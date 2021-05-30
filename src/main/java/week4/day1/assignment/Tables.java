package week4.day1.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
	    driver.get("http://leafground.com/pages/table.html");
	    
	    
	    List<WebElement> tableRows = driver.findElementsByXPath("//table[@id='table_id']//tr");
	    
	    int tableRowCount = tableRows.size();
	    
	    
	  List<WebElement> tableColumns = driver.findElementsByXPath("//table[@id='table_id']//tr[2]/td");
	    
	  int tableColumnCount = tableColumns.size();
	  
	  System.out.println("Number of table rows"+"\t"+ tableRowCount);
	  
	  System.out.println("Number of table rows"+"\t"+ tableColumnCount);
	  
	  int progressColumn=0;
	  int vitalColumn=0;
	  int lowestVitalRow=0;
	  int dataColumn=0;
	  
//	  List<String> progressElements= new ArrayList<>();
	  
	  for (int i=1;i<=tableRowCount;i++) {
		  
		  for (int j=1;j<=tableColumnCount;j++)
		  {
			  if(i==1) {
					String headerText= driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/th["+j+"]").getText();
					
					if(headerText.equals("Progress")) {
						
						System.out.println("print the column # of progress column"+j);
						
						progressColumn=j;
						
					}
					
					else if(headerText.equals("Vital Task")) {
						
						System.out.println("print the column # of vital column"+j);
						
						vitalColumn=j;
						
					}
					
			  
			  }
						  
						  else {
							  
							  System.out.println(driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td["+j+"]").getText());
						 
							String dataColumnText=driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td["+j+"]").getText();
							  
							  if(dataColumnText.equals("Learn to interact with Elements")) {
								  
								  					  
								  dataColumn=i; 
							 								  							  
							  }
			  
							  else if(j==progressColumn) {
								  
							String percentageValue=driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td["+j+"]").getText().replace("%","");
								
//							 progressElements.add(driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td["+j+"]").getText().replace("%",""));	  
							 								  							  
							if(percentageValue.equalsIgnoreCase("30")) {
								
								lowestVitalRow=i;
								
								System.out.println("print the Row # of Lowest vital Row"+lowestVitalRow);
								
							}
							  }
							  
						  
						  }
			  
		  }
		  
	  }
	  
	  
	  
	  System.out.println("The Progress value of Learn to interact with Elements"+"\n"+driver.findElementByXPath("//table[@id='table_id']//tr["+dataColumn+"]/td["+progressColumn+"]").getText());

	  Thread.sleep(3000);
      driver.findElementByXPath("//table[@id='table_id']//tr["+lowestVitalRow+"]/td["+vitalColumn+"]/input").click(); 
	  
	  
	// Collections.sort(progressElements);
//	  for(String progress:progressElements)
//	  {
//		  System.out.println(progress);
//		  
//		  
//	  }
	}

}
