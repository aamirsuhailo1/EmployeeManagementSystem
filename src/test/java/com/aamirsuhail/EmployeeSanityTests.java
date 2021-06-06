/**
 * 
 */
package com.aamirsuhail;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author aamirsuhail01@yahoo.com
 *
 */
public class EmployeeSanityTests {
	
	@Test
	public void employeeSanityTestOne() {
		System.out.println("This is employee sanity test one");
		Assert.assertTrue(true);
	}
	
	@Test
	public void employeeSanityTestTwo() {
		System.out.println("This is employee sanity test two");
		Assert.assertTrue(true);
	}
	
	@Test
	public void employeeSanityTestThree() {
		System.out.println("This is employee sanity test three");
		Assert.assertTrue(true);
	}
	
	@Test
	public void employeeSanityTestFour() {
		System.out.println("This is employee sanity test four");
		Assert.assertTrue(true);
	}
	
	@Test
	public void employeeSanityTestFive() {
		System.out.println("This is employee sanity test five");
		Assert.assertTrue(false);
	}
	
	@Test
	public void employeeSanityTestSix() {
		System.out.println("This is employee sanity test six");
		Assert.assertTrue(false);
	}

}
