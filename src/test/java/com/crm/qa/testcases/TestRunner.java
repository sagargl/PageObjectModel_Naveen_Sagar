package com.crm.qa.testcases;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;

public class TestRunner {
	
	public static void main(String[] args) {
		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		testng.setTestClasses(new class[] { LoginPageTest.class });
		testng.addListener(tla);
		testng.run();
		//testng.setTestClasses(new class[] {LoginPageTest.class});
	}
	
}
