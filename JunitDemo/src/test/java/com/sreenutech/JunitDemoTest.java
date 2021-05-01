package com.sreenutech;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitDemoTest {

	@BeforeClass
	public static void beforOnlyOnceForAllTests() {

		System.out.println("BOOFAT");

	}

	@Before
	public void setUp() {

		System.out.println("setUp()");

	}

	// @Test
	public void testM1() {

		System.out.println("m1() method");
	}

	@Test
	public void testM2() {

		System.out.println("m2() method");

	}

	@After
	public void tierDown() {

		System.out.println("tierDown()");

	}

	@AfterClass
	public static void afterOnlyOnceForAllTests() {
		System.out.println("AOOFAT");
	}

}
