package com.keywordFactory;

import java.io.File;

import org.testng.annotations.Factory;
import com.olo.keyworddriven.TestBuilder;

public class LoginFactoryTest {
	
	@Factory
	public Object[] createInstances() {
		return new TestBuilder().create(new File(LoginFactoryTest.class.getResource("/module2").getPath()));
		//return new TestBuilder().create(new File(LoginFactoryTest.class.getResource("/com/tests/login").getPath()));
	}
	
}
