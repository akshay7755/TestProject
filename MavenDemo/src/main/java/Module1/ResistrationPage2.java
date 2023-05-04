package Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResistrationPage2 {
	
	@FindBy(xpath="//input[@id='customer.firstName']") private WebElement fname;
	@FindBy(xpath="//input[@id='customer.lastName']") private WebElement lname;
	@FindBy(xpath="//input[@id='customer.address.street']") private WebElement address;
	@FindBy(xpath="//input[@id='customer.address.city']") private WebElement city;
	@FindBy(xpath="//input[@id='customer.address.state']") private WebElement state;
	@FindBy(xpath="//input[@id='customer.address.zipCode']") private WebElement zip;
	@FindBy(xpath="//input[@id='customer.phoneNumber']") private WebElement phone;
	@FindBy(xpath="//input[@id='customer.ssn']") private WebElement ssn;
	@FindBy(xpath="//input[@id='customer.username']") private WebElement uid;
	@FindBy(xpath="//input[@id='customer.password']") private WebElement pwd;
	@FindBy(xpath="//input[@id='repeatedPassword']") private WebElement cpwd;
	@FindBy(xpath="//input[@value='Register']") private WebElement resister;
	
	
	public ResistrationPage2 (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void setFname(String Fname) {
		fname.sendKeys(Fname);
	}
	
	public void setLname(String Lname) {
		lname.sendKeys(Lname);
	}

	public void setAddress(String Address) {
		address.sendKeys(Address);
	}

	public void setCity(String City) {
		city.sendKeys(City);
	}

	public void setState(String State) {
		state.sendKeys(State);
	}

	public void setZip(String Zip) {
		zip.sendKeys("Zip");
	}

	public void setPhone(String Phone) {
		phone.sendKeys(Phone);
	}

	public void setSsn(String Ssn) {
		ssn.sendKeys("Ssn");
	}

	public void setUid(String Uid) {
		uid.sendKeys(Uid);
	}

	public void setPwd(String Pwd) {
		pwd.sendKeys(Pwd);
	}

	public void setCpwd(String Cpwd ) {
		cpwd.sendKeys(Cpwd);
	}

	public void setResister() {
		resister.click();
	}



}



