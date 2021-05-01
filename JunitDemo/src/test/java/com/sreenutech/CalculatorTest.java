package com.sreenutech;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testAdd_For_Positive_Value() {
		
		Calculator cal = new Calculator();
		
		int res = cal.add(10, 3);
		
		Assert.assertEquals(13, res);
		
	}
	
	@Test
	public void testAdd_For_Negative_Value() {
		
		Calculator cal = new Calculator();
		
		int res = cal.add(-10, -3);
		
		Assert.assertEquals(-10, res);
		
	}

	@Test
	public void testSub_Postive_Numbers() {
		
		Calculator cal = new Calculator();
		int res = cal.sub(10, 5);
		
		Assert.assertEquals(5, res);
		Assert.assertTrue(res>0);
	}

	@Test
	public void testSub_Negative_Numbers() {
		
		Calculator cal = new Calculator();
		int res = cal.sub(-10, -5);
		Assert.assertEquals(-5, res);
	}

	//@Test
	public void testMul() {
		
		
	}
	
	@After
	public void tearDown() throws Exception {
		
	}

}
