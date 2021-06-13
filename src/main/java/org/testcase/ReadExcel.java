package org.testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.bouncycastle.jcajce.provider.symmetric.AES.Wrap;

public class ReadExcel {

	public String[][] excelData(String fileName) throws IOException {
		// TODO Auto-generated method stub
		
		//setUp WorkBook Path 
		
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");
		//. is the rootFolder of the project
		
		// get into workSheet
		
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		int noOfRows= ws.getLastRowNum(); // getLastRowNum - won't include the header row
		
		System.out.println("No of Rows"+ noOfRows);
		
	   int noOfCells= ws.getRow(0).getLastCellNum();
	   
	   System.out.println("No of Cells"+noOfCells);
	   
	   String[][] data = new String[noOfRows][noOfCells];
		
		//
			for(int i=1;i<=noOfRows;i++) 
			{
		      System.out.println();
				for (int j=0;j<noOfCells;j++) {
			       String value = ws.getRow(i).getCell(j).getStringCellValue();
			       data[i-1][j]= ws.getRow(i).getCell(j).getStringCellValue();
			  	
		           System.out.print(value+"\t");
		           
		           System.out.println(data[i-1][j]);
				}
		
			
		
			}
		// wb.close;
	
			wb.close();
			return data;

	}

	
}
//get into Row, row index starts from 0...want to go to row 1
//XSSFRow row = ws.getRow(i);
//
//
////Step 4 - get into Cell
//
//XSSFCell cell = row.getCell(0);
//
//// read data from cell, method called cell.get string
//
//String  value= cell.getStringCellValue();
