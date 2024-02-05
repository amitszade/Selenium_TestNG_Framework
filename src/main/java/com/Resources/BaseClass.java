package com.Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
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
	
	/*
	 * @BeforeMethod public void ExcelHandling() throws IOException {
	 * FileInputStream fs = new
	 * FileInputStream("C:\\Users\\Lenovo\\Desktop\\Workbook 2.xlsx"); XSSFWorkbook
	 * workbook = new XSSFWorkbook(fs); XSSFSheet sheet = workbook.getSheetAt(0); //
	 * int Lastrow = sheet.getLastRowNum();
	 * 
	 * for (int i = 1;i<=Lastrow;i++) { Row rw = sheet.getRow(i);
	 * 
	 * Cell cl = rw.getCell(1); FirstName = cl.toString();
	 * System.out.println("Firstname is "+FirstName);
	 * 
	 * Cell cl1 = rw.getCell(2); LastName = cl1.toString();
	 * System.out.println("LastName is "+LastName);
	 * 
	 * Cell cl2 = rw.getCell(2); Email = cl1.toString();
	 * System.out.println("LastName is "+Email);
	 * 
	 * Cell cl3 = rw.getCell(3); Telephone = cl2.toString();
	 * System.out.println("Telephone is "+Telephone);
	 * 
	 * Cell cl4 = rw.getCell(4); Password = cl3.toString();
	 * System.out.println("Passworsd is "+Password);
	 * 
	 * Cell cl5 = rw.getCell(5); CnfPassword = cl4.toString();
	 * System.out.println("ConfirmPassword is "+CnfPassword); }}
	 */
	
	
	// Other Test cases to be add is as follows
	// Verify all the links on Home Page -- Links in Information, Customer Service, Extras, My Account -- DONE
	// Verify Currency drop down menu on Home Page -- DONE
	// Verify the add to Cart Case 
	// -- search iphone
	// -- Capture the price of iphone and store it in a variable -- 
    // iPhoneprice = $123.20 + Ex Tax: $101.00 = 224.20
	// -- Click on Add to Cart
	// -- Search Samsung
	// -- Capture the price of Samsung Galaxy Tab and store it in a variable -- 
    // SamsungPrice = $241.99 + Ex Tax: $199.99 = 441.98
	// -- Click on Add to Cart
	// -- Add the two product's captured price and store it in a variable -- TwoProduct
	// -- Click on Cart -- 
	// -- Capture the Total price from cart section and Store it in a variable -- 
	// -- Compare the Total price in Cart and TwoProduct value -- 
    // Verify the same product to be returned -- 
	 
