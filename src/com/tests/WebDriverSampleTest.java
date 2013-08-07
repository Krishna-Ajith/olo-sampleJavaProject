package com.tests;

import org.testng.annotations.Test;

import com.olo.initiator.BrowserBotInitiator;

public class WebDriverSampleTest extends BrowserBotInitiator{
	
	@Test
	public void assertGmailTitle() throws Exception{
		browser.assertTitle("Bing");
	}
	
	
}
