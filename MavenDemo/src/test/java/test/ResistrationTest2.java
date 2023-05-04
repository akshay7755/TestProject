package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Errors.ScreenShots;
import Module1.HomePage;
import Module1.LoginPage;
import Module1.RegistrationPage;
import Module1.ResistrationPage2;
import Parameterization.ExcelReader;
import browserfactory.BaseClass2;

public class ResistrationTest2 {
	
	WebDriver driver;
	BaseClass2 Base;
	LoginPage Login;
	ResistrationPage2  R;
	HomePage Home;
	
	
	@BeforeClass
	public void OpenBrowser() {
		Base= new BaseClass2() ;
	    driver = Base.OpenChromeBrowser();//  in baseclass we taking WebDriver and return type is driver
	    
	}
	
	@DataProvider
	public Object[][] getData() throws EncryptedDocumentException, IOException{
	ExcelReader E=new ExcelReader();
	Object[][] data= E.getTestData("REG");
	return data;
	
}

			@Test(dataProvider="getData")
			
			
			public void ResisterUser(String Fname, String Lname, String Address, String City, String State, String Zip, String Phone, String Ssn, String Uid,String Pwd, String Cpwd, String TCID) throws IOException {   //method which we take here
		   
			try {
				
			//login page class method=ClickOnResisterBtn(), rsistration btn	
			Login = new LoginPage(driver); 
			Login.ClickOnResisterBtn();
			
			//resister class 
			R = new ResistrationPage2(driver);
			
			R.setFname(Fname);
			R.setLname(Lname);
			R.setAddress(Address);
			R.setCity(City);             
			R.setState(State);
			R.setZip(Zip);
			R.setPhone(Phone);
			R.setSsn(Ssn);
			R.setUid(Uid);
			R.setPwd(Pwd);
			R.setCpwd(Cpwd);
			R.setResister();
			
			//	Home.verifyLoginBytext();
			Home=new HomePage(driver);
			String Actual= Home.VerifyResistrationMSg();
			String Expected = "Your account was created successfully. You are now logged in.";
			Assert.assertEquals(Actual,Expected);
		  
		    Home.LogOuTOmain();
			}
		
			catch(Exception E)
			{
				E.printStackTrace();
				ScreenShots s=new ScreenShots();	
		    	s.TakeScreenshot(driver,"TCID");
			}
		
			
			}
			
	    //	@AfterClass
		//	public void CloseBrowser() {
			//Base.CloseBrowser(driver);
			
			
			
			}		
//	}
		


