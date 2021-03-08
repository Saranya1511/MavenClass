package com.shinningweb_junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class AnnotationClass {
	
	public static void main(String[] args) {
		
	}
		//flow chart of Junit Annotation
	@Test
	public void testCase1() {
		System.out.println("TestCase 1");//3
	}
	
	@Test
	public void testCase2() {
		System.out.println("TestCase 2");//6
	}
	
	@BeforeClass
	static public void beforeClass() {
		System.out.println("before testcase"); // 1
	}
	
	@Before
	public void before() {
		System.out.println("Before class");//2//5
	}
	
	@After
	public void after() {
		System.out.println("After TestCase");//4//7
	}
	
	@AfterClass
	static public void afterClass() {
		System.out.println("After class");//8
	}
	
	
}
