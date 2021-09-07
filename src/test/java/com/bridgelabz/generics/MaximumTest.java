package com.bridgelabz.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
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
}