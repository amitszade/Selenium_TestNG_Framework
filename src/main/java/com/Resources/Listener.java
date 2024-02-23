package com.Resources;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.Status;

public class Listener extends extentManager implements ITestListener {

	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, "Test Case passed is " + result.getName());

			// Test cases passed is validLoginTest
		}
	}

	public void onTestSkip(ITestResult result) {
		if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, "Test Case skipped is" + result.getName());
		}
	}

	public void onTestFailure(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, "Test Case failed is " + result.getName());
			test.log(Status.FAIL, "Test Case failed is " + result.getThrowable()); // To throw excpetion

			String screenshotPath = BaseClass.screenShot(BaseClass.driver, result.getName());

			test.addScreenCaptureFromPath(screenshotPath); // Adding screenshot inside report //To add name in extent
															// report
		}
	}
}