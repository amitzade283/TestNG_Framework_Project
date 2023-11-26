package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {
	
	public WebDriver driver;
	// Here we have used Encapsulation as we have declared this followings xpaths as private and created public methods below
	private By myAccount = By.xpath("//i[@class='fa fa-user']");	
	private By register = By.xpath("//a[contains(text(),'Register')]");	
	private By login = By.xpath("//a[contains(text(),'Login')]");
	
	public HomePageObjects (WebDriver driver2)
	{
		this.driver = driver2;
	}
	
	public WebElement clickOnMyAccount()
	{
		return driver.findElement(myAccount);
	}
	
	public WebElement clickOnRegister()
	{
		return driver.findElement(register);
	}
	
	public WebElement clickOnLogin()
	{
		return driver.findElement(login);
	}

}
