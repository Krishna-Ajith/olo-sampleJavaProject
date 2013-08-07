package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.olo.bot.BrowserBot;

public class LoginPage {
	
	private BrowserBot browser = null;
	
	public LoginPage(WebDriver driver){
		browser = new BrowserBot(driver);
	}
	
	@FindBy(id="Email")
	private WebElement userName;
	
	@FindBy(id="Passwd")
	private WebElement password;
	
	@FindBy(id="signIn")
	private WebElement signIn;
	
	public void login(String userName,String password) throws Exception{
		browser.type(this.userName, userName);
		browser.type(this.password, password);
		browser.click(signIn);
	}
	
}
