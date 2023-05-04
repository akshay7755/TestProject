package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePopup {
	
	//initialisation
	
	@FindBy (xpath="//div[@role='button']") private WebElement popup;

	//button[@class='_a9-- _a9_1']
	
	
	//declaration
	public HomePopup(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//usage
	public void remove()
	{	
		popup.click();
	}
}
