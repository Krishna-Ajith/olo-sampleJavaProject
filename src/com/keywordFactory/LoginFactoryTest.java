package com.keywordFactory;

import org.testng.annotations.Factory;
import com.olo.keyworddriven.TestBuilder;

public class LoginFactoryTest {
	
	@Factory
	public Object[] createInstances() {
		return new TestBuilder().create();
		//return new TestBuilder().create(new File(LoginFactoryTest.class.getResource("/com/tests/login").getPath()));
	}
	
}
