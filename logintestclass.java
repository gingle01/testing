package modulelogin1_12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import config_file.baseclass;
import config_file.utility;
import module_login.homekitepage;
import module_login.loginpage1;
import module_login.loginpage2;
import module_login.ordermodule;

public class logintestclass extends baseclass
{
	loginpage1 login1;
	loginpage2 login2;
	homekitepage home;
	int tcid;
	ordermodule order1;
	@BeforeClass
	
	public void openbrowser() throws EncryptedDocumentException, IOException
	{

			  initializebrowser();
			
	 login1=new loginpage1(driver);
	 login2 =new loginpage2(driver);
	 home=new homekitepage(driver);
	 order1=new ordermodule(driver);
	
	}
	
	@BeforeMethod
	
	public void loginbrowser() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login1.enterusername(utility.readPropertyFiledata("UN"));
		login1.enterpassword(utility.readPropertyFiledata("PWD"));
	    login1.clicklogin();
	    Thread.sleep(3000);
	    login2.enterpin(utility.readPropertyFiledata("PIN"));
	login2.clickcontinue();
	
	Thread.sleep(3000);
	}
	
	@Test
	
	public void verifyPN() throws EncryptedDocumentException, IOException, InterruptedException
	{
		 tcid=200;
		String actuserid=home.verifyusername();
		String expuserid=utility.readPropertyFiledata("expresult");
		Assert.assertEquals(actuserid, expuserid);
		Reporter.log("verify user profile name",true);
		
		//utility.capturescreenshot(driver,tcid);
		
		Thread.sleep(2000);
	}
	
//	@Test
//	
//	public void getorders() throws InterruptedException
//	{
//		Thread.sleep(4000);
//		order1.selectorder();
//		Reporter.log("below is all selected and rejected order ",true);
//		
//	}
	
	@AfterMethod
	
	public void logoutbrowser(ITestResult result) throws InterruptedException, IOException
	{
		Reporter.log("logout browser",true);
//		Reporter.log("-capture screenshot ---",true);
//	if(result.getStatus()==ITestResult.FAILURE)
//	{
//		utility.capturescreenshot(driver, tcid);
//	}
		Thread.sleep(3000);
	}
	
	
	@AfterClass
	
	public void closebrowser() throws InterruptedException
	{
		Thread.sleep(3000);
	driver.close();
	}
	
}
