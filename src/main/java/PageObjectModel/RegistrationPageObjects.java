package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPageObjects {
	// We have declare here new driver, because we cannot inherit the parent driver anywhere
	public WebDriver driver;
	// Here we have used Encapsulation as we have declared this followings xpaths as private and created public methods below
	private By firstName = By.xpath("//input[@name='firstname']");	
	private By lastName = By.xpath("//input[@name='lastname']");	
	private By email = By.xpath("//input[@name='email']");	
	private By telephone = By.xpath("//input[@name='telephone']");	
	private By password = By.xpath("//input[@name='password']");	
	private By confirmpw = By.xpath("//input[@name='confirm']");	
	private By subscribe = By.xpath("//input[@value='0']");	
	private By privacyPolicy = By.xpath("//input[@name='agree']");	
	private By Continue = By.xpath("//input[@value='Continue']");
	
	//Error messages xpath
	private By firstNameErrorMsg = By.xpath("(//div[@class='text-danger'])[1]");	
	private By lastNameErrorMsg = By.xpath("(//div[@class='text-danger'])[2]");
	private By emailblankErrorMsg = By.xpath("(//div[@class='text-danger'])[3]");
	private By telephoneErrorMsg = By.xpath("(//div[@class='text-danger'])[4]");
	private By passwordErrorMsg = By.xpath("(//div[@class='text-danger'])[5]");
	private By privacypolicy = By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	private By emailexistErrorMsg = By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	
		
	// driver2 took the cope of driver from registerTestCases class
	// driver2 is the driver from registerTestCases class, just the name is changed automatically as we have create constructor
	// -in the RegisterTestCases class, but we can keep the same name from driver2 to driver
	// Assigned the value of driver of BaseClass to the driver2 of RegistrationPageObjects class and this driver2 is used in
	// -the following public methods, that indirectly used in RegisterTestCases class, because the driver in the
	// -RegistrationPageObjects class is null, it need some value
	public RegistrationPageObjects(WebDriver driver2) {
		this.driver = driver2; 
	}

	// We have created a public method to call firstname xpath in another class as a part of Encapsulation
	public WebElement enterfirstname()
	{
		return driver.findElement(firstName);
	}
	
	public WebElement enterlastname()
	{
		return driver.findElement(lastName);
	}
	
	public WebElement enteremail()
	{
		return driver.findElement(email);
	}
	
	public WebElement entertelephone()
	{
		return driver.findElement(telephone);
	}
	
	public WebElement enterpassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement enterconfirmpw()
	{
		return driver.findElement(confirmpw);
	}
	
	public WebElement clickOnSubscribe()
	{
		return driver.findElement(subscribe);
	}
	
	public WebElement clickOnPrivacyPolicy()
	{
		return driver.findElement(privacyPolicy);
	}
	
	public WebElement clickOnContinue()
	{
		return driver.findElement(Continue);
	}
	
	public WebElement FirstNameErrorMsg()
	{
		return driver.findElement(firstNameErrorMsg);
	}
	
	public WebElement LastNameErrorMsg()
	{
		return driver.findElement(lastNameErrorMsg);
	}
	
	public WebElement BlankEmailErrorMsg()
	{
		return driver.findElement(emailblankErrorMsg);
	}
	
	public WebElement telephoneErrorMsg()
	{
		return driver.findElement(telephoneErrorMsg);
	}
	
	public WebElement PasswordErrorMsg()
	{
		return driver.findElement(passwordErrorMsg);
	}
	
	public WebElement privacypolicyErrorMsg()
	{
		return driver.findElement(privacypolicy);
	}
	
	public WebElement ExisitingEmailErrorMsg()
	{
		return driver.findElement(emailexistErrorMsg);
	}
	
}