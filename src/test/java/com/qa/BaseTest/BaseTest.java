package com.qa.BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.qa.BasePage.BaseAbstract;
import com.qa.BasePage.BasePage;

public class BaseTest {
	public WebDriver driver;
	public BaseAbstract callBase;
	//add extend report
	public ExtentHtmlReporter caeHtmlReporter;
	public ExtentReports caeReport;
	public ExtentTest caeTest;
	
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:\\Git\\Serialization\\TestOnePage\\testOnePage\\SupportDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		callBase=new BasePage(driver);
		driver.get("https://www.softwaretestingmaterial.com/");
	}
	@AfterMethod
	public void tearDown(ITestResult result) {
		String refineResult=result.getName();
		String refResult=refineResult.toUpperCase().replace("TEST", "TEST-");
		
		if(result.getStatus()==ITestResult.FAILURE) {
			caeTest.log(Status.FAIL, "Fail- "+refResult);
		}
		if(result.getStatus()==ITestResult.SUCCESS) {
			caeTest.log(Status.PASS, "Pass this method- "+refResult);
		}
		//configure extent report:
		
		
		
		
		
		
		driver.quit();
		System.out.println("This is afterMethod");
	}
	@BeforeTest
	public void setExtentReport() {
		caeHtmlReporter=new ExtentHtmlReporter("E:\\Git\\Serialization\\TestOnePage\\testOnePage\\test-output\\caeTest.html");
		caeReport=new ExtentReports();
		caeReport.attachReporter(caeHtmlReporter);
	}
	@AfterTest
	
	public void closeExtentReport() {
		System.out.println("close here");
		caeReport.flush();
	}
	
	
	
}
