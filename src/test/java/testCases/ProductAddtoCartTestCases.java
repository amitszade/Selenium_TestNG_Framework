package testCases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.Resources.BaseClass;
import com.Resources.commonMethods;
import com.Resources.constants;

import pageObjectModel.HomePageObjects;

public class ProductAddtoCartTestCases extends BaseClass {
	
	Double iphonePrice;
	Double SamsungPrice;

	@Test(priority = 0)
	public void VerfiyProductPlaceholderofSerachbox() {
		HomePageObjects hpo = new HomePageObjects(driver);

		commonMethods.handleAssertion(hpo.ProductSearchBox().getAttribute("placeholder"), constants.SearchBox);
	}

	@Test(priority = 1)
	public void Verifysearchtheiphone() {
		HomePageObjects hpo = new HomePageObjects(driver);

		hpo.ProductSearchBox().click();
		hpo.ProductSearchBox().sendKeys(constants.Searchiphone);
		hpo.SearchButton().click();
		commonMethods.handleAssertion(driver.getCurrentUrl(), constants.iphoneUrl);
	}

	@Test(priority = 2)
	public void Verifythepriceofiphone() 
	{
		HomePageObjects hpo = new HomePageObjects(driver);

		String pricea = hpo.iphonePrice().getText(); // Get the text using getText method
		String[] words = pricea.split("\\s"); // Stored it in a Array and splits it
		String numbers = words[0]; // Stored the value at 0th index
		String iphonepriceDollerRemoved = numbers.replaceAll("[$,]", ""); // Removed the $ from $123.20
		iphonePrice = Double.parseDouble(iphonepriceDollerRemoved);
	
		commonMethods.handleAssertion(iphonepriceDollerRemoved, constants.iphonePrice);
	}

	@Test(priority = 3)
	public void Verifyiphoneaddtocart() 
	{
		HomePageObjects hpo = new HomePageObjects(driver);

		hpo.iphoneAddToCartButton().click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		commonMethods.handleAssertion(hpo.iphoneAddedInCartSuccessful().getText(), constants.iphoneAddedIntoCart);
	}

	@Test(priority = 4)
	public void VerifysearchtheSamsung() {
		HomePageObjects hpo = new HomePageObjects(driver);

		hpo.ProductSearchBox().click();
		hpo.ProductSearchBox().clear();
		hpo.ProductSearchBox().sendKeys(constants.SearchSamsung);
		hpo.SearchButton().click();
		commonMethods.handleAssertion(driver.getCurrentUrl(), constants.SamsungUrl);
	}

	@Test(priority = 5)
	public void VerifythepriceofSamsungTab() {
		HomePageObjects hpo = new HomePageObjects(driver);

		String pricea = hpo.SamsungPrice().getText(); // Get the text using getText method
		String[] words = pricea.split("\\s"); // Stored it in a Array and splits it
		String numbers = words[0]; // Stored the value at 0th index
		String SamsungPriceDollerRemoved = numbers.replaceAll("[$,]", ""); // Removed the $ from $123.20
	    SamsungPrice = Double.parseDouble(SamsungPriceDollerRemoved);
		    
		commonMethods.handleAssertion(SamsungPriceDollerRemoved, constants.SamsungPrice);
	}

	@Test(priority = 6)
	public void VerifySamsungTabaddtocart() 
	{		
		HomePageObjects hpo = new HomePageObjects(driver);

		hpo.SamsungAddToCartButton().click();
		
		commonMethods.handleAssertion(hpo.SamsungAddedIntoCartSucceed().getText(), constants.SamsungAddedIntoCart);
	}

	@Test(priority = 7)
	public void VerifyTotalPriceinCart() 
	{
        double TotalPriceWithout$ = iphonePrice + SamsungPrice;
        String TotalCartValue = "$" + Double.toString(TotalPriceWithout$);
        
        HomePageObjects hpo = new HomePageObjects(driver);
        
        hpo.CartButton().click();
        
        commonMethods.handleAssertion(TotalCartValue, constants.TotalCartValue);        
	}
}
