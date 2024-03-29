package testCases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Resources.BaseClass;
import com.Resources.commonMethods;
import com.Resources.constants;

import pageObjectModel.HomePageObjects;

public class HomePageLinksTestCases extends BaseClass {
	
	@Test
	public void VerifyAlltheLinksonHomePage() throws MalformedURLException, IOException
	{
		HomePageObjects hpo = new HomePageObjects(driver);
				
		  for (WebElement link : hpo.AllHomePageLinks())
		  {
			  String url = link.getAttribute("href"); // This will give the value of all "href" attributes
			  
			  HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();			  
			  conn.setRequestMethod("HEAD"); // This will give status code and not the response body
			  conn.connect();
			  int respCode = conn.getResponseCode();
			  String RCode = Integer.toString(respCode);
			  
			  commonMethods.handleAssertion(RCode, constants.ResponseCode);			  
		  }	
	}
}
