package com.tju.scs;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TriangleTest {
	
	Triangle tr = null;
	@Before
	public void setUp() throws Exception {
		int a = 2;
		int b = 1;
		int c = 3;
		tr = new Triangle(a, b, c);
	}

	@Test
	public void testLegal() {
		assertEquals(1, tr.legal());
	}

	@Test
	public void testIsoscelesTriangle() {
		assertEquals(1, tr.isoscelesTriangle());
	}

	@Test
	public void testEquilateralTriangle() {
		assertEquals(1, tr.equilateralTriangle());
	}

	@Test
	public void testNormalTriangle() {
		assertEquals(1, tr.normalTriangle());
	}

}
