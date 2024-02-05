package testCases;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

import com.Resources.BaseClass;
import com.Resources.commonMethods;
import com.Resources.constants;

import pageObjectModel.HomePageObjects;
import pageObjectModel.LoginPageObjects;

public class LoginTestCases extends BaseClass {

	@Test(priority = 1)
	public void VerifyLoginwithInvalidData() throws InterruptedException, IOException {
		LoginPageObjects lpo = new LoginPageObjects(driver);

		lpo.EnterEmailAddr().clear();
		lpo.EnterEmailAddr().sendKeys(constants.EmailAddr5);

		lpo.EnterPassword().clear();
		lpo.EnterPassword().sendKeys(constants.password5);

		lpo.ClickOnLoginButton().click();
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		 try 
		 { 			
		    commonMethods.handleAssertion(lpo.InvalidLoginError().getText(),constants.InvalidCredErrorMsg); 
		 } 
		 
		 catch (Exception e) 
		 {
		    commonMethods.handleAssertion(lpo.LoginAttemptsExcceds().getText(),constants.LoginAttemptExceedsErrMsg);
		 }
		 
		
	}
		 
	@Test(priority = 0)
	public void LoginWith_NonRegisteredData() throws InterruptedException, IOException {
		HomePageObjects hpo = new HomePageObjects(driver);

		commonMethods.PutExpliciteWaits(driver, 4, hpo.ClickonMyAccount());

		hpo.ClickonMyAccount().click();

		hpo.ClickonLogin().click();

		LoginPageObjects lpo = new LoginPageObjects(driver);

		lpo.EnterEmailAddr().sendKeys(constants.EmailAddr4);

		lpo.EnterPassword().sendKeys(constants.password4);

		lpo.ClickOnLoginButton().click();

		commonMethods.handleAssertion(driver.getCurrentUrl(), constants.Non_RegisteredEmailUrl);
		Thread.sleep(4000);
		
		
	}

	@Test(priority = 2)
	public void LoginWithValidData() throws IOException {
		LoginPageObjects lpo = new LoginPageObjects(driver);

		commonMethods.PutExpliciteWaits(driver, 4, lpo.EnterEmailAddr());

		lpo.EnterEmailAddr().clear();
		lpo.EnterEmailAddr().sendKeys(RegisterTestCases.randomEmail);

		lpo.EnterPassword().clear();
		lpo.EnterPassword().sendKeys(constants.password6);

		lpo.ClickOnLoginButton().click();

		commonMethods.handleAssertion(driver.getCurrentUrl(), constants.LoginSuccessUrl);
		

		// System.out.println("Login Successful Messsage:
		// "+lpo.LoginSucceessMessage().getText());
	}
}
