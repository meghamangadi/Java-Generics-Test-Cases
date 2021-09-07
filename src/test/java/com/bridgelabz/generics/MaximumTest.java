package com.bridgelabz.generics;

import org.junit.Assert;

import org.junit.Test;

public class MaximumTest {
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