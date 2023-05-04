package SwagTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Parameterization.SwagExcell;
import browserfactory.SwagDemo;
import swag.LoginSwag;

public class TestingSwag {
	
	WebDriver driver;
	SwagDemo swag;
	LoginSwag ls;
	
	
	@BeforeClass
	public void  openBrowser() {
		swag= new SwagDemo();
	    driver=swag.openSwag();
	}
	
	@DataProvider
	public Object[][] getData() throws EncryptedDocumentException, IOException{
		SwagExcell E=new SwagExcell();
		Object [][]data=E.getSwagDeta();
		return data;
	}
	
	
	@Test(dataProvider="getData")
	public void infoLogin(String Userid, String Password) {
	
	 ls=new LoginSwag(driver);
     ls.user(Userid);
     ls.passwd(Password);
     ls.clickLbtn();
	
	}
	

	@AfterClass
	public void closeSwag() {
	swag.closeSwag(driver);
}
}
