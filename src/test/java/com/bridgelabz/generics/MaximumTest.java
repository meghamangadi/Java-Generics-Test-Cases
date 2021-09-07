package com.bridgelabz.generics;

import org.junit.Assert;

import org.junit.Test;



public class MaximumTest {

	@Test
	public void given3Values_WhenGetMaximum_ShouldReturnCorrectValue1() {
		int finalResult = Maximum.getmaximum(8, 3, 6);
		Assert.assertEquals(8, finalResult);
	}

	@Test
	public void given3Values_WhenGetMaximum_ShouldReturnCorrectValue2() {
		int finalResult = Maximum.getmaximum(3, 8, 6);
		Assert.assertEquals(8, finalResult);
	}

	@Test
	public void given3Values_WhenGetMaximum_ShouldReturnCorrectValue3() {
		int finalResult = Maximum.getmaximum(6, 3, 8);
		Assert.assertEquals(8, finalResult);
	}

	@Test
	public void given3FloatValues_WhenGetMaximum_ShouldReturnCorrectValue1() {
		float finalResult = Maximum.getmaximum(8.6f, 3.4f, 6.9f);
		Assert.assertEquals(8.6f, finalResult, 0.0);
	}

	@Test
	public void given3FloatValues_WhenGetMaximum_ShouldReturnCorrectValue2() {
		float finalResult = Maximum.getmaximum(3.4f, 8.6f, 6.9f);
		Assert.assertEquals(8.6f, finalResult, 0.0);
	}

	@Test
	public void given3FloatValues_WhenGetMaximum_ShouldReturnCorrectValue3() {
		float finalResult = Maximum.getmaximum(6.9f, 3.4f, 8.6f);
		Assert.assertEquals(8.6f, finalResult, 0.0);
	}

	@Test
	public void given3StringValues_WhenGetMaximum_ShouldReturnCorrectValue1() {
		String finalResult = Maximum.getmaximum("rat", "dog", "cat");
		Assert.assertEquals("rat", finalResult);
	}

	@Test
	public void given3StringValues_WhenGetMaximum_ShouldReturnCorrectValue2() {
		String finalResult = Maximum.getmaximum("dog", "rat", "cat");
		Assert.assertEquals("rat", finalResult);
	}

	@Test
	public void given3StringValues_WhenGetMaximum_ShouldReturnCorrectValue3() {
		String finalResult = Maximum.getmaximum("cat", "dog", "rat");
		Assert.assertEquals("rat", finalResult);
	}
}