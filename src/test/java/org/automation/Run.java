package org.automation;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlSuite.ParallelMode;
import org.testng.xml.XmlTest;

public class Run {

	
	public static void main(String[] args) {
		TestNG testng = new TestNG();
		testng.setTestClasses(new Class[] { AtactinAutomation.class });
		testng.run();
//		XmlSuite suite = new XmlSuite();
//		suite.setName("Suite1");
//		suite.setThreadCount(2);
//		suite.setParallel(ParallelMode.TESTS);
//		
//		XmlTest test1 = new XmlTest(suite);
//		test1.setName("Test1");
//		List<XmlClass> classes = new ArrayList<XmlClass>();
//		classes.add(new XmlClass("org.automation.AtactinAutomation"));
//		test1.setXmlClasses(classes);
//		
//		XmlTest test2 = new XmlTest(suite);
//		test2.setName("Test2");
//		List<XmlClass> classes2 = new ArrayList<XmlClass>();
//		classes2.add(new XmlClass("org.automation.AmazonAutomation"));
//		test2.setXmlClasses(classes2);
//		
//		List<XmlSuite> suites = new ArrayList<XmlSuite>();
//		suites.add(suite);
//		TestNG tng = new TestNG();
//		tng.setXmlSuites(suites);
//		tng.run();
	}
}
