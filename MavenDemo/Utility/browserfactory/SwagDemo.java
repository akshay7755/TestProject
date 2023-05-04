package browserfactory;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagDemo {
	
	public WebDriver openSwag() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\chromedriver\\112\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
	}
	
	public void closeSwag(WebDriver driver) {
		driver.quit();
	}

}
