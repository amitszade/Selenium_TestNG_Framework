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
	
	private By AboutUsLink = By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=information/information&information_id=4']");
	private By DeliveryInformationLink = By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=information/information&information_id=6']");
	private By PrivacyPolicyLink = By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=information/information&information_id=3']");
	private By TermsAndConditionsLink = By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=information/information&information_id=5']");
	private By ContactUsLink = By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=information/contact'])[1]");
	private By ReturnsLink = By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/return/add']");
	private By SiteMapLink = By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=information/sitemap']");
	private By BrandsLink = By.xpath("https://naveenautomationlabs.com/opencart/index.php?route=product/manufacturer");
	private By GiftCertificatesLink = By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/voucher']");
	private By AffiliateLink = By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=affiliate/login']");
	private By SpecialsLink = By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/special']");
	private By MyAccountLink = By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/account'])[2]");
	private By OrderHistoryLink = By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/order']");
	private By WishListLink = By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/wishlist'])[2]");
	private By NewsletterLink = By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/newsletter']");
	

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
	
	public WebElement About_Us()
	{
	    return driver.findElement(AboutUsLink);	
	}
	
	public WebElement Delivery_Information()
	{
	    return driver.findElement(DeliveryInformationLink);	
	}
	
	public WebElement Privacy_Policy()
	{
	    return driver.findElement(PrivacyPolicyLink);	
	}

	public WebElement TermsAndConditions()
	{
	    return driver.findElement(TermsAndConditionsLink);	
	}
	
	public WebElement Contact_Us()
	{
	    return driver.findElement(ContactUsLink);	
	}
	
	public WebElement Returns()
	{
	    return driver.findElement(ReturnsLink);	
	}
	
	public WebElement Site_Map()
	{
	    return driver.findElement(SiteMapLink);	
	}
	
	public WebElement Brands()
	{
	    return driver.findElement(BrandsLink);	
	}
	
	public WebElement Gift_Certificates()
	{
	    return driver.findElement(GiftCertificatesLink);	
	}
	
	public WebElement Affiliate()
	{
	    return driver.findElement(AffiliateLink);	
	}
	
	public WebElement Specials()
	{
	    return driver.findElement(SpecialsLink);	
	}
	
	public WebElement My_Account()
	{
	    return driver.findElement(MyAccountLink);	
	}
	
	public WebElement Order_History()
	{
	    return driver.findElement(OrderHistoryLink);	
	}
	
	public WebElement Wish_List()
	{
	    return driver.findElement(WishListLink);	
	}
	
	public WebElement Newsletter()
	{
	    return driver.findElement(NewsletterLink);	
	}
		
	
}
