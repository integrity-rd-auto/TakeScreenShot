package com.Test.ScreenShot;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListener.class)
public class ScreenShotTest extends Base {

	
	@BeforeMethod
	public void setUp() {
		
		initialization();
	}
	
	@Test
	public void takeScreenshotTest() {
		Assert.assertEquals(false,true);
	}
	
	@AfterMethod
	
	public void tearDown() {
		
		driver.quit();
	}
}
