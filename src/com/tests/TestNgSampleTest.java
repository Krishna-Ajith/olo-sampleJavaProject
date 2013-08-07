package com.tests;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNgSampleTest {
	
	@Test
	public void test1(){
		throw new SkipException("skip");
	}
	
	@Test
	public void test2(){
		
	}
	
	@Test
	public void test3() throws Exception{
		throw new Exception("Failure");
	}
	
}
