package com.resources;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class commonMethods {
	
	// Assertion Method
	public static void handleAssertions(String actualresult, String expectedresult)
	{
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualresult, expectedresult);
		sa.assertAll();
	}
	
	// Selenium Wait Method
	public static void expliciteWaits(WebDriver driver,int sec, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}	

}
