package testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import com.resources.BaseClass;
import com.resources.commonMethods;
import com.resources.constants;

import PageObjectModel.HomePageObjects;
import PageObjectModel.LoginPageObjects;

public class LoginTestCases extends BaseClass {

	// HomePageObjects hpo = new HomePageObjects(driver);
	@Test(priority=2)
	public void verifyLoginWithValidData() throws IOException {
		// initializedriver(); We have commented this because we have declare this
		// BeforeClass in BaseClass

		// driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		// We have commented this
		// -because we have written this in HomePageObjects, so here we will call just
		// method

		LoginPageObjects lpo = new LoginPageObjects(driver);

		lpo.enterEmail().clear();
		lpo.enterEmail().sendKeys(RegisterTestCases.randomEmail);
		System.out.println(RegisterTestCases.randomEmail);

		lpo.enterpassword().clear();
		lpo.enterpassword().sendKeys(constants.password);

		lpo.clickonloginbutton().click();

		//SoftAssert as = new SoftAssert();

		//String AccountUrl = "https://naveenautomationlabs.com/opencart/index.php?route=account/account";

		commonMethods.handleAssertions(driver.getCurrentUrl(), constants.AccountUrl);

		//as.assertAll();
		
		commonMethods.expliciteWaits(driver,3,lpo.clickonlogoutbutton() );
		
		lpo.clickonlogoutbutton().click();
	}

	@Test(priority=1)
	public void verifyLoginWithInvalidData() {
		HomePageObjects hpo = new HomePageObjects(driver);

		hpo.clickOnMyAccount().click();
		hpo.clickOnLogin().click();
		
		LoginPageObjects lpo = new LoginPageObjects(driver);

		lpo.enterEmail().sendKeys(RegisterTestCases.randomEmail);
		System.out.println(RegisterTestCases.randomEmail);

		lpo.enterpassword().sendKeys(constants.Invalidpasssword);

		lpo.clickonloginbutton().click();

		//SoftAssert as = new SoftAssert();

		//String loginErrorMsg = "Warning: No match for E-Mail Address and/or Password.";

		commonMethods.handleAssertions(lpo.loginPageErrorMsg().getText(), constants.loginErrorMsg);

		//as.assertAll();
	}

}
