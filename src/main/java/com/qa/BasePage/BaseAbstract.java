package com.qa.BasePage;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BaseAbstract {

	public WebDriver driver;
	public WebDriverWait wait;

	public BaseAbstract(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 30);

	}

	public abstract String getPageTitle();
	public abstract String getPageUrl();
	public abstract String getContent(By locator);
	public abstract WebElement getElement(By locator);
	public abstract List<WebElement> getElements(By locator);
	public <Tpage extends BasePage> Tpage getInstance(Class<Tpage> pageClass) {
		try {
			return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	
}
