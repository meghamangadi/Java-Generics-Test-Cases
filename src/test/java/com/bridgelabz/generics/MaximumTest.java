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
}