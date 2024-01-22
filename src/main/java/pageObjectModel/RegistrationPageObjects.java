package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPageObjects {
	
	public WebDriver driver; // This driver is null
	
	private By FirstName = By.xpath("//input[@name='firstname']"); 	
	private By LastName = By.xpath("//input[@name='lastname']");	
	private By Email = By.xpath("//input[@name='email']");	
	private By Telephone = By.xpath("//input[@name='telephone']");	
	private By Password = By.xpath("//input[@name='password']");	
	private By ConfirmPassword = By.xpath("//input[@name='confirm']");	
	private By SubscribeButton = By.xpath("(//input[@value='1'])[2]");	
	private By PrivacyPolicyCheckBox = By.xpath("//input[@name='agree']");	
	private By ContinueButton = By.xpath("//input[@type='submit']");
	
	//private By RegistrationSucceessMessage = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
	
	private By ExistingEmailWarning = By.xpath("//div[contains(text(),' Warning: E-Mail Address is already registered!')]");
	
	// Error Message of Registration With Blank Data
    private By FirstNameErrorMsg = By.xpath("(//div[@class='text-danger'])[1]");
    private By LastNameErrorMsg = By.xpath("(//div[@class='text-danger'])[2]");
    private By EmailErrorMsg = By.xpath("(//div[@class='text-danger'])[3]");
    private By TelephoneErrorMsg = By.xpath("(//div[@class='text-danger'])[4]");
    private By PasswordErrorMsg = By.xpath("(//div[@class='text-danger'])[5]");
    private By CnfPasswordErrorMsg = By.xpath("(//div[@class='text-danger'])[6]");
    private By PrivacyPolicyErrorMsg = By.xpath("//div[contains(text(),' Warning: You must agree to the Privacy Policy!')]");
	
	// We have declare the driver above which is null.
	// So, We have assign the value of driver2 which comes from BaseClass through the RegistrationTestCases class
	// -by creating the constructor below. So now driver of this class have value or scope.
	public RegistrationPageObjects(WebDriver driver2) {
		
		this.driver = driver2;
	}

	public WebElement enterFirstName()
	{
		return driver.findElement(FirstName);
	}
	
	public WebElement enterLastName()
	{
		return driver.findElement(LastName);
	}
	
	public WebElement enterEmail()
	{
		return driver.findElement(Email);
	}
	
	public WebElement enterTelephone()
	{
		return driver.findElement(Telephone);
	}
	
	public WebElement enterPassword()
	{
		return driver.findElement(Password);
	}
	
	public WebElement enterConfirmPassword()
	{
		return driver.findElement(ConfirmPassword);
	}
	
	public WebElement SelectSubscribeButton()
	{
		return driver.findElement(SubscribeButton);
	}
	
	public WebElement SelectPrivacypolicyCheckBox()
	{
		return driver.findElement(PrivacyPolicyCheckBox);
	}
	
	public WebElement ClickonContinueButton()
	{
		return driver.findElement(ContinueButton);
	}
	
	/*
	 * public WebElement RegistrationSucceessMessage() { return
	 * driver.findElement(RegistrationSucceessMessage); }
	 */
	
	public WebElement ExtEmail_Warning()
	{
		return driver.findElement(ExistingEmailWarning);
	}
	
	public WebElement FirstN_ErrMsg()
	{
		return driver.findElement(FirstNameErrorMsg);
	}
	
	public WebElement LastN_ErrMsg()
	{
		return driver.findElement(LastNameErrorMsg);
	}
	
	public WebElement Email_ErrMsg()
	{
		return driver.findElement(EmailErrorMsg);
	}
	
	public WebElement TPhone_ErrMsg()
	{
		return driver.findElement(TelephoneErrorMsg);
	}
	
	public WebElement PW_ErrMsg()
	{
		return driver.findElement(PasswordErrorMsg);
	}
	
	public WebElement CnfPW_ErrMsg()
	{
		return driver.findElement(CnfPasswordErrorMsg);
	}
	
	public WebElement PrivacyP_ErrMsg()
	{
		return driver.findElement(PrivacyPolicyErrorMsg);
	}
			
}
