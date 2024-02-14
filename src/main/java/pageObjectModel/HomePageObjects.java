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
	
	private By CurrencyDropDown = By.xpath("(//button[@data-toggle='dropdown'])[1]");
	private By CurrencyEuro = By.xpath("//button[@name='EUR']");
	private By CurrencyGBP = By.xpath("//button[@name='GBP']");
	private By CurrencyUSD = By.xpath("//button[@name='USD']");
	
	private By SearchBox = By.xpath("//input[@name='search']");
	private By SearchBoxButton = By.xpath("//span[@class='input-group-btn']");
	private By iphonePrice = By.xpath("//p[@class='price']");
	private By iphoneAddToCartButton = By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[7]");
	private By CartButton = By.xpath("//div[@id='cart']/button");
	private By iphoneAddedInCartSucceed = By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/product&product_id=40'])[3]");
	private By SamsungPrice = By.xpath("(//p[@class='price'])[2]");
	private By SamsungAddToCartButton = By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[8]");
	private By SamsungAddedIntoCartSucceed = By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/product&product_id=49'])[3]");
	private By TotalPriceInCart = By.xpath("(//td[@class='text-right'])[12]");
	
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
	
	public WebElement CurrencyMenu()
	{
		return driver.findElement(CurrencyDropDown);
	}
	
	public WebElement CurrencyEuro()
	{
		return driver.findElement(CurrencyEuro); 
	}
	
	public WebElement CurrencyPoundSterling()
	{
		return driver.findElement(CurrencyGBP);
	}
	
	public WebElement CurrencyUSDoller()
	{
	    return driver.findElement(CurrencyUSD);	
	}
	
	public WebElement ProductSearchBox()
	{
		return driver.findElement(SearchBox);
	}
	
	public WebElement SearchButton()
	{
		return driver.findElement(SearchBoxButton);
	}
	
	public WebElement iphonePrice()
	{
		return driver.findElement(iphonePrice);
	}
	
	public WebElement iphoneAddToCartButton()
	{
		return driver.findElement(iphoneAddToCartButton);
	}
	
	public WebElement CartButton()
	{
		return driver.findElement(CartButton);
	}	

	public WebElement iphoneAddedInCartSuccessful()
	{
		return driver.findElement(iphoneAddedInCartSucceed);
	}
		
	public WebElement SamsungPrice()
	{
		return driver.findElement(SamsungPrice);
	}
	
	public WebElement SamsungAddToCartButton()
	{
		return driver.findElement(SamsungAddToCartButton);
	}
	
	public WebElement SamsungAddedIntoCartSucceed()
	{
		return driver.findElement(SamsungAddedIntoCartSucceed);
	}
	
	public WebElement TotalPriceInCart()
	{
		return driver.findElement(TotalPriceInCart);
	}
	
}
