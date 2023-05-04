package Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {    //click on resistration button
	@FindBy (xpath="//a[text()='Register']") private WebElement ResisterButton;
	
	
	public LoginPage (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void ClickOnResisterBtn() {
		ResisterButton.click();
	}

}
