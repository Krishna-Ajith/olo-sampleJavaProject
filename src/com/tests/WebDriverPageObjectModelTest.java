package com.tests;

import static com.olo.util.PropertyReader.messages;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.olo.initiator.WebDriverInitiator;
import com.pages.LoginPage;

public class WebDriverPageObjectModelTest extends WebDriverInitiator{
	
	@Test
	public void loginTest() throws Exception{
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		String userName = messages.get("app").getProperty("username");
		String password = messages.get("app").getProperty("password");
		lp.login(userName, password);
	}

}
