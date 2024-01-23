package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

	public WebDriver driver;
	public LoginPageObjects(WebDriver driver2) {
		
		this.driver = driver2;
	}
	
	private By EmailAddress = By.xpath("//input[@name='email']");	
	private By Password = By.xpath("//input[@name='password']");	
	private By Login = By.xpath("//input[@value='Login']");
	
	private By InvalidLoginErrorMessage = By.xpath("//div[contains(text(),' Warning: No match for E-Mail Address and/or Password.')]");
	private By LoginAttemptsExccedsMsg = By.xpath("//div[contains(text(),' Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.')]");
	
	public WebElement EnterEmailAddr()
	{
		return driver.findElement(EmailAddress);
	}
	
	public WebElement EnterPassword()
	{
		return driver.findElement(Password);
	}
	
	public WebElement ClickOnLoginButton()
	{
		return driver.findElement(Login);
	}
		
	public WebElement InvalidLoginError()
	{
		return driver.findElement(InvalidLoginErrorMessage);
	}
	
	public WebElement LoginAttemptsExcceds()
	{
		return driver.findElement(LoginAttemptsExccedsMsg);
	}

}
