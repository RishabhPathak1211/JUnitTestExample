package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		JUnitFunctions junit = new JUnitFunctions();
		int result1 = junit.addNumbers(100, 300);
		assertEquals(400, result1);
	}
}
