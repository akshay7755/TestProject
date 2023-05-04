package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//declaration
	@FindBy (id="user-name") private WebElement uname;
	@FindBy (id="password") private WebElement pwd;
	@FindBy (id="login-button") private WebElement btn;
	
	//initialisation
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//usage
	public void setLoginpageusername()
	{
		uname.sendKeys("standard_user");
	}
	
	public void setloginPagePassword()
	{
		pwd.sendKeys("secret_sauce");
	}
	
	public void clickLoginPageBtn()
	{
		btn.click();
	}

}
