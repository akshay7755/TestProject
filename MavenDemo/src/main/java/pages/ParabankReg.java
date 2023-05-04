package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParabankReg {
	
	//declaration
		//Register
		@FindBy (xpath="//*[@id='loginPanel']/p[2]/a") private WebElement reglnk;
		@FindBy (id="customer.firstName") private WebElement fname;
		@FindBy (id="customer.lastName") private WebElement lname;
		@FindBy (id="customer.address.street") private WebElement address;
		@FindBy (id="customer.address.city") private WebElement city;
		@FindBy (id="customer.address.state") private WebElement state;
		@FindBy (id="customer.address.zipCode") private WebElement zip;
		@FindBy (name="customer.phoneNumber") private WebElement phone;
		@FindBy (id="customer.ssn") private WebElement ssn;
		@FindBy (id="customer.username") private WebElement uname;
		@FindBy (name="customer.password") private WebElement pwd;
		@FindBy (id="repeatedPassword") private WebElement rpwd;
		@FindBy (xpath="//input[@value='Register']") private WebElement rbtn;
		
		
	  //initialisation
		public ParabankReg(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		
		//usage
		public void reglnkclick() 
		{
			reglnk.click();
		
	  }
		public void reginfo() 
		{
			fname.sendKeys("Akshay");
			lname.sendKeys("Bhavare");
			address.sendKeys("Hadapsar, pune");
			city.sendKeys("pune");
			state.sendKeys("Maharashtra");
			zip.sendKeys("411028");
			phone.sendKeys("8600087412");
			ssn.sendKeys("123456789");
			uname.sendKeys("parabank@789");
			pwd.sendKeys("parabank@987");
			rpwd.sendKeys("parabank@987");
			rbtn.click();
			
			
			
			
		}
	}

