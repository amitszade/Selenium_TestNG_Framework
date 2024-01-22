package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {

	public WebDriver driver;

	public HomePageObjects(WebDriver driver2) 
	{
		this.driver = driver2;
	}

	private By MyAccount = By.xpath("//a[@class='dropdown-toggle']");
	private By Register = By.xpath("//a[contains(text(),'Register')]");
	private By Login = By.xpath("//a[contains(text(),'Login')]");

	public WebElement ClickonMyAccount() 
	{
		return driver.findElement(MyAccount);
	}

	public WebElement ClickonRegister() 
	{
		return driver.findElement(Register);
	}

	public WebElement ClickonLogin() 
	{
		return driver.findElement(Login);
	}

}
