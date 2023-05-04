package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Module1.HomePage;
import Module1.LoginPage;
import Module1.RegistrationPage;
import browserfactory.Base;
import browserfactory.BaseClass2;


/*public class ResistrationTest {
	
	WebDriver driver;
	BaseClass2 Base;
	LoginPage Login;
	RegistrationPage  R;
	HomePage Home;
	
	@BeforeClass
	public void OpenBrowser() {
		Base= new BaseClass2() ;
	    driver = Base.OpenChromeBrowser();
	}
		//	@Test
		//	public void ResisterUser() {   //method which we take here
		//	Login = new LoginPage(driver); //login page class method=ClickOnResisterBtn()
		//	Login.ClickOnResisterBtn();
			
			
			R = new RegistrationPage(driver);
			R.setFname();
			R.setLname();
			R.setAddress();
			R.setCity();             
			R.setState();
			R.setZip();
			R.setPhone();
			R.setSsn();
			R.setUid();
			R.setPwd();
			R.setCpwd();
			R.setResister();
			
			
			Home=new HomePage(driver);
			String Actual= Home.VerifyResistrationMSg();
			String Expected = "Your account was created successfully. You are now logged in.";
			Assert.assertEquals(Actual , Expected);
			System.out.println("successful page view");
			
		  
		    Home.LogOuTOmain();
			
			
			}
			
	    	@AfterClass
			public void CloseBrowser() {
			Base.CloseBrowser(driver);
			
			
			
			}		
	}*/
		



