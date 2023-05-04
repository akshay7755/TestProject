package Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
//Your account was created successfully. You are now logged in.
	
	@FindBy (xpath="//p[text()='Your account was created successfully. You are now logged in.']") private WebElement Rmsg;
	@FindBy (xpath="//a[text()='Open New Account']") private WebElement OpenNA;
	@FindBy (xpath="//a[text()='Log Out']") private WebElement LogOut;
	
	
	
	    public  HomePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	    }
	
	    public void OpenNewAccountClick() {
	    	OpenNA.click();
		
	    }
	
	    public String VerifyResistrationMSg () {
		String Actual=Rmsg.getText();
		return Actual;
		
	    }
		public void LogOuTOmain()
		{
			LogOut.click();
		}
		// additional by me
		public void verifyLoginBytext() {
			String log=Rmsg.getText();
			System.out.println(log);
		}
		}
	
