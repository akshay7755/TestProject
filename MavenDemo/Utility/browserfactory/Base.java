package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.ParabankReg;

public class Base {
	public static void main(String[]args) {

	
	//public WebDriver openchromebrowser() {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\chromedriver\\112\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		driver.manage().window().maximize();
		
		ParabankReg k=new ParabankReg(driver);
		k.reglnkclick();
		k.reginfo();
		
		
	
		//return driver;
	
	//public void CloseBrowser(WebDriver driver) {
		
		//driver.quit();
  
	}
}
