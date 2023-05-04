package swag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginSwag {
	
	@FindBy(xpath="//input[@id='user-name']") private WebElement uid;
	@FindBy(xpath="//input[@name='password']") private WebElement pwd;
	@FindBy(xpath="//input[@type='submit']") private WebElement btn;
	
	public LoginSwag (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void user(String Userid) {
		uid.sendKeys(Userid);
	}
	
	public void passwd(String Password) {
		pwd.sendKeys(Password);
	}
	
	public void clickLbtn() {
		btn.click();
	}
	

}
