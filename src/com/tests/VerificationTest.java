package com.tests;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.olo.bot.BrowserBot;
import com.olo.initiator.ApplicationInitiator;

public class VerificationTest extends ApplicationInitiator{
	
	private static final Logger logger = LogManager.getLogger(VerificationTest.class.getName());
	
	@Test
	public void verifyGmailTitle() throws Exception{
		BrowserBot browser = new BrowserBot(getDriver());
		browser.verifyTitle("Times City");
		logger.info("I am after verification");
		browser.verifyTitle("Gmail");
		logger.info("I am after assertion");
	}
	
}
