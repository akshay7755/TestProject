package Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	
	@FindBy(xpath="//input[@id='customer.firstName']") private WebElement Fname;
	@FindBy(xpath="//input[@id='customer.lastName']") private WebElement Lname;
	@FindBy(xpath="//input[@id='customer.address.street']") private WebElement Address;
	@FindBy(xpath="//input[@id='customer.address.city']") private WebElement City;
	@FindBy(xpath="//input[@id='customer.address.state']") private WebElement State;
	@FindBy(xpath="//input[@id='customer.address.zipCode']") private WebElement Zip;
	@FindBy(xpath="//input[@id='customer.phoneNumber']") private WebElement Phone;
	@FindBy(xpath="//input[@id='customer.ssn']") private WebElement Ssn;
	@FindBy(xpath="//input[@id='customer.username']") private WebElement Uid;
	@FindBy(xpath="//input[@id='customer.password']") private WebElement Pwd;
	@FindBy(xpath="//input[@id='repeatedPassword']") private WebElement Cpwd;
	@FindBy(xpath="//input[@value='Register']") private WebElement Resister;
	
	
	public RegistrationPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setFname() {
		Fname.sendKeys("Akshay");
	}
	
	public void setLname() {
		Lname.sendKeys("Bhavare");
	}

	public void setAddress() {
		Address.sendKeys("Hadapsar, pune");
	}

	public void setCity() {
		City.sendKeys("Pune");
	}

	public void setState() {
		State.sendKeys("Maharashtra");
	}

	public void setZip() {
		Zip.sendKeys("411028");
	}

	public void setPhone() {
		Phone.sendKeys("8600087412");
	}

	public void setSsn() {
		Ssn.sendKeys("123456789");
	}

	public void setUid() {
		Uid.sendKeys("Parabank@456");
	}

	public void setPwd() {
		Pwd.sendKeys("Parabank@654");
	}

	public void setCpwd() {
		Cpwd.sendKeys("Parabank@654");
	}

	public void setResister() {
		Resister.click();
	}



}
