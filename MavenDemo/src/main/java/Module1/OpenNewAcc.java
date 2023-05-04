package Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenNewAcc {

	@FindBy(xpath="//input[@name='username']") private WebElement Uput;
	@FindBy(xpath="//input[@name='password']") private WebElement Pput;
	@FindBy(xpath="//input[@value='Log In']") private WebElement Btnput;

	
	public OpenNewAcc (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	Configurations.PropertyFileReader p=new Configurations.PropertyFileReader();
	
	
	public void setUsername() {
		Uput.sendKeys(p.getUidname());
	}
	
	public void setPassword() {
		Pput.sendKeys(p.getPwd());
	}
	
	public void ClickOnLoginButton() {
		Btnput.click();
	} 
	
}


