package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Library implements IAutoConstant {
	
	public static String getPropertyValue(String propertyname){
		String property="";
		Properties prop = new Properties();
		FileInputStream fileobj;
		try {
			fileobj = new FileInputStream(CONFIG_PATH);
			prop.load(fileobj);
			 property = prop.getProperty( propertyname);
		} catch (Exception e) {
			
		}
		return property;
		}
	public static String getCellValue( String sheet,int row,int cell) {
		String value="";
		try {
			Workbook wb=WorkbookFactory.create(new FileInputStream(EXCEL_PATH));
                         value = wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		} catch (Exception e) {
			
		}
		return value;
	}
	public static int getRowCount(String sheet) {
		int lastRowNum=0;
	
		try {
			Workbook wb=WorkbookFactory.create(new FileInputStream(EXCEL_PATH));
                           lastRowNum = wb.getSheet(sheet).getLastRowNum();
		} catch (Exception e) {
			}
	return   lastRowNum;

}
	  public static void takeScreenshot(WebDriver driver,String testmethodname ) {
		   Date d = new Date();
		  String currentDateTime = d.toString().replaceAll(":", "_");
		  
		  TakesScreenshot ts=(TakesScreenshot)driver;
                File srcFile = ts.getScreenshotAs(OutputType.FILE);
                File desfile = new File(SCREEN_SHOT+testmethodname+":"+currentDateTime+"fabebook-login.png");
             try {
				Files.copy(srcFile,desfile);
			} catch (Exception e) {
				
			}
                
}	
	
}	
	
	
	
	
	
	
	
	
	