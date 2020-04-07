package com.qa.PageTest;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.BaseTest.BaseTest;
import com.qa.Pages.Blog;

public class TestBlogPage extends BaseTest{
	

	@Test
	public void testTitleText() {
		caeTest=caeReport.createTest("testTitleText");
		String title=callBase.getInstance(Blog.class).getReadPageTitle();
		Assert.assertEquals(title, "Software Testing Material");
	}
	
	@Test
	public void testBlogButtonText() {
		caeTest=caeReport.createTest("testBlogButtonText");
		String blogButtonText=callBase.getInstance(Blog.class).getReadBlogLinkText();
		Assert.assertEquals(blogButtonText, "Blog");
	}
	@Test
	public void testReadBlogUrl() {
		caeTest=caeReport.createTest("testReadBlogUrl");
		Assert.assertEquals(callBase.getInstance(Blog.class).getBlogUrl(), "https://www.softwaretestingmaterial.com/blog/");
		
	}

}
