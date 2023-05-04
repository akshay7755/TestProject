package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFB {
	//declaration
	@FindBy (xpath="//input[@aria-label='Phone number, username, or email']") private WebElement uname;
	@FindBy (xpath="//input[@aria-label='Password']") private WebElement passwd;
	@FindBy (xpath="//button[@class='_acan _acap _acas _aj1-']") private WebElement btn;
	
	//initialisation
	public LoginFB(WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
	}

	
	//usage
	public void putuname()
	{
		uname.sendKeys("akshay.ab1994@gmail.com");
	}
	
	public void putpwd()
	{
		passwd.sendKeys("Akshay@1994");
	}
	
	public void clickbtn()
	{
		btn.click();
	}
	
	
}
