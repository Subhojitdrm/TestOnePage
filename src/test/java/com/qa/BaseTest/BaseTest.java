package com.qa.BaseTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	@BeforeMethod
	public void setUp() {
		System.out.println("This is beforeMethod");
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
