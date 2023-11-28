package com.resources;

public class constants {
	
	// Registration Page Data
	// #verifyRegistrationWithInValidData
	public static String firstname = "TestFirst";
	public static String lastname = "TestLast";
	public static String invalidEmail = "test123gmail.com";
	public static String telephone = "123456789";
	public static String password = "Test@123";
	public static String confirmpassword = "Test@123";
	
	// #verifyRegistrationWithBlankData
	public static String firstname1 = "";
	public static String lastname1 = "";
	public static String Email1 = "";
	public static String telephone1 = "";
	public static String password1 = "";
	public static String confirmpassword1 = "";
	
	// #verifyRegistrationWithExistingData
	public static String existingEmail = "Test00@gmail.com";
		
	// Registration Page Assertions
	public static String AccountsuccessUrl = "https://naveenautomationlabs.com/opencart/index.php?route=account/success";
	public static String RegistrationPageurl = "https://naveenautomationlabs.com/opencart/index.php?route=account/register";
	
	public static String FirstNameErrorMsg = "First Name must be between 1 and 32 characters!";
	public static String LastNameErrorMsg = "Last Name must be between 1 and 32 characters!";
	public static String EmailErrorMsg = "E-Mail Address does not appear to be valid!";
	public static String TelephoneErrorMsg = "Telephone must be between 3 and 32 characters!";
	public static String PasswordErrorMsg = "Password must be between 4 and 20 characters!";
	public static String PrivacyPolicyErrorMsg = "Warning: You must agree to the Privacy Policy!";
	
	public static String ExistingEmailErrorMsg = "Warning: E-Mail Address is already registered!";
	
	
	// Login Page Test Data
	public static String Invalidpasssword = "Test123";
	
	// Login Page Assertions
	public static String AccountUrl = "https://naveenautomationlabs.com/opencart/index.php?route=account/account";
	public static String loginErrorMsg = "Warning: No match for E-Mail Address and/or Password.";

}
