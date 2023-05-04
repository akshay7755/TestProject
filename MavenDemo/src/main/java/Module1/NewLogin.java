package Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewLogin {
	
	@FindBy(xpath="//input[@name='username']") private WebElement Uput;
	@FindBy(xpath="//input[@name='password']") private WebElement Pput;
	@FindBy(xpath="//input[@value='Log In']") private WebElement Btnput;

	
	public NewLogin (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void newuserid(String newuid) {
		Uput.sendKeys(newuid);
	}
	
	public void newpassword(String newpwd) {
		Pput.sendKeys(newpwd);
	}
	
	public void newbtn() {
		Btnput.click();
	}
	
}
