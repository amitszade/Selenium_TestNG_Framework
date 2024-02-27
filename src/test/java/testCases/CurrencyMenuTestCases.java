package testCases;

import org.testng.annotations.Test;

import com.Resources.BaseClass;
import com.Resources.commonMethods;
import com.Resources.constants;

import pageObjectModel.HomePageObjects;


public class CurrencyMenuTestCases extends BaseClass{
		
	@Test (priority=0)
	public void VerifyEuroOptionCurrencyDropDownMenu()
	{
		HomePageObjects hpo = new HomePageObjects(driver);
		
		hpo.CurrencyMenu().click();
		
		commonMethods.handleAssertion(hpo.CurrencyEuro().getText(), constants.CurrencyEUROText);
	}
	
	@Test
	public void VerifyPoundSterlingOptionCurrencyDropDownMenu()
	{
		HomePageObjects hpo = new HomePageObjects(driver);
		
		commonMethods.handleAssertion(hpo.CurrencyPoundSterling().getText(), constants.CurrencyGBPText);
	}
	
	@Test
	public void VerifyUSDollerOptionCurrencyDropDownMenu()
	{
		HomePageObjects hpo = new HomePageObjects(driver);
		
		commonMethods.handleAssertion(hpo.CurrencyUSDoller().getText(), constants.CurrencyUSDText);
	}
}
