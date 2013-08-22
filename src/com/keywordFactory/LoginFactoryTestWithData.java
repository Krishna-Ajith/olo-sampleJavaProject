package com.keywordFactory;

import java.io.File;

import org.testng.annotations.Factory;

import com.olo.keyworddriven.DataDrivenBuilder;

public class LoginFactoryTestWithData {
	
	@Factory
	public Object[] createInstances() {
		return new DataDrivenBuilder().create(new File(LoginFactoryTestWithData.class.getResource("/module1").getPath()));
	}
	
}
