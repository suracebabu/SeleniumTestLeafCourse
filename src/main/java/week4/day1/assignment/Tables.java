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
	    
	// Get Table Row count    
	    List<WebElement> tableRows = driver.findElementsByXPath("//table[@id='table_id']//tr");
	    
	    int tableRowCount = tableRows.size();
	
	 // Get Table Column count      
	    
	  List<WebElement> tableColumns = driver.findElementsByXPath("//table[@id='table_id']//tr[2]/td");
	    
	  int tableColumnCount = tableColumns.size();
	  
	  System.out.println("Number of table rows"+"\t"+ tableRowCount);
	  
	  System.out.println("Number of table rows"+"\t"+ tableColumnCount);
	  
	  int progressColumn=0;
	  int vitalColumn=0;
	  int lowestVitalRow=0;
	  int dataColumn=0;
	  ArrayList<Integer> list = new ArrayList();
	  
//	  List<String> progressElements= new ArrayList<>();
	  
	  for (int i=1;i<=tableRowCount;i++) {
		  
		  for (int j=1;j<=tableColumnCount;j++)
		  {
			
	// Get the table headers*******Read the header once		  
			  if(i==1) {
					String headerText= driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/th["+j+"]").getText();
					
					if(headerText.equals("Progress")) {
						
						System.out.println("print the column # of progress column"+j);
						
						progressColumn=j;
						
					}
	// Get the column number for the header - Vital task				
					else if(headerText.equals("Vital Task")) {
						
						System.out.println("print the column # of vital column"+j);
						
						vitalColumn=j;
						
					}
					
			  
			  }
		// Get the table data value				  
						  else {
							  
							  System.out.println(driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td["+j+"]").getText());
						 
							String dataColumnText=driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td["+j+"]").getText();
							// Get the Row number of data- Learn to interact with elements					  
							  if(dataColumnText.equals("Learn to interact with Elements")) {
				  					  
								  dataColumn=i; 
													  							  
							  }
							 // Read all values of Progress column 
							  else if(j==progressColumn) {
								  
							String percentageValue=driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td["+j+"]").getText().replace("%","");
								
//							 progressElements.add(driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td["+j+"]").getText().replace("%",""));	  
							 
							Integer percentage=Integer.valueOf(percentageValue);
								  
							  
							  list.add(percentage);
							   
							 
												
//							if(percentageValue.equalsIgnoreCase("30")) {
//								
//								lowestVitalRow=i;
//								
//								System.out.println("print the Row # of Lowest vital Row"+lowestVitalRow);
//								
//							}
							  }
							  
						  
						  }
			  
		  }
		  
	  }
	  
	  int minPercentage = list.indexOf(Collections.min(list));
	  
	  	  
	  System.out.println("The Progress value of Learn to interact with Elements"+"\n"+driver.findElementByXPath("//table[@id='table_id']//tr["+dataColumn+"]/td["+progressColumn+"]").getText());

	  Thread.sleep(3000);
  
      lowestVitalRow=(minPercentage+2);
      
     System.out.println(lowestVitalRow);
     
     Thread.sleep(3000);
      
      driver.findElementByXPath("//table[@id='table_id']//tr["+lowestVitalRow+"]/td["+vitalColumn+"]/input").click(); 
      
      System.out.println("Index of smallest number in collection"+minPercentage);
      
      for(Integer testP:list) {
    	  
    	  System.out.println(testP);
    	  
      }
	  
// Collections.sort(progressElements);
//	  for(String progress:progressElements)
//	  {
//		  System.out.println(progress);
//		  
//		  
//	  }
	}

}
