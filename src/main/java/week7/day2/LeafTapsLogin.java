package week7.day2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class LeafTapsLogin {

	@Test
	
	public void runLogin() throws IOException{
		
		
	// step1: set the path of the properties file
	FileInputStream fis = new FileInputStream("");
	
	// step2: create object for properties
	Properties prop = new Properties();
	
	// step3: Load the property file
	prop.load(fis);
	
	// to read a particular value from property file
	//System.out.println(prop.getProperty("password"));
		
	}
}
