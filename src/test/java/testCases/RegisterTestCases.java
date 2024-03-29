package testCases;

import org.testng.annotations.Test;

import com.Resources.BaseClass;
import com.Resources.commonMethods;
import com.Resources.constants;

import pageObjectModel.HomePageObjects;
import pageObjectModel.RegistrationPageObjects;

public class RegisterTestCases extends BaseClass {
	
	public static String randomEmail = "";
	
	@Test //4
	public void VerifyRegistrationWithValidData(){
		
		RegistrationPageObjects rpo = new RegistrationPageObjects(driver);

		commonMethods.PutExpliciteWaitsWebElement(driver,5, rpo.enterFirstName());
		
		randomEmail = commonMethods.RandomEmailGenerator();
		rpo.enterFirstName().clear();
		rpo.enterFirstName().sendKeys(constants.firstname3);

		rpo.enterLastName().clear();
		rpo.enterLastName().sendKeys(constants.lastname3);

		rpo.enterEmail().clear();
		rpo.enterEmail().sendKeys(randomEmail);

		rpo.enterTelephone().clear();
		rpo.enterTelephone().sendKeys(constants.telephone3);

		rpo.enterPassword().clear();
		rpo.enterPassword().sendKeys(constants.password3);

		rpo.enterConfirmPassword().clear();
		rpo.enterConfirmPassword().sendKeys(constants.confirmPassword3);

		rpo.SelectSubscribeButton().click();

		//rpo.SelectPrivacypolicyCheckBox().click();
		rpo.SelectPrivacypolicyCheckBox().click();

		rpo.ClickonContinueButton().click();
		
		commonMethods.handleAssertion(driver.getCurrentUrl(), constants.SuccessUrl);
		
		//System.out.println("Registration Successful Messsage: "+rpo.RegistrationSucceessMessage().getText());
		
	}

	@Test //3
	public void VerifyRegistrationWithInvalidData() {
				
		RegistrationPageObjects rpo = new RegistrationPageObjects(driver);
        
		commonMethods.PutExpliciteWaitsWebElement(driver,5, rpo.enterFirstName());
		
		rpo.enterFirstName().clear();
		rpo.enterFirstName().sendKeys(constants.EmailAddr2);

		rpo.enterLastName().clear();
		rpo.enterLastName().sendKeys(constants.lastname2);

		rpo.enterEmail().clear();
		rpo.enterEmail().sendKeys(constants.EmailAddr2);

		rpo.enterTelephone().clear();
		rpo.enterTelephone().sendKeys(constants.telephone2);

		rpo.enterPassword().clear();
		rpo.enterPassword().sendKeys(constants.password2);

		rpo.enterConfirmPassword().clear();
		rpo.enterConfirmPassword().sendKeys(constants.confirmPassword2);

		rpo.SelectSubscribeButton().click();

		rpo.SelectPrivacypolicyCheckBox().click();

		rpo.ClickonContinueButton().click();
		
		commonMethods.handleAssertion(driver.getCurrentUrl(), constants.InvalidUrl);

	}

	@Test //1
	public void VerifyRegistrationWithBlankData() {
		
        HomePageObjects hpo = new HomePageObjects(driver);
        
        commonMethods.PutExpliciteWaitsWebElement(driver,5, hpo.ClickonMyAccount());

		hpo.ClickonMyAccount().click();

		hpo.ClickonRegister().click();
		
		RegistrationPageObjects rpo = new RegistrationPageObjects(driver);

		rpo.enterFirstName().sendKeys(constants.firstname);

		rpo.enterLastName().sendKeys(constants.lastname);

		rpo.enterEmail().sendKeys(constants.EmailAddr);

		rpo.enterTelephone().sendKeys(constants.telephone);

		rpo.enterPassword().sendKeys(constants.password);

		rpo.enterConfirmPassword().sendKeys(constants.confirmPassword);

		rpo.SelectSubscribeButton().click();

		rpo.ClickonContinueButton().click();
		
		commonMethods.handleAssertion(rpo.FirstN_ErrMsg().getText(), constants.FirstNameErrorMsg);
		commonMethods.handleAssertion(rpo.LastN_ErrMsg().getText(), constants.LastNameErrorMsg);
		commonMethods.handleAssertion(rpo.Email_ErrMsg().getText(), constants.EmailErrorMsg);
		commonMethods.handleAssertion(rpo.TPhone_ErrMsg().getText(), constants.TelephoneErrorMsg);
		commonMethods.handleAssertion(rpo.PW_ErrMsg().getText(), constants.PasswordErrorMsg);
		commonMethods.handleAssertion(rpo.CnfPW_ErrMsg().getText(), constants.CnfPasswordErrorMsg);
		commonMethods.handleAssertion(rpo.PrivacyP_ErrMsg().getText(), constants.PrivacyPolicyErrorMsg);
		
	}

	@Test //2
	public void VerifyRegistrationWithExistingData() 
	{
		
		RegistrationPageObjects rpo = new RegistrationPageObjects(driver);
		
		rpo.enterFirstName().sendKeys(constants.firstname1);

		rpo.enterLastName().sendKeys(constants.lastname1);

		rpo.enterEmail().sendKeys(constants.EmailAddr1);

		rpo.enterTelephone().sendKeys(constants.telephone);

		rpo.enterPassword().sendKeys(constants.password1);

		rpo.enterConfirmPassword().sendKeys(constants.confirmPassword1);

		rpo.SelectSubscribeButton().click();

		rpo.SelectPrivacypolicyCheckBox().click();
		
		rpo.ClickonContinueButton().click();
		
		commonMethods.handleAssertion(rpo.ExtEmail_Warning().getText(), constants.EmailExistWaring);

	}

}
