package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Configurations.PropertyFileReader;
import Errors.ScreenShots;
import Module1.HomePage;
import Module1.NewLogin;
import Module1.OpenNewAcc;
import browserfactory.BaseClass2;
import browserfactory.BaseClass2Property;

public class NewAccountTest {
	WebDriver driver;
	HomePage home;
	//NewLogin login;
	
	BaseClass2Property base;
	OpenNewAcc acc;
	PropertyFileReader file;
	
	
  	    @BeforeClass
	    public void OpenBrowser() {
		base=new BaseClass2Property();
		driver=base.OpenChromeBrowser();
	}
	
	   @BeforeMethod
       public void LoginNewUser() {
	   acc=new OpenNewAcc(driver);
	   acc.setUsername();
	   acc.setPassword();
	   acc.ClickOnLoginButton();
	   }
	
	@org.testng.annotations.Test
	public void CreateNewSubAccount() {
		try {
			home=new HomePage(driver);
			home.OpenNewAccountClick();
		}catch(Exception e) {
			e.printStackTrace();
			ScreenShots s=new ScreenShots();
			s.TakeScreenshot(driver, "5002");
		
		}
	}
	}
	
	/*	@AfterMethod
		public void logout() {
			 home.LogOuTOmain();
		}
		
		public void CloseBrowser() {
			base.CloseChromeBrowser(driver);
		}

}*/
