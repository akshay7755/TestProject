package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Module1.NewLogin;
import Parameterization.ExcelReader;
import browserfactory.BaseClass2;

public class NewLoginTest {
	
	WebDriver driver;
	BaseClass2 Base;
	NewLogin NL;

	
	@BeforeClass
	public void OpenBrowser() {
		Base= new BaseClass2() ;
	    driver = Base.OpenChromeBrowser();
	}
	
	    @DataProvider
		public Object[][] getData() throws EncryptedDocumentException, IOException{
		ExcelReader E=new ExcelReader();
		Object[][] data= E.getTestData("newlogin");
		return data;
}
	    @Test(dataProvider="getData")
	    public void NewRegUser(String newuid, String newpwd) {
	    	
	    	NL=new NewLogin(driver);
	    	
	    	NL.newuserid(newuid);
	        NL.newpassword(newpwd);
	        NL.newbtn();
	    
	    
	    }
	  //  @AfterClass
	//	public void CloseBrowser() {
	//	Base.CloseBrowser(driver);
		
	    
	      
	    
}
