package com.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.olo.initiator.ApplicationInitiator;
import com.pages.LoginPage;

public class WebDriverPageObjectModelTest extends ApplicationInitiator{
	
	@Test
	public void loginTest() throws Exception{
		LoginPage lp = PageFactory.initElements(getDriver(), LoginPage.class);
		lp.login("asdfasdf", "asdfasdf");
	}

}
