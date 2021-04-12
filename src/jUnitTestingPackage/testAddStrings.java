package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		JUnitFunctions junit = new JUnitFunctions();
		String result1 = junit.addStrings("Hello", "World");
		assertEquals("HelloWorld", result1);
	}
}
