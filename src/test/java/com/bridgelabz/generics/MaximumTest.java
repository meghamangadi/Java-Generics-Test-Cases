package com.bridgelabz.generics;

import org.junit.Assert;
import org.junit.Test;



public class MaximumTest {
@Test
public void checkmaximum1() {
    int max=Maximum.getmaximum(8,3,6);
    Assert.assertEquals(8,max);
}
@Test
public void checkmaximum2() {
    int max=Maximum.getmaximum(3,8,6);
    Assert.assertEquals(8,max);
}
@Test
public void checkmaximum3() {
    int max=Maximum.getmaximum(3,6,8);
    Assert.assertEquals(8,max);
}
}