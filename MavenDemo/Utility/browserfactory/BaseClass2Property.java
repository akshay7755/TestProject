package browserfactory;

import org.apache.xmlbeans.impl.xb.xmlconfig.ConfigDocument.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass2Property {
	
	public WebDriver OpenChromeBrowser() {
		Configurations.PropertyFileReader p=new Configurations.PropertyFileReader();
		System.setProperty("webdriver.chrome.driver", p.getChromePath());
		WebDriver driver =new ChromeDriver();
		driver.get(p.getUrl());
		driver.manage().window().maximize();
		
		return driver;
		
	}
	public void CloseChromeBrowser(WebDriver driver) {
		driver.quit();
	}

}
