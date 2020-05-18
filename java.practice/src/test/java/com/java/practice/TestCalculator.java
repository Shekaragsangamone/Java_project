package com.java.practice;

import org.junit.Assert;
import org.junit.Test;

import com.java.practice.Calculator;

public class TestCalculator {

	@Test
	public void testAdd_simple() {
		Calculator calci = new Calculator();
		int sum = calci.add(1, 2);
		Assert.assertEquals(3, sum);
	}

	@Test
	public void testAdd_negative() {
		Calculator calci = new Calculator();
		int sum = calci.add(1, -2);
		Assert.assertEquals(-1, sum);
	}

	@Test
	public void testAddPositive() {
		Calculator calci = new Calculator();
		int sum = calci.addPositive(1, 2);
		Assert.assertEquals(3, sum);
	}

	@Test
	public void testAddPositive_negative() {
		Calculator calci = new Calculator();
		int sum = calci.addPositive(-1, -2);
		Assert.assertEquals(0, sum);
	}

	@Test
	public void testAddPositive_BothNegative() {
		Calculator calci = new Calculator();
		int sum = calci.addPositive(1, -2);
		Assert.assertEquals(0, sum);
	}

}
