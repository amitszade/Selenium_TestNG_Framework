package com.Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	public static WebDriver driver;
	public Properties prop;
	public int Row;
	public String FirstName;
	public String LastName;
	public String Email;
	public String Telephone;
	public String Password;
	public String CnfPassword;

	public void initializeDriver() throws IOException {

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\com\\Resources\\data.properties");

		prop = new Properties();

		prop.load(fis);

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}

		else if (browserName.equalsIgnoreCase("FireFox")) {
			driver = new FirefoxDriver();
		}

		else if (browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
	}

	@BeforeClass
	public void launchBrowser() throws IOException {
		
		initializeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	}
	
	@BeforeSuite
	public void ExtentReport()
	{
		extentManager.ReportGeneration();
	}
	
	@AfterSuite
	public void endReport()
	{
		extentManager.endReport();
	}
	
	public static String screenShot(WebDriver driver, String fileName)
	{
		String datename = new SimpleDateFormat("yyyymmddhhmmss").format(new Date());
		
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\ScreenShot\\" + fileName + "_" + datename + ".png";
		File finalDestination = new File(destination);
		   try {
		    FileUtils.copyFile(source, finalDestination);
		   } catch (Exception e) {
		    e.getMessage();
		   }
		   return destination;
		  }	 
}	
