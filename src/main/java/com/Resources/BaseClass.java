package com.Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public WebDriver driver;
    public Properties prop;
    
    
	public void initializeDriver() throws IOException {

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir")+"\\src\\main\\java\\com\\Resources\\data.properties");

		prop = new Properties();

		prop.load(fis);

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) 
		{
			driver = new ChromeDriver();
		}
		
		else if (browserName.equalsIgnoreCase("FireFox")) 
		{
			driver = new FirefoxDriver();
		}
		
		else if (browserName.equalsIgnoreCase("Edge")) 
		{
			driver = new EdgeDriver();
		}
	}

	@BeforeClass
	public void launchBrowser() throws IOException
	{
		initializeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(prop.getProperty("url"));
	}
			
	/*
	 * @BeforeMethod public void ExcelHandling() throws IOException {
	 * FileInputStream fs = new
	 * FileInputStream("C:\\Users\\Lenovo\\Desktop\\Workbook 2.xlsx"); XSSFWorkbook
	 * workbook = new XSSFWorkbook(fs); XSSFSheet sheet = workbook.getSheetAt(0); //
	 * int Lastrow = sheet.getLastRowNum(); Row rw = sheet.getRow(1); Cell cl =
	 * rw.getCell(1); firstname = cl.toString();
	 * System.out.println("Firstname is "+firstname); Cell cl1 = rw.getCell(2);
	 * lastname = cl1.toString(); System.out.println("LastName is "+lastname); Cell
	 * cl2 = rw.getCell(3); telephone = cl2.toString();
	 * System.out.println("Telephone is "+telephone); Cell cl3 = rw.getCell(4);
	 * password = cl3.toString(); System.out.println("Passworsd is "+password); Cell
	 * cl4 = rw.getCell(5); confirmPassword = cl4.toString();
	 * System.out.println("ConfirmPassword is "+confirmPassword);}
	 */
}
