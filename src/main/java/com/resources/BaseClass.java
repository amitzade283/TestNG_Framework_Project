package com.resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	 public WebDriver driver;
	 public Properties prop;
	 	
	public void initializedriver() throws IOException
	{   // To read data of the data.properties file
		FileInputStream fis = new FileInputStream(
			//--This is user directory path--   --This path will common for all users--
				System.getProperty("user.dir")+("\\src\\main\\java\\com\\resources\\data.properties"));
	
	    // To access the data.properties file, an object is created of Properties class
		prop = new Properties();
		
		// To read the keys and its values in the data.properties file
		// Reads a property list (key and element pairs) from the input byte stream.
		prop.load(fis);
		
		// To fetch the specific key in the data.properties file and it is returning a value, hence it is storing in a string
		//prop.getProperty("browser");
		String browserName = prop.getProperty("browser");
		
		if (browserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}	
	}
	
	@BeforeClass
	public void launchBrowser() throws IOException
	{
		initializedriver();
		
		driver.manage().window().maximize();
		
		driver.get(prop.getProperty("url"));
	}
	
	public String generateRandomEmail() 
	{
		
		return System.currentTimeMillis() + "@gmail.com";
	}
	
	
	
}
