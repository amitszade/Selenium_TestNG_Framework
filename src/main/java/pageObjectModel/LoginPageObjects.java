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
	
	//private By LoginSucceessMessage = By.xpath("//h2[contains(text(),'My Account')]");
	
	private By InvalidLoginErrorMessage = By.xpath("//div[contains(text(),' Warning: No match for E-Mail Address and/or Password.')]");
	
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
	
	/*
	 * public WebElement LoginSucceessMessage() { return
	 * driver.findElement(LoginSucceessMessage); }
	 */
	
	public WebElement InvalidLoginErrorMsg()
	{
		return driver.findElement(InvalidLoginErrorMessage);
	}

}
