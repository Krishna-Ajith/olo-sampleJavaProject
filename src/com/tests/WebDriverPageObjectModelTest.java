package com.tests;

import static com.olo.util.PropertyReader.app;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.olo.initiator.WebDriverInitiator;
import com.pages.LoginPage;

public class WebDriverPageObjectModelTest extends WebDriverInitiator{
	
	@Test
	public void loginTest() throws Exception{
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		String userName = app.get("app").getProperty("username");
		String password = app.get("app").getProperty("password");
		lp.login(userName, password);
	}

}
