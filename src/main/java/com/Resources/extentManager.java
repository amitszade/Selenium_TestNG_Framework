package com.Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentManager {
	
	public static ExtentSparkReporter htmlReporter; // This class is responsible for look of the report
	public static ExtentReports extent; // Responsible for entries of Test cases
	public static ExtentTest test; // Responsible for test case status pass/fail
	
	public static void ReportGeneration()
	{
		htmlReporter = new ExtentSparkReporter
				(System.getProperty("user.dir") + "\\Test Reports\\myReport.html");
		htmlReporter.config().setDocumentTitle("Automation Report");
		htmlReporter.config().setReportName("Functional Report");
		htmlReporter.config().setTheme(Theme.DARK);
		
	    extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Hostname", "LocalHost");
		extent.setSystemInfo("OS", "Windows 11");
		extent.setSystemInfo("Browser Name", "Chrome");
		extent.setSystemInfo("Test Suite run by", "Amit Zade");
	}
	
	public static void endReport()
	{
		extent.flush();
	}
}
