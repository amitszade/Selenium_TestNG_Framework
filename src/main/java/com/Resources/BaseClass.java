package com.Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver;
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
	 
}
