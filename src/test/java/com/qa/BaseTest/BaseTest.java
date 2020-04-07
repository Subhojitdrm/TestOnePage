package com.qa.BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.qa.BasePage.BaseAbstract;
import com.qa.BasePage.BasePage;

public class BaseTest {
	public WebDriver driver;
	public BaseAbstract callBase;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:\\Git\\Serialization\\TestOnePage\\testOnePage\\SupportDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		callBase=new BasePage(driver);
		driver.get("https://www.softwaretestingmaterial.com/");
	}
	@AfterMethod
	public void tearDown() {
		System.out.println("This is afterMethod");
	}
	@BeforeTest
	public void setExtentReport() {
		System.out.println("ExtentReport SetUp");
	}
	@AfterTest
	
	public void closeExtentReport() {
		System.out.println("close here");
	}
	
	
	
}
