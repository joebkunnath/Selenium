package com.crm.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.crm.qa.base.Base;

public class TestUtil extends Base{

	public static long PAGE_TIME_OUT = 20;
	public static long IMPLICIT_WAIT = 10;
	public static String TESTDATA_SHEET_PATH = "/Users/joe/Selenium/eclipse-workspace/POMFramework/DataDriven/src/main/java/com/crm/qa/testdata/TestData.xlsx";
	static Workbook book;
	static Sheet sheet;
	
	public void switchToFrame() {
		driver.switchTo().frame("");
	}
	
	public static Object[][] getTestData(String Sheetname){
		
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
//			XSSFWorkbook wb = new XSSFWorkbook(file); 
//			XSSFSheet sheet = wb.getSheetAt(0); 
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			book = WorkbookFactory.create(file);
		}catch (InvalidFormatException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		sheet =book.getSheet(Sheetname);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i = 0; i< sheet.getLastRowNum();i++) {
			for(int j=0;j< sheet.getRow(0).getLastCellNum();j++) {
				data[i][j] = sheet.getRow(i+1).getCell(j).toString().trim();
				System.out.println(data[i][j]);
			}
		}
		
		return data;
		
	}
}
