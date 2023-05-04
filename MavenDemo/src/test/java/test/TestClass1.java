package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.LoginPage;


public class TestClass1 {
	
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver",
			"D:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com");
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
   LoginPage l=new LoginPage(driver);
   l.setLoginpageusername();
   l.setloginPagePassword();
   l.clickLoginPageBtn();
 

}
}