package com.keywordFactory;

import java.io.File;

import org.testng.annotations.Factory;

import com.olo.keyworddriven.TestBuilder;

public class LoginFactoryTestWithData {
	
	@Factory
	public Object[] createInstances() throws Exception {
		return new TestBuilder().create(new File(LoginFactoryTestWithData.class.getResource("/module1").getPath()));
	}
	
}
