package com.bridgelabz.generics;

import org.junit.Assert;

import org.junit.Test;

public class MaximumTest {

	@Test
	public void givenmorethen3Integers_WhenGetMaximum_ShouldReturnCorrectValue1() {
		Integer[] inputarray = { 8, 3, 6, 9, 2, 5 };
		int finalResult = Maximum.getmaximum(inputarray);
		Assert.assertEquals(9, finalResult);
	}

	@Test
	public void givenmorethen3Integers_WhenGetMaximum_ShouldReturnCorrectValue2() {
		Integer[] inputarray = { 8, 3, 6, 9, 2, 5 };
		int finalResult = Maximum.getmaximum(inputarray);
		Assert.assertEquals(9, finalResult);
	}

	@Test
	public void givenmorethen3Integers_WhenGetMaximum_ShouldReturnCorrectValue3() {
		Integer[] inputarray = { 8, 3, 6, 9, 2, 5 };
		int finalResult = Maximum.getmaximum(inputarray);
		Assert.assertEquals(9, finalResult);
	}

	@Test
	public void givenmorethen3FloatValues_WhenGetMaximum_ShouldReturnCorrectValue1() {
		Float[] inputarray = { 3.4f, 8.6f, 6.9f, 2.4f, 7.5f };
		float finalResult = Maximum.getmaximum(inputarray);
		Assert.assertEquals(8.6f, finalResult, 0.0);

	}

	@Test
	public void givenmorethen3FloatValues_WhenGetMaximum_ShouldReturnCorrectValue2() {
		Float[] inputarray = { 8.6f, 3.4f, 6.9f, 2.4f, 7.5f };
		float finalResult = Maximum.getmaximum(inputarray);
		Assert.assertEquals(8.6f, finalResult, 0.0);
	}

	@Test
	public void givenmorethen3FloatValues_WhenGetMaximum_ShouldReturnCorrectValue3() {
		Float[] inputarray = { 3.4f, 7.5f, 6.9f, 2.4f, 8.6f };
		float finalResult = Maximum.getmaximum(inputarray);
		Assert.assertEquals(8.6f, finalResult, 0.0);
	}

	@Test
	public void givenmorethen3StringValues_WhenGetMaximum_ShouldReturnCorrectValue1() {
		String[] inputarray = { "rat", "def", "cdf", "dog", "cat" };
		String finalResult = Maximum.getmaximum(inputarray);
		Assert.assertEquals("rat", finalResult);

	}

	@Test
	public void givenmorethen3StringValues_WhenGetMaximum_ShouldReturnCorrectValue2() {
		String[] inputarray = { "cat", "def", "cdf", "dog", "rat" };
		String finalResult = Maximum.getmaximum(inputarray);
		Assert.assertEquals("rat", finalResult);
	}

	@Test
	public void givenmorethen3StringValues_WhenGetMaximum_ShouldReturnCorrectValue3() {
		String[] inputarray = { "cdf", "def", "rat", "dog", "cat" };
		String finalResult = Maximum.getmaximum(inputarray);
		Assert.assertEquals("rat", finalResult);
	}
}