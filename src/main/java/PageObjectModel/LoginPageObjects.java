package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	public WebDriver driver;
	
	// Here we have used Encapsulation as we have declared this followings xpaths as private and created public methods below
	private By email = By.xpath("//input[@name='email']");	
	private By password = By.xpath("//input[@name='password']");	
	//private By forgotpw = By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/forgotten'])[1]");	
	private By login = By.xpath("//input[@type='submit']");
	//private By loginErrormsg = By.xpath("//div[contains(text(),'Warning: No match for E-Mail Address and/or Password.')]");
	private By loginErrormsg = By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	private By logout = By.xpath("(//a[contains(text(),'Logout')])[2]"); 
	
	
	
	public LoginPageObjects(WebDriver driver2) {
		
		this.driver = driver2;
	}

	public WebElement enterEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement enterpassword()
	{
		return driver.findElement(password);
	}
	
	/*
	 * public WebElement clickonforgotpassword() { return
	 * driver.findElement(forgotpw); }
	 */

	public WebElement clickonloginbutton()
	{
		return driver.findElement(login);
	}
	
	public WebElement loginPageErrorMsg()
	{
		return driver.findElement(loginErrormsg);
	}

	public WebElement clickonlogoutbutton() {
		
		return driver.findElement(logout);
	}
	
}
