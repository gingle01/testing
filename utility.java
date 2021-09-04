package config_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utility {
	

	public static String gettestdata(int rowindex,int cellindex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file =new FileInputStream("C:\\Users\\Shailesh\\eclipse-workspace\\demoproject\\testdata\\parameter.xlsx");
		 Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		 String value=sh.getRow(rowindex).getCell(cellindex).getStringCellValue();
		 return value;
	}


public static void capturescreenshot(WebDriver driver,int id) throws IOException
{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File dest=new File("C:\\Users\\Shailesh\\eclipse-workspace\\demoproject\\screenshot\\testcaseid"+id+".jpg");
	FileHandler.copy(src, dest);
}

public static String readPropertyFiledata(String key) throws IOException
{
	Properties obj=new Properties();
	FileInputStream file =new FileInputStream("C:\\Users\\Shailesh\\eclipse-workspace\\demoproject\\propertyfile..properties");
     obj.load(file);
     String value=obj.getProperty(key);
     return value;

}



}


