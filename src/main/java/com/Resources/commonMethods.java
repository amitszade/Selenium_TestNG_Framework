package com.Resources;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class commonMethods {
	
	public static WebDriver driver;
	public static String ActualResult;
	public static String ExpectedResult;
	
	public static void handleAssertion(String ActualResult, String ExpectedResult)
	{
		SoftAssert sa = new SoftAssert();
		
	    sa.assertEquals(ActualResult, ExpectedResult);
		sa.assertAll();
	}
	
		
	public static void PutExpliciteWaits(WebDriver driver, int sec, WebElement webElement)
	{		
		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.elementToBeClickable(webElement));		
	}
	
	public static String RandomEmailGenerator()
	{
		return System.currentTimeMillis()+"@gmail.com";
	}
}
