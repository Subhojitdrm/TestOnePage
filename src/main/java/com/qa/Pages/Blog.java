package com.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.BasePage.BasePage;

public class Blog extends BasePage{

	public Blog(WebDriver driver) {
		super(driver);
	}
	
	//read pageTitleFromThisPage	
	private By readPageTitle=By.xpath("//a[@href='https://www.softwaretestingmaterial.com']");
	
	//read pageBlog Link text
	private By readBlogLinkText=By.xpath("//nav[@role='navigation']//ul[@id='menu-1-9725c2b']//a[@href='https://www.softwaretestingmaterial.com/blog/' and @class='elementor-item']");

	public String getReadPageTitle() {
		return getContent(readPageTitle);
		
	}
	public String getReadBlogLinkText() {
		return getContent(readBlogLinkText);
	}


	
	
	
	

}
