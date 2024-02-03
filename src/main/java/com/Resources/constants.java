package com.Resources;

public class constants {
	
	    // Registration With Blank Data
	    public static String firstname = "";
	    public static String lastname = "";
	    public static String EmailAddr = "";
	    public static String telephone = "";
	    public static String password = "";
	    public static String confirmPassword = "12";
	    
	    // Error Message of Registration With Blank Data
	    public static String FirstNameErrorMsg = "First Name must be between 1 and 32 characters!";
	    public static String LastNameErrorMsg = "Last Name must be between 1 and 32 characters!";
	    public static String EmailErrorMsg = "E-Mail Address does not appear to be valid!";
	    public static String TelephoneErrorMsg = "Telephone must be between 3 and 32 characters!";
	    public static String PasswordErrorMsg = "Password must be between 4 and 20 characters!";
	    public static String CnfPasswordErrorMsg = "Password confirmation does not match password!";
	    public static String PrivacyPolicyErrorMsg = "Warning: You must agree to the Privacy Policy!";
	    
	    // Registration With Existing Data
	    public static String firstname1 = "TestFirst";
	    public static String lastname1 = "TestLast";
	    public static String EmailAddr1 = "hgfghf@email.com";
	    public static String telephone1 = "123456789";
	    public static String password1 = "Test@123";
	    public static String confirmPassword1 = "Test@123";
	    public static String EmailExistWaring = "Warning: E-Mail Address is already registered!";
	    
	    // Registration With Invalid Data
	    public static String firstname2 = "TestFirst";
	    public static String lastname2 = "TestLast";
	    public static String EmailAddr2 = "Testmail.com";
	    public static String telephone2 = "123456789";
	    public static String password2 = "Test@123";
	    public static String confirmPassword2 = "Test@123";
	    public static String InvalidUrl = "https://naveenautomationlabs.com/opencart/index.php?route=account/register";
	    
	    // Registration With Valid Data
	    public static String firstname3 = "TestFirst";
	    public static String lastname3 = "TestLast";
	    public static String telephone3 = "123456789";
	    public static String password3 = "Test@123";
	    public static String confirmPassword3 = "Test@123";
	    public static String SuccessUrl = "https://naveenautomationlabs.com/opencart/index.php?route=account/success";
	    
	    // Login With non registered Email Address
	    public static String EmailAddr4 = "Test1100@gmail.com";
	    public static String password4 = "Test@123";
	    public static String Non_RegisteredEmailUrl = "https://naveenautomationlabs.com/opencart/index.php?route=account/login";
	    
	    // Login With Invalid Data
	    public static String EmailAddr5 = "hgfghemail.com";
	    public static String password5 = "Test@123";
	    public static String InvalidCredErrorMsg = "Warning: No match for E-Mail Address and/or Password.";
	    public static String LoginAttemptExceedsErrMsg = "Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.";
	    
	    // Login With valid Data
	    public static String password6 = "Test@123";
	    public static String LoginSuccessUrl = "https://naveenautomationlabs.com/opencart/index.php?route=account/account";
	    
	    // Currency Drop Down is Clickable
	    public static String CurrencyEUROText = "€ Euro";
	    public static String CurrencyGBPText = "£ Pound Sterling";
	    public static String CurrencyUSDText = "$ US Dollar";
	    
	    // All Links on Home page
	    public static int ResponseCode = 200;
	    
	    
  
}
