package com.qa.BasePage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage extends BaseAbstract{

	public BasePage(WebDriver driver) {
		super(driver);
	
	}
	@Override
	public String getPageTitle() {
		return driver.getTitle();
	}

	@Override
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	@Override
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}

	@Override
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
		
	}
	@Override
	public String getContent(By locator) {
		return getElement(locator).getText();
		
	}


	

}
