package testCases;

import org.testng.annotations.Test;

import com.Resources.BaseClass;
import com.Resources.commonMethods;
import com.Resources.constants;

import pageObjectModel.HomePageObjects;


public class CurrencyMenuTestCases extends BaseClass{
	
	@Test (priority=0)
	public void verifyEuroOptionCurrencyDropDownMenu()
	{
		HomePageObjects hpo = new HomePageObjects(driver);
		
		hpo.CurrencyMenu().click();
		
		commonMethods.handleAssertionString(hpo.CurrencyEuro().getText(), constants.CurrencyEUROText);
	}
	
	@Test
	public void verifyPoundSterlingOptionCurrencyDropDownMenu()
	{
		HomePageObjects hpo = new HomePageObjects(driver);
		
		commonMethods.handleAssertionString(hpo.CurrencyPoundSterling().getText(), constants.CurrencyGBPText);
	}
	
	@Test
	public void verifyUSDollerOptionCurrencyDropDownMenu()
	{
		HomePageObjects hpo = new HomePageObjects(driver);
		
		commonMethods.handleAssertionString(hpo.CurrencyUSDoller().getText(), constants.CurrencyUSDText);
	}
}
