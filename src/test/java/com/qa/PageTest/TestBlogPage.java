package com.qa.PageTest;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.BaseTest.BaseTest;
import com.qa.Pages.Blog;

public class TestBlogPage extends BaseTest{
	

	@Test
	public void testTitleText() {
		String title=callBase.getInstance(Blog.class).getReadPageTitle();
		Assert.assertEquals(title, "Software Testing Material");
	}
	
	@Test
	public void testBlogButtonText() {
		String blogButtonText=callBase.getInstance(Blog.class).getReadBlogLinkText();
		Assert.assertEquals(blogButtonText, "Blog");
	}

}
