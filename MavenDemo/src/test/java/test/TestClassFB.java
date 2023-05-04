package test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import pages.HomePopup;
import pages.LoginFB;

public class TestClassFB {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"D:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	//object of LogunFB class
	LoginFB f=new LoginFB(driver);
     f.putuname();
     f.putpwd();
     f.clickbtn();
     
    
   //object of  HomePopup
     HomePopup k=new HomePopup(driver);
     String mainid=driver.getWindowHandle();
     Set<String> allids=driver.getWindowHandles();
    		String[]arr=allids.toArray(new String[allids.size()]);
    		driver.switchTo().window(arr[1]);
  //  HomePopup k=new HomePopup(driver);
   // Actions action =new Actions(driver);
  //  WebElement h=driver.findElement(By.xpath("//div[@role='button']"));
   // action.moveToElement(h).build().perform();
    k.remove();
       
         
	}
}

